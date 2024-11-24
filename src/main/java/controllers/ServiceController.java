package controllers;

import input.CreateServiceInputModel;
import input.ServiceFilterInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service")
public interface ServiceController {
    @GetMapping(path = "search")
    String search(
            @ModelAttribute("filter") ServiceFilterInputModel filter,
            Model model
    );
    @GetMapping(path = "create")
    String create(
            @ModelAttribute("createService") CreateServiceInputModel createService,
            Model model
    );
}
