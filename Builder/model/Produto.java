package ESIIIBuilderProduct.model;

public class Produto {
  private int valor;
  private int capacidade;
  private String nome;
  private String cor;
  private String marca;
  private String fabricante;
  private Object tamanho;
  private Object tipo;
  private VideogameJogoEletronico videogame;

  public int getValor() {
    return this.valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getCapacidade() {
    return this.capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getFabricante() {
    return this.fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public Object getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(Object tamanho) {
    this.tamanho = tamanho;
  }

  public Object getTipo() {
    return this.tipo;
  }

  public void setTipo(Object tipo) {
    this.tipo = tipo;
  }

  public VideogameJogoEletronico getVideogame() {
    return this.videogame;
  }

  public void setVideogame(VideogameJogoEletronico videogame) {
    this.videogame = videogame;
  }

  @Override
  public String toString() {
    return "{" +
        " \"valor\"='" + getValor() + "'" +
        ", \"capacidade\"='" + getCapacidade() + "'" +
        ", \"nome\"='" + getNome() + "'" +
        ", \"cor\"='" + getCor() + "'" +
        ", \"marca\"='" + getMarca() + "'" +
        ", \"fabricante\"='" + getFabricante() + "'" +
        ", \"tamanho\"='" + getTamanho() + "'" +
        ", \"tipo\"='" + getTipo() + "'" +
        ", \"videogame\"='" + getVideogame() + "'" +
        "}";
  }

}
