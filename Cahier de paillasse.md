# Cahier de paillasse

## Rendu du métamodèle 
### Difficultés principales
- Comment modéliser les UEs, les spécialités, les formations et les batiments qui ont des noms différents.
- Comment palier au problème des hashMap dans lesquelles on ne peut pas spécifier les types clé/valeur dans Ecore ?
- En créant le model, nous n'avons pas pu ajouter des éléments parce qu'ils n'étaient pas liés par composition à la racine du méta-model.


### Moyens mis en oeuvre
* Mise en oeuvre du pattern Ancêtre commun.
* Utilisation des relations entrent les classes.
* Ajout d'une composition qui a peu de sens. Par exemple : les intervalles du temps liés au département. 

## Rendu de la transformation d'un modèle à un modèle
### Difficultés principales
- Des difficultés avec le M2T lors du codage de la transformation.
- Des problèmes avec l'environnement Eclipse lors de la génération du fichier .md avec Acceleo.
- Diffciultés à représenter une table avec le metamodel simpleMarkdown

### Moyens mis en oeuvre
* les problèmes concernant l'environement Eclipse sont réglés en cherchant la solution sur internet.
* Les problèmes concernant le language de programmation on les a dépassé en cherchant sur les doc et internet.
* Nous n'avons plus introduit une table dans notre modèle simpleMarkdown parce qu'on a représenté les données d'une façon plus simple(sur plusieurs lignes). 

## Rendu final
### Difficultés principales
- Des problèmes avec l'environnement Eclipse. (Diffciultés majeure)
- Des difficultés liés à la programmation du langage xtext

### Moyens mis en oeuvre
* les problèmes concernant l'environement Eclipse sont réglés en cherchant la solution sur internet.
* Les problèmes concernant la création du language xtext on été dépassé en utilisant la doc du xtext et les exemples fournis dans les diapo du cours.

