import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name){
        this.belly = new ArrayList<Salmon>();
        this.name = name;
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void eatSalmonFromRiver(River river, Salmon salmon) {
        this.belly.add(salmon);
        river.deactivateSalmon(salmon);
    }

    public void sleep() {
        this.belly.clear();
    }
}
