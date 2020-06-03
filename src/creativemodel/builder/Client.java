package creativemodel.builder;

public class Client {

        public static void main(String args[]){
            AbstractBuilder abstractBuilder = new ConcreteBuilder();

            Director director = new Director(abstractBuilder);

            Product product = director.construct();

            product.show();
        }
}
