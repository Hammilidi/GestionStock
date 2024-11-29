# **Application de Gestion de Stock**

## **Description**
Cette application est une solution simple pour gérer les stocks d'une petite boutique. Elle utilise les concepts de **Programmation Orientée Objet (POO)** pour assurer une bonne organisation du code et une facilité de maintenance. L'application permet d'ajouter, modifier, supprimer, rechercher et afficher des produits, tout en calculant la valeur totale des stocks. 

---

## **Fonctionnalités**
1. Ajouter un produit.
2. Modifier un produit existant.
3. Supprimer un produit en fonction de son code unique.
4. Afficher la liste de tous les produits en stock.
5. Rechercher un produit par son nom.
6. Calculer la valeur totale des stocks.

---

## **Choix d'implémentation**

### **1. Programmation Orientée Objet (POO)**
L'utilisation de la POO permet de représenter les produits et leurs données comme des objets. Cela améliore :
- La **lisibilité** du code.
- La **modularité**, en rendant chaque partie du programme indépendante et réutilisable.
- La **maintenabilité**, car les modifications sont plus faciles à effectuer dans une structure bien organisée.

### **2. Classe `Produit`**
#### **Attributs privés**
- Les attributs (`code`, `nom`, `quantite`, `prix`) sont déclarés comme **privés** pour assurer l'encapsulation. Cela empêche tout accès ou modification directe non contrôlée.
- L'encapsulation garantit que seules des méthodes spécifiques (getters et setters) peuvent accéder ou modifier ces attributs, réduisant ainsi les risques d'erreurs.

#### **Getters et Setters**
- Les getters permettent de **lire** les valeurs des attributs sans les modifier.
- Les setters permettent de **modifier** les valeurs tout en appliquant des validations si nécessaire (par exemple, empêcher l'insertion de quantités ou de prix négatifs).

#### **Méthode `toString()`**
- Cette méthode est utilisée pour **convertir un objet en une représentation textuelle lisible**. 
- Elle permet d'afficher facilement les informations détaillées d'un produit, particulièrement utile dans les listes ou les logs.

#### **Méthode pour calculer la valeur totale**
- La méthode `calculerValeurTotale()` simplifie le calcul du stock en multipliant directement la quantité et le prix d'un produit. Cela réduit la duplication de code dans les opérations de gestion du stock.

### **3. Gestion avec un tableau**
- Un tableau de type `Produit[]` a été choisi pour stocker les objets produits. Cette méthode est simple et efficace pour gérer une quantité limitée de données.
- La capacité maximale est fixée à 100 produits pour correspondre aux spécifications. Si le tableau est plein, un message d'erreur est affiché.

### **4. Classe `GestionStock`**
- Les fonctionnalités principales sont implémentées sous forme de **méthodes statiques** pour centraliser la logique de gestion des stocks.
- Les noms de méthodes explicites (comme `ajouterProduit`, `modifierProduit`) facilitent la compréhension et la navigation dans le code.

### **5. Menu interactif**
- L'application utilise un menu console pour permettre une interaction simple avec l'utilisateur. Chaque option est associée à une fonctionnalité claire.

### **6. Validations**
- Les validations assurent la cohérence des données :
  - Vérification de l'unicité des codes produits avant leur ajout.
  - Empêcher les entrées invalides (quantité ou prix négatifs).
  - Gérer les cas où le tableau est plein ou où un produit est introuvable.

---

## **Instructions d'utilisation**
1. Clonez ce dépôt GitHub :
   ```bash
   git clone https://github.com/votre-utilisateur/gestion-stock.git
   ```
2. Ouvrez le projet dans un IDE Java (comme IntelliJ IDEA, Eclipse ou NetBeans).
3. Compilez et exécutez le fichier principal `GestionStock.java`.
4. Utilisez le menu interactif pour naviguer dans les différentes fonctionnalités.

---

## **Exemple d'exécution**
Voici un exemple d'exécution de l'application via la console :

```
----- Gestion de Stock -----
1. Ajouter un produit
2. Modifier un produit
3. Supprimer un produit
4. Afficher la liste des produits
5. Rechercher un produit
6. Calculer la valeur totale du stock
0. Quitter
Choisissez une option : 1

Entrez le code du produit : 101
Entrez le nom du produit : Pomme
Entrez la quantité : 50
Entrez le prix : 0.5
Produit ajouté avec succès !

Choisissez une option : 4
Produit [Code: 101, Nom: Pomme, Quantité: 50, Prix: 0.5]
```

---

## **Scénarios de Test**
1. **Ajout d'un produit :**
   - Ajouter un produit avec un code unique.
   - Tenter d'ajouter un produit avec un code déjà existant (erreur attendue).

2. **Modification d'un produit :**
   - Modifier un produit existant.
   - Tenter de modifier un produit avec un code inexistant (erreur attendue).

3. **Suppression d'un produit :**
   - Supprimer un produit existant.
   - Tenter de supprimer un produit avec un code inexistant (erreur attendue).

4. **Calcul de la valeur totale du stock :**
   - Ajouter plusieurs produits et vérifier si la valeur totale est calculée correctement.

---

## **Améliorations possibles**
- Utiliser des **collections dynamiques** comme `ArrayList` pour éviter la limitation de 100 produits.
- Ajouter la **persistance des données** (sauvegarde et chargement à partir d'un fichier).
- Intégrer une interface graphique (GUI) pour une meilleure expérience utilisateur.

---

## **Auteur**
- **Yonli Fidèle**  
  Passionné de programmation et de résolution de problèmes, avec un intérêt particulier pour le développement d'applications utiles à la communauté.
