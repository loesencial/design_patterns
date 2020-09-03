package FacetedBuilder;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder atCompany(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder as(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }
}
