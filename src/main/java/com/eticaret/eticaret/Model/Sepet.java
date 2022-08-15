package com.eticaret.eticaret.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sepet")
@Getter
@Setter
public class Sepet {

    @Id
    @Column(name = "sepet_id")
    private Long sepet_id;

    @ManyToMany(mappedBy = "sepetMM")
    private List<Urunler> urunlerMM;

    @OneToOne(mappedBy = "sepetOO")
    private Musteriler müsteriler_id;

    
}
