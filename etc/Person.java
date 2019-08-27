class Person {
  final House house;
  // etc.

  Person(House house) { this.house = house; }
}

class House {
  final Address address;
  // etc.

  House(Address address) { this.address = address; }
}

class Address {
  final Street street;
  // etc.

  Address(Street street) { this.street = street; }
}

class Street {
  final int number;
  // etc.

  Street(int number) { this.number = number; }
}

////

// use-case: given a Person, move them next door (add 2 to street number)

class UseCase {
  // \person -> person.house.address.street.number %~ (+2)
  Person moveNextDoor(Person person) {
    return
      new Person(
        new House(
          new Address(
            new Street(
              person.house.address.street.number + 2
            )
          )
        )
      );
  } 
}
