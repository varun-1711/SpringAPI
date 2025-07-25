package com.example.FirstAPI.controller;

import com.example.FirstAPI.model.empinfo;
import com.example.FirstAPI.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class empcontroller {

    @Autowired
    empservice empservice;

    @GetMapping("/details")

    public List<empinfo> getAllemp(){
        return empservice.getAllemp();

    }

    @GetMapping("/details/{empid}")
    public empinfo getempByID(@PathVariable("empid") int id){
        return empservice.getempByID(id);
    }


    @PostMapping("/details")

    public String addemp(@RequestBody empinfo info){
        empservice.addemp(info);

        return "added success";

    }

    @PutMapping("/details")

    public String updateemp(@RequestBody empinfo info){
        empservice.updateemp(info);
        return "update success";
    }

    @DeleteMapping("/details/{id}")

    public String deleteemp(@PathVariable int id){
        empservice.deleteempByID(id);

        return "deleted";
    }

    @DeleteMapping("/details/clear")

    public String clearemp(){
        empservice.clearemp();
        return "clear all";
    }

    @GetMapping("/details/roll/{ro}")
    public List<empinfo> getempbyroll(@PathVariable("ro") String roll){
         return empservice.getempbyroll(roll);
    }







}
