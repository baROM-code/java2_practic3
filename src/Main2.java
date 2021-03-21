public class Main2 {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov", "+78001232323");
        myPhoneBook.add("Petrov", "+78001234567");
        myPhoneBook.add("Ivanov", "+78001238976");
        myPhoneBook.add("Petrov", "+78001232244");
        myPhoneBook.add("Puhov", "+78001236892");

        System.out.println(myPhoneBook.get("Petrov"));
    }
}
