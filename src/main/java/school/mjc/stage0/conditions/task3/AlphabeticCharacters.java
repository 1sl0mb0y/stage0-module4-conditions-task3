package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 97 && character < 122 || character >= 65 && character <90 ) {
            if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I'
                || character == 'o' || character == 'O' || character == 'u' || character == 'U'
            ) System.out.println("Vowel");
            else System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
