package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1=new Human();
        Human grandFather2=new Human();
        Human grandMather1=new Human();
        Human grandMather2=new Human();
        Human father=new Human();
        Human mather=new Human();
        Human children1=new Human();
        Human children2=new Human();
        Human children3=new Human();
        grandFather1.name="Ivan";
        grandFather2.name="Petr";
        grandMather1.name="Mariya";
        grandMather2.name="Olga";
        father.name="Nic";
        mather.name="Alla";
        children1.name="Bob";
        children2.name="Ket";
        children3.name="Tim";
        grandFather1.sex=true;
        grandFather2.sex=true;
        grandMather1.sex=false;
        grandMather2.sex=false;
        father.sex=true;
        mather.sex=false;
        children1.sex=true;
        children2.sex=false;
        children3.sex=true;
        grandFather1.age=71;
        grandFather2.age=75;
        grandMather1.age=68;
        grandMather2.age=65;
        father.age=49;
        mather.age=48;
        children1.age=21;
        children2.age=16;
        children3.age=12;
        father.children.add(children1);
        father.children.add(children2);
        father.children.add(children3);
        mather.children.add(children1);
        mather.children.add(children2);
        mather.children.add(children3);
        grandFather1.children.add(father);
        grandMather1.children.add(father);
        grandFather2.children.add(mather);
        grandMather2.children.add(mather);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMather1);
        System.out.println(grandMather2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
