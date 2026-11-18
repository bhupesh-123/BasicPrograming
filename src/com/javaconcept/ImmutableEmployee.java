package com.javaconcept;

import java.util.List;

final public class ImmutableEmployee {
    final private  int id;
    final private  String name;
    final private Address address;
    final private List<Address> addresses;

    public ImmutableEmployee(int id, String name, Address address,List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.address = new Address(address.getCity(),address.getState());
        this.addresses=List.copyOf(addresses);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Address> getAddresses() {
        return List.copyOf(addresses);
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", addresses=" + addresses +
                '}';
    }

    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "MH");
        List<Address> addresses=List.of(addr);
        ImmutableEmployee emp = new ImmutableEmployee(1,"bhupesh",addr,addresses);
        System.out.println(emp.getAddress().getCity());

        // Modify original address
        addr.setCity("Delhi");
        System.out.println("Address city updating.");
        System.out.println(emp.getAddress().getCity());
        // Output → Mumbai  (Immutable)
    }
}
