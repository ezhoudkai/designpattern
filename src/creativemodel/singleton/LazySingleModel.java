package creativemodel.singleton;

public class LazySingleModel {

    private static volatile LazySingleModel lazySingleModel = null;

    private LazySingleModel(){};

    public static synchronized LazySingleModel getInstance() {

         if(lazySingleModel == null){
             lazySingleModel = new LazySingleModel();
         }

         return lazySingleModel;
    }


}
