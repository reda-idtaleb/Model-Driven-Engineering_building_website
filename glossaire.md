# Glossaire Portail pédagogique

## Métier

* Une formation est un ensemble cohérent de modules de cours. Il est organisé en unité de temps, généralement des semestres.
* Une matière est un module de cours qui permet d'acquérir des connaissances et compétences spécifiques (a priori différentes de celles des autres modules)
* Une spécialité est une déviation dans une formation qui permet à des élèves de suivre certains enseignements et pas d'autres.     
Les spécialités ne sont pas obligatoirement présentes au sein d'une formation.
* Un emploi du temps est à la jonction entre les disponibilités des enseignants, des salles et des étudiants pour une matière.


## Ingénierie des besoins

| Classe  |Définition|   
|--------|----------|
|Department    |Un département regroupe plusieurs formations d'un seul domaine, par exemple le département informatique.          |
|Entity       | Une entité est un type abstrait qui modélise les différentes entités au sein d'un département. Chaque entité peut avoir des caractéristiques différentes, par exemple une spécialité(Entity) peut avoir des noms différents.         |
|NamedEntity   |Une entité "nommée" est un sous type abstrait du type **Entity**, qui regroupe les entités qui pouvant avoir des noms différents au sein d'un département.          |
|Training |Une formation au sein d'un département permet aux étudiants de suivre une spécialité. Une formation est assistée par un ou plusieurs secrétaires ainsi est dirigée par un ou plusieurs responsables.|
|Speciality | Une spécialité est un parcours au sein d'une formation qui s'étend sur un semestre. Il peut y avoir plusieurs spécialités au sein d'une même formation. Chaque spécialité est assistée par au moins un secrétariat et dirigée par un responsable pédagogique.|
|Employee|Un employee au sein d'un département peut être un secrétaire, un reponsable pédagogique ou/et un enseignant... Chaque employée possède une adresse mail et un bureau.|
|Room|Modélise une salle. Une salle se trouve dans un bâtiment.|
|Building|Un bâtiment contient une ou plusieurs salle.|
|Semester|Un semestre est une unité de temps qui représente la durée d'une spécialité au sein d'une formation.|
|SemestreKind|Représente les différents semestres S1, S2, S3, S4, S5, S6|
|Session|Une session représente une séance d'une UE et d'un groupe qui est réalisée dans une salle en durée limitée. Il existe plusieurs types de séances.|
|SessionKind|Modélise les types d'une séance: Cours, TP ou TD|
|Subject|Un sujet désigne une unité d'enseignement au sein d'une spécialité. Un sujet possède un nombre de crédits. Un sujet est organisé dans une ou plusieurs sessions.|
|Group|Un groupe représente un groupe d'étudiants d'une session. Un groupe est désigné par un numéro de groupe.|
|TimeInterval|Désigne une durée exprimée par une date de début et une date de fin. Les "intervalles de temps" sont utilisés pour désigner une durée d'une session.|
|Resource|Désigne les ressources humaines.|

### Racine du méta-model :
La racine de notre méta-model est le département

# Glossaire HTML/Bootstrap
## Ingénierie des besoins

| Classe  |Définition|   
|--------|----------|
|Website|Modèlise une page web d'un site|
|Page|Caractérise le contenu d'une page du site|
|PAgeElement|Se sont les éléments qu'on peut avoir dans une page|
|Paragraph|Représente un élément d'une page, un paragraphe|
|Title|Représente un élément d'une page, un titre |
|Button|Représente un élément d'une page, un button|
|Section|Représente un élément d'une page, une section |
|Content|Représente le contenu textuel des éléments de la page|
|Table|Repésente une table dans un haut niveau d'abstraction|
|Row|Représente une ligne d'une table|
|DataCell|est le contenu d'une case d'un tableau représenté dans un haut niveau d'abstraction|
### Racine du méta-model :
La racine de notre méta-model est le website
