package creativemodel.builder;

public interface AbstractBuilder {

    Product product = new Product();

    void buildPartA();
    void buildPartB();
    void buildPartC();

    default Product getResult(){
        return product;
    }

}
