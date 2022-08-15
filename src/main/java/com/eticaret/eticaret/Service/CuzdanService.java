package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Model.Cuzdan;
import com.eticaret.eticaret.Repository.ICuzdanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuzdanService {
    @Autowired
    private ICuzdanRepository iCuzdanRepository;
    public List<Cuzdan> getCuzdan() {
        return iCuzdanRepository.findAll();
    }
}
