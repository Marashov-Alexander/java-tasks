package ru.mail.polis.homework.collections.mail;

public class Envelop<T> {
    private final Client sender;
    private final Client recipient;
    private final T content;

    public Envelop(Client sender, Client recipient, T content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public Client getSender() {
        return sender;
    }

    public Client getRecipient() {
        return recipient;
    }

    public T getContent() {
        return content;
    }
}
