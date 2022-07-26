package shopping;
import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Product> products = new ArrayList<Product>();

    public Products(){
        this.storeItens();
    }

    private void storeItens() {
        this.products.add(new Product(products.size(), "Perfume", "Boticário", "Cheiroso", 100.00, 10.00));
        this.products.add(new Product(products.size(), "Oléo Corporal", "Boticário", "Cheiroso demais", 80.00, 10.00));
        this.products.add(new Product(products.size(), "Sabonete", "Boticário", "Bonito e cheiroso", 50.00, 10.00));
        this.products.add(new Product(products.size(), "Desodorante", "Boticário", "Belo", 40.00, 10.00));
        this.products.add(new Product(products.size(), "Batom", "Boticário", "Barato", 10.00, 10.00));
        this.products.add(new Product(products.size(), "Creme", "Boticário", "Atraente", 90.00, 10.00));
    }

    //O método tem de retorno uma lista e retorna a lista de produtos
    
    public List<Product> getProducts(){
        return products;
    }
    
}
