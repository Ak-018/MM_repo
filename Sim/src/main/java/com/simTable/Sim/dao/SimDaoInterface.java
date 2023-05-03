package com.simTable.Sim.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simTable.Sim.entity.SimTable;

@Repository
public interface SimDaoInterface extends JpaRepository<SimTable, Long> {

}
