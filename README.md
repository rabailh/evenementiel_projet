# Projet evenementiel

Dans le cadre du cours de développement java, il nous a été donné de réaliser ce projet. 

## L'Équipe

L'entièreté du projet à été conçu et développé par Raphaël BAILHET ainsi que Manon BOISSON.

## Cahier des charges

- [ ] En Équipe de 2 à 4 personnes
- [ ] Projet dans le language Java 
- [ ] Le projet est hébergé par un serveur git
- [ ] Contient un Main ainsi qu'au moins 5 autres classes 
- [ ] Le projet contient un branche de dev, une de stage, et un de prod 
- [ ] La branche de dev doit contenir au moins 5 commits, faits par deux personnes différentes, ainsi que 2 merges 
- [ ] Il doit y avoir des tests unitaires pour au moins 2 des classes du projet
- [ ] Le projet doit avoir un githook pour le commit et un pour le pre-push
- [ ] Une liste de ces hooks avec une description de leur action doit être lisible sur le readme du git

***

## Le gitflow

Dans ce projet le gitflow se présente sous la forme suivante ;

Les branches principales
- main              : correspond à la branche de prod
- develop           : correspond à la branche de dev
- integration       : correspond à la branche de stage

Les branches concernant les évolutions se présenter sous la forme suivante ;

NuméroDeTâche.0

exemple :
```
2 - mise en place des githooks
```

***

## Les githooks

Dans ce projet, il y a deux githooks mis en place. 

- L'un lors du commit qui vérifie la validité du message du commit. Il doit être de la forme : 'NuméroDeTâche - message de commit'. 

- Le second lors du prepush qui vérifie avant de push si il y a du contenu (des commits) à pousser.

A chaque clonage du projet, il faut executer la commande suivante : 
```git config core.hooksPath .githooks```

Git ne permet pas d'automatiser l'éxécution d'une commande directement après un git clone.


## Les tâches 

- US 1.0 Init projet : 
	- créer projet
	- mettre en place branche de prod
	- mettre en place branche de stage
	- mettre en place branche de dev
	- créer le readme qui doit contenir description gitflow

	
- US 2.0 Init hooks : 
	- mettre en place les hooks
	- mettre à jour le readme description hooks 

	
- US 3.0 Créer les Enum
	- Enum Commune
	- Enum Evenement

- US 4.0 Commune Init
	- Init classe abstraite commune attr + sign methodes
	- Init classe village attr+ sign méthodes
	- Init classe ville attr+ sign méthodes
	- Init classe Megalopole attr+ sign méthodes

- US 5.0 Implem classe abstraite commune + TU

- US 6.0 Implem classe village + TU
	
- US 7.0 Implem classe ville + TU
	
- US 8.0 Implem classe Megalopole + TU

- US 9.0 Classe Personne
	- creation classe
	- implem méthodes
	- TU
	
- US 10.0 Classe evenement	
	- creation classe
	- implem méthodes
	- TU	

- US 11.0 Main
	- creation d'un scenario d'exe
	- implem du scenario
	- Test fonctionnel 
