# Handleiding

## Inleiding
Dit is het Backend gedeelte van mijn eindopdracht voor de studie Fullstack Development. Je kon kiezen tussen een standaard casus of een eigen casus. Ik koos uiteraard voor een eigen project. 
Frontend gedeelte vind je hier: [nynke](https://github.com/Nynkek)

Main class: MenstruatieDiskApplication.java

Dit project is opgesteld met behulp van Springboot waardoor de bestandstructuur opgedeeld is in de verschillende lagen.
In het application.properties bestand staan de database gegevens geconfigureerd, vergeet deze niet te veranderen naar jouw eigen gegevens voordat het project opgestart wordt


[//]: # (![screenshot]&#40;src/assets/screenshot.png&#41;)

## Applicatie starten

## Bestanden
- main klasse MenstruatieDiskApplication
- CustomApplicationListener, voor het uitlezen van de endpoints

### /config
configuratie bestanden
- GlobalCorsConfiguration
- WebSecurityConfig

### /controller
De controller laag zorgt voor de endpoints van de API

### /dto
de DTO's dienen als Data Transfer Object tussen Request en Response, er is niet voor ieder object een Dto gebruikt
de DTO's zijn onderverdeeld in mappen Request en Response

### /model
de data objecten van de applicatie, ook wel POJO's (Plain Old Java Objects)
op basis van deze objecten zijn de rest van de lagen opgebouwd

### /repository
de repositories zijn verantwoordelijk voor het gemakkelijk filteren van data

### /security
in de security map staan twee bestanden de JwtRequestFilter en JwtUtil die beiden verantwoordelijk zijn voor de authenticatie door middel van een JWT token

### /service
de service laag dient voor de filtering van de dataobjecten voordat deze verzonden worden naar de controller
De service laag communiceert met de repository.

Het klassendiagram van dit project is te zien in het Technisch Ontwerp.
De API REST Endpoints staan uitgebreid beschreven in de Installatie handleiding.

# Rollen en Gebruikers
Dit zijn de geconfigureerde testgebruikers

USERS
1. 
2. 
3. 

MODERATOR
1. 

ADMIN
1. 