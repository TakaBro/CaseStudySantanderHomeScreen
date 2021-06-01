package com.santanderhomescreen.data.local

import com.santanderhomescreen.data.Cartao
import com.santanderhomescreen.data.Cliente
import com.santanderhomescreen.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Lukas")
        val cartao = Cartao("123456789")
        return Conta("445655-4",
            "6552-4",
            "R$ 2450,80",
            "4.120,00",
            cliente,
            cartao)
    }
}