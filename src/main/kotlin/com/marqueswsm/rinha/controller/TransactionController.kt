package com.marqueswsm.rinha.controller

import com.marqueswsm.rinha.dto.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TransactionController {

    @PostMapping("/clients/{id}/transacoes")
    fun createTransaction(@PathVariable id: Long): TransactionResponseDTO {
        return TransactionResponseDTO(1000, 1000)
    }

    @GetMapping("/clients/{id}/extrato")
    fun getTransactions(@PathVariable id: Long): Statements {
        return Statements(
            saldo = Saldo(1000, "2021-01-01", 1000),
            ultimas_transacoes = listOf(
                TransactionDTO(100, transactionType.C, "Depósito", "2021-01-01"),
                TransactionDTO(50, transactionType.D, "Saque", "2021-01-02")
            )
        )
    }
}