# Exercice 3 : Compteur de mots dans un fichier

## Description
Ce programme Java permet d'analyser un fichier texte volumineux pour en extraire le nombre total de mots. Il utilise les outils de lecture de fichiers pour traiter les données ligne par ligne.

## Objectifs de l'exercice
Ce projet met en pratique les compétences suivantes :
- Utilisation de la classe `File` pour manipuler des fichiers externes.
- Lecture de flux de données avec `Scanner`.
- Manipulation de chaînes de caractères avec la méthode `.split(" ")`.
- Utilisation des tableaux (`String[]`) et de leur propriété `.length`.
- Gestion des boucles de lecture (`while`) et des compteurs.

## Fonctionnement du programme
1. Le programme ouvre le fichier nommé `texte.txt` situé à la racine du projet.
2. Il parcourt le document ligne par ligne.
3. Chaque ligne est découpée en mots en utilisant l'espace comme délimiteur.
4. Le nombre de mots de chaque ligne est ajouté à un compteur total.
5. Le résultat final est affiché dans la console.

## Instructions
- Assurez-vous que le fichier `texte.txt` est présent à la racine du projet (au même niveau que le dossier `src`).
- Lancez la classe `Main.java`.
- Le total des mots s'affichera automatiquement dans le terminal.

## Auteur
**Bamba Ousmane** - RGL3B.
