package structuralmodel.adapter;

public class AdapterTwo extends AdapteeTwo implements Target{
    @Override
    public void request() {
        specialRequest();
    }
}
