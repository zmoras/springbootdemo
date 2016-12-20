package com.omegacode.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.omegacode.repository.PieceRepository;
import com.omegacode.repository.SizeRepository;
import com.omegacode.repository.UserRepository;
import com.omegacode.repository.WardrobeRepository;

@Service
@Profile("unused")
public class DatabaseLoader {
	private final PieceRepository pieceRepository;
	private final SizeRepository sizeRepository;
	private final UserRepository userRepository;
	private final WardrobeRepository wardrobeRepository;

	@Autowired
	public DatabaseLoader(PieceRepository pieceRepository, SizeRepository sizeRepository, UserRepository userRepository,
			WardrobeRepository wardrobeRepository) {
		this.pieceRepository = pieceRepository;
		this.sizeRepository = sizeRepository;
		this.userRepository = userRepository;
		this.wardrobeRepository = wardrobeRepository;
	}

	@PostConstruct
	private void initDatabase() {
//		pieceRepository.deleteAll();
//		sizeRepository.deleteAll();
//		userRepository.deleteAll();
//		wardrobeRepository.deleteAll();

//		User user = new User();
//		user.setEmail("user@example.com");
//		user.setDisplayedName("First User <3");
//		user.setUsername("first1");
//		user.setPassword1("abcdef");
//		user.setConfirmationStatus(true);
//		userRepository.save(user);
	}
}
