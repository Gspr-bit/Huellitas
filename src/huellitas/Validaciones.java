/**
 *
 * @author Gaspar Huerta
 */

package huellitas;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Validaciones
{   
    private Notificaciones notificacion;
    
    private String fecha; 
    Calendar actual = Calendar.getInstance();

    public Validaciones() {
    }
  
    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void agregarRecordatorio(String nombre, String localizacion) {
        notificacion = new Notificaciones();
        String intervalo;
        int intervaloNum;
        do {            
            intervalo = JOptionPane.showInputDialog("¿Deseas que se te recuerde actualizar la información de " + nombre + "?\n"
                + "Ingresa cada cuantos meses deseas el recordatorio, si no quieres recibir nada ingresa 0");
        } while (!isNumber(intervalo));
        intervaloNum = Integer.parseInt(intervalo);
        if (intervaloNum > 0) {
            notificacion.setIdNotificacion(0);
            notificacion.setFecha(this.sumarDias(this.fechaActual(false), 0, intervaloNum, 0));
            notificacion.setIntervalo("meses");
            notificacion.setIntervaloNum(intervaloNum);
            notificacion.setMensaje("Debes actualizar la información de " + nombre + " en " + localizacion);
            notificacion.setRepetir(true);
            System.out.println(notificacion.agregar());
        }
        
    }
       
    public boolean isNumber(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public boolean isEmail(String email) {
        String [] x;
        x = email.split("@");
        if (x.length == 2) {
            if (x[1].contains(".")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    /**
     * @param nombreCampo
     * @param cadena
     * @param menorSize
     * @param majorSize
     * @return "true" if cadena >= menorSize && cadena <= majorSize
     */
    public String size(String nombreCampo, String cadena, int menorSize, int majorSize) {
        if (cadena.length() > majorSize) {
            return nombreCampo + " es demaciado largo, (máximo " + majorSize + " carácteres";
        } else if (cadena.length() < menorSize) {
            return nombreCampo + " es demaciado corto, (mínimo " + majorSize + " carácteres";
        } else {
            return "true";
        }
    }
    
    public boolean noVacio(String cadena) {
        if (cadena.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    //Formato fecha: DD/MM/AAAA
    /**
     * 
     * @param date
     * @return true if "date" is a date, else returns the error
     * sets Fecha in the format YYYY-MM-DD
     * @see Validaciones.getFecha();
     */
    public String esFecha(String date) {  
        String resultado = "true";   
        String [] x = new String[3];
        int num [] = new int[3];  
        int numDias [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        switch (date.length()) {
            case 10:
                for (int i = 0; i < 10; i++) {
                    String caracter = Character.toString(date.charAt(i));
                    if (i == 2 || i == 5) {
                        if (!caracter.equals("/")) {
                            resultado = "Revisa la sintaxis de la fecha";
                        }
                    } else {
                        if (!isNumber(caracter)) {
                            resultado = "Revisa la sintaxis de la fecha";
                        }
                    }
                }   break;
            case 0:
                resultado = "Faltan datos";
                break;
            default:
                resultado = "Revisa la sintaxis de la fecha";
                break;
        }

        if (resultado.equals("true")) {
            x = date.split("/");
            for (int i = 0; i < 3; i++) {                
                num[i] = Integer.parseInt(x[i]);        
            }      
            if (num[2] % 4 == 0) {            
                numDias[1] = 29;
            }  
            if (num[1] == 0 || num[1] > 12) {
                resultado = "El mes no existe";
            } else if (num[0] == 0 || num[0] > numDias[num[1]-1]) {
                resultado = "El día no existe";
            } 
                            
        }

        if (resultado.equals("true")) {
            setFecha(x[2] + "-" + x[1] + "-" + x[0]);
        } else {
            setFecha(null);
        }        

        return resultado;
    }
    
    public String fechaActual(boolean caja) {
        String dia,mes;        
        if ((actual.get(Calendar.MONTH) + 1) < 10) {
                mes = "0" + (actual.get(Calendar.MONTH) + 1);
            } else {
                mes = "" + (actual.get(Calendar.MONTH) + 1);
            }
            if (actual.get(Calendar.DATE) < 10) {
                dia = "0" + (actual.get(Calendar.DATE));
            } else {
                dia = "" + (actual.get(Calendar.DATE));
            }   
        if (caja) {
            return dia + "/" + mes + "/" + actual.get(Calendar.YEAR); 
        } else {
            return actual.get(Calendar.YEAR) + "-" + mes + "-" + dia;
        }
    }
    
    public String isPassword(String password) {
        String resultado = "true";
        String x;
        for (int i = 0; i < password.length(); i++) {
            if (password.contains("Ñ") || password.contains("ñ") || !(Character.isLetter(password.charAt(i)) || isNumber(Character.toString(password.charAt(i))))) {
                resultado = "No se permiten símbolos ni \"Ñ\"";
            } 
        } 
        return resultado;
    }
    
    /**
     * This method reads a date in the format YYYY-MM-DD
     * and returns it as DD/MM/YYYY
     * ============== or ===============
     * reads a date in the format DD-MM-YYYY
     * and returns it as YYYY/MM/DD
     * @param fecha
     * @return fecha
     */
    public String cambiarFecha(String fecha) {
        String x [] = new String[3];
        x = fecha.split("-");
        return x[2] + "/" + x[1] + "/" + x[0];
    }
    
    /**
     * This method reads a date and adds the specified days, months and years
     * The date's format must be: YYYY-MM-DD
     * 
     * @param date
     * @param years
     * @param meses
     * @param dias
     * @return fecha
     */
    public String sumarDias(String date, int years, int meses, int dias) {
        String [] x = new String[3];
        int [] num = new int[3];
        x = date.split("-");             
        int fechas [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < 3 ; i++) {
            num[i] = Integer.parseInt(x[i]);
        }

        num [0] += years;
        num[1] += meses;
        num[2] += dias;

        while (num[1] > 12) {
            num[0] ++;
            num[1] -= 12;
        }
        
        if (num[0] % 4 == 0) {            
            fechas[1] = 29;
        }  

        while (num[2] > fechas[num[1]-1]) {
            num[2] -= fechas[num[1]-1];
            num[1] ++;   
            while (num[1] > 12) {
                num[0] ++;
                num[1] -= 12;
            }
        }   
        
        for (int i = 0; i < 3; i++) {
            if (num[i] < 10) {
                x[i] = "0" + num[i];
            } else {
                x[i] = "" + num[i];
            }
        }

        return x[0] + "-" + x[1] + "-" + x[2];
    }
}