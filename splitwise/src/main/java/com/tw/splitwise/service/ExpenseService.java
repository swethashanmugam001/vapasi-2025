package com.tw.splitwise.service;

import com.tw.splitwise.entity.Expense;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ExpenseService {

    boolean add(Expense expense);

    Map<String, Map<String, Double>> splitAllExpenses();

    Map<String, Map<String, Double>> netOffAllExpenses(Map<String, Map<String, Double>> originalSummary);

    Expense findById(int id);

    List<Expense> findAll();

    List<Expense> findBySenderName(String name);

    List<Expense> findByBeneficiaryName(String name);

    List<Expense> findByTransactionDate(Date transactionDate);

    List<Expense> findByCategory(String category);
}
