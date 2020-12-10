class Problem {

    public static void main(String[] args) {
        int tada = Integer.parseInt(args[1]);
        int tadaa = Integer.parseInt(args[2]);
            
        if (args[0].equals("+") || args[0].equals("-") || args[0].equals("*")) {
            
            if (args[0].equals("+")) {
                System.out.println(tada + tadaa);
            } else if (args[0].equals("-")) {
                System.out.println(tada - tadaa);
            } else if (args[0].equals("*")) {
                System.out.println(tada * tadaa);
            }
        } else {
            System.out.println("Unknown operator");
        }
    }
}
