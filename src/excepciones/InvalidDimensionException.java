package excepciones;

public class InvalidDimensionException extends Exception{
	public InvalidDimensionException() {
		super("La dimension debe ser mayor a 1");
	}
}
