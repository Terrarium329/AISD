public interface LoudAnimal {
    void makeSound();
//  public abstract są tutaj do wszystkich
//  metod zroione domyślnie

    default void sayName(){
        System.out.println("Nie wiem jak się nazywam");
    }
    // default kasuje abstracta, więc można
    // coś wrzaucić do metody

}
