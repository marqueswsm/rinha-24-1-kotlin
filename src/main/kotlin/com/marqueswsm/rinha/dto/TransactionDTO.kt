package com.marqueswsm.rinha.dto

enum class transactionType {
    C, D
}

data class TransactionDTO(
    val valor: Int,
    val tipo: transactionType,
    val descricao: String,
    val realizada_em: String
)

data class TransactionResponseDTO(
    val limit: Int,
    val saldo: Int,
)