package com.toilet.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toilet.main.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
