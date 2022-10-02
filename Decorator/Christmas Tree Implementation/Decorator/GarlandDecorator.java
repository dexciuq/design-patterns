package Decorator;

import Decorator.Interfaces.Tree;
import Decorator.Interfaces.TreeDecorator;

public class GarlandDecorator extends TreeDecorator {
    public GarlandDecorator(Tree tree) {
        super(tree);
    }

    private String decorateWithGarlands(){
        return " with Garlands";
    }

    @Override
    public String decorate(){
        return super.decorate() + decorateWithGarlands();
    }
}
