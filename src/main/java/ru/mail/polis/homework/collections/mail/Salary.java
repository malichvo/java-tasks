package ru.mail.polis.homework.collections.mail;

/**
 * 1 балл
 */
public class Salary extends MailTemplate<Integer> {
    public Salary(String sender, String recipient, Integer salary) {
        super(sender, recipient, salary);
    }
}
