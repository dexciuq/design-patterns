import Decorator.*;
import Decorator.Interfaces.Tree;

public class Main {
    public static void main(String[] args) {
        Tree christmasTree = new ChristmasTree();

        // wrapper by garland decorator
        christmasTree = new GarlandDecorator(christmasTree);
        System.out.println(christmasTree.decorate());

        // wrapper by bubble lights, tinsel, topper
        christmasTree = new TreeTopperDecorator(new TinselDecorator(new BubbleLightDecorator(christmasTree)));
        System.out.println(christmasTree.decorate());
    }
}