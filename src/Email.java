/**
 * Created by jonathangunnells on 5/17/16.
 */// Day 2 lecture

public class Email {
    Person author;
    String subject;
    String body;
    String destination;
    int time;



    public Email(Person aurthor, String subject, String body, String destination, int time) {
        this.author = author;
        this.subject = body;
        this.destination = destination;
        this.time = time;
    }

    public Email(String subject, String body, String destination) {
        this.author = null;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = time;
    }
}

