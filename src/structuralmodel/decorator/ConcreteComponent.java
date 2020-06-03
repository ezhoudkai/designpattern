package structuralmodel.decorator;

public class ConcreteComponent implements AbstractComponent{

    public ConcreteComponent(){
        System.out.println("这里是具体的构建角色");
    }

    @Override
    public void operation() {
        System.out.println("这里是具体的构建角色的操作方法");
    }
}
