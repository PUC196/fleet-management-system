package com.example.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.State_master;
import com.example.services.StateService;
@CrossOrigin("*")
@RestController
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping(value="api/states")
    public List<State_master> getAllStates() {
    	System.out.println(stateService.getAllStates());
    	
        return stateService.getAllStates();
    }
}
