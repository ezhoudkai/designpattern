package creativemodel.singleton;

public class HungrySingleModel {

    private static final HungrySingleModel hungrySingleModel = new HungrySingleModel();

    private HungrySingleModel(){};

     public static HungrySingleModel getInstance() {
        return hungrySingleModel;
    }

}
