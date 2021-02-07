# TIMIZAR_Imene_REZZOUG_Aya-
test project
******************************************************
question5 :
on peut utiliser cette interface par d'autre interfaces (heritage), implementer par des classes. 
 -L'importance de cette interface "IObjetDessinable" est de:
⦁	Réaliser un couplage faible ( faible responsabilité qui respecte le princip S).
⦁	Réaliser l'abstraction .
⦁	 mettre un code réutilisable que on peut instancier dans d'autres applis ou instancier plusieurs fois dans la meme application.
******************************************************
question 7 :
-le problème c'est que la méthode "animer()" fait un appel à la méthode déplacer() .
- la méthode deplacer() est une méthode  publique donc on aura une redefinition ( il a une autre classe (traincercle) qui porte la meme signature).
******************************************************
question 8 :
la classe "visage" et "TrainCercle" vont implementées l'interface "IObjetDessinable"qui contient de dont une methode abstraite Dessiner().
******************************************************
question 14:
si on applique la solution 1 et ajouter la methode abstraite dans la classe forme le code ça va être dupliqué par la suite il va nous faire des problèmes de maintenabilité (on peux pas changer le comportement d'objet qui est affiché sur la fenêtre ).
******************************************************
question 17:
-pour ajouter un nouveau mouvement il faut crée une nouvelle classe qui va implémentée l'interface "IFormeAnimable".
