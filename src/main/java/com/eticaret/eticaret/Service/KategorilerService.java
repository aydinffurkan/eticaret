package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Kategoriler;
import com.eticaret.eticaret.Repository.IKategorilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin("http://localhost:4200")
@Service
public class KategorilerService {
    @Autowired
    private IKategorilerRepository iKategorilerRepository;
    public List<Kategoriler> getKategoriler() {

        return iKategorilerRepository.findAll();
    }
    public Optional<Kategoriler> getKategoriById(Long id) {
        return iKategorilerRepository.findById(id);
    }

    public Boolean deleteKategoriler(Long id) {
        iKategorilerRepository.deleteById(id);
        return true;
    }

}
