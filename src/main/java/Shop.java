import Sellable.Isellable;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Isellable> Sellables = new LinkedList<Isellable>();

    public void addSellable(Isellable sellable){
        Sellables.add(sellable);
    }

    public List<Isellable> getSellables() {
        return Sellables;
    }

    public void purchase(Isellable sellable){
        String message =String.format("Do you wantt to buy %s for %s", sellable.getName(), sellable.getPrice());
    }
}
