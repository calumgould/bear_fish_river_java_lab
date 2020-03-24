import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> fish;

    public River(){
        this.fish = new ArrayList<Salmon>();
    }

    public int fishCount() {
        return this.fish.size();
    }

    public void addFish(Salmon salmon) {
        this.fish.add(salmon);
    }

    public void deactivateSalmon(Salmon salmon) {
        this.fish.remove(salmon);
    }
}
