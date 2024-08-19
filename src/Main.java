import Modelo.ContaAReceber;
import Modelo.Pagamento;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ContaAReceber cr = new ContaAReceber(1000,"Heloisa de Oliveira");
        System.out.println(cr);
        System.out.println(cr.getFonte());
        try {
            Pagamento p1 = new Pagamento(500, LocalDate.now());
            cr.addPagamento(p1);
            Pagamento p2 = new Pagamento(500, LocalDate.now());
            cr.addPagamento(p2);
            cr.addPagamento(new Pagamento(500,LocalDate.now()));
            System.out.println(cr);
            System.out.println(p1);
            System.out.println(p2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
