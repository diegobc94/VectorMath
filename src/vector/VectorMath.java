package vector;

import java.util.Arrays;

import excepciones.*;

public class VectorMath {
	private int dim;
	private double[] coord;
	
	public VectorMath(int dim) throws Exception {
		if(dim<2)
			throw new InvalidDimensionException();
		this.dim=dim;
		this.coord=new double[dim];
	}
	
	public VectorMath() {
		
	}

	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}

	public double[] getCoord() {
		return coord;
	}

	public void setCoord(double[] vmCoord) {
		int dimVm=this.dim;
		for(int i=0; i<dimVm; i++)
			this.coord[i]=vmCoord[i];
	}

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "VectorMath [dim=" + dim + ", coord=" + Arrays.toString(coord) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coord);
		result = prime * result + dim;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VectorMath other = (VectorMath) obj;
		if (!Arrays.equals(coord, other.coord))
			return false;
		if (dim != other.dim)
			return false;
		return true;
	}

	public VectorMath suma(VectorMath vm) throws Exception {
		if(this.dim!=vm.dim)
			throw new DistinctDimensionException();
		int dimSum = this.dim;
		VectorMath sum = new VectorMath(dimSum);
		for(int i=0; i<dimSum; i++) {
			sum.coord[i] = this.coord[i]+vm.coord[i];
		}
		return sum;
	}
	
	
	public static VectorMath suma(VectorMath vm1, VectorMath vm2) throws Exception {
		if(vm1.dim!=vm2.dim)
			throw new DistinctDimensionException();
		int dimSuma = vm1.dim;
		VectorMath sum = new VectorMath(dimSuma);
		for(int i=0; i<dimSuma; i++) {
			sum.coord[i] = vm1.coord[i]+vm2.coord[i];
		}
		return sum;
	}

	public VectorMath resta(VectorMath vm) throws Exception {
		if(this.dim!=vm.dim)
			throw new DistinctDimensionException();
		int dimResta = this.dim;
		VectorMath vmResta = new VectorMath(dimResta);
		for(int i=0; i<dimResta; i++)
			vmResta.coord[i] = this.coord[i] - vm.coord[i];
		return vmResta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
