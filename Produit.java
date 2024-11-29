public class Produit {
    // Attributs privés
    private int code;
    private String nom;
    private int quantite;
    private double prix;

    // Constructeur avec tous les attributs
    public Produit(int code, String nom, int quantite, double prix) {
        this.code = code;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    // Constructeur par défaut
    public Produit() {
        this(0, "Inconnu", 0, 0.0);
    }

    // Getters et Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Méthode pour calculer la valeur totale du produit
    public double calculerValeurTotale() {
        return quantite * prix;
    }

    // Méthode toString pour afficher les détails d'un produit
    @Override
    public String toString() {
        return "Produit [Code: " + code + ", Nom: " + nom + ", Quantité: " + quantite + ", Prix: " + prix + "]";
    }
}
