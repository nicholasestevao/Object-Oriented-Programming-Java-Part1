
package ex2.lista1;

public class Dispositivo {
    private boolean ligado;
    private boolean status;
    
    public void Dispositivo(){
        this.ligado = false;
        this.status = true;
    }
    public void ligaDispositivo(){
        this.ligado = true;
        System.out.println("Dispositivo ligado.");
    }
    
    public boolean verificaStatus(){
        System.out.println("Verificando o status do dispositivo ...");
        if(status){
            System.out.println("Dispositivo esta funcionando corretamente.");
        }else{
            System.out.println("Dispositivo nao esta funcionando");
        }
        return status;
    }
    public void executaTeste(){
        System.out.println("Executando teste ...");
        if(!verificaStatus()){
            this.ligado = false;
            System.out.println("Reiniciando dispositivo ...");
            ligaDispositivo();
            this.status = true;
        }else{
            System.out.println("Dispositivo esta funcionando corretamente.");
        }
    }
}
