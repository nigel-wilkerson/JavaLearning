package generics;

/**
 * Name: Nigel Wilkerson
 * File: GameCharacter.java
 * Version: 1.0
 * Date: 10/15/2026
 * Description: Generic class demonstrating multiple type parameters by modeling a game character
 *              with name, status, and level.
 */

public class GameCharacter <T, U, V>{

    private T name;
    private U status;
    private V level;

    public GameCharacter (T name, U status, V level){
        this.name = name;
        this.status = status;
        this.level = level;
    }

    // Return name (String)
    public T getName() {
        return name;
    }

    // Return status (Hero or Villain)
    public U getStatus() {
        return status;
    }

    // Return level (Int)
    public V getLevel() {
        return level;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setStatus(U status) {
        this.status = status;
    }

    public void setLevel(V level) {
        this.level = level;
    }

    public void getCharacterInfo(){
        System.out.println("------Character Info------");
        System.out.println("Name: " + this.name);
        System.out.println("Hero/Villain: " + this.status);
        System.out.println("Level: " + this.level);
    }

}
