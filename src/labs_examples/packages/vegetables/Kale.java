package labs_examples.packages.vegetables;

public class Kale {

    protected String healthBenefits;

    protected static void kaleRecipe(String recipe){
        System.out.println("I like to put kale in " + recipe);
    }
    protected static void kaleIntake(int intake){
        System.out.println("I try to consume kale " + intake + " times a week.");

    }

    public Kale() {
        kaleIntake(3);
        kaleRecipe("Salad");
    }

    public Kale(String healthBenefits) {
        this.healthBenefits = healthBenefits;
        System.out.println("health benefit of kale: " +healthBenefits);
    }
}

