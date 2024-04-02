public class Main {
    public static void main(String[] args) {

        ItemMenu hamburguer = new ItemMenu("Hamburguer", "Hamburguer artesanal com queijo cheddar, alface e tomate", 15.0, true);
        ItemMenu salada = new ItemMenu("Salada", "Salada de folhas verdes com tomate e molho", 8.0, true);
        ItemMenu sorvete = new ItemMenu("Sorvete", "Sorvete de chocolate com cobertura de caramelo salgado", 12.0, false);

        System.out.println("Nome do hamburguer: " + hamburguer.getNome());
        System.out.println("Descrição da salada: " + salada.getDescricao());
        System.out.println("Preço do sorvete: $" + sorvete.getPreco());
        System.out.println("Disponibilidade do hamburguer: " + (hamburguer.isDisponivel() ? "Disponível" : "Indisponível"));

        System.out.println("O hamburguer está em promoção? " + (hamburguer.estaEmPromocao() ? "Sim" : "Não"));
        System.out.println("A salada está em promoção? " + (salada.estaEmPromocao() ? "Sim" : "Não"));
        System.out.println("O sorvete está em promoção? " + (sorvete.estaEmPromocao() ? "Sim" : "Não"));

        sorvete.setPreco(10.0); //
        hamburguer.setDisponivel(false);

        System.out.println("Novo preço do sorvete: $" + sorvete.getPreco());
        System.out.println("Disponibilidade do hamburguer após atualização: " + (hamburguer.isDisponivel() ? "Disponível" : "Indisponível"));
    }
}