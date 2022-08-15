package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Tedarikci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ITedarikciRepository extends JpaRepository<Tedarikci,Long> {

}
