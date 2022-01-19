package com.example.block.Services;

import com.example.block.entities.Transaction;
import org.springframework.stereotype.Service;


public interface TransactionService {
    public void signTransaction(Transaction transaction);
}
