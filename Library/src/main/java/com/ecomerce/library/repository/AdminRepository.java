package com.ecomerce.library.repository;

import com.ecomerce.library.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
public interface AdminCatagory extends JpaRepository<Admin,Double>{
    Admin findAdminBy(String username);
}