package com.example.block.repositories;



import com.example.block.entities.BlockChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BlockChaineRepository extends JpaRepository<BlockChain,String> {
}
