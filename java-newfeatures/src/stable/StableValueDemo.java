package stable;

public class StableValueDemo {
    static void main() {
        StableValue<String> stable=StableValue.of();
        System.out.println("Is the value initialized : "+stable.isSet());
        stable.setOrThrow("Shantanu");

        System.out.println("Is the value initialized : "+stable.isSet());

        System.out.println("The value : "+stable.orElseThrow());

        //Once the value is set You cannot modify it
        stable.setOrThrow("Shantanu Banerjee");

    }
}
