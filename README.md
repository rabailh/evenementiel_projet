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
- [ ] Les hooks du projet doivent être mis en place dès le clonage du projet
- [ ] Une liste de ces hooks avec une description de leur action doit être lisible sur le readme du git

***

## Le gitflow

Dans ce projet le gitflow se présente sous la forme suivante ;

Les branches principales
- main              : correspond à la branche de prod
- develop           : correspond à la branche de dev
- integration       : correspond à la branche de stage

Les branches concernant les évolutions se présenter sous la forme suivante ;

X - message de commit

X étant le numéro de la tâche

exemple :
```
2 - mise en place des githooks
```

***

## Les githooks

Dans ce projet, il y a deux githooks mis en place. 

- L'un lors du commit qui vérifie la validité du message du commit. Il doit être de la forme décrite précédement. 

- Le second lors du prepush qui vérifie avant de push si il y a du contenu (des commits) à pousser.
