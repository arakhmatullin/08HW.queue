package ru.itpark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {

    public static final String FIRST_PERSON = "First Person";
    public static final String SECOND_PERSON = "Second Person";
    public static final String THIRD_PERSON = "Third Person";

    @Test
    void getElementFromEmptyQueue(){
        Queue queue = new Queue();
        QueueElement element = queue.get();
        Assertions.assertEquals(null,element);
    }

    @Test
    void addAndGetOneElement(){
        Queue queue = new Queue();
        QueueElement element = new QueueElement(FIRST_PERSON);
        queue.add(element);
        int length = queue.getLength();
        Assertions.assertEquals(1,length);
        String name = queue.get().getPerson().getName();
        Assertions.assertEquals(FIRST_PERSON,name);
    }

    @Test
    void addAndGetThreeElements(){
        Queue queue = new Queue();
        QueueElement firstElement = new QueueElement(FIRST_PERSON);
        queue.add(firstElement);
        int expectedLength = 1;
        int length = queue.getLength();
        Assertions.assertEquals(expectedLength,length);
        QueueElement secondElement = new QueueElement(SECOND_PERSON);
        queue.add(secondElement);
        expectedLength++;
        length = queue.getLength();
        Assertions.assertEquals(expectedLength,length);
        QueueElement thirdElement = new QueueElement(THIRD_PERSON);
        queue.add(thirdElement);
        expectedLength++;
        length = queue.getLength();
        Assertions.assertEquals(expectedLength,length);
        String nameFirstPerson = queue.get().getPerson().getName();
        Assertions.assertEquals(FIRST_PERSON,nameFirstPerson);
        expectedLength--;
        length = queue.getLength();
        Assertions.assertEquals(expectedLength,length);
        String nameSecondPerson = queue.get().getPerson().getName();
        Assertions.assertEquals(SECOND_PERSON,nameSecondPerson);
        expectedLength--;
        length = queue.getLength();
        Assertions.assertEquals(expectedLength,length);
        String nameThirdPerson = queue.get().getPerson().getName();
        Assertions.assertEquals(THIRD_PERSON,nameThirdPerson);

    }

}