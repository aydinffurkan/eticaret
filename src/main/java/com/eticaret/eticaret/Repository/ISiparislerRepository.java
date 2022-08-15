package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Siparisler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiparislerRepository extends JpaRepository<Siparisler,Long> {
}
