package be.bstorm.bf_java2024_exospringmvc01.controllers;

import be.bstorm.bf_java2024_exospringmvc01.models.Contact;
import be.bstorm.bf_java2024_exospringmvc01.models.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    private List<Skill> skills;

    public AppController() {
        this.skills = new ArrayList<Skill>();
        this.skills.add(new Skill("Java Spring Boot", "Spring Boot Skill"));
        this.skills.add(new Skill("Spring MVC", "Spring MVC Skill"));
        this.skills.add(new Skill("Hibernate", "Hibernate Skill"));
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("skills", this.skills);
        return "index";
    }

    @GetMapping("/{id}")
    public String details(@PathVariable int id, Model model) {
        for(Skill skill : this.skills) {
            if(skill.getId() == id) {
                model.addAttribute("skill", skill);
                return "details";
            }
        }
        return "error";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String postContact(@ModelAttribute Contact contact) {
        System.out.println("Contact posted");
        return "redirect:/";
    }
}
