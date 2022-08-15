package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Musteriler;
import com.eticaret.eticaret.Repository.IMuslerilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("http://localhost:4200")

@Service
public class MusterilerService {
    @Autowired
    private IMuslerilerRepository iMuslerilerRepository;

    public List<Musteriler> getMusteriler() {
        return iMuslerilerRepository.findAll();
    }
}
