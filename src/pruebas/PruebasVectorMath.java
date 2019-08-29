package pruebas;

import vector.VectorMath;

public class PruebasVectorMath {

	public static void main(String[] args) throws Exception {
		VectorMath vm = new VectorMath(3);
		double[] coord = {1.3,2.1,3.6};
		vm.setCoord(coord);
		System.out.println(vm);
	}

}
