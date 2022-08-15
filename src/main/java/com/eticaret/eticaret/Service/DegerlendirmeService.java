package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Degerlendirme;
import com.eticaret.eticaret.Repository.IDegerlendirmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DegerlendirmeService {
    @Autowired
    private IDegerlendirmeRepository iDegerlendirmeRepository;


    public List<Degerlendirme> getDegerlendirme() {
        return iDegerlendirmeRepository.findAll();
    }

    public Optional<Degerlendirme> getDegerlendirmeById(Long id) {
        return iDegerlendirmeRepository.findById(id);
    }

}
