package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameRestController {

    @GetMapping("/names")
    public List<Name> getNames() {
        List<Name> names = List.of(
                new Name("mumu1", ""),
                new Name("mumu2", "2"));
        return names;
    }
}
