package com.likeAndComment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.likeAndComment.entities.LikesAndCom;

public interface LikesAndComRepository extends JpaRepository<LikesAndCom, Long> {

}
