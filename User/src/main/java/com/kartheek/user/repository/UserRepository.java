package com.kartheek.user.repository;


import com.kartheek.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  //  Boolean existsByUserEmail(String email);
}
