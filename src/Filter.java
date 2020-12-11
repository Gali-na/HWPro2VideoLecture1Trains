import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Filter {
    private static ArrayList<Train> filterIDByDataAndTime(String data, String time) {
        Train train = new Train();
        boolean flag = false;
        ArrayList<Train> trains = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try { XMLStreamReader streamReader = factory.createXMLStreamReader(new FileInputStream("file.xml"));
            while ((streamReader.hasNext())) {
                int event = streamReader.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    if (streamReader.getLocalName().equals("date")) {
                        if (streamReader.getElementText().equals(data))
                            flag = true;
                    }
                    if (streamReader.getLocalName().equals("departure")) {
                        if (streamReader.getElementText().equals(time))
                            flag = true;
                    }
                    if (streamReader.getLocalName().equals("id")) {
                        if (flag == true) {
                            train.setId(streamReader.getElementText());
                            trains.add(train);
                            train = new Train();
                            flag = false;
                        }
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return trains;
    }
    public static ArrayList<Train> filterByDataAndTime(String data, String time, ListTrains trains) {
        ArrayList<Train> trainsId = filterIDByDataAndTime(data,time);
        ArrayList<Train> rezultByTimeAndDate = new ArrayList<>();
        for (Train t : trainsId) {
            Train temp = trains.searchById(t.getId());
            if (temp != null) {
                rezultByTimeAndDate.add(temp);
            }
        }
        return rezultByTimeAndDate;
    }
}
