package com.backend.backend.DataBaseaccessObject;

import com.backend.backend.Model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface D_Group extends JpaRepository<Group, Long> {

    @Query(value = "select a.Authority from `group` as g " +
            "left join Authority as a on a.A_ID = g.A_ID  " +
            "where g.G_ID = ?1", nativeQuery=true)
    List<String> getAuthoritybyGID(Long G_ID);
}
