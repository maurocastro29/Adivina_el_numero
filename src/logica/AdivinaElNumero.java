package logica;
import javax.swing.JOptionPane;

public class AdivinaElNumero {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        //Se crea un numero aleatorio entre 1 y 500
        int numeroAdivinar = (int) (Math.random() * 500 + 1);
        int numero = 0;
        //Se pide el nombre del usuario
        String nombre = JOptionPane.showInputDialog("Escriba el nombre para el usuario");
        Usuario user = new Usuario(nombre);
        //Se piden numeros al usuario hasta que encuentre el numero aleatorio
        do{
            try{
                numero = new Integer(JOptionPane.showInputDialog("Escriba un numero a adivinar"));
                if(numero>numeroAdivinar){
                    JOptionPane.showMessageDialog(null, "El numero a adivinar es menor");
                }else if(numero<numeroAdivinar){
                    JOptionPane.showMessageDialog(null, "El numero a adivinar es mayor");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No ha digitado ningun numero valido" + e);
            }
            user.setIntentos(user.getIntentos() + 1);
        }while(numero != numeroAdivinar);
        //Se muestra el mensaje
        JOptionPane.showMessageDialog(null, "Felicidades "+user.getNombre()+" el numero ha adivinar era "+numeroAdivinar+"\nlo has conseguido en "+ user.getIntentos()+" intentos");
    }
}
