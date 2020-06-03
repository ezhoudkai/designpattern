package creativemodel.prototype;

public class Client {
        public static void main(String args[]) throws CloneNotSupportedException {
                RealPrototype realPrototype = new RealPrototype();

                RealPrototype copyPrototype = (RealPrototype) realPrototype.clone();

                System.out.println(realPrototype == copyPrototype);

        }
}
