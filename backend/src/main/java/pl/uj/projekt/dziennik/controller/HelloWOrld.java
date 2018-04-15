package pl.uj.projekt.dziennik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController("/api")
public class HelloWOrld {

    @GetMapping(path = {"/main"})
    public String getMain(){
        List<String> a = new ArrayList<>();
        a.add("ddd");
        a.add("bbb");
        return new String(a.stream()
                .collect(Collectors.joining(" , ")));
    }
}