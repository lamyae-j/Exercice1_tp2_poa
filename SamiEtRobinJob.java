package part1;

import java.util.Random;

public class  SamiEtRobinJob implements Runnable{

   CompteBanque compte =new CompteBanque(1000);
    @Override
    public void run() {
        // le thread entre dans une boucle infinie et fais appel a demanderetrait
        boolean etat= true;
        try {
            while (etat) {
                Random rand = new Random();
                int montant = rand.nextInt(1001);
                System.out.println(Thread.currentThread().getName()+" : " + this.compte.getSolde());
                etat = DemandeRetrait(this.compte,montant);
                try {
                    Thread.currentThread().sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " reveillé.");
                this.compte.retirer(montant);
                System.out.println(Thread.currentThread().getName() + " à compléter le retrait");
            }
        }catch(Exception e){
            System.out.println(e+"\n");
        }

    }

    public boolean DemandeRetrait(CompteBanque compte, double montant ){// le montant à extraire du compte
        //si on souhaite effectuer un retrait ca ne dois pas dépasser le montant disponible sur le compte
        boolean etat =true ;
        if(compte.getSolde()-montant <=0){
            etat=false;
            System.out.println("Pas assez d’argent pour "+Thread.currentThread().getName()+"\n");
        }
        System.out.println(Thread.currentThread().getName()+" est sur le point de retirer \n");


        return etat ;
    }
}
