package structuralmodel.proxy;

public class Proxy implements AbstractSubject{

    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        //代理的作用
        preRequest();
        realSubject.Request();
        afterRequest();
    }

    public void preRequest(){
            System.out.println("这里是请求前可以执行的操作");
    }

    public void afterRequest(){
            System.out.println("这里是请求后可以执行的操作");
    }
}
