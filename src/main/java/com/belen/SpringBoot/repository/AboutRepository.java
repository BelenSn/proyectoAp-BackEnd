
package com.belen.SpringBoot.repository;

import com.belen.SpringBoot.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository <About, Long>{
    
}
