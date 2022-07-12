package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	CarService carService = new CarServiceImpl();

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
	public String showCars(ModelMap model, @RequestParam (value = "count", required = false) Integer count) {
		List<Car> carData;
		if (count == null) {
			carData = carService.giveAllCars();
		} else {
			carData = carService.giveSomeCars(count);
		}
		model.addAttribute("cars", carData);
		List<String> messages = new ArrayList<>();
		messages.add("Cars page");
		model.addAttribute("messages", messages);
		return "cars";
	}

}