package labs_examples.testing.refugees;

//POJO

public class PersonRefugee {

    int id;
    int Year;
    String Country;
    double Population;
    double Refugees;
    double RefPerCap;

    public PersonRefugee(int id, int year, String country, double population, double refugees, double refPerCap) {
        this.id = id;
        Year = year;
        Country = country;
        Population = population;
        Refugees = refugees;
        RefPerCap = refPerCap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getPopulation() {
        return Population;
    }

    public void setPopulation(double population) {
        Population = population;
    }

    public double getRefugees() {
        return Refugees;
    }

    public void setRefugees(double refugees) {
        Refugees = refugees;
    }

    public double getRefPerCap() {
        return RefPerCap;
    }

    public void setRefPerCap(double refPerCap) {
        RefPerCap = refPerCap;
    }

    @Override
    public String toString() {
        return "PersonRefugee{" +
                "id=" + id +
                ", Year=" + Year +
                ", Country='" + Country + '\'' +
                ", Population=" + Population +
                ", Refugees=" + Refugees +
                ", RefPerCap=" + RefPerCap +
                '}';
    }
}
