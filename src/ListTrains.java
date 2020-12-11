import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement(name="trains")
public class ListTrains {

    private ArrayList<Train> trains= new ArrayList<>();

    public ListTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ListTrains() {

    }

    public ArrayList<Train> getTrains() {
        return trains;
    }
    public Train  searchById (String Id) {

        for(Train t:this.trains) {
            if(t.getId().equals(Id))
        return  t;
        }
        return null;
    }
    @XmlElement(name = "train")
    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public void  addTrain (Train train){
        this.trains.add(train);
    }

    @Override
    public String toString() {
        return "ListTrains{" +
                "trains=" + trains +
                '}';
    }
}
