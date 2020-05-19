package corona.virus;

import corona.virus.servicios.coronaVirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirusApplication implements CommandLineRunner {

	@Autowired
	private coronaVirusService coronaService[];
	private coronaVirusService cservice;


	public static void main(String[] args) {
		SpringApplication.run(VirusApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		coronaService = new coronaVirusService[3];
		for (int i = 0; i < 3; i++) {
			coronaVirusService cs = new coronaVirusService();
			cs.leer();
			coronaService[1] = cs;
		}
		for (int i = 0; i < coronaService.length; i++) {
			coronaService[1].mostrar();
		}
		int mayor = 0;
		int posicion = 0;
		mayor = coronaService[0].casosConfirmados;


		for (int i = 1; i < coronaService.length; i++) {
			if (coronaService[i].casosConfirmados > mayor) {

				mayor = coronaService[i].casosConfirmados;
				posicion = 1;
			}
			System.out.println("departamento con mas casos es:" + coronaService[posicion].nombreDepartamento + "=" + mayor);

		}
	}
}
		//comprobarmayor();

//        String[] nombreDespartamento ={"cbba","oruro","santa"};
//		int[] casosConfirmados ={10,4,8};
//		int mayor;
//		int posicion;
//		mayor = casosConfirmados[0];
//
//		for (int i = 0; i < 2; i++) {
//			if (casosConfirmados[i] > mayor) {
//				System.out.println("departamento cn mas confirmados: " + nombreDespartamento[i] + " " + "nro confir: " + casosConfirmados[i]);
//				mayor = casosConfirmados[i];
//				System.out.println(mayor);
//			}
//
//		}








//	public  void comprobarmayor (int[] casosConfirmados, String[] nombreDespartamento) {
//		nombreDespartamento = new String[2];
//		casosConfirmados = new int[2];
//		int mayor;
//		int posicion;
//		mayor = casosConfirmados[0];
//
//		for (int i = 1; i < 2; i++) {
//			if (casosConfirmados[i] > mayor) {
//				System.out.println("departamento cn mas confirmados: " + nombreDespartamento[i] + " " + "nro confir: " + casosConfirmados[i]);
//				mayor = casosConfirmados[i];
//				System.out.println(mayor);
//			}
//
//		}
//
//
//	}












