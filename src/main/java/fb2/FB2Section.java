package fb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by hav on 29.08.16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Section {

    @XmlElement(name = "p")
    private List<String> paragraphs;

    public FB2Section() {
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (String s : paragraphs) {
            res.append("\t\t" + s + '\n');
        }
        return res.toString();
    }
}
