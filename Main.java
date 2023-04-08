public class Main {
    public static void main(String[] args) {

        Fornecedor logitec = new Fornecedor(
                "Logitech",
                "Av. Brasil 123",
                "98989898",
                5000.00,
                4000
        );
        System.out.println("Empresa");
        System.out.println("Nome: " + logitec.getNome());
        System.out.println("Endereço: " + logitec.getEndereco());
        System.out.println("Telefone: " + logitec.getTelefone());
        System.out.println("Valor do crédito: R$" + logitec.getValorCredito());
        System.out.println("Valor da dívida: R$" + logitec.getValorDivida());
        System.out.println("Saldo: R$" + logitec.obterSaldo());
        System.out.println("--------------------------------------------");
        Empregado empregado = new Empregado(
                "Tiago",
                "Rua Vera Cruz, 21",
                "54545454",
                55,
                2589.58,
                450
                );
        System.out.println("Empregado");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("COD Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: R$" + empregado.getSalarioBase());
        System.out.println("Quanto paga de Imposto?: R$" + empregado.getImposto());
        System.out.println("Salario Final: R$" + empregado.calcularSalario());
        System.out.println("--------------------------------------------");

        Administrador administrador = new Administrador(
                "José",
                "Rua Nova 32",
                "5689653",
                78966,
                5000,
                350,
                890
        );
        System.out.println("Administrador");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("COD Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: R$" + administrador.getSalarioBase());
        System.out.println("Quanto paga de Imposto?: R$" + administrador.getImposto());
        System.out.println("Qual sua ajuda de custo: R$" + administrador.getAjudaDeCusto());
        System.out.println("Salario Final: R$" + administrador.calcularSalario());

        Operario operario = new Operario(
                "Raphael",
                "Rua Palmares",
                "123456",
                7893666,
                7899,
                450,
                425,
                125
        );

        System.out.println("--------------------------------------------");
        System.out.println("Operario");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("COD Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: R$" + operario.getSalarioBase());
        System.out.println("Quanto paga de Imposto?: R$" + operario.getImposto());
        System.out.println("Qual valor da sua Comissão?: R$" + operario.getComissao());
        System.out.println("Salario Final: R$" + operario.calcularSalario());

        Vendedor vendedor = new Vendedor(
                "Maria",
                "Rua Matriz",
                "89888855",
                889988,
                2500,
                536,
                1236,
                236
        );

        System.out.println("--------------------------------------------");
        System.out.println("Operario");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("COD Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: R$" + vendedor.getSalarioBase());
        System.out.println("Quanto paga de Imposto?: R$" + vendedor.getImposto());
        System.out.println("Qual valor da sua Comissão?: R$" + vendedor.getComissao());
        System.out.println("Salario Final: R$" + vendedor.calcularSalario());
    }
}