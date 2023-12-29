package com.ecomerce.library.service;

import com.ecomerce.library.dto.AdminDto;
import com.ecomerce.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
