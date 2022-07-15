package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.DAO.UserDAOImpl;
import web.models.User;
import web.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserServiceImpl userService;

    public UsersController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String showAllUsers(ModelMap model) {
        // @RequestParam(value = "count", required = false) Integer count
        // все пользователи
        model.addAttribute("users", userService.getAllUsers());
        return "users/all";
    }

    @GetMapping("/{id}")
    public String showUserbyId(@PathVariable("id") Long id, ModelMap model) {
        // @RequestParam(value = "count", required = false) Integer count
        // пользователь по id
        User resultUser = userService.getUserById(id);
        if (resultUser != null) {
            model.addAttribute("userName", resultUser.getFirstName() + " " + resultUser.getLastName());
        }
        model.addAttribute("user", resultUser);
        return ("users/take");
    }

    @GetMapping("/addUser")
    public String addUser (ModelMap model) {
        model.addAttribute("user", new User());
        return ("/users/add");
    }

    @PostMapping()
    public String createUser (@ModelAttribute ("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String editUser (@PathVariable ("id") long id, ModelMap model) {
        model.addAttribute("user", userService.getUserById(id));
        return "/users/edit";
    }

    @PatchMapping("/{id}")
    public String updateUser (@ModelAttribute ("user") User user, @PathVariable ("id") long id) {
        userService.updateUser(id, user);
        return ("redirect:/users");
    }

    @DeleteMapping("/{id}")
    public String deleteUser (@PathVariable ("id") long id) {
        userService.deleteUser(id);
        return ("redirect:/users");
    }

}
