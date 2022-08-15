package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(exclude = "degerlendirmes")
@Table(name = "degerlendirme")
@Getter
@Setter
public class Degerlendirme {

    @Id
    @Column(name = "degerlendirme_id")
    private Long id;

    @Column(name = "yorumlar")
    private String yorumlar;

    @Column(name = "puan")
    private int puan;


    @Column(name = "aktifAlan")
    private boolean aktifAlan;
    @OneToOne(mappedBy = "degerlendirme_oo")
    @JsonIgnoreProperties("degerlendirme_oo")
    private Urunler urunler_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "degerlendirmes"})
    @JoinColumn(name = "musteri_id")
    private Musteriler degerlendirme;


}
