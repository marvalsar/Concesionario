public class Concesionario {
    
    public static void main(String[] args) {
        
        //Crear instancias de la clase Vehiculos
        //Objeto de la clase Vehiculos auto
        Vehiculos auto = new Vehiculos();
        auto.setCodigo("AZ2056");
        auto.setTipo("Auto");
        auto.setMarca("Mazda");
        auto.setModelo(2022); 
        auto.setKilometraje(10);

        //Objeto de la clase Vehiculos camioneta
        Vehiculos camioneta = new Vehiculos();
        camioneta.setMarca("Volvo");
        camioneta.setModelo(2022); 
        camioneta.setTipo("Camioneta");
        camioneta.setCodigo("AZ3058");
        camioneta.setKilometraje(5);

        //Objeto de la clase Vehiculos motocicleta
        Vehiculos motocicleta = new Vehiculos();
        motocicleta.setMarca("Kawasaky");
        motocicleta.setModelo(2023); 
        motocicleta.setTipo("Motocicleta");
        motocicleta.setCodigo("MT3245");
        motocicleta.setKilometraje(5);

        //Objeto de la clase Registro registroauto
        Registro registroauto = new Registro();
        registroauto.setCodVendido("AZ2056");
        registroauto.setMontVenta(100000000);
        registroauto.setApellido("Rodriguez");
        registroauto.setNombre("Teresa");
        registroauto.setDocIdent(1234560);
        registroauto.setAutoVendido(auto);

        //Objeto de la clase Registro registrocamioneta
        Registro registrocamioneta = new Registro();
        registrocamioneta.setCodVendido("AZ3058");
        registrocamioneta.setMontVenta(20000000);
        registrocamioneta.setApellido("Jimenez");
        registrocamioneta.setNombre("Federico");
        registrocamioneta.setDocIdent(78564523);
        registrocamioneta.setCaminetaVendida(camioneta);

        //Objeto de la clase Registro registromotocicleta
        Registro registromotocicleta = new Registro();
        registromotocicleta.setCodVendido("MT3245");
        registromotocicleta.setMontVenta(300000000);
        registromotocicleta.setApellido("Espinosa");
        registromotocicleta.setNombre("Jaime");
        registromotocicleta.setDocIdent(9856321);
        registromotocicleta.setMotoVendida(motocicleta);

        System.out.println("El código del vehículo es: " +auto.getCodigo());
        System.out.println("El tipo de vehículo es: " +auto.getTipo());
        System.out.println("La marca del vehículo es: "+auto.getMarca());
        System.out.println("El modelo del vehículo es: "+auto.getModelo());
        System.out.println("El kilometraje del vehículo es: "+auto.getKilometraje());
        
        System.out.println("**********REGISTRO DE VENTA*********");
        System.out.println("Monto de la venta:   "+registroauto.getMontVenta());
        System.out.println("Vehiculo (codigo):   "+registroauto.getCodVendido());
        System.out.println("Venículo (tipo):     "+registroauto.getAutoVendido().getTipo());
        System.out.println("Vehículo (marca)     "+registroauto.getAutoVendido().getMarca());
        System.out.println("Apellido:**********  "+registroauto.getApellido());
        System.out.println("Nombre:************  "+registroauto.getNombre());
        System.out.println("Documento comprador: "+registroauto.getDocIdent());

        System.out.println("**********REGISTRO DE VENTA*********");
        System.out.println("Monto de la venta:   "+registrocamioneta.getMontVenta());
        System.out.println("Vehiculo (codigo):   "+registrocamioneta.getCodVendido());
        System.out.println("Venículo (tipo):     "+registrocamioneta.getCaminetaVendida().getTipo());
        System.out.println("Vehículo (marca)     "+registrocamioneta.getCaminetaVendida().getMarca());
        System.out.println("Apellido:**********  "+registrocamioneta.getApellido());
        System.out.println("Nombre:************  "+registrocamioneta.getNombre());
        System.out.println("Documento comprador: "+registrocamioneta.getDocIdent());
        
        System.out.println("**********REGISTRO DE VENTA*********");
        System.out.println("Monto de la venta:   "+registromotocicleta.getMontVenta());
        System.out.println("Vehiculo (codigo):   "+registromotocicleta.getCodVendido());
        System.out.println("Venículo (tipo):     "+registromotocicleta.getMotoVendida().getTipo());
        System.out.println("Vehículo (marca)     "+registromotocicleta.getMotoVendida().getMarca());
        System.out.println("Apellido:**********  "+registromotocicleta.getApellido());
        System.out.println("Nombre:************  "+registromotocicleta.getNombre());
        System.out.println("Documento comprador: "+registromotocicleta.getDocIdent());
    }
}
