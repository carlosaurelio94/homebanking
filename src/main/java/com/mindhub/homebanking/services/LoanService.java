package com.mindhub.homebanking.services;

import com.mindhub.homebanking.dtos.LoanDTO;
import com.mindhub.homebanking.models.Loan;

import java.util.Set;

public interface LoanService {

    Set<LoanDTO> getLoanDTO();

    Loan getLoan(long id);

    }
