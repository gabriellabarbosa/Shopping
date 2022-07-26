package shopping;
import java.util.ArrayList;
import java.util.List;

public class Cart extends CartOperations {
    
    List<Product> cartItens = new ArrayList<Product>();

    //1 adicionar produto
    //2 remover produto
    //3 obter produto por Id
    //4 listar produtos

    // buscar um produto cadastrado e adicionar na coleção de produtos do carrinho 
    public void addProduct(Integer id) {     
        Product product = getProductById(id);
        addToCart(product);
    }

    // adicionando um produto na coleção do carrinho
    private void addToCart(Product product) {
        cartItens.add(product);
    }

    //remover item do carrinho
    public void removeProduct(Integer id) {
        Product product = getProductById(id);
        cartItens.remove(product);
    }

    //método para buscar um produto cadastrado no estoque
    private Product getProductById(Integer id) {

        //produto em estoque que será adicionado ao carrinho
        Product product = null;
        
        //Lista de produtos em estoque
        List<Product> products = new Products().getProducts();
        
        //procutando um elemento no estoque com base no id
        for (Product prod : products) {
            
            if (prod.getId() == id) {
                //elemento encontrado
                product = prod;
            }
        }
        return product;
    }

    //exibir o carrinho
    public void printCart(){
        for (Product product : cartItens) {
            System.out.println("Nome do produto: " + product.getName());
            System.out.println("Marca do produto: " + product.getBrand());
            System.out.println("Descricao do produto: " + product.getDescription());
            System.out.println("Preco do produto: " + product.getPrice());
            System.out.println();
        }
    }

    //implementação do método abstrato da classe CartOperations
    @Override
    public void getCartTotalPrice() {
        //Stream reduce() que retorna a soma dos preços dos produtos no carrinho
        Double totalPrice = cartItens.stream()
        .map(cartItem -> cartItem.getPrice())
        .reduce(0.0, (subtotal, cartItem) -> subtotal + cartItem);
        System.out.println(totalPrice);
    }

    //implementação do método da classe CartOperations
    @Override
    public void listCartPrice() {
        //Stream map() que gera uma nova lista contendo os preços dos itens no carrinho
          List<Double> cartPrices = cartItens.stream().map(cartItem -> cartItem.getPrice()).toList();
          cartPrices.stream().forEach(cartPrice -> System.out.println(cartPrice));
    }

    
    //implementação do método da classe CartOperations
    @Override
    public void itensCount() {
        //Stream count() que conta a quantidade de itens no carrinho
        Long itemsQt = cartItens.stream().count();
        System.out.println(itemsQt);
    }  
}