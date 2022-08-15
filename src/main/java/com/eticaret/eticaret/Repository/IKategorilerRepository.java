package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Kategoriler;
import com.eticaret.eticaret.Model.Urunler;
import org.aspectj.apache.bcel.generic.LOOKUPSWITCH;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@Repository
public interface IKategorilerRepository extends JpaRepository<Kategoriler, Long> {

}
