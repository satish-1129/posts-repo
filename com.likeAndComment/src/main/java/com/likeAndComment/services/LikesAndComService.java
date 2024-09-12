package com.likeAndComment.services;

import java.util.List;

import com.likeAndComment.entities.LikesAndCom;

public interface LikesAndComService {

	void createPost(LikesAndCom lac);

	List<LikesAndCom> fetchAllPosts();

}
