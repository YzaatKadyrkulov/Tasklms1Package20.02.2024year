import java.nio.charset.CoderResult;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task of teacher
         * Deadline : 21.02.2024 / 17:00
         * Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
         * жана circumference деген статик методдору болсун.
         * areaны табуу учун: PI * (radius * radius)
         * circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
         */
         Circle circle = new Circle(23,23);

        Circle.getArea(circle.getPi(), circle.getRadius());
        Circle.getCircumFerence(circle.getPi(), circle.getRadius());



    }
    }
