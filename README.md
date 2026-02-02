# MowItNow – Tondeuse automatique

Implémentation en Java du kata **"La Tondeuse"** (MowItNow / Xebia).

## 📌 Description
Ce projet simule le déplacement de tondeuses automatiques sur une pelouse rectangulaire.
Chaque tondeuse reçoit une position initiale, une orientation et une suite d’instructions
lui permettant d’explorer la pelouse en respectant des règles précises.

Le programme lit une entrée et retourne la position finale de chaque tondeuse.

---

## ⚙️ Règles de fonctionnement
- La pelouse est définie par un coin inférieur gauche `(0,0)` et un coin supérieur droit `(x,y)`
- Une tondeuse est définie par :
  - une position `(x, y)`
  - une orientation (`N`, `E`, `S`, `W`)
- Les instructions possibles sont :
  - `G` : tourner à gauche (90°)
  - `D` : tourner à droite (90°)
  - `A` : avancer d’une case dans la direction actuelle
- Si une tondeuse sort de la pelouse, le mouvement est ignoré
- Les tondeuses sont exécutées **séquentiellement**

---

## 🧱 Choix techniques
- Java
- Programmation orientée objet
- Séparation claire des responsabilités (domain / instructions / orchestration)
- Utilisation du pattern **Command / Strategy** pour les instructions
- Tests unitaires et test d’intégration avec **JUnit 5**

---

## 📂 Structure du projet

src/
├── main/
│ └── java/
│ └── com/mowitnow/
│ ├── domain/
│ ├── instruction/
│ └── MowerApplication.java
└── test/
└── java/

---

## ▶️ Exemple d’entrée
└── com/mowitnow/
5 5
1 2 N
GAGAGAGAA
3 3 E
AADAADADDA

## ✅ Sortie attendue
1 3 N
5 1 E

---

## 🧪 Tests
Les tests unitaires et le test d’intégration permettent de valider :
- les rotations
- les déplacements
- le respect des limites de la pelouse
- le scénario fourni dans l’énoncé

---

## 🚀 Exécution
Le cœur du programme est accessible via la classe :
com.mowitnow.MowerApplication
