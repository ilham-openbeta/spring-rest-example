package id.web.ilham.springexample.services;

import id.web.ilham.springexample.models.person.PersonRequest;
import id.web.ilham.springexample.models.person.PersonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public ResponseEntity<String> helloworld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    public ResponseEntity<String> printPerson(String name, String age) {
        String message = "Hello " + name + ". You are " + age + " years old.";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    public ResponseEntity<Object> addPerson(String name) {
        System.out.println(name + " added");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<PersonResponse> save(PersonRequest personRequest) {
        String name = personRequest.getName();
        PersonResponse personResponse = new PersonResponse(name);
        System.out.println(name + " saved");
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }

    public ResponseEntity<String> error() {
        return new ResponseEntity<>("ERROR", HttpStatus.BAD_REQUEST);
    }

}
