package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Tedarikci;
import com.eticaret.eticaret.Model.Urunler;
import com.eticaret.eticaret.Service.TedarikciServis;
import com.eticaret.eticaret.exception.ResourceNotFoundException;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/tedarikci")
public class TedarikciController {

    @Autowired
    private TedarikciServis tedarikciServis;

    @GetMapping("/getTedarikci")
    public List<Tedarikci> getTedarikci()
    {
        return tedarikciServis.getTedarikci();
    }


    @GetMapping("/getTedarikciById/{id}")
    public ResponseEntity < Tedarikci > getInstructorById(
            @PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Tedarikci user = tedarikciServis.getTedarikciById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Belirletilen İd Numarasına Ait Kayıt Bulunamadı.. :: " + id));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/addTedarikci")
    public Tedarikci addTedarikci (@RequestBody Tedarikci tedarikci)
    {
      //  tedarikci.setUrunlerMM(new ArrayList<>(5));
     return tedarikciServis.createTedarikci(tedarikci);

    }

  @DeleteMapping("/deleteTedarikci/{id}")
    public Boolean deleteTedarikci(@PathVariable(value = "id") Long id) throws ResourceNotFoundException
  {
      Optional<Tedarikci> tedarikci=tedarikciServis.getTedarikciById(id);
      if (tedarikci.isEmpty())
      {
          return false;
      }
      tedarikciServis.deleteTedarikci(id);
      return true;
  }




}
