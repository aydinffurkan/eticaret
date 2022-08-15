package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.SiparisEdilenUrunler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISiparisEdilenUrunlerRepository extends JpaRepository<SiparisEdilenUrunler,Long> {
}
