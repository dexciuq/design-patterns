package Decorator;

import Decorator.Interfaces.Tree;
import Decorator.Interfaces.TreeDecorator;

public class BubbleLightDecorator extends TreeDecorator {
    public BubbleLightDecorator(Tree tree) {
        super(tree);
    }

    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
}
