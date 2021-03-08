package com.bmgs.main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
     * @param formID
     * @return form.html
     */
    @RequestMapping(value="/form/{id}", method=RequestMethod.GET)
    public ResponseEntity<Object> viewForm(@PathVariable("id") long formID) {
        Form form = service.findById(formID);
        return new ResponseEntity<>(form, HttpStatus.OK);
    }

    /**
     * REST method for added questions to a form
     * @param formID
     */
    @RequestMapping(value="/form/{id}", method=RequestMethod.POST)
    public ResponseEntity<Object> postQuestion(@RequestBody Question question, @PathVariable("id") long formID) {
        Form form = service.findById(formID);
        form.addQuestion(question);
        service.save(form);
        return new ResponseEntity<>(form, HttpStatus.OK);
    }
}
