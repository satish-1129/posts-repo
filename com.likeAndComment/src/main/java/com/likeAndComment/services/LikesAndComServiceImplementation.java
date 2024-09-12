package com.likeAndComment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likeAndComment.repositories.LikesAndComRepository;

@Service
public class LikesAndComServiceImplementation 
{
		@Autowired
		LikesAndComRepository repo;
		
		public void createPost(Post post)
		{
			repo.save(post);
		}

		public List<Post> fetchAllPosts() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
	}

}
