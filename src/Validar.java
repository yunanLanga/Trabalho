
import java.io.*;

public class Validar {

    BufferedReader x;

    public Validar(){
        x = new BufferedReader(new InputStreamReader(System.in));
    }

    public byte validarByte(byte min, byte max, String msg, String msgE) throws IOException {
        byte v;
        do{
            System.out.println(msg);
            v = Byte.parseByte(x.readLine());
            if(v<min || v>max){
                System.out.println(msgE);
            }
        }while (v<min || v>max);
        return v;
    }

    public short validarShort(String msg,String msgE, byte size) throws IOException{
        byte cod;

        do{
            System.out.println(msg);
            cod = Byte.parseByte(x.readLine());
            if(cod < size || cod > size){
                System.out.println(msgE);
            }
        }while (cod < size || cod > size);
        return cod;
    }
}
