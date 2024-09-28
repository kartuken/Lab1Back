package com.example.demo.controllers;

import com.example.demo.models.StringModel;
import com.example.demo.services.IOFileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;

@RestController
public class InputPageController {


    @PostMapping("/api/dido")
    @ResponseBody
    public StringModel saveSomeData(@RequestBody StringModel model){
        IOFileService.writeToFile(model.text);
        return new StringModel("All OK");
    }

}
