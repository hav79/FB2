package fb2.XMLAdapters;

import fb2.ISBN;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hav on 29.08.16.
 */
public class ISBNAdapter extends XmlAdapter<String, List<ISBN> > {
    @Override
    public List<ISBN> unmarshal(String v) throws Exception {
        List<ISBN> isbns = new ArrayList<>();
        if (v.length() > 13) {
            String[] isbnString = v.split(",");
            for (String s: isbnString)
                if (ISBN.isValidISBN(s.replaceAll("-", "").trim()))
                    isbns.add(new ISBN(s));
        } else {
            if (ISBN.isValidISBN(v.replaceAll("-", "").trim()))
                isbns.add(new ISBN(v));
        }
        return isbns;
    }

    @Override
    public String marshal(List<ISBN> v) throws Exception {
        StringBuilder s = new StringBuilder();
        for (ISBN isbn: v) {
            s.append(isbn.getValue());
        }
        return s.toString();
    }
}
