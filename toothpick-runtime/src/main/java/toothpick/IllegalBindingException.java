package toothpick;

/**
 * Thrown when a binding is illegal.
 */
public class IllegalBindingException extends IllegalStateException {
  public IllegalBindingException() {
  }

  public IllegalBindingException(String s) {
    super(s);
  }

  public IllegalBindingException(String message, Throwable cause) {
    super(message, cause);
  }

  public IllegalBindingException(Throwable cause) {
    super(cause);
  }
}