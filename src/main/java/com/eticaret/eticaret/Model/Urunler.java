package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Default;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode(exclude = "urunlers")
@Table(name = "urunler")
@Getter
@Setter
public class Urunler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "urunlerId")
    private Long id;

    @NotNull
    @Column(name = "urunAdi")
    private String urunAdi;

    @Column(name = "urunAlisFiyati")
    private int urunAlisFiyati;

    @Column(name = "urunSatisFiyati")
    private int urunSatisFiyati;

    @Column(name = "urunYorum")
    private String urunYorum;

    @Column(name = "stok")
    private int stok;

    @NotNull
    @Column(name = "aktifAlan")
    private boolean aktifAlan;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tedarikci> tedarikciMM;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Musteriler> musterilerMM;//müsteriler sinifindan list türünde nesne oluşturuldu.

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Sepet> sepetMM;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "urunler_id"})
    @JoinColumn(name = "degerlendirme_id")
    private Degerlendirme degerlendirme_oo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "urunlers"})
    @JoinColumn(name = "kategori_id")
    private Kategoriler kategoriler;

}