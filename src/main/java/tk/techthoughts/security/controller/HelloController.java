package tk.techthoughts.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

    @GetMapping
    public String default_rest() {
        return "Try /rest/admin; /rest/user/{}";
    }

    @GetMapping(value = "/user/{name}")
    public String helloUser(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping(value = "/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

}
