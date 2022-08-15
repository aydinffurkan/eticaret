package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.Dao.UrunlerDao;
import com.eticaret.eticaret.Model.Urunler;
import com.eticaret.eticaret.Repository.IUrunlerRepository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin("http://localhost:4200")
@Service
public class UrunlerService {
    @Autowired
    private IUrunlerRepository iUrunlerRepository;
    @Autowired
    private UrunlerDao urunlerDao;

    public List<Urunler> getUrunler()
    {
        return iUrunlerRepository.findAll();
    }

    public Optional<Urunler> getUrunlerById(Long id)
    {

        return iUrunlerRepository.findById(id);
    }

    public Urunler saveUrunler (Urunler urunler)
    {

        return iUrunlerRepository.save(urunler);
    }

    public Boolean deleteUrunler(Long id)
    {
         iUrunlerRepository.deleteById(id);
         return true;
    }

   public List<Urunler> findBooksByAuthorNameAndTitle(Long kategori_id) {
        return urunlerDao.findBooksByAuthorNameAndTitle(kategori_id);

    }


}
