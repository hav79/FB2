package fb2;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by hav on 19.08.16.
 */
@XmlRootElement(name = "FictionBook")
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Document {

    @XmlTransient
    public static final String fb2NS = "http://www.gribuser.ru/xml/fictionbook/2.0";

    public FB2Description description = new FB2Description();
    @XmlTransient
    private String filename;



    @XmlElement
    private FB2Body body;

    @XmlElement(name = "binary")
    private List<FB2Binary> binaries;
//    @XmlJavaTypeAdapter(FB2BinaryAdapter.class)
//    private Map<String, FB2Binary> binaries = new HashMap<>();

    public FB2Document() {
    }

    public FB2Document(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FB2TitleInfo getTitleInfo() {
        return description.getTitleInfo();
    }

    public void setTitleInfo(FB2TitleInfo titleInfo) {
        this.description.setTitleInfo(titleInfo);
    }

    public FB2TitleInfo getSrcTitleInfo() {
        return description.getSrcTitleInfo();
    }

    public void setSrcTitleInfo(FB2TitleInfo srcTitleInfo) {
        this.description.setSrcTitleInfo(srcTitleInfo);
    }

    public FB2DocumentInfo getDocumentInfo() {
        return description.getDocumentInfo();
    }

    public void setDocumentInfo(FB2DocumentInfo documentInfo) {
        this.description.setDocumentInfo(documentInfo);
    }

    public FB2PublishInfo getPublishInfo() {
        return description.getPublishInfo();
    }

    public void setPublishInfo(FB2PublishInfo publishInfo) {
        this.description.setPublishInfo(publishInfo);
    }

    public FB2Body getBody() {
        return body;
    }

    public void setBody(FB2Body body) {
        this.body = body;
    }

    public List<FB2Binary> getBinaries() {
        return binaries;
    }

    public void setBinaries(List<FB2Binary> binaries) {
        this.binaries = binaries;
    }

    //    public Map<String, FB2Binary> getBinaries() {
//        return binaries;
//    }
//
//    public void setBinaries(Map<String, FB2Binary> binaries) {
//        this.binaries = binaries;
//    }
//
//    public void addBinary(String name, FB2Binary binaries) {
//        this.binaries.put(name, binaries);
//    }
//
//    public FB2Binary getBinaries(String name) {
//        return this.binaries.get(name);
//    }

//    public FB2Binary getCover() {
//        return this.getBinaries(getTitleInfo().getCoverName());
//    }

    @Override
    public String toString() {
        return "FB2Document{" +
                "file: " + filename + '\n' + description;
//                ", titleInfo=" + getTitleInfo() +
//                ", srcTitleInfo=" + getSrcTitleInfo() +
//                ", documentInfo=" + getDocumentInfo() +
//                ", publishInfo=" + getPublishInfo() +
//                ", body=" + body +
//                ", binaries=" + binaries +
//                '}';
    }
}
