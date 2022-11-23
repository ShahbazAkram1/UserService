package com.Icwd.user.service.repository;

import com.Icwd.user.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, String> {
}
