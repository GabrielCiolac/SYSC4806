package com.bmgs.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Iterator;
import java.util.Optional;

@Controller
public class FormController {

    private final FormRepositoryService service;

    public FormController(FormRepositoryService service) {
        this.service = service;
    }

    /**
     * Display master list of forms, in linked format.
     *
     * @param model
     * @return index.html
     */
    @GetMapping(path="/index")
    public String index(Model model) {
        Iterable<Form> forms = service.findAll();
        //Iterator formIterator = forms.iterator();
        if (forms != null) {
            StringBuilder links = new StringBuilder();
            for (Form form : forms) {

                // Get form ID and title
                Long id = form.getId();
                String title = form.getTitle();

                // Add form link to string
                links.append("<div><a href=\"forms/" + id + "\">" + title + "</a></div>");
            }
            model.addAttribute("forms", links.toString());
        } else {
            model.addAttribute("forms", "No forms have been created yet.");
        }
        return "index";
    }

    /**
     * Display the viewing and editing interface for the form with the indicated ID.
     *
     * @param model
     * @param formID
     * @return form.html
     */
    @GetMapping(path="form/{id}")
    public String viewForm(Model model, @PathVariable("id") Long formID) {
        Optional<Form> form = service.findById(formID);
        if (form != null)
            model.addAttribute("form", form.toString());
        else
            model.addAttribute("form", "This form does not exist.");
        return "form";
    }
}
