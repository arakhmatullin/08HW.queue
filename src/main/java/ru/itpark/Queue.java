package ru.itpark;
public class Queue {
    private QueueElement first = null;

    public void add(QueueElement queueElement) {
        QueueElement last = first;
        if (first == null) {
            first = queueElement;
            return;
        }
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(queueElement);
    }

    public QueueElement get() {
        QueueElement result = first;
        if (first != null) {
            first = first.getNext();
        }
        return result;
    }


    public int getLength(){
        int result = 0;
        QueueElement current = first;
        while (current != null){
            current =current.getNext();
            ++result;
        }
        return result;
    }
}
