import java.util.*;

public class ContactBook {
    private Set<Contact> listaContacte;

    public ContactBook() {
        this.listaContacte = new HashSet<>();
    }

    public Optional<Contact> search(Contact contact){
        return listaContacte.stream()
                .filter(element ->element.equals(contact))
                .findAny();
    }

    public void addContact(Contact contact){
        if(search(contact).isPresent()){
           System.out.println("Contact existent");
        }else{
            listaContacte.add(contact);
            System.out.println("Contact adaugat cu succes");
        }
    }

    public void viewContact(Contact contact){
        if(search(contact).isPresent()){
            System.out.println("Contact gasit!");
            System.out.println(contact);
        }else{
            System.out.println("Contactul nu a fost gasit!");
        }
    }

    public void deleteContact(Contact contact){
        if(search(contact).isPresent()){
            listaContacte.remove(contact);
            System.out.println("Contact sters!");
        }
    }

    public void afisareListaContacte(){
        listaContacte.forEach(System.out::println);
    }
}
