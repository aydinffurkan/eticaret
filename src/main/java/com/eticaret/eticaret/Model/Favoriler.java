package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "favoriler")
@CrossOrigin("http://localhost:4200")
@Getter
@Setter
public class Favoriler {
    @Id
    @Column(name = "favori_id")
    private Long favoriId;

    @ManyToOne
    @JsonIgnoreProperties({"hibernateLazyInitializer", "favorilers"})
    @JoinColumn(name = "musteri_id")
    private Musteriler favoriler;


}
