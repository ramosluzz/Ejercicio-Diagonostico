package principal;

import java.util.ArrayList;

import empleado.Empleado;

public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Lila","Operaciones" ,12,45,78);
		Empleado emp2 = new Empleado("Juan","Tecnologia" ,12,3,125);
		Empleado emp3 = new Empleado("Tomas","Finanzas",17,7,90);
		Empleado emp4 = new Empleado("Guido","Tecnologia",14,30,12);
		Empleado emp5 = new Empleado("Luna","Tecnologia",34,12,120);
		ArrayList<Empleado> empleados= new ArrayList<Empleado>();
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
		empleados.add(emp5);
		//El empleado que más ingresos genera trimestralmente
		int mayorIngreso=0,suma=0, totOpe=0,totTech=0,totFin=0;
		String empMayorIngreso="";
		for(int i=0;i<5;i++) {
			suma = empleados.get(i).salarioEnero + empleados.get(i).salarioFebrero+ empleados.get(i).salarioMarzo;
			if(suma> mayorIngreso) {
				mayorIngreso = suma;
				empMayorIngreso = empleados.get(i).nombre;
			}
			if(empleados.get(i).area== "Operaciones")
			{
				totOpe = totOpe + suma;
			} else{ if(empleados.get(i).area== "Tecnologia") {
				    totTech = totTech +suma;
			}else {totFin = totFin +suma;}}
		}
		System.out.println(">> "+emp1.nombre +", Area: "+ emp1.area);
		emp1.mesMasYMenosIngreso(emp1.salarioEnero, emp1.salarioFebrero, emp1.salarioMarzo);
		emp1.promedioSalarial(emp1.salarioEnero, emp1.salarioFebrero, emp1.salarioMarzo);
		System.out.println(">> "+emp2.nombre +", Area: "+ emp2.area);
		emp2.mesMasYMenosIngreso(emp2.salarioEnero, emp2.salarioFebrero, emp2.salarioMarzo);
		emp2.promedioSalarial(emp2.salarioEnero, emp2.salarioFebrero, emp2.salarioMarzo);
		System.out.println(">> "+emp3.nombre +", Area: "+ emp3.area);
		emp3.mesMasYMenosIngreso(emp3.salarioEnero, emp3.salarioFebrero, emp3.salarioMarzo);
		emp3.promedioSalarial(emp3.salarioEnero, emp3.salarioFebrero, emp3.salarioMarzo);
		System.out.println(">> "+emp4.nombre +", Area: "+ emp4.area);
		emp4.mesMasYMenosIngreso(emp4.salarioEnero, emp4.salarioFebrero, emp4.salarioMarzo);
		emp4.promedioSalarial(emp4.salarioEnero, emp4.salarioFebrero, emp4.salarioMarzo);
		System.out.println(">> "+emp5.nombre +", Area: "+ emp5.area);
		emp5.mesMasYMenosIngreso(emp5.salarioEnero, emp5.salarioFebrero, emp5.salarioMarzo);
		emp5.promedioSalarial(emp5.salarioEnero, emp5.salarioFebrero, emp5.salarioMarzo);
		
		System.out.println("El empleado con mayor ingreso es: "+ empMayorIngreso+",con: "+mayorIngreso);
		
		//El área que más ingresos genera trimestralmente
		int areaMayor = Math.max(totOpe, Math.max(totTech, totFin));
		if(areaMayor == totOpe) {
			System.out.println("El area con mas ingresos es: Operaciones");
		}else { if(areaMayor == totTech)
			{
			System.out.println("El area con mas ingresos es: Tecnologia");
			}else {System.out.println("El area con mas ingresos es: Finanzas");}
			}
			}
}
