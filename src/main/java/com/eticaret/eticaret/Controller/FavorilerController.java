package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Favoriler;
import com.eticaret.eticaret.Service.FavorilerService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favoriler")
@CrossOrigin("http://localhost:4200")
@Getter
@Setter
public class FavorilerController {
    @Autowired
    public FavorilerService favorilerService;

    @GetMapping("/getFavoriler")
    public List<Favoriler> getFavoriler(){
        return favorilerService.getFavoriler();
    }



}
