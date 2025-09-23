package com.cooksys.social_media.respositories;

import com.cooksys.social_media.dtos.CredentialsDto;
import com.cooksys.social_media.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByCredentials_Username(String normalized);

    List<User> findAllByDeletedIsFalse();

    User findByCredentialsUsernameAndCredentialsPassword(String username, String password);

    boolean findByCredentialsUsernameAndDeletedIsFalse(String username);

    boolean findByCredentialsUsernameAndDeletedIsTrue(String credentials_username);
}
