package structuralmodel.proxy;

public class RealSubject implements AbstractSubject{
    @Override
    public void Request() {
        System.out.println("访问真实主题");
    }
}
