package fb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.UUID;

/**
 * Created by hav on 19.08.16.
 */

@XmlType(propOrder = {"authors", "programUsed", "date", "id", "version", "history"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2DocumentInfo {

    @XmlElement(name = "author")
    private List<FB2Person> authors;
    @XmlElement(name = "program-used")
    private String programUsed;
    private String date;
//    private FB2Date date;
//    private String id;
    private UUID id;
    private String version;
    private FB2Section history;
    //history???


    public List<FB2Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<FB2Person> authors) {
        this.authors = authors;
    }

    public void addAuthor(FB2Person author) {
        this.authors.add(author);
    }

    public String getProgramUsed() {
        return programUsed;
    }

    public void setProgramUsed(String programUsed) {
        this.programUsed = programUsed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public String getIdAsString() {
        return id.toString();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setIdFromString(String id) {
        this.id = UUID.fromString(id);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FB2Section getHistory() {
        return history;
    }

    public void setHistory(FB2Section history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "\t" + "authors: " + authors + '\n' +
                "\t" + "id: " + id.toString() + '\n' +
                "\t" + "v. " + version + " (" + date + ")" +
                "\tHistory:\n" + history;
//                "FB2DocumentInfo{" +
//                "authors=" + authors +
//                ", programUsed='" + programUsed + '\'' +
//                ", date=" + date +
//                ", id=" + id +
//                ", version='" + version + '\'' +
//                '}' + '\n';
    }
}
