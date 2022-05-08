package ESIIIBuilderProduct.model;

public class ProdutoBuilder {
  private Produto produto;

  ProdutoBuilder() {
    this.produto = new Produto();
  }

  public static ProdutoBuilder builder() {
    return new ProdutoBuilder();
  }

  public ProdutoBuilder addNome(String nome) {
    produto.setNome(nome);
    return this;
  }

  public ProdutoBuilder addValor(int valor) {
    produto.setValor(valor);
    return this;
  }

  public ProdutoBuilder addCor(String cor) {
    produto.setCor(cor);
    return this;
  }

  public ProdutoBuilder addVideogame(VideogameJogoEletronico videogame) {
    produto.setVideogame(videogame);
    return this;
  }

  public ProdutoBuilder addTamanho(int tamanho) {
    if (tamanho < 35 || tamanho > 44) {
      produto.setTamanho(tamanho);
    }

    return this;
  }

  public ProdutoBuilder addTamanho(TamanhoCamiseta tamanho) {
    produto.setTamanho(tamanho);
    return this;
  }

  public ProdutoBuilder addTipo(TipoArmazenamento tipo) {
    produto.setTipo(tipo);
    return this;
  }

  public ProdutoBuilder addTipo(TipoCalcado tipo) {
    produto.setTipo(tipo);
    return this;
  }

  public ProdutoBuilder addMarca(String marca) {
    produto.setMarca(marca);
    return this;
  }

  public ProdutoBuilder addCapacidade(int capacidade) {
    produto.setCapacidade(capacidade);
    return this;
  }

  public ProdutoBuilder addFabricante(String fabricante) {
    produto.setFabricante(fabricante);
    return this;
  }

  public Produto get() {
    return this.produto;
  }
}
