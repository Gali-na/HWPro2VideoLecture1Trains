import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class СreatureXML {
    public static void createXML(ListTrains trains, String fileName) {
        JAXBContext jaxbC = null;
        Marshaller marSh = null;
        try {
            jaxbC = JAXBContext.newInstance(ListTrains.class);
            marSh = jaxbC.createMarshaller();
            marSh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marSh.marshal(trains, new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}





