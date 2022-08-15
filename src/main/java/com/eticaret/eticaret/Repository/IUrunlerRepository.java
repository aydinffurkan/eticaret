package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Urunler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface IUrunlerRepository extends JpaRepository<Urunler,Long> {

}
