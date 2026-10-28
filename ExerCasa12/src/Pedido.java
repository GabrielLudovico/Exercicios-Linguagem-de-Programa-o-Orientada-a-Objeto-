public class Pedido {

    private String nomeCliente;
    private double valorProdutos;
    private double distancia;
    private int tipoEntrega;
    private int formaPagamento;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(double valorProdutos) {
        if (valorProdutos <= 0) {
            System.out.println("Valor dos produtos inválido");
        } else {
            this.valorProdutos = valorProdutos;
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia <= 0) {
            System.out.println("Distância inválida");
        } else {
            this.distancia = distancia;
        }
    }

    public int getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(int tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double calcularTaxaEntrega() {
        double taxa;
        if (tipoEntrega == 1) {
            taxa = 5;

            if (distancia > 5) {
                taxa = taxa + (distancia - 5) * 2;
            }

        } else {
            taxa = 10;

            if (distancia > 5) {
                taxa = taxa + (distancia - 5) * 3;
            }
        }

        return taxa;
    }

    public double calcularDesconto() {
        if (valorProdutos >= 150 && formaPagamento == 1) {
            return valorProdutos * 0.10;
        }

        return 0;
    }

    public double calcularValorFinal() {
        return valorProdutos - calcularDesconto()
                + calcularTaxaEntrega();
    }
}