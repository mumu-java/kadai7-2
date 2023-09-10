package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication3 {

    @GetMapping("/names")
    public List<Namelist> getNames() {
        List<Namelist> names = List.of(
                new Namelist("mumu1", ""),
                new Namelist("mumu2", "2"));
        return names;
    }
}
