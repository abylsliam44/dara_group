abstract class Recipe {
    // Template method
    public final void prepare() {
        gatherIngredients();
        cook();
        serve();
    }

    protected abstract void gatherIngredients();
    protected abstract void cook();
    protected abstract void serve();
}

class PastaRecipe extends Recipe {
    @Override
    protected void gatherIngredients() {
        System.out.println("Ingredients gathered: pasta, tomato sauce, spices.");
    }

    @Override
    protected void cook() {
        System.out.println("Pasta is boiling, then sauce is added.");
    }

    @Override
    protected void serve() {
        System.out.println("Pasta is served on the table with parmesan.");
    }
}

class SaladRecipe extends Recipe {
    @Override
    protected void gatherIngredients() {
        System.out.println("Ingredients gathered: lettuce, tomatoes, cucumbers, dressing.");
    }

    @Override
    protected void cook() {
        System.out.println("Ingredients are chopped and mixed.");
    }

    @Override
    protected void serve() {
        System.out.println("Salad is served in a bowl.");
    }
}

// Demo class to test the Template Method pattern
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Recipe pasta = new PastaRecipe();
        pasta.prepare();

        System.out.println();

        Recipe salad = new SaladRecipe();
        salad.prepare();
    }
}
