package HW1011;

import HW1011.BD.BDPhoneBook;
import HW1011.PhoneBook.BookCommand;
import HW1011.PhoneBook.Contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BDPhoneBook bd = new BDPhoneBook();
        bd.load();
        BookCommand bk = new BookCommand(bd);


        String com = "";
        try {

            while (!com.equals("stop")) {

                bk.showMenu("1");

                com = reader.readLine();

                switch (com) {
                    case "1":
                        System.out.println("Введите имя контакта:");
                        bk.searchContact(reader.readLine());
                        break;

                    case "2":

                        String name = null;
                        Date birthday = null;
                        String[] phones = null;
                        String adress = null;
                        Date modifyDate = null;

                        System.out.println("Введите имя контакта:");
                        name = reader.readLine();

                        System.out.println("Введите дату рождения контакта (в формате: 04.01.1992)");
                        String[] arr = reader.readLine().split("\\.");
                        birthday = new Date(Integer.parseInt(arr[2]) - 1900, Integer.parseInt(arr[1])- 1 , Integer.parseInt(arr[0]));
                        System.out.println("Введите номер телефона(в формате: 380931028682), если хотите добавить несколько телефонов введите их через запятую без пробелов (пример: 380931028682,380962841741)");
                        String[] arr1 = reader.readLine().split(",");
                        phones = arr1;

                        System.out.println("Введите адресс контакта");
                        adress = reader.readLine();
                        modifyDate = new Date();

                        bk.addContact(new Contact(name, birthday, adress, modifyDate, phones));

                        break;

                    case "3":
                        System.out.println("Введите имя контакта:");
                        bk.deleteContact(reader.readLine());
                        break;

                    case "4":
                        bk.showAllContact();
                        break;

                    case "5":
                        System.out.println("Введите имя контакта:");
                        Contact c = (Contact) bd.map.get(reader.readLine());
                        String oldKey;
                        if (c != null) {
                            System.out.println(c);
                            oldKey = c.getName();

                            bk.showMenu("2");

                            switch (reader.readLine()) {
                                case "1":
                                    System.out.println("Введите новое имя");
                                    c.setName(reader.readLine());
                                    break;
                                case "2":
                                    System.out.println("Введите новую дату рождения контакта (в формате: 04.01.1992)");
                                    String[] arr2 = reader.readLine().split("\\.");
                                    c.setBirthday(new Date(Integer.parseInt(arr2[2]) - 1900, Integer.parseInt(arr2[1])- 1 , Integer.parseInt(arr2[0])));
                                    break;
                                case "3":
                                    System.out.println("Введите новый номер телефона(в формате: 380931028682), если хотите добавить несколько телефонов введите их через запятую без пробелов (пример: 380931028682,380962841741)");
                                    String[] arr3 = reader.readLine().split(",");
                                    c.setPhones(arr3);
                                    break;
                                case "4":
                                    System.out.println("Введите новый адресс контакта");
                                    c.setAdress(reader.readLine());
                                    break;
                            }

                            bk.editingContact(oldKey, c);


                        } else {
                            System.err.println("Контакт не найден");
                        }
                        break;

                    default:
                        System.err.println("Неверная команда ввода, поробуйте еще раз");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Неверная команда ввода, перезапустите программу");
        }

        reader.close();
    }
}
