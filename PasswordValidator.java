import java.util.Random;

public class import java.util.Random;

public class PasswordValidator {
    private static final String ALLOWED_SPECIAL_CHARACTERS = "@$*#";
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 12;

    // Method to generate a random password
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH; // Generate random length between 6 and 12
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        int numDigits = 0;

        while (password.length() < length) {
            char ch;
            int type = random.nextInt(4); // 0: lowercase, 1: uppercase, 2: special character, 3: digit

            switch (type) {
                case 0:
                    ch = (char) (random.nextInt(26) + 'a');
                    password.append(ch);
                    hasLowercase = true;
                    break;
                case 1:
                    ch = (char) (random.nextInt(26) + 'A');
                    password.append(ch);
                    hasUppercase = true;
                    break;
                case 2:
                    ch = ALLOWED_SPECIAL_CHARACTERS.charAt(random.nextInt(ALLOWED_SPECIAL_CHARACTERS.length()));
                    password.append(ch);
                    hasSpecialChar = true;
                    break;
                case 3:
                    ch = (char) (random.nextInt(10) + '0');
                    password.append(ch);
                    numDigits++;
                    break;
            }
        }

        // Ensure the password contains at least one of each required character type
        if (!hasLowercase || !hasUppercase || !hasSpecialChar) {
            return generatePassword(); // Retry generation if any criteria are not met
        }

        return password.toString();
    }

    // Method to validate a given password
    public boolean validatePassword(String password) {
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        int numDigits = 0;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (ALLOWED_SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                numDigits++;
            }
        }

        return hasLowercase && hasUppercase && hasSpecialChar;
    }

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String generatedPassword = validator.generatePassword();
        System.out.println("Generated password: " + generatedPassword);

        if (validator.validatePassword(generatedPassword)) {
            int lowercaseCount = 0, uppercaseCount = 0, specialCharCount = 0, digitCount = 0;

            for (char ch : generatedPassword.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (ALLOWED_SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                    specialCharCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            System.out.println("The generated password " + generatedPassword +
                    " is valid and has " + lowercaseCount + " lowercase alphabet(s) " +
                    uppercaseCount + " uppercase alphabet(s) " +
                    specialCharCount + " special character(s) " +
                    digitCount + " digit(s)");
        } else {
            System.out.println(generatedPassword + " is an invalid password");
        }
    }
}
{
    private static final String ALLOWED_SPECIAL_CHARACTERS = "@$*#";
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 12;

    // Method to generate a random password
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH; // Generate random length between 6 and 12
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        int numDigits = 0;

        while (password.length() < length) {
            char ch;
            int type = random.nextInt(4); // 0: lowercase, 1: uppercase, 2: special character, 3: digit

            switch (type) {
                case 0:
                    ch = (char) (random.nextInt(26) + 'a');
                    password.append(ch);
                    hasLowercase = true;
                    break;
                case 1:
                    ch = (char) (random.nextInt(26) + 'A');
                    password.append(ch);
                    hasUppercase = true;
                    break;
                case 2:
                    ch = ALLOWED_SPECIAL_CHARACTERS.charAt(random.nextInt(ALLOWED_SPECIAL_CHARACTERS.length()));
                    password.append(ch);
                    hasSpecialChar = true;
                    break;
                case 3:
                    ch = (char) (random.nextInt(10) + '0');
                    password.append(ch);
                    numDigits++;
                    break;
            }
        }

        // Ensure the password contains at least one of each required character type
        if (!hasLowercase || !hasUppercase || !hasSpecialChar) {
            return generatePassword(); // Retry generation if any criteria are not met
        }

        return password.toString();
    }

    // Method to validate a given password
    public boolean validatePassword(String password) {
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;
        int numDigits = 0;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (ALLOWED_SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                numDigits++;
            }
        }

        return hasLowercase && hasUppercase && hasSpecialChar;
    }

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String generatedPassword = validator.generatePassword();
        System.out.println("Generated password: " + generatedPassword);

        if (validator.validatePassword(generatedPassword)) {
            int lowercaseCount = 0, uppercaseCount = 0, specialCharCount = 0, digitCount = 0;

            for (char ch : generatedPassword.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                } else if (ALLOWED_SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                    specialCharCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            System.out.println("The generated password " + generatedPassword +
                    " is valid and has " + lowercaseCount + " lowercase alphabet(s) " +
                    uppercaseCount + " uppercase alphabet(s) " +
                    specialCharCount + " special character(s) " +
                    digitCount + " digit(s)");
        } else {
            System.out.println(generatedPassword + " is an invalid password");
        }
    }
}
