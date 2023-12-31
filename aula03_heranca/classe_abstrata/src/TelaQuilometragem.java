public class TelaQuilometragem extends ClasseAbstrata{
    /* Tela que mostra a kilometragem percorrida por
     um veiculo. */

    /* Atributo que guarda o valor da km atual
    do veiculo. */
    int km = 0;
  
    /*Construtor que iniciliza o titulo da tela.
     */
    public TelaQuilometragem() {
      /* Atribui o valor do titulo desta tela. */
      super.setTitulo("Km Atual");
    }
  
    /**
     * Implementa o método abstrato da classe Tela,
     * neste método buscamos a km atual do veiculo.
     * 
     * @return Texto com a km atual.
     */
    @Override
    public String obterInformacao() {
      km += 10;
      return String.valueOf(km) + " km";
    }
  }

