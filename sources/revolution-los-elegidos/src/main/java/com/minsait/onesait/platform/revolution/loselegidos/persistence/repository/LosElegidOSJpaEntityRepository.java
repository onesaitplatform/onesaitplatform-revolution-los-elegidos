package com.minsait.onesait.platform.revolution.loselegidos.persistence.repository;

import com.minsait.onesait.platform.revolution.loselegidos.persistence.model.LosElegidOSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LosElegidOSJpaEntityRepository extends JpaRepository<LosElegidOSEntity, Integer> {

    Optional<LosElegidOSEntity> findById(Integer id);
}
