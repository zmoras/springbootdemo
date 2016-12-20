package com.omegacode.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.omegacode.entity.Size;

public interface SizeRepository extends CrudRepository<Size, BigInteger>{

}
