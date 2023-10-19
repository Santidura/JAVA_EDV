package libro;

/*import Servicio.service_ope;*/
import Servicio.service_rect;



/*import Servicio.service_peri;*/

 /*import Servicio.serviciolibro;*/

import Servicio.ServiceCuenta;
import Servicio.service_cafetera;
import Servicio.service_user;
import Servicio.serviciolibro;
public class Main {

    public static void main(String[] args) {
        
        /* service_peri calcular = new service_peri();
        calcular.area();
        calcular.perimetro();*/
 /* service_ope OP = new service_ope();
        OP.crearOperaciones();*/

        /*service_rect rect = new service_rect();
        rect.crearRect();*/
       
        
        /*ServiceCuenta accountingService = new ServiceCuenta();
        accountingService.createAccount();
        accountingService.run();*/
        
        /*service_cafetera coffe_coffe = new service_cafetera();
        coffe_coffe.ingresarCant();*/
        
       
        
        service_user usuario = new service_user();
        usuario.cargarUsuario();
        usuario.mostrarusuario();
        serviciolibro leerlibro = new serviciolibro();
        leerlibro.cargarlibro();
        leerlibro.mostrarlibro();
        
                
    }
    

}

/**
 * 3
 *
 *
 * @author duran
 */
