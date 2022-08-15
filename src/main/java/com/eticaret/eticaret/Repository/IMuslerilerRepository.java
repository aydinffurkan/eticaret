package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Musteriler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")

@Repository
public interface IMuslerilerRepository extends JpaRepository<Musteriler,Long> {
}
