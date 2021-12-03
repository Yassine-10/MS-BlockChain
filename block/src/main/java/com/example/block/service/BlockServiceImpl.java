package com.example.block.service;

import com.example.block.entities.Block;
import com.example.block.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class BlockServiceImpl implements BlockService{
    @Autowired
    BlockRepository blockRepository;
    @Override
    public void createBlock() {
        Block block=new Block();
        block.setDateCreation(new Date());
        block.setHashCode(calculerHash());

    }

    @Override
    public String calculerHash() {

        return null;
    }

    @Override
    public void minerBlock(int difficulte) {

    }
}
