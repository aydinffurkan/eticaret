package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Model.Cuzdan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuzdanRepository extends JpaRepository<Cuzdan,Long> {
}
