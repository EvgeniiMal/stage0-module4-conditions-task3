package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowels = "aeiou";
        if ((character > 64 && character < 91) || (character > 96 && character < 123)) {
            if (vowels.indexOf(character) >= 0) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
