package creativemodel.prototype;

public class RealPrototype implements Cloneable {

    public RealPrototype(){
        System.out.println("具体原型类初始化。");
    }

    public Object clone() throws CloneNotSupportedException {

        System.out.println("具体原型复制成功。");
        return super.clone();
    }

}
