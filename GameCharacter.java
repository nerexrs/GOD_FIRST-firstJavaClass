/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Nerex_rs
 */
public class GameCharacter {
    String name;
    int life;
    String skill;
    String classCharacter;
    
    public GameCharacter(String name, int life, String skill, String classCharacter){
        this.name = name;
        this.life = life;
        this.skill = skill;
        this.classCharacter = classCharacter;
    }
    public void externalHit(){
        life -= 1;
    }
    public static void main(String args[]) {
        GameCharacter magician = new GameCharacter("Pepito", 4, "Rayos de arcoiris", "Mago");
        System.out.printf("Los datos del personaje son:%n Nombre: %s. Vida: %d. Habilidad: %s. Clase: %s", magician.name, magician.life, magician.skill, magician.classCharacter);
        System.out.printf("%n Han atacado al %s llamado %s porque su poder de %s no sirve para defenderse ", magician.classCharacter, magician.name, magician.skill);
        System.out.printf("%n La vida anterior del " + magician.classCharacter + " era 4");
        magician.externalHit();
        System.out.printf("%n La vida actual del " + magician.classCharacter + ", cuyo nombre es " + magician.name + " es: " + magician.life);

    }
}
