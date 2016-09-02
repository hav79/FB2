package fb2;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * Created by hav on 14.08.16.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Sequence {

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "number")
    private Integer number;

    // FIXME Вложенные серии не работают.
    @XmlElement(name = "sequence")
    private List<FB2Sequence> childSequences;

    public FB2Sequence() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<FB2Sequence> getChildSequences() {
        return childSequences;
    }

    public void setChildSequences(List<FB2Sequence> childSequences) {
        this.childSequences = childSequences;
    }

    public void addChildSequence(FB2Sequence sequence) {
        this.childSequences.add(sequence);
    }

    public boolean hasChildren() {
        return !this.childSequences.isEmpty();
    }

    @Override
    public String toString() {
        return name + " - " + number;
//                "FB2Sequence{" +
//                "name='" + name + '\'' +
//                ", number=" + number +
//                '}';
    }
}
