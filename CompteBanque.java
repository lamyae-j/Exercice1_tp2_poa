package part1;

public class CompteBanque {
    double solde;

    public CompteBanque(int solde) {
        this.solde = solde;
    }

    public void retirer(double solde){ // int juste pour verifi
       setSolde(this.solde-solde);

    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }
}
