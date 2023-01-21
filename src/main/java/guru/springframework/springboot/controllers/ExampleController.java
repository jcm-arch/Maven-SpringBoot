package guru.springframework.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex(){
        Map<String, Object> returnval = new HashMap<>();
        returnval.put("Hello", "World");

        return returnval;
    }
}
