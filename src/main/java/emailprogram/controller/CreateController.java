package emailprogram.controller;

import emailprogram.model.Email;
import emailprogram.service.ServiceEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create")
public class CreateController {
    @Autowired
    private ServiceEmail serviceEmail;

    @GetMapping
    public String doGet(){
        return "create";
    }

    @PostMapping
    public String doPost(Email email){
        serviceEmail.insert(email);
        return "redirect:/";
    }
}
