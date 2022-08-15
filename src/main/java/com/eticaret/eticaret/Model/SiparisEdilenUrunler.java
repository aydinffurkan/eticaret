package com.eticaret.eticaret.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "siparisEdilenUrunler")
@Getter
@Setter
public class SiparisEdilenUrunler {
    @Id
    @Column(name = "siparisEdilenUrunler")
    private Long siparisEdilenUrunler;

    @Column(name = "urunAlisFiyati")
    private int urunAlisFiyati;

    @Column(name = "aktifAlan")
    private boolean aktifAlan;

    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparisler siparisEdilenUrunlers;



}
