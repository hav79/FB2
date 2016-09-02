package fb2;

import javax.xml.bind.annotation.*;

/**
 * Created by hav on 22.08.16.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Binary {

    @XmlAttribute(name = "id")
    String name;
    @XmlAttribute(name = "content-type")
    String mediaType;
    @XmlValue
    byte[] data;

    public FB2Binary() {
    }

    public FB2Binary(String name, String mediaType, byte[] data) {
        this.name = name;
        this.mediaType = mediaType;
        this.data = data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }

    public String getMediaType() {
        return mediaType;
    }
}
