package calculator;

public class Main {
    public static void main(String[] args) {
        float bubblegum = 202;
        float toffee = 118;
        float iceCream = 2250;
        float milkChocolate = 1680;
        float doughnut = 1075;
        float pancake = 80;

        float income = bubblegum + toffee + iceCream
                + milkChocolate + doughnut + pancake;

        System.out.printf("""
                Earned amount:
                Bubblegum: $%.1f
                Toffee: $%.1f
                Ice cream: $%.1f
                Milk chocolate: $%.1f
                Doughnut: $%.1f
                Pancake: $%.1f
                """,
                bubblegum, toffee, iceCream,
                milkChocolate, doughnut, pancake);

        System.out.printf("Income: $%.1f", income);
    }
}