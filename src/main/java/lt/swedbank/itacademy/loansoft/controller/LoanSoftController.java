package lt.swedbank.itacademy.loansoft.controller;

import lt.swedbank.itacademy.loansoft.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by paulius on 17.2.22.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoanSoftController {


    @Autowired
    private TestRepository testRepository;

    @RequestMapping(value = "/", method =  RequestMethod.GET)
    public String getHelloMessage(){

        return "Hello, Loan Guuuuy";
    }

    @RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
    public String getCategories(@PathVariable Long id) {

        return testRepository.findOne(id).getName();


    }
}