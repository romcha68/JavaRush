package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {


        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2]);
                        if (args[i +1].equals("м"))
                            allPeople.add(Person.createMale(args[i], date));
                        if (args[i+1].equals("ж"))
                            allPeople.add(Person.createFemale(args[i], date));
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Date newInDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]);

                        Person updatingPerson = allPeople.get(Integer.parseInt(args[i]));
                        updatingPerson.setName(args[i+1]);
                        updatingPerson.setBirthDate(newInDate);

                        if (args[i+2].equals("м")) updatingPerson.setSex(Sex.MALE);
                        if (args[i+2].equals("ж")) updatingPerson.setSex(Sex.FEMALE);

                        allPeople.set(Integer.parseInt(args[i]), updatingPerson);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person detetingPerson = allPeople.get(Integer.parseInt(args[i]));
                        detetingPerson.setName(null);
                        detetingPerson.setSex(null);
                        detetingPerson.setBirthDate(null);
                        allPeople.set(Integer.parseInt(args[i]), detetingPerson);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])));
                    }
                }
                break;
        }
    }

}
