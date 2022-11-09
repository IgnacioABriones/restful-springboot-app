package com.mitocode.repo;

import com.mitocode.model.Medic;
import com.mitocode.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientMedic extends JpaRepository <Medic, Integer> {
}
