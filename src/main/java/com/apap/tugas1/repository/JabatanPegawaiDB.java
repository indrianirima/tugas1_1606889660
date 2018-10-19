package com.apap.tugas1.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tugas1.model.JabatanModel;
import com.apap.tugas1.model.JabatanPegawaiModel;

@Repository
public interface JabatanPegawaiDB extends JpaRepository<JabatanPegawaiModel, Long> {

	List<JabatanPegawaiModel> findByJabatan(JabatanModel jabatan);
	
	
}
