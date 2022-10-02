package Decorator.Interfaces;

public abstract class TreeDecorator implements Tree {

    private final Tree tree;

    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}

