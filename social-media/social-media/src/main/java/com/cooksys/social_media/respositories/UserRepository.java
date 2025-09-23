package com.cooksys.social_media.respositories;


import com.cooksys.social_media.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByCredentials_Username(String credentialsUsername);

}
