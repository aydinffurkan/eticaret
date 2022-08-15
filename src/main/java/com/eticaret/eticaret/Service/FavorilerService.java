package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Favoriler;
import com.eticaret.eticaret.Repository.IFavorilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin("http://localhost:4200")

public class FavorilerService {
    @Autowired
    private IFavorilerRepository iFavorilerRepository;

    public List<Favoriler> getFavoriler(){
        return iFavorilerRepository.findAll();
    }
}
