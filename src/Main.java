import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        train.setId("1");
        train.setDate("01.02.2020");
        train.setDeparture("12:00");
        train.setFrom("Krivoj Rog");
        train.setTo("Kiev");

        Train trainTwo = new Train();
        trainTwo.setId("2");
        trainTwo.setDate("15.02.2020");
        trainTwo.setDeparture("15:00");
        trainTwo.setFrom("Krivoj Rog");
        trainTwo.setTo("Lvov");

        Train trainTree = new Train();
        trainTree.setId("3");
        trainTree.setDate("15.02.2020");
        trainTree.setDeparture("15:00");
        trainTree.setFrom("Krivoj Rog");
        trainTree.setTo("Zaporizhzhia");

        ArrayList<Train> trains = new ArrayList<>();
        trains.add(train);
        trains.add(trainTwo);
        trains.add(trainTree);

        ListTrains trainsForXML = new ListTrains();
        trainsForXML.setTrains(trains);

        СreatureXML.createXML(trainsForXML, "file.xml");
        ArrayList<Train> rezultByTimeAndDate = Filter.filterByDataAndTime("15.02.2020", "15:00", trainsForXML);

        for (Train t : rezultByTimeAndDate) {
            System.out.println(t);
        }
    }
}
