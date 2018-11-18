package HW1011.PhoneBook;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Contact {


        private String name;
        private Date birthday;
        private List<String> phones;
        private String adress;
        private Date modifyDate;


        public Contact(String name, Date birthday, String adress, Date modifyDate, String[] arrPhone) {
            this.name = name;
            this.birthday = birthday;
            this.adress = adress;
            this.modifyDate = modifyDate;
            this.phones = Arrays.asList(arrPhone);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(String [] phones) {

        this.phones = Arrays.asList(phones);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return
                "Имя контакта = '" + name + '\'' +
                ", День рождения = " + birthday +
                ", Телефоны = " + phones +
                ", Адресса = '" + adress + '\'' +
                ", Посл. дата изм. = " + modifyDate
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
        if (birthday != null ? !birthday.equals(contact.birthday) : contact.birthday != null) return false;
        if (phones != null ? !phones.equals(contact.phones) : contact.phones != null) return false;
        if (adress != null ? !adress.equals(contact.adress) : contact.adress != null) return false;
        return modifyDate != null ? modifyDate.equals(contact.modifyDate) : contact.modifyDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phones != null ? phones.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
