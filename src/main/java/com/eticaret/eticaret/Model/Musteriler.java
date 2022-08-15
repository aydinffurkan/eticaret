package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode(exclude = "musteri_id")
@Table(name = "musteriler")
@Getter
@Setter
public class Musteriler {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "musteri_id")
    private Long musteri_id;

    @Column(name = "musteri_adi")
    private String musteri_adi;

    @Column(name = "musteri_soyadi")
    private String musteri_soyadi;

    @Column(name = "musteri_adres")
    private String musteri_adres;

    @Column(name = "musteri_telefon")
    private int musteri_telefon;

    @Column(name = "musteri_tc")
    private int musteri_tc;

    @Column(name = "aktifAlan")
    private Boolean aktifAlan;

    @ManyToMany(mappedBy = "musterilerMM")
    private List<Urunler> urunlerMM;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "musteriler_id"})
    @JoinColumn(name = "cuzdan_id",referencedColumnName = "cuzdan_id")
    private Cuzdan cuzdanOO;

    @OneToOne(cascade = CascadeType.ALL)
    //@JsonManagedReference
    @JsonIgnoreProperties({"hibernateLazyInitializer", "musteriler_id"})
    @JoinColumn(name = "sepet_id")
    private Sepet sepetOO;

    @OneToMany(mappedBy = "degerlendirme", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("degerlendirme")
    private List<Degerlendirme> degerlendirmes;

    @OneToMany(mappedBy = "siparisler", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Siparisler> siparislers=new ArrayList<>();

    @OneToMany(mappedBy = "favoriler", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("favoriler")
    private List<Favoriler> favorilers=new ArrayList<>();



}
