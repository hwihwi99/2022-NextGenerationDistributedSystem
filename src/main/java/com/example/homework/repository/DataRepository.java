package com.example.homework.repository;

import com.example.homework.model.DataInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataInfo, Long> {

}
