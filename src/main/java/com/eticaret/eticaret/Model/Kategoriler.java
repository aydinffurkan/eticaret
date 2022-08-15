package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import javax.sound.sampled.Clip;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "kategoriler")
@Getter
@Setter
public class Kategoriler {
    @Id
    @Column(name = "kategori_id")
    private Long kategori_id;

    @Column(name = "kategori_ad")
    private String katagori_ad;

    @Column(name = "aktifAlan")
    private Boolean aktifAlan;

    @Column(name = "altkategori_id")
    private Long altkategori_id;

    @OneToMany(mappedBy = "kategoriler", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("kategoriler")
    private Set<Urunler> urunlers;

}
