class Main {
    public static void main(String[] args)  {
        Main klasa = new Main();
        System.out.println(klasa.checkIfPositiveNumber(6));
        System.out.println(klasa.checkIfPositiveNumber(-1));
    }

    boolean checkIfPositiveNumber(int num) {
        try {
            if (num < 0) {
                throw new IllegalParameterException();
            }
        } catch (IllegalParameterException exception) {
            exception.printStackTrace();
        }
        return (num >= 0);
    }
}
class IllegalParameterException extends Exception {
    public IllegalParameterException() {
        super("Argument nie może być wartością ujemną");
    }
    public IllegalParameterException(String msg) {
        super(msg);
    }
}