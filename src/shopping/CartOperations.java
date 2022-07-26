package shopping;

public abstract class CartOperations {

    //valor total dos produtos no carrinho
    public abstract void getCartTotalPrice();

    //cria apenas uma lista apenas com os preços dos produtos
    public void listCartPrice(){}

    //conta a quantidade de itens do carrinho
    public void itensCount(){}
}

