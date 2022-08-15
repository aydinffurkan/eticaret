package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Sepet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISepetRepository extends JpaRepository<Sepet,Long> {
}
