package school.com.sib.entities

class ContaCorrente {

    private var saldo : Double = 0.0;

    fun creditar(valor: Double){
        saldo += valor
    }

    fun debitar(valor: Double){
        if(valor > saldo){
            throw RuntimeException("Saldo Insuficiente")
        }
        saldo -= valor
    }

    fun consultarSaldo() = saldo
}
