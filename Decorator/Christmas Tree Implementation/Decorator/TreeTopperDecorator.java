package Decorator;

import Decorator.Interfaces.Tree;
import Decorator.Interfaces.TreeDecorator;

public class TreeTopperDecorator extends TreeDecorator {
    public TreeTopperDecorator(Tree tree) {
        super(tree);
    }

    private String decorateWithTreeTopper(){
        return " with Tree Topper";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }
}
