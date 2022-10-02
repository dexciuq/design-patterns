package Decorator;

import Decorator.Interfaces.Tree;
import Decorator.Interfaces.TreeDecorator;

public class TinselDecorator extends TreeDecorator {
    public TinselDecorator(Tree tree) {
        super(tree);
    }

    private String decorateWithTinsels(){
        return " with Tinsels";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsels();
    }
}
