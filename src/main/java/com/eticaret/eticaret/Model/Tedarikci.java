package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tedarikci")
@CrossOrigin("http://localhost:4200")
@Getter
@Setter
public class Tedarikci {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "tedarikciId")
    private Long id;
    @Column(name = "tedarikciFirmaAdi")
    private String tedarikciFirmaAdi;
    @Column(name = "TedarikciFirmaAdresi")
    private String tedarikciFirmaAdresi;
    @Column(name = "aktifAlan")
    private boolean aktifALan;

    @ManyToMany(mappedBy = "tedarikciMM")
    private List<Urunler> UrunlerMM;
    public List<Urunler> getUrunlerMM() {
        return UrunlerMM;
    }


}
