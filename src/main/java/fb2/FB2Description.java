package fb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by hav on 28.08.16.
 */

@XmlType(propOrder = {"titleInfo", "srcTitleInfo", "documentInfo", "publishInfo"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Description {

    @XmlElement(name = "title-info")
    private FB2TitleInfo titleInfo;
    @XmlElement(name = "src-title-info")
    private FB2TitleInfo srcTitleInfo;
    @XmlElement(name = "document-info")
    private FB2DocumentInfo documentInfo;
    @XmlElement(name = "publish-info")
    private FB2PublishInfo publishInfo;

    public FB2TitleInfo getTitleInfo() {
        return titleInfo;
    }

    public void setTitleInfo(FB2TitleInfo titleInfo) {
        this.titleInfo = titleInfo;
    }

    public FB2TitleInfo getSrcTitleInfo() {
        return srcTitleInfo;
    }

    public void setSrcTitleInfo(FB2TitleInfo srcTitleInfo) {
        this.srcTitleInfo = srcTitleInfo;
    }

    public FB2DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(FB2DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    public FB2PublishInfo getPublishInfo() {
        return publishInfo;
    }

    public void setPublishInfo(FB2PublishInfo publishInfo) {
        this.publishInfo = publishInfo;
    }

    @Override
    public String toString() {
        return "FB2Description{\n" +
                "title-info:\n" + titleInfo +
                ",\n src-title-info:\n" + srcTitleInfo +
                ",\n document-info:\n" + documentInfo +
                ",\n publish-info:\n" + publishInfo +
                '}';
    }
}
