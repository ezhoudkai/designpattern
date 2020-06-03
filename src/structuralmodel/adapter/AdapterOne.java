package structuralmodel.adapter;

public class AdapterOne extends AdapteeOne implements Target{
    @Override
    public void request() {
            specialRequest();
    }

}
