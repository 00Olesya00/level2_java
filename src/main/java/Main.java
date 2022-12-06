import lesson_1.barrier.Road;
import lesson_1.barrier.Wall;
import lesson_1.participator.Cat;
import lesson_1.participator.Human;
import lesson_1.participator.Robot;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Leo", 2, 110);
        Robot robot = new Robot("Nano", 10, 2000);
        Human human = new Human("Олег", 1, 100);
        Wall wall = new Wall(1);
        Road road = new Road(100);
    }
}
