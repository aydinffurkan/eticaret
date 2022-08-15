package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Degerlendirme;
import com.eticaret.eticaret.Service.DegerlendirmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/degerlendirme")

public class DegerlendirmeController {
    @Autowired
    private DegerlendirmeService degerlendirmeService;

    @GetMapping("/getDegerlendirme")
    public List<Degerlendirme> getDegerlendirme()
    {
        return degerlendirmeService.getDegerlendirme();
    }

    @GetMapping("/degerlendirmeById/{id}")
    public Optional<Degerlendirme> getDegerlendirmeById(@PathVariable(name = "id") Long id){
        return degerlendirmeService.getDegerlendirmeById(id);
    }

}
