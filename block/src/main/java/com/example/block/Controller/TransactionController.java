package com.example.block.Controller;


import com.example.block.Services.BlockService;
import com.example.block.Services.BlockchainService;
import com.example.block.Services.TransactionService;
import com.example.block.entities.Block;
import com.example.block.entities.BlockChain;
import com.example.block.entities.Transaction;
import com.example.block.repositories.BlockChaineRepository;
import com.example.block.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;


import java.security.NoSuchAlgorithmException;


@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository ;
    @Autowired
    private BlockchainService blockchainService;
    @Autowired
    private BlockService blockService;
    @Autowired
    private BlockChaineRepository blockChaineRepository;
    @Autowired
    TransactionService transactionService;
    @Autowired
    private JmsTemplate jmsTemplate;


    @PostMapping("/sign")
    public void sign(@RequestBody Transaction transaction){

        System.out.println(transaction.toString()+"...............");


    }

    @GetMapping("/mine/{id}")
    public Block mine(@PathVariable String id) throws NoSuchAlgorithmException {
        BlockChain blockChain = blockChaineRepository.findById(id).get();
        Block blockMiner = blockService.mining(blockChain);
        Block block = blockchainService.minerBlock(null,blockMiner,blockChain);
        transactionRepository.deleteAll();
        return block;
    }


}
