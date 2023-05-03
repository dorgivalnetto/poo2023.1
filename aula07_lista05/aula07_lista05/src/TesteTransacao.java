public class TesteTransacao {
    public static void main(String[] args) throws Exception {

        /*
        PagamentoBoleto pagtoBoleto = new PagamentoBoleto();
        pagtoBoleto.setDescricao("Condomínio");
        pagtoBoleto.setValor(450);
        pagtoBoleto.setData("30/04/2023");
        pagtoBoleto.setLinhaDigitavel("1234 1234 1234");
        pagtoBoleto.setCedente("Condomínio UFCA Computação");
        pagtoBoleto.setDataVencimento("10/05/2023");
        pagtoBoleto.emitirComprovante();

        Transferencia transf1 = new Transferencia();
        transf1.setDescricao("Aluguel");
        transf1.setValor(1400);
        transf1.setData("02/05/2023");
        transf1.setContaOrigem("0001000123");
        transf1.setContaDestino("0001000965");
        transf1.emitirComprovante();

        Transacao_Heranca transf2 = new Transferencia();
        transf2.setDescricao("Plano de Saúde");
        transf2.setValor(1700);
        transf2.setData("01/05/2023");
        transf2.setContaOrigem("0001000123");
        */

        Transacao_Heranca transf3 = new Transferencia
        ("Aluguel", 1400, "30/04/2023",
         "0001000123", "0001000965");
        transf3.emitirComprovante();

        Transacao_Heranca pgto1 = new PagamentoBoleto
        ("Condomínio", 450, "30/04/2023", 
        "1234 1234 1234", "10/05/2023",
        "Condomínio UFCA Computação");
        pgto1.emitirComprovante();
    }
}
