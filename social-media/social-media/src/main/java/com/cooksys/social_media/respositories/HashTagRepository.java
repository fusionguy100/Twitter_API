package com.cooksys.social_media.respositories;

import com.cooksys.social_media.entities.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashTagRepository extends JpaRepository<Hashtag, Long> {
}
