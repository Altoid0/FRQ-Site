package com.application.frq;

import com.application.frq.Anthony.modelsSQL.Player;
import com.application.frq.Anthony.modelsSQL.PlayerSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.validation.Valid;
import java.util.List;

// Built using article: https://spring.io/guides/gs/validating-form-input/
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class AnthonySQLController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD
    @Autowired
    private PlayerSqlRepository repository;

    @GetMapping("/anthony/sql/player")
    public String player(Model model) {
        List<Player> list = repository.listAll();
        model.addAttribute("list", list);
        return "Anthony/mvc/sql/player";
    }

    /*  The HTML template Forms and PlayerForm attributes are bound
        @return - template for Player form
        @param - Player Class
    */
    @GetMapping("/anthony/sql/playercreate")
    public String playerAdd(Player player) {
        return "Anthony/mvc/sql/playercreate";
    }

    /* Gathers the attributes filled out in the form, tests for and retrieves validation error
    @param - Player object with @Valid
    @param - BindingResult object
     */
    @PostMapping("/anthony/sql/playercreate")
    public String playerSave(@Valid Player player, BindingResult bindingResult) {
        // Validation of Decorated PlayerForm attributes
        if (bindingResult.hasErrors()) {
            return "Anthony/mvc/sql/playercreate";
        }
        repository.save(player);
        // Redirect to next step
        return "redirect:/anthony/sql/player";
    }

    @GetMapping("/anthony/sql/playerupdate/{id}")
    public String playerUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("player", repository.get(id));
        return "Anthony/mvc/sql/playerupdate";
    }

    @PostMapping("/anthony/sql/playerupdate")
    public String playerUpdateSave(@Valid Player player, BindingResult bindingResult) {
        // Validation of Decorated PlayerForm attributes
        if (bindingResult.hasErrors()) {
            return "Anthony/mvc/sql/playerupdate";
        }
        repository.save(player);
        // Redirect to next step
        return "redirect:/anthony/sql/player";
    }

    @GetMapping("/anthony/sql/playerdelete/{id}")
    public String playerDelete(@PathVariable("id") long id) {
        repository.delete(id);
        return "redirect:/anthony/sql/player";
    }

}
