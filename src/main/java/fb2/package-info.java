/**
 * Created by hav on 28.08.16.
 */
@XmlSchema(//namespace = "http://www.gribuser.ru/xml/fictionbook/2.0",
        xmlns = {@XmlNs(prefix = "aa", namespaceURI = "http://www.gribuser.ru/xml/fictionbook/2.0"),
                @XmlNs(prefix = "l", namespaceURI = "http://www.w3.org/1999/xlink")},
elementFormDefault = XmlNsForm.UNQUALIFIED)
package fb2;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;