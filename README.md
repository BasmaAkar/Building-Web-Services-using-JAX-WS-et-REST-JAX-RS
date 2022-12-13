# Building-Web-Services-using-JAX-WS-et-REST-JAX-RS-JEE
_**Objectif**_ : 
L’objectif principal de cet atelier et de pratiquer la mise en place d’une variété des web services basés sur plusieurs architectures. Durant cet atelier l’étudiant sera mené à implémenter 3 architectures spécifiques: JAX-WS, JAX-RS, Jersey, le rôle principal de ces web services est de garantir la bonne gestion des stations et prix des carburants.
_** Outils :**_ Eclipse, Maven, Tomcate, JAX-WS, JAX-RS.
###
###  Diagramme de class :
![image](https://user-images.githubusercontent.com/101791324/207425844-aa73e57d-c1cf-4ebd-8393-6eabcbb32cec.png)

Implémentez des méthodes pour un web service qui va gérer la partie backend « CRUD station, CRUD Carburant, et la gestion des prix journaliers du carburant d’une station donnée ». ce web service sera de type JAX-WS.
Implémentez une méthode capable de renvoyer les prix des deux carburants en se basant sur deux paramètres « nom_station et date », la même méthode sera implémentée dans trois web services de différents types : « JAX-WS, JAX-RS et Jersey ».
###  Architecture de projet : 

![image](https://user-images.githubusercontent.com/101791324/207426177-f4040ff1-8133-4808-a81e-f8a166b33da8.png)
### Relation ManyToMany entre la class Station et Carburant ce qui génère un table qui a 2 Froeign key 
![image](https://user-images.githubusercontent.com/101791324/207426531-33418ab1-aec1-4bbb-af9c-e312a34c3909.png)
![image](https://user-images.githubusercontent.com/101791324/207427857-055bbc33-9379-4d8e-885c-88b9fb5f9d72.png)
### WebServices :
![image](https://user-images.githubusercontent.com/101791324/207429777-811fa6e2-83db-4263-afad-30ef0cf05b45.png)
![image](https://user-images.githubusercontent.com/101791324/207429888-2ca81a95-ad2e-4f8a-ba76-55f9b6f63df6.png)
![image](https://user-images.githubusercontent.com/101791324/207430063-38045b96-73cb-4a60-ac85-d6ceefc2b740.png)





