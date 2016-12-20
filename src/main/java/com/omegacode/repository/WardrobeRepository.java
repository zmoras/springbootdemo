package com.omegacode.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.omegacode.entity.Wardrobe;

public interface WardrobeRepository extends CrudRepository<Wardrobe, BigInteger>{

}
