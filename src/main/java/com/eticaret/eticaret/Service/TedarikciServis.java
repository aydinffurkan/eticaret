package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Tedarikci;
import com.eticaret.eticaret.Model.Urunler;
import com.eticaret.eticaret.Repository.ITedarikciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin("http://localhost:4200")

public class TedarikciServis {
    @Autowired
    private ITedarikciRepository iTedarikciRepository;
    public  List<Tedarikci> getTedarikci() {
        return iTedarikciRepository.findAll();
    }


    public Optional<Tedarikci> getTedarikciById(Long id) {

        return iTedarikciRepository.findById(id);
    }

    public Tedarikci createTedarikci(Tedarikci tedarikci) {

        return iTedarikciRepository.save(tedarikci);
    }

    public Boolean deleteTedarikci(Long id) {

        iTedarikciRepository.deleteById(id);
        return true;
    }


}
