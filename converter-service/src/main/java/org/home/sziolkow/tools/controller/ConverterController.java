package org.home.sziolkow.tools.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by slawek on 05/10/16.
 */
@RestController
public class ConverterController {

    @CrossOrigin
    @RequestMapping("/convert")
    public ContentContainer greeting() {
        return new ContentContainer("test");
    }
}
