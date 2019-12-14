package ru.mail.polis.homework.collections.mail;

public class Client {
    public String name;
    public int mailsCount;
    public int mailsSent;

    public Client() {
        mailsCount = 0;
        mailsSent = 0;
    }

    public Client(final String name) {
        this.name = name;
        mailsCount = 0;
        mailsSent = 0;
    }

}
