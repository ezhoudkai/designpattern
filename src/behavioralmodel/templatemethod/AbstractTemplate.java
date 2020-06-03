package behavioralmodel.templatemethod;

public abstract class AbstractTemplate {

    public void templateMethod(){
        register();
        login();
        doSomeThing();
        end();
    }

    public void register(){
        System.out.println("1.注册");
    }

    public void login(){
        System.out.println("2.登陆");
    }

    abstract void doSomeThing();

    abstract void end();

}
