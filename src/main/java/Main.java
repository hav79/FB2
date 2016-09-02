import fb2.FB2Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by hav on 27.08.16.
 */
public class Main {

    public static void main(String[] args) {

//        FB2Document document = new FB2Document("test2.fb2");
//        FB2TitleInfo titleInfo = new FB2TitleInfo();
//        titleInfo.setTitle("Test title");
////        titleInfo.setGenres(Arrays.asList(new FB2Genre("sf")));
//        titleInfo.setLang("ru");
//        titleInfo.setSrcLang("en");
//        FB2Person author = new FB2Person();
//        author.setFirstName("Name");
//        author.setLastName("LastName");
//        titleInfo.addAuthor(author);
//        document.setTitleInfo(titleInfo);

        try {
            JAXBContext context = JAXBContext.newInstance(FB2Document.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            marshaller.marshal(document, new File(document.getFilename()));

            Unmarshaller unmarshaller = context.createUnmarshaller();
            FB2Document document1 = (FB2Document) unmarshaller.unmarshal(new File("test4.fb2"));
            System.out.println(document1.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
