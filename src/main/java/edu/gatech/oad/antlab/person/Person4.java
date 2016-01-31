package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    public String calc(String input) {
      String answer = "";
      char[] word = input.toCharArray();
      for (int x = 0; x < input.length(); x++) {
        word[x] = (char) ((int)word[x] + 1);
        answer = answer + word[x];
      }
      return answer;
    }
  
    public static void main(String[] args) {
        Person4 bob = new Person4("Bobby");
        bob.calc("Bobby");
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

