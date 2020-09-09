package org.daming.aspectlog.web.api;

import org.daming.aspectlog.core.annotations.AspectLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloController {

    @AspectLog
    @GetMapping("hello")
    public String hello(@RequestParam(defaultValue = "world") String name) {
        return "Hello " + name + "!";
    }
}
