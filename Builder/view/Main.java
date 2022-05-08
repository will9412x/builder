package ESIIIBuilderProduct.view;

import java.util.ArrayList;

import ESIIIBuilderProduct.model.Produto;
import ESIIIBuilderProduct.model.ProdutoBuilder;
import ESIIIBuilderProduct.model.TamanhoCamiseta;
import ESIIIBuilderProduct.model.TipoArmazenamento;
import ESIIIBuilderProduct.model.TipoCalcado;
import ESIIIBuilderProduct.model.VideogameJogoEletronico;

class Principal {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    Produto calcado1 = ProdutoBuilder.builder()
        .addTamanho(35)
        .addCor("Amarelo")
        .addTipo(TipoCalcado.SOCIAL)
        .addValor(150)
        .get();

    Produto calcado2 = ProdutoBuilder.builder()
        .addTamanho(43)
        .addCor("Preto")
        .addTipo(TipoCalcado.TENIS)
        .addValor(1000)
        .get();

    Produto calcado3 = ProdutoBuilder.builder()
        .addTamanho(36)
        .addCor("Vermelho")
        .addTipo(TipoCalcado.SOCIAL)
        .addValor(5000)
        .get();

    Produto camiseta1 = ProdutoBuilder.builder()
        .addTamanho(TamanhoCamiseta.PP)
        .addCor("Vermelho")
        .addMarca("Nike")
        .addValor(350)
        .get();

    Produto camiseta2 = ProdutoBuilder.builder()
        .addTamanho(TamanhoCamiseta.GG)
        .addCor("Cinza")
        .addMarca("Lacoste")
        .addValor(1000)
        .get();

    Produto camiseta3 = ProdutoBuilder.builder()
        .addTamanho(TamanhoCamiseta.M)
        .addCor("Damasco")
        .addMarca("Gucci")
        .addValor(10000)
        .get();

    Produto jogo1 = ProdutoBuilder.builder()
        .addNome("GTA V")
        .addVideogame(VideogameJogoEletronico.XBOX)
        .addValor(150)
        .get();

    Produto jogo2 = ProdutoBuilder.builder()
        .addNome("Super Mario Bros.")
        .addVideogame(VideogameJogoEletronico.SWITCH)
        .addValor(450)
        .get();

    Produto jogo3 = ProdutoBuilder.builder()
        .addNome("The Last of Us")
        .addVideogame(VideogameJogoEletronico.PLAYSTATION)
        .addValor(150)
        .get();

    Produto armazenamento1 = ProdutoBuilder.builder()
        .addTipo(TipoArmazenamento.SSD)
        .addCapacidade(240)
        .addFabricante("Seagate")
        .addValor(450)
        .get();

    Produto armazenamento2 = ProdutoBuilder.builder()
        .addTipo(TipoArmazenamento.MS_NVME)
        .addCapacidade(240)
        .addFabricante("Samsung")
        .addValor(1000)
        .get();

    Produto armazenamento3 = ProdutoBuilder.builder()
        .addTipo(TipoArmazenamento.HDD)
        .addCapacidade(1000)
        .addFabricante("Sandisk")
        .addValor(350)
        .get();

    produtos.add(calcado1);
    produtos.add(calcado2);
    produtos.add(calcado3);
    produtos.add(camiseta1);
    produtos.add(camiseta2);
    produtos.add(camiseta3);
    produtos.add(jogo1);
    produtos.add(jogo2);
    produtos.add(jogo3);
    produtos.add(armazenamento1);
    produtos.add(armazenamento2);
    produtos.add(armazenamento3);

    System.out.println(produtos.toString());
  }
}