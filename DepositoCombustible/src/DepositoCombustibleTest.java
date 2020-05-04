import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testDeposito() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		System.out.println("Capacidad m�xima del dep�sito:"+tank.getDepositoMax());
		if(tank.getDepositoMax()/2==tank.getDepositoNivel()) {
			System.out.println("Dep�sito a mitad");
		}else if(tank.getDepositoMax() == tank.getDepositoNivel()){
			System.out.println("Dep�sito lleno");
		}		
		tank.consumir(1);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		tank.consumir(35);
		
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		tank.consumir(-25);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		tank.fill(10);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		tank.fill(40);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
		tank.fill(-25);
		System.out.println("Nivel del dep�sito:"+tank.getDepositoNivel());
	}

}
