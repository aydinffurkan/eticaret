package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Favoriler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IFavorilerRepository extends JpaRepository<Favoriler,Long> {
}
