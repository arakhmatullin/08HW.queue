package ru.itpark;
public class QueueElement {
    private Person person;
    private QueueElement next;

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }

    public Person getPerson() {
        return person;
    }

    public QueueElement(String name){
        person = new Person(name);
    }

}
