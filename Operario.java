public class Operario extends Empregado{
    private int valorProducao;
    private double comissao;

    public double calcularSalario(){
        comissao = valorProducao * 0.10;
        return getSalarioBase() + comissao - getImposto();
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, int valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public int getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
