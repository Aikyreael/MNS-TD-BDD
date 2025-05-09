# Workshop noté Behavior Driven Development
- Réaliser une BDD que vous devez poussez au maximum pour tester les différents scénarions du site web bWAPP.
- Voici comment le démarrer via docker : ```docker run -d -p 80:80 hackersploit/bwapp-docker```
- **Pensez à aller sur http://localhost/install.php et cliquer sur "here" pour initialiser la base de données**
- Ensuite, la page principale est celle de login : http://localhost/login.php
- Pour votre projet, vous pouvez utiliser la technologie de votre choix. Libre à vous d'utiliser ou non le projet contenant les helper proposés, à vous de voir.
- Minimum 5 scénariis. A vous de bien écrire les scénarios pour les rendre cohérents. Exemples possible (à réécrire avec les mots clés Given, When, Then, ...) :
    - Login réussite (Pour bWapp, login "bee", password "bug")
    - Login échec anticipé (mauvais identifiant et password)
    - Logout (donc initialement être loggé)
    - Changement de mot de passe (après s'être connecté)
    - Modifier le niveau de sécurité (après s'être connecté)
    - ... Réalisez-en le maximum possible pour avoir une note plus élevée !
- Soyez cohérents dans vos différents step définition, mettez en place un background si nécessaire, un table ou des arguments quand ça vous semble pertinent ! (Car tout est déjà en place, donc vous serez noté sur la pertinece de vos tests également)

## Info 
- Plusieurs choses peuvent beaucoup vous aider dans les tests de BWAPP_ATDD.zip que je vous ai envoyé

## Rendu
- Idéalement via un lien de repo git, accessible soit en public soit via une invitation à cbrasseur sur github
- Sinon, un zip via discord, sans les dossiers générés (dossiers bin et obj en .Net)