
Opdracht Helpdesk:

Bij een groot bedrijf kunnen alle werknemers (employees) hulp krijgen van de Informatiseringshelpdesk voor problemen die te maken hebben met de IT hulpmiddelen die geïnstalleerd zijn op de werkplek. Deze problemen kunnen te maken hebben met hardware of software.
In het systeem worden medewerkers bijgehouden. Een medewerker heeft een username en een password (dat gewoon in tekst wordt opgeslagen). Er zijn reguliere medewerkers (die meldingen mogen maken) en er zijn helpdeskmedewerkers (die meldingen mogen oplossen). Bij alle medewerkers wordt bijgehouden op welke afdeling ze werken. Voor helpdeskmedewerkers wordt ook nog bijgehouden wat hun expertise is.
Iedereen kan tickets toevoegen aan het systeem (Dat gebeurt in deze toets gewoon door Java code toe te voegen aan de main methode). Er wordt dan een ticket met een uniek nummer aangemaakt. De datum van de melding worden vastgelegd in het systeem. De melder wordt ook vastgelegd. Daarnaast bevat het ticket een omschrijving van het probleem. Bij een hardware probleem moet ook de id van de computer worden vastgelegd, dat is een getal. Bij een softwareprobleem moet de naam van het softwarepakket ook worden opgeslagen.
Tickets kunnen opgelost worden door helpdeskmedewerkers. Als die helpdeskmedewerker een probleem oplost wordt opgeslagen welke medewerker dit was en kan er een korte oplossing voor het probleem beschreven worden.
Let op: Je hoeft geen menu of andere userinterface te maken voor het systeem. Alle medewerkers die het systeem gaan gebruiken kunnen programmeren en het volstaat om een main methode te maken waarin je geschreven methodes aanroept (zie het bijgeleverde Application.java bestand voor details).

 
Academie Creative Technology HBO-ICT
Enkele tips
Omdat we begrijpen dat best lastig kan zijn om een dergelijk systeem te bouwen hebben we hier enkele tips:
- Test tijdens het bouwen voortdurend. Dit kun je doen door aanroepen vanuit je main methode te doen naar je administratie class en eventueel wat te printen. Zorg wel dat je aan het einde alleen alle stappen doet die aangegeven zijn in het commentaar in de Application class, zodat je onderstaande uitvoer krijgt.
- Als het goed is heb je alleen in de Application class enkele System.out.println() regels nodig, verder niet.
- Zijn er delen waar je niet uit komt? Probeer er dan omheen te werken zodat je toch nog punten kunt scoren op de andere onderdelen. Beschrijf eventueel in commentaar regels wat je probeert te doen, zodat de beoordelaar snapt waarom je bepaalde delen wel of niet gedaan hebt.
- Voor de duidelijkheid. We beoordelen op:
o De werking van je programma
o De netheid van je code
o Het verdelen van de verantwoordelijkheden over de classes o Je individuele classes
o Het gebruik van overerving o Algoritmes voor zoeken
o Het inlezen van JSON
o Het gebruik van Exceptions.

Voorbeelduitvoer
Uitvoer van het systeem zou er als volgt uit kunnen zien:
Employees:
ruud (IT Lecturers)
jeroen (IT Lecturers)
hesther (Management)
gerralt (Helpdesk, Expertise: Mice)
Tickets:
Ticket 1 (Softwareticket, Application: Office 365):
Status: Open
ruud (IT Lecturers): Excel can't calculate the number of days in a year
Ticket 2 (Hardwareticket, computerId: 5):
Status: Solved
jeroen (IT Lecturers): My mouse doesn't work!
gerralt (Helpdesk, Expertise: Mice): Try putting it into the USB port instead of the HDMI
port.
Ticket 3 (Softwareticket, Application: MacOS X):
Status: Solved
ruud (IT Lecturers): MacOS won't boot on my system
gerralt (Helpdesk, Expertise: Mice): Please replace your Dell laptop with a real system

Opdracht SaxionStation

Saxion heeft besloten diensten uit te breien en daarom een eigen console te ontwikkelen. Gebruikers kunnen worden aangemeld in het SaxionStaion systeem, weke vervolgens hun krediet kunnen ophogen. Met dit krediet kkunnen dan applicaties gekocht worden.

In het nieuwe systeem worden alle gebruikers bijgehouden. Een user heeft een username en een kredietbalans(altijd positief). Ook wordt voor elke user een lijst bijgehoudoen met alle gekochte applicaties. Ook worden in het systeem alle applicaties bijgehouden. Een applicaties kan een game of een media-applicatie zijn. Zowel games als media-applicaties bevatten een naam en een prijs. Verder wordt bij een game de rating, de minimale leeftijd om te mogen spelen en het maximumaantalspelers bijgehouden. Bij eem media-applicatie wordt het type van de applicatie opgeslagen.

In het systeem kunnen nieuwe gebruikers handmatig worden toegevoegd (in dit geval via de JAVA code in de main methode). Verder kan in het systeem krediet worden toegevoegd voor een gebruiker (aan de hand van de gebruikersnaam). Ook het handmatig toevoegen van applicaties is mogelijk. Het toevoegen van games kan op twee manieren: Handmatig zoals bij applicaties, of via het inlezen van een JSON-bestand. Bij elke functionaliteit in het systeem geldt dat er een foutmelding getoond wordt als er iets misgaat.

Uitvoer van het systeem zou er als volgt uit kunnen zien

Saxion Station administration
Users:
User geralt has a balance of $40.01.
  Owned apps:
    - Game the Witcher 3 ($59.99) (Rating: 5). Max 1 player with a minimum age of 18
User ruud has a balance of $0.0.
 Owned apps:
    - Game Cities: skylines ($39.99) (Rating: 4). Max 2 player with a minimum age of 12
    - Media app Netflix app ($0.0) is of type Video Entertainment app
Apps:
Game the Witcher 3 ($59.99) (Rating: 5). Max 1 player with a minimum age of 18
Game Cities: skylines ($39.99) (Rating: 4). Max 2 player with a minimum age of 12
Media app Netflix app ($0.0) is of type Video Entertainment app
Media app Spotify app ($9.99) is of type Audio Entertainment app

