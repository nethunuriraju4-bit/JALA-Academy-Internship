interface College {

    // Static final variable
    int COLLEGE_CODE = 101;
}

class Student implements College {

    public static void main(String[] args) {

        System.out.println("College Code: " + College.COLLEGE_CODE);
    }
}