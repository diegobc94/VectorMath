package excepciones;

public class DistinctDimensionException extends Exception{
	public DistinctDimensionException() {
		super("Los vectores deben tener la misma dimensión");
	}
}
