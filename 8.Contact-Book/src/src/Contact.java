public class Contact {
    private String nume;
    private String tipContact;
    private String telefon;

    public Contact(String nume, String tipContact, String telefon) {
        this.nume = nume;
        this.tipContact = tipContact;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Contact: " + nume +", tipContact: " + tipContact +
                ", telefon: " + telefon;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        return nume.equals(contact.nume);
    }

    @Override
    public int hashCode() {
        return nume.hashCode();
    }
}
