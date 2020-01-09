package com.czetsuya.data.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.czetsuya.data.entity.Menu;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {

    @Query("SELECT DISTINCT m FROM Menu m JOIN m.roles r WHERE r IN :roleNames")
    List<Menu> findMenuByRoles(@Param("roleNames") List<String> roleNames);
}
