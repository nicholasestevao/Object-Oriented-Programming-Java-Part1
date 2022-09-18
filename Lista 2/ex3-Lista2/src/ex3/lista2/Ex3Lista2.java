
package ex3.lista2;

public class Ex3Lista2 {

    public static void main(String[] args) {       
        
        //Categorias positivas regeram a vida do proprio personagem
        //Categorias negativas tiram vida dos outros personagem
        Superpoder poder1 = new Superpoder(-1, "Raio congelante");
        Superpoder poder2 = new Superpoder(-1, "Super velocidade");
        Superpoder poder3 = new Superpoder(2, "Invisibilidade");
        Superpoder poder4 = new Superpoder(-1, "Super força");
        Superpoder poder5 = new Superpoder(-1, "Telepatia");
        Superpoder poder6 = new Superpoder(2, "Super resistencia");
        
        SuperHeroi superhomem = new SuperHeroi("Super Homem", 500, "Clark Kent");
        Vilao lexluthor = new Vilao("Lex Luthor", 800, 100);
        
        superhomem.addSuperPoder(poder4);
        superhomem.addSuperPoder(poder2);
        superhomem.addSuperPoder(poder3);
        superhomem.addSuperPoder(poder6);
        
        lexluthor.addSuperPoder(poder1);
        lexluthor.addSuperPoder(poder5);
        lexluthor.addSuperPoder(poder3);
        lexluthor.addSuperPoder(poder2);
        int i = 0;
        while(superhomem.getVida() != 0 && lexluthor.getVida() != 0){
            superhomem.atacar(50, superhomem.getSuperPoder(i%4), lexluthor);
            lexluthor.atacar(50, lexluthor.getSuperPoder(i%4), superhomem);
            i++;
        }
        
        if(superhomem.getVida() == 0){
            System.out.println("Lex Luthor venceu!");
        }else{
            System.out.println("Super Homem venceu!");
        }
        
        
    }
    
}
