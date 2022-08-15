package com.eticaret.eticaret.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "siparisler")
@Getter
@Setter
public class Siparisler {
    @Id
    @Column(name = "siparisler_id")
    private Long siparisler_id;

    @Column(name = "siparis_tarihi")
    private Date siparisTarihi;

    @Column(name = "siparisFiyati")
    private int siparisFiyati;

    @Column(name = "siparisOdemeYontemi")
    private String siparisOdemeYontemi;

    @Column(name = "aktifAlan")
    private boolean aktifAlan;

    @ManyToOne
    @JoinColumn(name = "musteri_id")
    private Musteriler siparisler;

    @OneToMany(mappedBy = "siparisEdilenUrunler"
            ,cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<SiparisEdilenUrunler> siparisEdilenUrunler=new ArrayList<>();


}
