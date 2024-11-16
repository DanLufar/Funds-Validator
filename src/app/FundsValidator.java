package app;


class FundsException extends Exception {

    public FundsException(String message) {
        super("Insufficient funds!");
    }
}