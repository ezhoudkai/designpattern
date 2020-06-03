package behavioralmodel.templatemethod;

public class ConcreteTemplate extends AbstractTemplate{
    @Override
    void doSomeThing() {
        System.out.println("这里是具体要做的事，我是事情1.");
    }

    @Override
    void end() {
        System.out.println("这里是结束的地方，我是结束1");
    }
}
