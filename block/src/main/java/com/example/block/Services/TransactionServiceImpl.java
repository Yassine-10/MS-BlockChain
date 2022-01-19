package com.example.block.Services;

import com.example.block.entities.Transaction;
import com.example.block.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void signTransaction(Transaction transaction) {
        Transaction transaction1 = transaction ;
        transaction1.setDate(new Date());
        transactionRepository.save(transaction1);
    }
}
