package com.in.practice.model;

public class User {

        private String firstName;
        private String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
            int result = 0;
            result = ((firstName == null) ? 0 : firstName.hashCode()) + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object userObj) {
            if (this == userObj)
                return true;
            if (this == null)
                return false;
            if (getClass() != userObj.getClass())
                return false;
            User user = (User) userObj;
            if (firstName == null){
                if (user.firstName != null)
                    return false;
            } else if (!firstName.equals(user.firstName))
                return false;
            if (lastName == null){
                if (user.lastName != null)
                    return false;
            } else if (!lastName.equals(user.lastName))
                return false;
            return true;

    }
}
