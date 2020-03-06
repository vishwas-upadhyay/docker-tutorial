package com.vishudolu.vishudolu.contoller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
@RequestMapping("vishudolu")
public class HomePageController {

    @GetMapping()
    public String homePage() {

        return "home";
    }

    @GetMapping("/hehe")
    public String getHomePage() {
        return "<HTML>" +
                "<h1> Welcome to love diary of VishuDolu" +
                "" +
                "" +
                "<img src=\"1.jpeg\"/>" +
                "</HTML>"
                ;
    }

    //Sending multiple images via restcontroller is not easy. Better to user template engine like thymeleaf.
    @RequestMapping(value = "/hi", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/img/1.jpeg");
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(bytes);
    }


}
