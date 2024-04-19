public class PasswordValidator {
  public static boolean validate(String password) {
    if (password == null) throw new NullPointerException();

    // Check length
    boolean isAtLeastEightCharacters = password.length() >= 8;

    // Check numbers
    boolean hasNumbers = false;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i))) {
        hasNumbers = true;
      }
    }

    // Check lowercase
    boolean hasLowerCaseLetters = false;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if (!Character.isLowerCase(ch) && !Character.isWhitespace(ch)) {
        hasLowerCaseLetters = true;
      }
    }


    // Check uppercase
    boolean hasUpperCaseLetters = false;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if (!Character.isUpperCase(ch) && !Character.isWhitespace(ch)) {
        hasUpperCaseLetters = true;
      }
    }
    
    // Check special characters
    boolean hasSpecialCharacters = false;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
        hasSpecialCharacters = true;
      }
    }

    return isAtLeastEightCharacters && hasUpperCaseLetters && hasLowerCaseLetters && hasNumbers && hasSpecialCharacters;
  }
}
