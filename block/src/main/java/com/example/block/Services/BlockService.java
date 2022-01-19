package com.example.block.Services;


import com.example.block.entities.Block;
import com.example.block.entities.BlockChain;

import java.security.NoSuchAlgorithmException;

public interface BlockService  {

    public Block createBlock() throws NoSuchAlgorithmException;
    public String calculHashBlock(Block block) throws NoSuchAlgorithmException;
    public Block mining(BlockChain blockChain) throws NoSuchAlgorithmException;

}
