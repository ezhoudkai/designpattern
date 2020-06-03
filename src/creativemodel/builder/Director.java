package creativemodel.builder;

public class Director {

    private AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder){
            this.abstractBuilder = abstractBuilder;
    }

    public Product construct(){
                abstractBuilder.buildPartA();
                abstractBuilder.buildPartB();
                abstractBuilder.buildPartC();
                return abstractBuilder.getResult();
    }


}
