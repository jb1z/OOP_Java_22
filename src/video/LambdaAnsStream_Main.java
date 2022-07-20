package video;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaAnsStream_Main {

    @FunctionalInterface
    public interface Qq{
        String qq();
    }

    @FunctionalInterface
    public interface Sum{
        int sum(int x, int y);
    }

    public static void main(String[] args){
        Student s1 = new Student(Student.Specialization.Biology);
        Student s2 = new Student(Student.Specialization.Astronomy);
        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        // lambda with comparator
        Arrays.sort(students,
                (o1, o2) -> o1.getSpecialization().toString().compareTo(o2.getSpecialization().toString()));

        Qq duck = () -> "Quack";
        System.out.println(duck.qq());

        Sum summer = (x, y) -> x + y + 20;
        int x = 10;
        int y = 200;
        System.out.println(summer.sum(x, y));

        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.stream()
                .map(i -> i * i)
                .filter(el -> el > 3)
                .flatMap(el -> Stream.iterate(1, i -> i <= el, i -> i + 1))
                .mapToInt(i -> i)
                .summaryStatistics());
    }
}
