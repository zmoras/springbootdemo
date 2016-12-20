package com.omegacode.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.omegacode.entity.Piece;

public interface PieceRepository extends CrudRepository<Piece, BigInteger>{

}
