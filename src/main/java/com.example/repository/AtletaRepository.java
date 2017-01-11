package com.example.repository;

import com.example.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by DAM on 20/10/16.
 */
public interface AtletaRepository extends JpaRepository<Atleta , Long> {

}
