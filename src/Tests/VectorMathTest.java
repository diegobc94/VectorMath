package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import excepciones.DistinctDimensionException;
import excepciones.InvalidDimensionException;
import vector.VectorMath;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;

public class VectorMathTest {	
	
	@Test(expected = InvalidDimensionException.class)
	public void VectorMathTest_dimInvalida_lanzaExcepcion() throws Exception  {
		assertEquals(new InvalidDimensionException(), new VectorMath(1));
	}
	
	@Test(expected = DistinctDimensionException.class)
	public void sumaTest_distDimension_lanzaExcepcion() throws Exception {
		VectorMath vm1 = new VectorMath(2);
		VectorMath vm2 = new VectorMath(3);
		assertEquals(new DistinctDimensionException(), vm1.suma(vm2));
	}
	
	@Test
	public void sumaTest_dimValida_devuelveVectorMath() throws Exception {
		int dim=2;
		VectorMath vm1 = new VectorMath(dim);
		VectorMath vm2 = new VectorMath(dim);
		assertEquals(new VectorMath(dim), vm1.suma(vm2));
	}
	
	@Test(expected = DistinctDimensionException.class)
	public void sumaStaticTest_distDimension_lanzaExcepcion() throws Exception {
		VectorMath vm1 = new VectorMath(2);
		VectorMath vm2 = new VectorMath(3);
		assertEquals(new DistinctDimensionException(),VectorMath.suma(vm1, vm2));
	}
	
	@Test
	public void sumaStaticTest_dimValida_devuelveVectorMath() throws Exception {
		int dim=2;
		VectorMath vm1 = new VectorMath(dim);
		VectorMath vm2 = new VectorMath(dim);
		assertEquals(new VectorMath(dim),VectorMath.suma(vm1, vm2));
	}

	@Test(expected = DistinctDimensionException.class)
	public void restaTest_distDimension_lanzaExcepcion() throws Exception {
		VectorMath vm1 = new VectorMath(2);
		VectorMath vm2 = new VectorMath(3);
		assertEquals(new DistinctDimensionException(), vm1.resta(vm2));
	}
	
	@Test
	public void restaTest_dimValida_devuelveVectorMath() throws Exception {
		VectorMath vm1 = new VectorMath(3);
		VectorMath vm2 = new VectorMath(3);
		VectorMath vmResta = new VectorMath(3);
		double[] coord1 = {1.2,2.3,5.7};
		vm1.setCoord(coord1);
		double[] coord2 = {0.5,1.0,0.3};
		vm2.setCoord(coord2);
		double[] coordResta = {0.7,1.3,5.4};
		vmResta.setCoord(coordResta);
		assertEquals(vmResta,vm1.resta(vm2));
	}
	
}
