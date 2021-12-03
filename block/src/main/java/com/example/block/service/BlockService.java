package com.example.block.service;

public interface BlockService {
    public void createBlock();
    public String calculerHash();
    public void minerBlock(int difficulte);
}
