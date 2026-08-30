class Profile {
    private String name;
    private int age;
    private double heightMetres;

    public Profile(String name, int age, double heightMetres) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be blank");

        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");

        if (heightMetres <= 0)
            throw new IllegalArgumentException("Height must be positive");

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightMetres() {
        return heightMetres;
    }

    public String toString() {
        return "Name: " + name +
               ", Age: " + age +
               ", Height: " + heightMetres;
    }
}

public class TextProfile {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Enter name, age and height as arguments.");
            return;
        }

        String name = args[0];

        int age = Integer.parseInt(args[1]);

        double height = Double.parseDouble(args[2]);

        Profile profile = new Profile(name, age, height);

        System.out.println(profile);

        String ageText = Integer.toString(age);
        String heightText = Double.toString(height);

        System.out.println("Age as String: " + ageText);
        System.out.println("Height as String: " + heightText);
    }
}