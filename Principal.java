public class Principal {
    public static void main(String[] args){
        CadastroBrinquedo brinqs = new CadastroBrinquedo(3);

        Carro c1 = new Carro(40, 50);
        Barco b1 = new Barco(30,60);
        Aviao a1 = new Aviao(80,79);

        brinqs.adicionarBrinquedos(c1);
        brinqs.adicionarBrinquedos(b1);
        brinqs.adicionarBrinquedos(a1);

        brinqs.todoMundoSeMovendo();

    }
}
