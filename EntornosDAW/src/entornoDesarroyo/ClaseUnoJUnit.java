package EntornosDesarrollo;

public class ClaseUnoJUnit {
		
	 // Metodo que siempre devuelve true
    public boolean DevuelveTrue()
    {
    			   try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}	
                   return true;
    }
    
    // Metodo que devuelve el valor entero recibido como parametro
    public int DevuelveEnt(String sPrueba, int iValEnt)
    {
                   return iValEnt;
    }
}
