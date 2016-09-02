package fb2;

import javax.xml.bind.annotation.*;

/**
 * Created by hav on 22.08.16.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Genre {

    @XmlValue
    FB2GenreCode code;
    @XmlTransient
    String name;
    @XmlTransient
    String rusName;
    @XmlTransient
    String group;

    public FB2Genre() {
    }

    public FB2Genre(FB2GenreCode code, String name, String rusName, String group) {
        this.code = code;
        this.name = name;
        this.rusName = rusName;
        this.group = group;
    }

    public FB2Genre(String code) {
        this(FB2GenreCode.fromValue(code), "", "", "");
    }

    public FB2GenreCode getCode() {
        return code;
    }

    public void setCode(FB2GenreCode code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "FB2Genre{" +
                "code=" + code +
                '}';
    }
}
