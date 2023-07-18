package ru.gb.mrd;
import ru.gb.repository.Repository;
import ru.gb.ui.UI;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Repository repository = new Repository();
        LocalDate localDate = LocalDate.now();
        String text = localDate + " -> " + ui.request();
        try {
            repository.write(text);
        }  catch (Exception e) {
            e.printStackTrace();
            System.err.println(e);
        }
    }

}