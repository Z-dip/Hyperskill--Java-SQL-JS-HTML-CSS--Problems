class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

        // write your code here
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

        // write your code here
    }

    public String getFullName() {
        if (firstName == null && lastName == null) {
            return "Unknown";
        }
        if (firstName == null) {
            firstName = "";
            return lastName;
        }
        if (lastName == null) {
            lastName = "";
            return firstName;
        }
        if (firstName != "" && lastName != "") {      
            return firstName + " " + lastName;
        }


        return ""; // write your code here
    }
}
