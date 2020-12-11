import javax.xml.bind.annotation.*;

@XmlRootElement (name="train")
public class Train {
    private String id;
    private String from;
    private String to;
    private String date;
    private String departure;

    public Train(String id, String from, String to, String date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public Train() {
    }

    public String getId() {
        return id;
    }

    @XmlElement
    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }
    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }
    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }
    @XmlElement
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Train{" +
                "Id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
