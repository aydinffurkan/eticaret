package com.eticaret.eticaret.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cuzdan")
@Getter
@Setter
public class Cuzdan {

    @Id
    @Column(name = "cuzdan_id")
    private Long cuzdan_id;

    @Column(name = "bakiye")
    private int bakiye;

    @Column(name = "odemeYontemi")
    private String odemeYontemi;

    @Column(name = "aktifAlan")
    private Boolean aktifAlan;

    @OneToOne(mappedBy = "cuzdanOO")
   // @JsonBackReference
    @JsonIgnoreProperties("cuzdanOO")
    private Musteriler musteriler_id;


}
