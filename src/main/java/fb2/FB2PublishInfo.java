package fb2;

import fb2.Exceptions.ISBNFormatException;
import fb2.XMLAdapters.ISBNAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * Created by hav on 19.08.16.
 */

@XmlType(propOrder = {"title", "publisher", "city", "year", "isbn", "sequence"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2PublishInfo extends FB2Element {

    @XmlElement(name = "book-name")
    private String title;
    private String publisher;
    private String city;
    private Integer year;
    @XmlJavaTypeAdapter(ISBNAdapter.class)
    private List<ISBN> isbn;
    private FB2Sequence sequence;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }

    public List<ISBN> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<ISBN> isbn) {
        this.isbn = isbn;
    }

    public void addIsbn(String isbn) {
        try {
            this.isbn.add(new ISBN(isbn));
        } catch (ISBNFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public FB2Sequence getSequence() {
        return sequence;
    }

    public void setSequence(FB2Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public String getName() {
        return "publish-info";
    }

    @Override
    public String toString() {
        return "\t" + title + '\n' +
                "\t" + publisher + ", " + city + " (" + year + ")\n" +
                "\t" + "ISBN: " + isbn + '\n' + sequence;
//                (sequence != null ? (sequence.getName() + " - " + sequence.getNumber()) : "");
//                "FB2PublishInfo{" +
//                "title='" + title + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", city='" + city + '\'' +
//                ", year=" + year +
//                ", isbn=" + isbn +
//                ", sequence=" + sequence +
//                '}';
    }
}
