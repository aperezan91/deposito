import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testDeposito() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		System.out.println("Capacidad máxima del depósito:"+tank.getDepositoMax());
		if(tank.getDepositoMax()/2==tank.getDepositoNivel()) {
			System.out.println("Depósito a mitad");
		}else if(tank.getDepositoMax() == tank.getDepositoNivel()){
			System.out.println("Depósito lleno");
		}		
		tank.consumir(1);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		tank.consumir(35);
		
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		tank.consumir(-25);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		tank.fill(10);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		tank.fill(40);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
		tank.fill(-25);
		System.out.println("Nivel del depósito:"+tank.getDepositoNivel());
	}

}
