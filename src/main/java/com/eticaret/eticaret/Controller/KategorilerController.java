package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Kategoriler;

import com.eticaret.eticaret.Service.KategorilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("http://localhost:4200")
@RestController

@RequestMapping("/kategoriler")
public class KategorilerController {
    @Autowired
    private KategorilerService kategorilerService;

    @GetMapping("/getKategoriler")
    public List<Kategoriler> getKategoriler()
    {
        return kategorilerService.getKategoriler();
    }

    @GetMapping("/getKategorilerById/{id}")
    public Optional<Kategoriler> getKategoriById(@PathVariable(name = "id") Long id)
    {
        return kategorilerService.getKategoriById(id);
    }

   @DeleteMapping("/deleteKategoriler/{id}")
    public Boolean DeleteKategoriler(@PathVariable(name = "id") Long id)
   {
       Optional<Kategoriler> kategoriler=kategorilerService.getKategoriById(id);
       if (kategoriler.isEmpty())
       {
           return false;
       }
       kategorilerService.deleteKategoriler(id);
       return true;
   }



}

