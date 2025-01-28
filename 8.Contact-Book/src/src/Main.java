public class Main {
    public static void main(String[] args) {
        //Generare carte contacte
        ContactBook book1 = new ContactBook();

        //Generare contacte
        Contact c1 = new Contact("Alex","acasa","0755667898");
        Contact c2 = new Contact("Ion","acasa","0755664598");
        Contact c3 = new Contact("Denis","acasa","0755347898");

        //Manipulare lista contacte
        //Populare
        book1.addContact(c1);
        book1.addContact(c2);
        book1.addContact(c3);

        //Vizualizare contacte
        book1.viewContact(c1);
        book1.viewContact(c2);
        book1.viewContact(c3);

        //Stergere contacte
        book1.deleteContact(c2);
        book1.deleteContact(c3);

        //Afisare lista contacte
        book1.afisareListaContacte();

    }
}
