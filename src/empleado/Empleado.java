package empleado;

public class Empleado {
	public String nombre;
	public String area;
	public int salarioEnero;
	public int salarioFebrero;
	public int salarioMarzo;
	
	public Empleado(String nombre,String area, int salarioEnero, int salarioFebrero,int salarioMarzo) {
		this.nombre = nombre;
		this.area =area;
		this.salarioEnero= salarioEnero;
		this.salarioFebrero= salarioFebrero;
		this.salarioMarzo = salarioMarzo;
	}
	//El promedio salarial trimestral de cada empleado
	public void promedioSalarial(int salarioEnero, int salarioFebrero, int salarioMarzo)
	{
		int prom;
		prom = (salarioEnero + salarioFebrero + salarioMarzo)/3;
		System.out.println("Promedio Salarial: " + prom);
	}
	//El mes con más ingresos y el mes con menos ingresos de cada empleado
	public void mesMasYMenosIngreso(int salarioEnero, int salarioFebrero, int salarioMarzo) {
		int max=0, min =0;
		String mesMaximo, mesMinimo;
		max=  Math.max(salarioEnero, Math.max(salarioFebrero, salarioMarzo));
		min =Math.min(salarioEnero, Math.min(salarioFebrero, salarioMarzo));
		if( max==salarioEnero){
			mesMaximo = "Enero";
		}else {if(max==salarioFebrero){
				mesMaximo="Febrero";
			}else {mesMaximo="Marzo";}
		}
		if( min==salarioEnero){
			mesMinimo = "Enero";
		}else {if(min==salarioFebrero){
				mesMinimo="Febrero";
			}else {mesMinimo="Marzo";}
		}
		System.out.println("Mes Maximo:" + mesMaximo +", con: " + max);
		System.out.println("Mes Minimo:" + mesMinimo +", con: " + min);
	}
}
