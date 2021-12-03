package com.example.block.repositories;

import com.example.block.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BlockRepository extends JpaRepository<Block,String> {
}
