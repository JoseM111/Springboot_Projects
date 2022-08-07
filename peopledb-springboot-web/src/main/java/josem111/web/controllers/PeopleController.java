package josem111.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static josem111.helpers.IHelpers.people;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping
    @ResponseBody
    public Model getPeople(Model model) {
        /**
         * @model:
         * A <interface> that defines a holder for <model> attributes.
         * Primarily designed for adding attributes to the model.
         * Allows for accessing the overall model as a <java.util.Map>
         * Works like a <Map with key:value pairs>
         */
        return model.addAttribute("people", people);
    }
}









