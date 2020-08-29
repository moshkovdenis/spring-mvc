package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String tableCars(@RequestParam(defaultValue = "en") String locale, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> carList = carService.listOfCars();
        model.addAttribute("cars", carList);
        checkLocale(locale, model);
        return "cars";
    }

    private void checkLocale(String locale, ModelMap model) {
        if (locale.equals("ru")) {
            model.addAttribute("locale", "МАШИНЫ");
        } else if (locale.equals("en")) {
            model.addAttribute("locale", "CARS");
        }
    }
}