#  Ce repository n'est plus maintenu. Merci d'utiliser celui-ci : https://github.com/smaestri/sharebook : nombreuses librairies mises à jour. Merci!

# sharebook

Code de la formation en ligne Udemy *Développeur Web Fullstack avec Spring et React*
https://www.udemy.com/course/developpeur-web-fullstack-avec-spring-et-react.
L'application finale est déployée sur Azure et testable ici https://sharebook.azurewebsites.net/index.html


### Cliquez ci-dessous pour accéder directement au code de la section voulue

- Section 2 - Intialisation du projet avec Spring Boot  [Le code sur cette branche](https://github.com/smaestri/sharebook-092021/tree/Section2-Init)
- Section 3 - Mise en place des APIs  [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section3-Spring-MVC)
- Section 4 - Mise en place de Spring DATA  [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section4-Spring-DATA)
- Section 5 - Mise en place de Spring Security  [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section5-Spring-Security)
- Section 6 - Intialisation du frontend  [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section6-Init-Frontend)
- Section 7 - Débuts avec React [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section7-React)
- Section 8 - React Router [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section8-Routes)
- Section 9 - Formulaires avec React [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section9-Forms)
- Section 10 - Les hooks React [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section10-Hooks)
- Section 11 - Connexion aux APIs [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section11-Front-APIs)
- Section 12 - React Boostrap [Le code sur cette branche](https://github.com/smaestri/sharebook/tree/Section12-React-Boostrap)

## Structure

### Backend
Application Spring Boot basée sur Maven, qui suit le formalisme standard de fichiers.

- Lancer l'application directement depuis votre IDE en lancant la classe *main DemoApplication*.
- Vous pouvez également compiler avec *mvn clean package* puis lancer l'application avec *java -jar target fichier_JAR*

### Frontend
Single Page Application (SPA) React basée sur *create-react-app*

- Veiller à bien télécharger les dépendances avec *npm install* ou *yarn install* selon votre système. Les dépendances apparaitront dans le répertoire *node_modules*. A faire que quand on modifie les dépendances ensuite.
- Lancer l'application avec *npm run start*
- Accédez à l'application sur *http://localhost:3000*

## Mises à jour

### 01/2022 - Mises à jour des versions des framework utilisés + vidéos React Router
 Spring Boot 2.6.2, Node LTS 16, create react app 5.0, react-router 6.2.1, axios 0.24.0

### 09/2021 - Mises à jour des versions des framework utilisés :
- Passage Spring Boot en version 2.5.4
- Passage NodeJs nouvelle LTS 14.18.0
- Passage React 17.0.2
- Le code partagé se fait désormais sur les branches pour plus de lisibilité, mise à jour du README avec lien vers les sections

### 06/2021 - Ajouts divers
- Swagger avec Spring Security
- Ajouts avertissements suite au braking change Spring sur l'intilisation des données
