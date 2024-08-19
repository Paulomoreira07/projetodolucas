package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ContaAReceber implements ContaInterface{
    private List<Pagamento> pagamentoList;
    private float valor;
    private String fonte;

    public ContaAReceber(float valor, String fonte) {
        pagamentoList = new ArrayList<Pagamento>();
        this.valor = valor;
        this.fonte = fonte;
    }

    @Override
    public String toString() {
        return "ContaAReceber{" +
                "pagamentoList=" + pagamentoList +
                ", valor=" + valor +
                ", fonte='" + fonte + '\'' +
                '}';
    }

    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    private double valorPago = 0;
    @Override
    public void addPagamento(Pagamento p) throws Exception {
        if( valorPago+getValor()>valor)
            throw new Exception("Valor Excedeu a conta!!!");
        pagamentoList.add(p);
        valorPago = valorPago + p.getValor();
    }
}
