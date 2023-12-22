package Fiza.src.day11_12;

public class check {


    public static String decryptMessage(String encryptedMessage, String keyPhrase) {
        // Split the encrypted message and key phrase into words
        String[] encryptedWords = encryptedMessage.split(" ");
        String[] keyWords = keyPhrase.split(" ");

        // Initialize a StringBuilder to store decrypted words
        StringBuilder decryptedMessage = new StringBuilder();

        // Iterate through each word in the encrypted message and its corresponding key word
        for (int i = 0; i < encryptedWords.length; i++) {
            String encryptedWord = encryptedWords[i];
            String keyWord = keyWords[i];

            // Check if the length of the key word is even or odd
            if (keyWord.length() % 2 == 0) {
                // Decrypt by incrementing each character
                decryptedMessage.append(decryptWord(encryptedWord, keyWord.length()));
            } else {
                // Decrypt by decrementing each character
                decryptedMessage.append(decryptWord(encryptedWord, -keyWord.length()));
            }

            // Add space between words
            if (i < encryptedWords.length - 1) {
                decryptedMessage.append(" ");
            }
        }

        return decryptedMessage.toString();
    }

    private static String decryptWord(String word, int keyLength) {
        StringBuilder decryptedWord = new StringBuilder();

        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            // Decrypt by adjusting the character based on the key length
            char decryptedChar = (char) ((c - 'a' - keyLength + 26) % 26 + 'a');
            decryptedWord.append(decryptedChar);
        }

        return decryptedWord.toString();
    }

    public static void main(String[] args) {
        String encryptedMessage = "dfsb ed ajyn";
        String keyPhrase = "bye go ball";
        String result = decryptMessage(encryptedMessage, keyPhrase);
        System.out.println(result);
    }
}
