import java.util.*;

public class ColorMeaningChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> colorMap = new HashMap<>();

        // Initial predefined color-meaning pairs
        colorMap.put("Red", "Symbolizes passion, energy, and love");
        colorMap.put("Blue", "Represents calmness, stability, and trust");
        colorMap.put("Green", "Stands for nature, growth, and harmony");
        colorMap.put("Yellow", "Symbolizes happiness, optimism, and creativity");
        colorMap.put("Black", "Represents power, elegance, and mystery");

        while (true) {
            System.out.println("\n=== Color Meaning Checker ===");
            System.out.println("1. Check a color meaning");
            System.out.println("2. Add a new color and its meaning");
            System.out.println("3. Show all available colors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter color name: ");
                    String color = input.nextLine().trim();

                    if (color.isEmpty()) {
                        System.out.println("Color name cannot be empty.");
                    } else if (colorMap.containsKey(color)) {
                        System.out.println(color + " → " + colorMap.get(color));
                    } else {
                        System.out.println("Color not found. Try again.");
                    }
                    break;

                case "2":
                    System.out.print("Enter new color name: ");
                    String newColor = input.nextLine().trim();

                    if (newColor.isEmpty()) {
                        System.out.println("Color name cannot be empty.");
                        break;
                    }

                    if (colorMap.containsKey(newColor)) {
                        System.out.println("This color already exists with meaning: " + colorMap.get(newColor));
                    } else {
                        System.out.print("Enter the meaning for " + newColor + ": ");
                        String meaning = input.nextLine().trim();

                        if (meaning.isEmpty()) {
                            System.out.println("Meaning cannot be blank.");
                        } else {
                            colorMap.put(newColor, meaning);
                            System.out.println("New color and meaning added successfully!");
                        }
                    }
                    break;

                case "3":
                    System.out.println("List of available colors:");
                    for (String key : colorMap.keySet()) {
                        System.out.println("- " + key);
                    }
                    break;

                case "4":
                    System.out.println("Exiting program. Thank you!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
