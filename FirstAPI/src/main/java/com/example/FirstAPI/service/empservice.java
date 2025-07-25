package com.example.FirstAPI.service;

import com.example.FirstAPI.model.empinfo;
import com.example.FirstAPI.repository.emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empservice {

    @Autowired
    emprepo emprepo;


    public List<empinfo> getAllemp() {
        return emprepo.findAll();


    }

    public void addemp(empinfo info) {
        emprepo.save(info);

    }

    public empinfo getempByID(int id) {
        return emprepo.findById(id).orElse(new empinfo());
    }

    public void updateemp(empinfo info) {
        emprepo.save(info);
    }

    public void deleteempByID(int id) {
        emprepo.deleteById(id);
    }

    public void clearemp() {
        emprepo.deleteAll();

    }

    public List<empinfo> getempbyroll(String roll) {
       return  emprepo.findByroll(roll);
    }


}
