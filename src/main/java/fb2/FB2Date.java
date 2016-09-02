package fb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by hav on 22.08.16.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class FB2Date {

    @XmlAttribute(name = "value")
    private XMLGregorianCalendar machineReadable;
    private String humanReadable;
//    private boolean yearOnly;

    public XMLGregorianCalendar getMachineReadable() {
        return machineReadable;
    }

    public void setMachineReadable(XMLGregorianCalendar date) {
        this.machineReadable = date;
    }

    public String getHumanReadable() {
        return humanReadable;
    }

    public void setHumanReadable(String humanReadable) {
        this.humanReadable = humanReadable;
    }

//    public Date getDate() {
//        try {
//            if (machineReadable != null) {
//                yearOnly = machineReadable.matches("\\d\\d\\d\\d");
//                if (yearOnly) {
//                    GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(machineReadable), 0, 1, 12, 0);
//                    return cal.getTime();
//                }
//                return DateFormat.getDateInstance().parse(machineReadable);
//            }
//        } catch (Exception e) {
//        }
//        try {
//            if (humanReadable != null) {
//                yearOnly = humanReadable.matches("\\d\\d\\d\\d");
//                if (yearOnly) {
//                    GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(humanReadable), 0, 1, 12, 0);
//                    return cal.getTime();
//                }
//                return DateFormat.getDateInstance().parse(humanReadable);
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    public boolean isYearOnly() {
//        return yearOnly;
//    }

}
