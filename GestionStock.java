import java.util.Scanner;

public class GestionStock {
    private static Produit[] produits = new Produit[100];
    private static int compteur = 0; // Nombre actuel de produits

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            printMenu();
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne restante

            switch (choix) {
                case 1:
                    ajouterProduit(scanner);
                    break;
                case 2:
                    modifierProduit(scanner);
                    break;
                case 3:
                    supprimerProduit(scanner);
                    break;
                case 4:
                    afficherProduits();
                    break;
                case 5:
                    rechercherProduit(scanner);
                    break;
                case 6:
                    calculerValeurStock();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 0);

        scanner.close();
    }

    // Affiche le menu principal
    public static void printMenu() {
        System.out.println("----- Gestion de Stock -----");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Afficher la liste des produits");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Calculer la valeur totale du stock");
        System.out.println("0. Quitter");
    }

    // Ajouter un produit
    public static void ajouterProduit(Scanner scanner) {
        if (compteur >= produits.length) {
            System.out.println("Erreur : Le stock est plein !");
            return;
        }

        System.out.print("Entrez le code du produit : ");
        int code = scanner.nextInt();
        scanner.nextLine(); // Consomme la ligne restante

        // Vérifie l'unicité du code
        for (int i = 0; i < compteur; i++) {
            if (produits[i].getCode() == code) {
                System.out.println("Erreur : Un produit avec ce code existe déjà !");
                return;
            }
        }

        System.out.print("Entrez le nom du produit : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez la quantité : ");
        int quantite = scanner.nextInt();

        System.out.print("Entrez le prix : ");
        double prix = scanner.nextDouble();

        produits[compteur++] = new Produit(code, nom, quantite, prix);
        System.out.println("Produit ajouté avec succès !");
    }

    // Modifier un produit
    public static void modifierProduit(Scanner scanner) {
        System.out.print("Entrez le code du produit à modifier : ");
        int code = scanner.nextInt();
        scanner.nextLine(); // Consomme la ligne restante

        for (int i = 0; i < compteur; i++) {
            if (produits[i].getCode() == code) {
                System.out.print("Entrez le nouveau nom : ");
                String nom = scanner.nextLine();

                System.out.print("Entrez la nouvelle quantité : ");
                int quantite = scanner.nextInt();

                System.out.print("Entrez le nouveau prix : ");
                double prix = scanner.nextDouble();

                produits[i].setNom(nom);
                produits[i].setQuantite(quantite);
                produits[i].setPrix(prix);

                System.out.println("Produit modifié avec succès !");
                return;
            }
        }
        System.out.println("Erreur : Produit introuvable.");
    }

    // Supprimer un produit
    public static void supprimerProduit(Scanner scanner) {
        System.out.print("Entrez le code du produit à supprimer : ");
        int code = scanner.nextInt();

        for (int i = 0; i < compteur; i++) {
            if (produits[i].getCode() == code) {
                produits[i] = produits[compteur - 1]; // Remplace par le dernier produit
                produits[compteur - 1] = null; // Supprime la dernière entrée
                compteur--;
                System.out.println("Produit supprimé avec succès !");
                return;
            }
        }
        System.out.println("Erreur : Produit introuvable.");
    }

    // Afficher la liste des produits
    public static void afficherProduits() {
        if (compteur == 0) {
            System.out.println("Aucun produit en stock.");
            return;
        }

        for (int i = 0; i < compteur; i++) {
            System.out.println(produits[i]);
        }
    }

    // Rechercher un produit
    public static void rechercherProduit(Scanner scanner) {
        System.out.print("Entrez le nom du produit à rechercher : ");
        String nom = scanner.nextLine();

        for (int i = 0; i < compteur; i++) {
            if (produits[i].getNom().equalsIgnoreCase(nom)) {
                System.out.println(produits[i]);
                return;
            }
        }
        System.out.println("Erreur : Produit introuvable.");
    }

    // Calculer la valeur totale du stock
    public static void calculerValeurStock() {
        double valeurTotale = 0.0;

        for (int i = 0; i < compteur; i++) {
            valeurTotale += produits[i].calculerValeurTotale();
        }

        System.out.println("Valeur totale du stock : " + valeurTotale);
    }
}
