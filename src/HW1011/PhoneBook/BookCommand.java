package HW1011.PhoneBook;

import HW1011.BD.BDPhoneBook;

public class BookCommand  {

    BDPhoneBook bd = null;

    public BookCommand(BDPhoneBook bd) {
        this.bd = bd;
    }

    public void addContact(Contact contact){
        bd.map.put(contact.getName(), contact);
        System.out.println(contact);
        System.err.println("Контакт добавлен");
    }

    public void deleteContact(String name){
        if (bd.map.get(name) != null){
            System.out.println(bd.map.get(name));
            bd.map.remove(name);
            System.err.println("Контакт удален");
        }else {
            System.err.println("Контакт не найден");
        }
    }

    public void searchContact(String name){

       if (bd.map.get(name) != null){
           System.err.println("Контакт найден");
           System.out.println(bd.map.get(name));
       }else {
           System.err.println("Контакт не найден");
       }

}

    public void editingContact(String oldKey, Contact contact){
        bd.map.replace(oldKey, contact.getName(), contact);
        System.out.println(bd.map.get(contact.getName()));
        System.err.println("Контакт изменен");
    }

    public void showAllContact(){
        System.out.println(bd.map);
    }


    public void showMenu (String type){

        switch (type){
            case "1":

                System.out.println();
                System.out.println("Меню телефонной книги:");
                System.out.println();
                System.out.println("Найти контакт нажмите 1");
                System.out.println("Добавить контакт нажмите 2");
                System.out.println("Удалить контакт нажмите 3");
                System.out.println("Вывести все доступные контакты нажмите 4");
                System.out.println("Редактировать контакт нажмите 5");
                System.out.println("Для завершения работы программы введите stop");

                break;

            case "2":

                System.out.println();
                System.out.println("Редактировать имя нажмите 1");
                System.out.println("Редактировать дату рождения нажмите 2");
                System.out.println("Редактировать телефонны нажмите 3");
                System.out.println("Редактировать адресс нажмите 4");
                System.out.println();
                break;

        }

    }
}
