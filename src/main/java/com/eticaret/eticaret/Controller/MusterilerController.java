package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Musteriler;
import com.eticaret.eticaret.Service.MusterilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")

@RestController
@RequestMapping("musteriler")
public class MusterilerController {

    @Autowired
   private MusterilerService musterilerService;

    @GetMapping("/getMusteriler")
    public List<Musteriler> getMusteriler(){
        return musterilerService.getMusteriler();
    }
}
