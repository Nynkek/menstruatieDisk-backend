![Menstruatiedisk homepage](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-screenshot-project.png?raw=true)

# Menstruatiedisk app
  Dit is het Backend gedeelte van mijn eindopdracht voor de Bootcamp Fullstack Development. Je kon kiezen tussen een standaard casus of een eigen casus. Ik koos uiteraard voor een eigen project.
 [Frontend gedeelte in React vind je hier](https://github.com/Nynkek/menstruatieDisk-frontend).

# Installatie-handleiding

### database
Dit project is opgesteld met behulp van Spring Boot waardoor de bestandstructuur opgedeeld is in de verschillende lagen.
In het application.properties bestand staan de database-gegevens geconfigureerd, vergeet deze niet te veranderen naar jouw eigen gegevens voordat het project opgestart wordt

### klassendiagram
Mijn klassendiagram van dit project is te zien in het Technisch Ontwerp.

### API REST Endpoints
De API REST Endpoints staan uitgebreid beschreven in de Installatie handleiding.
Via Postman heb ik ze in een collectie gezet. Deze kun je [hier download](https://www.getpostman.com/collections/2c08775ccb3a7c6e1007).


## Applicatie starten


De eerste stap is het _clonen_ van de repository. Gebruik de GitHub clone feature.

Of gebruik de onderstaande informatie om de code manueel te clonen.
- SSH: `git@github.com:Nynkek/menstruatieDisk-backend.git`
- HTTPS: `https://github.com/Nynkek/menstruatieDisk-backend.git`


## Bestanden
- main klasse MenstruatieDiskApplication

### /config
configuratie bestanden
- GlobalCorsConfiguration
- WebSecurityConfig

### /controller
De controller laag zorgt voor de endpoints van de API
- AuthenticationController
- DiscController
- ExceptionController
- PendingDiscController
- PhotoController
- UserController

### /dto
De DTO's dienen als Data Transfer Object tussen Request en Response, er is niet voor ieder object een Dto gebruikt
de DTO's zijn onderverdeeld in mappen Request en Response

- DiscDto
- PendingDiscDto
- UserDto

### /model
De data objecten van de applicatie, ook wel POJO's (Plain Old Java Objects)
op basis van deze objecten zijn de rest van de lagen opgebouwd

- Authority
- AuthorityKey
- Disc (subklasse)
- FileUploadResponse
- Material (enum)
- PendingDisc (subklasse)
- SuperDic (superklasse)
- User

### /repository
De repositories zijn verantwoordelijk voor het gemakkelijk filteren van data

- DiscRepository
- FileUploadRepository
- PendingDiscRepository
- UserRepository

### /filter
In de filtermap staat JwtRequestFilter, die samen met JwtUtils verantwoordelijk zijn voor de authenticatie door middel van een JWT token

- JwtRequestFilter

### /service
De service laag dient voor de filtering van de dataobjecten voordat deze verzonden worden naar de controller
De service laag communiceert met de repository.
- CustomUserDetailsService
- DiscService
- PendingDiscService
- PhotoService
- UserService

### /utils
Handige dingen.

- JwtUtils
- RandomStringGenerator

# Rollen en Gebruikers
Dit zijn de geconfigureerde testgebruikers. Username + wachtwoord.

**USER**
1. user - password

**BRAND**
1. brand - password

**ADMIN**
1. admin - password




## **Probleemstelling**

Er is weinig bekend over duurzame menstruatieproducten terwijl wegwerpproducten veel plastic afval veroorzaken. Ook
kunnen er in tampons en maandverband irriterende materialen zitten zonder dat dat op de verpakking staat. Want het is
in Nederland niet verplicht om de ingrediënten op de verpakking te zetten. Toch draag je dit in een van je meest
absorberende plekken. Best gek toch? Dat je niet eens weet wat er dan precies in zit.

Een duurzaam product — die 10 jaar mee gaat en afval bespaart — is de menstruatiedisk. Hier is weinig onafhankelijke
Nederlandse informatie over beschikbaar, terwijl kennis macht is. Je moet helemaal zelf weten wat je gebruikt, maar dan
moet je wel de opties weten!

### Oplossing
Tijd voor een onafhankelijke website met de voor- en nadelen van de menstruatiedisk. De website bevat een tabel, waarbij
je de verschillende disks kan vergelijken op eigenschappen.

Een Disk-producent kan via een formulier een eigen disk toevoegen aan de tabel. Maar voordat die data gelijk
gepubliceerd wordt, moet de Admin die eerst nog even controleren en goedkeuren.

![Menstruatiedisk logo](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-logo-rood.png?raw=true)




# screenshots

## Disks vergelijken in tabel met filteropties
![Menstruatiedisk screenshot tabel](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-screenshot-tabel.png?raw=true)

## Disk toevoegen
![Menstruatiedisk screenshot disk toevoegen](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-screenshot-disc-toevoegen.png?raw=true)
![Menstruatiedisk screenshot disk toevoegen](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-screenshot-disc-toevoegen2.png?raw=true)

## homepage

![Menstruatiedisk homepage](https://github.com/Nynkek/menstruatieDisk-frontend/blob/main/src/assets/menstruatiedisk-screenshot-project.png?raw=true)
