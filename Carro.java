public class Carro extends Brinquedo {

    public Carro(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
    }
    @Override
    public void mover(){
        int velocidade = (getVelocidade() * 4) + 15;
        System.out.println(velocidade);
    }
}
