package com.SuperHeroSquad.SuperHeroSquad.controller;

import com.SuperHeroSquad.SuperHeroSquad.repository.ActiveRepository;
import com.SuperHeroSquad.SuperHeroSquad.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveController {
    @Autowired
private ActiveRepository activeRepository;

    @RequestMapping("/active/list")
    public boolean home(Model model)
    {
        model.addAttribute("actives",activeRepository.findAll());
        return "bidList/list";
    }




}
