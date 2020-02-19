package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class Indonesia {

    Cities major_cities;
    Islands biggest_islands;
    Languages major_languages;
    Double population;
    String religion;

    public Indonesia(Cities major_cities, Islands biggest_islands, Languages major_languages, Double population, String religion) {
        this.major_cities = major_cities;
        this.biggest_islands = biggest_islands;
        this.major_languages = major_languages;
        this.population = population;
        this.religion = religion;
    }

    public Cities getMajor_cities() {
        return major_cities;
    }

    public void setMajor_cities(Cities major_cities) {
        this.major_cities = major_cities;
    }

    public Islands getBiggest_islands() {
        return biggest_islands;
    }

    public void setBiggest_islands(Islands biggest_islands) {
        this.biggest_islands = biggest_islands;
    }

    public Languages getMajor_languages() {
        return major_languages;
    }

    public void setMajor_languages(Languages major_languages) {
        this.major_languages = major_languages;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Indonesia{" +
                "major_cities=" + major_cities +
                ", biggest_islands=" + biggest_islands +
                ", major_languages=" + major_languages +
                ", population=" + population +
                ", religion='" + religion + '\'' +
                '}';
    }
}
