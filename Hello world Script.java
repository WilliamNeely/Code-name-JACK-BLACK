class QuickStart {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        String name = "William";
        int age = 14;

        System.out.println(ANSI_BLUE + "Hello World My name is " + name + ", and I am " + age + " years old" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "I have no siblings" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "I have a Mom and a Dad" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "I have a dog and 2 cats" + ANSI_RESET);
    }
}
