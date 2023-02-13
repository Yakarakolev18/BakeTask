import java.util.ArrayList;

public class PastryBaker {
    private ArrayList<Pastry> pastries;
    private ArrayList<Baker> bakers;

    public PastryBaker(ArrayList<Pastry> pastries, ArrayList<Baker> bakers) {
        this.pastries = pastries;
        this.bakers = bakers;
    }

    public ArrayList<Pastry> getpastries() {
        return pastries;
    }

    public void setPastry(ArrayList<Pastry> pastries) {
        this.pastries = pastries;
    }

    public ArrayList<Baker> getbakers() {
        return bakers;
    }

    public void setBaker(ArrayList<Baker> bakers) {
        this.bakers = bakers;
    }

    public void addElements(Baker baker, Pastry pastry){
        pastries.add(pastry);
        bakers.add(baker);
    }
    public void returnInfo(ArrayList<PastryBaker> pastryBakers) {
        for (PastryBaker pb : pastryBakers) {
            System.out.println(pb.toString());
        }
    }
    public ArrayList<Pastry> pastries(int bakerId){}

    @Override
    public String toString() {
        return "PastryBaker{" +
                "pastry=" + pastries +
                ", baker=" + bakers +
                '}';
    }
}
