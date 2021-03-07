package id.web.ilham.springexample.controllers;

import id.web.ilham.springexample.models.person.PersonRequest;
import id.web.ilham.springexample.models.person.PersonResponse;
import id.web.ilham.springexample.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @GetMapping("/")
    public ResponseEntity<String> helloworld(){
        return exampleService.helloworld();
    }

    // Example URL : http://localhost:8080/api/v1/hello/ilham?age=30
    @GetMapping("/hello/{name}")
    public ResponseEntity<String> printPerson(@PathVariable String name, @RequestParam(defaultValue = "20") String age){
        return exampleService.printPerson(name, age);
    }

    @PostMapping("/hello/{name}")
    public ResponseEntity<Object> addPerson(@PathVariable String name){
        return exampleService.addPerson(name);
    }

    @PostMapping("/save")
    public ResponseEntity<PersonResponse> save(@RequestBody PersonRequest personRequest){
        return exampleService.save(personRequest);
    }

    @PostMapping("/errortest")
    public ResponseEntity<String> error(){
        return exampleService.error();
    }

}
