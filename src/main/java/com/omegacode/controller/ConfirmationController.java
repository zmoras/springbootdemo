package com.omegacode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.omegacode.entity.User;
import com.omegacode.repository.UserRepository;

@Controller
public class ConfirmationController {
	
    @Autowired 
    private UserRepository userRepository; 

    @RequestMapping("/confirm")
    public String greeting(@RequestParam(value="id", required=true) String confirmationId, Model model) {

    	User user = userRepository.getUserByConfirmationId(confirmationId);
    	String message = "Invalid confirmation id. Contact us or try again.";
    	if(user!=null){
    		if(!user.isConfirmationStatus()){
    			user.setConfirmationStatus(true);
    			user.setConfirmationId(null);
    			userRepository.save(user);
    		}
    		message = user.getUsername() + ", your account has been verified. You may now log in. ";
    	}             
        
        model.addAttribute("message", message);
        return "message";
    }

}