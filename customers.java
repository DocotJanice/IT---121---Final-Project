package UML_ClassConvertToCodes;

import java.util.Objects;

public class customers {

    // attributes
    private String name;
    private  int age;
    private String address;
    private String gender;
    private String email;
    public customers(){
        super();
    }


    //methods
    public customers(String name, int age, String address, String gender, String email ) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof customers)) return false;
        customers customers = (customers) o;
        return getAge() == customers.getAge() && getName().equals(customers.getName()) && getAddress().equals(customers.getAddress()) && getGender().equals(customers.getGender()) && getEmail().equals(customers.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAddress(), getGender(), getEmail());
    }
}

