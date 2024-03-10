package com.marqueswsm.rinha.dto

data class Saldo(
    val total: Int,
    val data_extrato: String,
    val limite: Int
)

data class Statements(
    val saldo: Saldo,
    val ultimas_transacoes: List<TransactionDTO>
)