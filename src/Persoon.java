import java.util.ArrayList;

public class Persoon implements LevendeWezens {
    String dagUitEten;
    ArrayList<Contact> contacten = new ArrayList<>();

    public void Plannen(String text) {
        dagUitEten = text;
        for (Contact contact : contacten) {
            contact.DagAangepast(text);
        }
    }

    public void Add(Contact contact) {
        contacten.add(contact);
    }
}
