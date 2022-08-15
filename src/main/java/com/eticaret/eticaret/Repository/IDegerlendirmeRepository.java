package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Degerlendirme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDegerlendirmeRepository extends JpaRepository<Degerlendirme,Long> {
}
