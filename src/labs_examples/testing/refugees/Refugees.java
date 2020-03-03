package labs_examples.testing.refugees;

import labs_examples.objects_classes_methods.labs.objects.exercise_3.Country;
import labs_examples.testing.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;

public class Refugees  {

    static String filepath = "/Users/joe/Documents/CodingNomads/refugees_per_capita.csv";

    public static void main(String[] args) throws IOException {

        ArrayList<PersonRefugee> people = readData();
            for (PersonRefugee p: people){
                System.out.println(p.toString());
            }
    }

    public static ArrayList<PersonRefugee> readData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        ArrayList<PersonRefugee> people = new ArrayList<>();
        String val = "";

        br.readLine();

        while ((val = br.readLine()) != null) {

            String[] elements = val.split(",");
            int id = Integer.parseInt(elements[0]);
            int year = Integer.parseInt(elements[1]);
            String country = elements[2];
            double population = Double.parseDouble(elements[3]);
            double refugees = Double.parseDouble(elements[4]);
            double refPerCap = Double.parseDouble(elements[5]);


            PersonRefugee p = new PersonRefugee(id, year, country, population, refugees, refPerCap);

            people.add(p);

        }

        return people;

    }

}
