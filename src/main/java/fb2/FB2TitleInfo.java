package fb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hav on 19.08.16.
 */
@XmlType(propOrder = {"genres", "authors", "title", "annotation", "date", "coverName", "lang", "srcLang", "translators", "sequences"})
@XmlAccessorType(XmlAccessType.FIELD)
public class FB2TitleInfo {

    @XmlElement(name = "book-title")
    private String title;
    @XmlElement(name = "genre")
    private List<FB2GenreCode> genres = new ArrayList<>();
    private String date;
    private String lang;
    @XmlElement(name = "src-lang")
    private String srcLang;

    @XmlElement(name = "author")
    private List<FB2Person> authors = new ArrayList<>();
    @XmlElement(name = "translator")
    private List<FB2Person> translators = new ArrayList<>();

    private String coverName;
    @XmlElement(name = "sequence")
    private List<FB2Sequence> sequences = new ArrayList<>();

    //annotation???
    private FB2Section annotation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FB2GenreCode> getGenres() {
        return genres;
    }

    public void setGenres(List<FB2GenreCode> genres) {
        this.genres = genres;
    }

    public void addGenre(FB2GenreCode genre) {
        this.genres.add(genre);
    }

    public void addGenre(String genre) {
        this.genres.add(FB2GenreCode.fromValue(genre));
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSrcLang() {
        return srcLang;
    }

    public void setSrcLang(String srcLang) {
        this.srcLang = srcLang;
    }

    public List<FB2Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<FB2Person> authors) {
        this.authors = authors;
    }

    public void addAuthor(FB2Person author) {
        this.authors.add(author);
    }

    public List<FB2Person> getTranslators() {
        return translators;
    }

    public void setTranslators(List<FB2Person> translators) {
        this.translators = translators;
    }

    public void addTranslator(FB2Person translator) {
        this.translators.add(translator);
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String cover) {
        this.coverName = cover;
    }

    public List<FB2Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(List<FB2Sequence> sequences) {
        this.sequences = sequences;
    }

    public void addSequence(FB2Sequence sequence) {
        this.sequences.add(sequence);
    }

    public FB2Section getAnnotation() {
        return annotation;
    }

    public void setAnnotation(FB2Section annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "\t" + title + " (" + date + ")\n" +
                "\t" + "authors: " + authors + '\n' +
                "\t" + "genres: " + genres + '\n' +
                "\t" + lang + " (" + srcLang + ")\n" +
                "\t" + "translators: " + translators + '\n' +
                "\t" + sequences + '\n' +
                "\tAnnotation:\n" + annotation;
//                "FB2TitleInfo{" +
//                "title='" + title + '\'' +
//                ", genres=" + genres +
//                ", date='" + date + '\'' +
//                ", lang='" + lang + '\'' +
//                ", srcLang='" + srcLang + '\'' +
//                ", authors=" + authors +
//                ", translators=" + translators +
//                ", coverName='" + coverName + '\'' +
//                ", sequences=" + sequences +
//                '}' + '\n';
    }
}
