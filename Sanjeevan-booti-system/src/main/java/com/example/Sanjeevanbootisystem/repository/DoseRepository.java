package com.example.Sanjeevanbootisystem.repository;

import com.example.Sanjeevanbootisystem.Model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Integer> {
}
