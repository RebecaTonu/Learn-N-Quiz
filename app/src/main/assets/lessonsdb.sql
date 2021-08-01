BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `lesson` (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`courseid`	INTEGER,
	`title`	TEXT,
	`section0`	TEXT,
	`section1`	TEXT,
	`section2`	TEXT,
	`section3`	TEXT,
	`section4`	TEXT,
	`section5`	TEXT,
	`section6`	TEXT,
	`section7`	TEXT,
	`section8`	TEXT,
	`section9`	REAL,
	`questions`	INTEGER,
	`result`	INTEGER DEFAULT 0,
	`nsections`	INTEGER DEFAULT 0
);
INSERT INTO `lesson` VALUES (1,1,'Geografie usor','Hidrografia Europei<<-->>Europa detine o retea hidrografica bogata cu dimensiuni impresionate.
 In continuare vor fi prezentate fluviile si raurile din top 5:
•Volga  este cel mai lung fluviu din Europa, aflat în totalitate pe teritoriul Rusiei și are un curs de 3.690 km
•Dunărea este al doilea fluviu ca lungime din Europa după Volga, izvorăște din Munții Pădurea Neagră (Germania). Dunărea curge către sud-est, pe o distanță de 2.858 km.
•Nipru  este un fluviu de 2.145 km lungime care izvorăște din Rusia și curge prin Belarus și Ucraina, înainte de a se vărsa în mare.
•Nistrul  este un râu  de 1362 km care izvorăște din Carpații Ucraineni în apropiere de granița cu Polonia și se varsă în Marea Neagră.
•Rinul este una dintre căile fluviale cele mai circulate din Europa si are o lungime de 1230 km.
 ','Muntii<<-->>Există cel puțin 109 munți pe Pământ cu altitudini mai mari de 7.200 metri deasupra nivelului mării. Marea majoritate a acestor munți se află la marginea plăcii Indiene și Eurosiatice.
 •Vârful Everest este cel mai înalt punct de pe Pământ, cu o altitudine de 8848 m deasupra nivelului mării. Se află în Munții Himalaya, pe granița dintre Nepal și Tibet (China). Numele din limba engleză, Everest, a fost dat în onoarea topografului britanic Sir George Everest.
•Masivul Kilimanjaro (Kilima Njaro-"Muntele alb")este un munte, un stratovulcan, situat în nord-estul Tanzaniei.
 •Mont Blanc cunoscut și sub denumirea La Dame Blanche ("Doamna Albă") este cel mai înalt vârf din Alpi și din Europa de Vest, situat pe granița dintre Franța și Italia, înălțimea lui este de aproximativ 4.810 m
 •Elbrus are altitudinea de 5.642 m deasupra  fiind cel mai înalt munte din Caucaz, de unii geografi fiind considerat și cel mai înalt munte din Europa.
  ','Solurile<<-->>Solul este partea superioară, afânată, a litosferei, care se află într-o continuă evoluție sub influența factorilor pedogenetici, reprezentând stratul superficial al Pământului în care se dezvoltă viața vegetală.
   Știința care studiază geneza, evoluția, structura și distribuția solurilor se numește pedologie.
  În următoarele rânduri vă vor fi prezentate câteva tipuri de soluri:
 • Sol aluvionar - Tip de sol cu o structură foarte variată ce apare pe luncile inundabile.
 •Sol calcaros- solul calcaros are un aspect albicios si are o cantitate mare de pietre. Acest timp de sol este predispus la uscaciune.
 • Sol argilos-  Este un sol cu o structura densa, lipicioasa si usor modelabila.
 • Sol permafrost - Este un tip de sol care este in permanenta inghetat si se regaseste in regiunile polare.
  ','Climatul temperat oceanic<<-->> Climatul temperat-oceanic, denumit și temperat-maritim, este răspândit în vestul Europei, pe coasta mărilor și Oceanului Atlantic, în sudul Americii de Sud, sud-estul Australiei și Noua Zeelandă.
     Este un tip de climat caracterizat prin umiditate mărită în cea mai mare parte a anului, cu veri răcoroase și ierni fără geruri excesive.
     Climatul temperat-oceanic are următoarele caracteristici:
•Veri mai răcoroase, cu temperaturi sub 22 grade Celsius în luna iulie
•Iernile sunt mai blânde
•Temperaturile medii anuale sunt între 10-15 grade Celsius
•Precipitațiile sunt abundente, sau relativ abundente tot anul: aproximativ 1000-2000 mm/an
 •Bat vânturile de vest și alizeele
  ','România,țara Carpato Danubiano Pontica<<-->>•Munții Carpați reprezintă un lanț muntos ce aparține marelui sistem muntos central al Europei. Aceștia se întind pe aproape 1.500 de km, însă mai mult de jumătate din lanțul muntos se află în România.
   •Delta Dunării, situată la estul țării, în nordul Podișului Dobrogei, este cea mai tânără formă de pământ din România. Cuprinde cele 3 brațe principale ale fluviului Dunărea: Chilia, Sulina și Sfântul Gheorghe, prin care Dunărea se varsă în Marea Neagră.
  • Apele Dunării, care se varsă în Marea Neagră, formează cea mai mare și mai bine conservată deltă din Europa. Delta Dunării găzduiește peste 300 de specii de păsări, precum și 45 de specii de pești de apă dulce în numeroasele sale lacuri și mlaștini.
    ','America Centrala <<-->>America Centrală este o regiune centrală a celor două Americi. Nedefinită exact, regiunea geografică este considerată a fi porțiunea sudică a continentului nord-american.
     Din punct de vedere geografic, America Centrală reprezintă un istm îngust al sudului Americii de Nord, întinzându-se de la Istmul lui Tehuantepec din Mexic către sud-est spre Istmul Panama unde se întâlnește cu Câmpiile Pacificului din Columbia în nord-vestul Americii de Sud.
',' Obiective turistice in Europa <<-->> Europa este un continent bogat din punct de vedere al obiectivelor turistice, mai ales a celor istorice.
Cateva dintre ele reusesc sa adune turisti din toate colturile lumii.
•Turnul Eiffel nu este doar unul dintre cele mai cunoscute obiective turistice din Europa, ci chiar din lume, impresionanta  constructie are 324 de metri înălțime.
•Daca esti pasionat de istorie si vrei sa faci o calatorie in timp, atunci trebuie sa ajungi la Colosseum, in Roma. Amfiteatrul, care dateaza din secolul I d.Hr., este una dintre cele mai mari clădiri-ruină rămase din perioada Imperiului Roman. Aici aveau loc celebrele lupte cu gladiatori.
•Palatul Buckingham a devenit resedinta regala a Monarhiei Britanice in 1837, in perioada Reginei Victoria. Cei mai multi vin sa priveasca schimbarea garzii, care are loc la ora 11.
•Capela Sixtina din palatul papal de la Vatican este cunoscuta in toata lumea datorita deosebitelor picturi murale realizare de Michelangelo. Construita intre anii 1477 – 1480, capela infatiseaza mai multe momente cheie din Biblie, cel mai cunoscut mural este „Crearea lui Adam”.
',NULL,NULL, NULL,'Dunarea traverseaza 4 capitale?<->A<<-->>Rinul este cel mai lung fluviu din Europa?<->A<<-->> Cel mai inalt munte de pe glob este Everest?<->A<<-->>Permafrostul este solul ce se gaseste in regiunea polara?<->A<<-->> Alizeele sunt vanturile tipice din climatul oceanic ?<->A<<-->>Este Romania o tara Carpato-Danubiano-Pontica?<->A<<-->>  Americii Centrale se invecineaza cu Caraibe<->F<<-->>In Bucuresti poti vizita Colosseum?<->F<<-->> Este Brazilia  una dintre tarile traversate de linia Ecuatorului<->A<<-->>Globul pamantesc este compus din 7 tectonice principale?<->A',0,7);

INSERT INTO `lesson` VALUES (3,1,'Geografie Mediu','Enclave<<-->>Enclavele au fost un fenomen relativ răspândit în geografia politică a Europei medievale și chiar moderne.
  În prezent în lume există doar trei state-enclave : Lesotho, San Marino și Vatican, ultimele două fiind microstate.
 • O enclavă în cadrul Azerbaidjanului este regiunea autonomă Nagorno Karabah.
 • Trei regiuni autonome ale Federației Ruse sunt, de asemenea, enclave : Adîgheia, Ordînsk-Bureatia și Aghinsk-Bureatia.
 ','Europa<<-->>Europa este un continent situat în întregime în emisfera nordică și în cea mai mare parte în emisfera estică.
 Cuprinde cea mai vestică parte a Eurasiei și este mărginită de Oceanul Arctic la nord, Oceanul Atlantic la vest, Marea Mediterană la sud și de Asia la est.
 Europa este considerată în mod obișnuit separată de Asia de bazinul hidrografic al Munților Ural, râul Ural, Marea Caspică, Caucazul Mare, Marea Neagră, și căile navigabile ale strâmtorii turcești
 ','Cascada Niagara<<-->>Cascada Niagara este un ansamblu format din trei căderi de apă situate la granița dintre statul nord american New York din SUA și provincia Ontario din Canada.
  •  Cascada americană (American Falls) și Cascada vălul miresii (Bridal Veil Falls) pe teritoriul Statelor Unite și Cascada potcoavă (Horseshoe Falls) pe teritoriul Canadei.
  •  Pe partea nord americană cascada are o lățime de 363 m, apele cascadei cad de la 21 m înălțime, iar pe partea canadiană cascada are o lățime de 792 m (în formă de potcoavă), înălțimea căderii de apă fiind 51 m.
  ','Bariera de corali<<-->> Marea Barieră de Corali este cel mai mare sistem de recif de corali din lume cuprinzând aproximativ 3000 de recifuri și 300 de insule ce se întind de-a lungul a 2600 kilometri și acoperă o suprafață de 344.400 km patrati.
  • Reciful este situat în Marea Coralilor în apropiere de coasta Queensland-ului din nord-estul Australiei.
 ','Fuji<<-->>Muntele Fuji este un vulcan situat în partea centrală a insulei principale din arhipelagul Japoniei, în nordul peninsulei Izu și la vest de Tokyo.
 Aflat la granița dintre prefecturile Shizuoka și Yamanashi, este înconjurat de o zonă deluroasă și iese în evidență prin înălțime (3.776 m), fiind muntele cel mai înalt din Japonia.
','Machu Picchu <<-->>Machu Picchu este un oraș-templu incaș din secolul al XV-lea d.Hr., situat pe teritoriul regiunii actuale Cusco din Peru.
 • Ruinele au fost redescoperite în 1911 de către arheologul Hiram Bingham, fiind unele dintre cele mai frumoase și enigmatice locuri străvechi din lume.
 •În timp ce incașii foloseau sigur vârful muntelui de 2761,5 m înălțime, ridicând sute de structuri de piatră începând cu anii 1400, legendele și miturile indicau faptul că Machu Picchu (însemnând "vechiul pisc" în limba Quechua) era adorat ca un loc sacru din cele mai vechi timpuri.
',NULL,NULL, NULL, NULL,'Care este cea mai mica capitala si stat enclava din lume<->Vatican<->Berlin<->Ciudad de Mexico<->Seoul<<-->>Care este cel mai intins lac cu apa dulce din Europa?<->Baikal<->Rybinsk<->Saimaa<->Estona<<-->>Cu ce ocean se invecineaza Europa in partea vestica?<->Atlantic<->Pacific<->Indian<->Artic<<-->>Unde este situata cascada Niagara:<->la granita dintre America si Canada<->Mexic<->Australia<->Brazilia<<-->>Unde se afla Marea Bariera de Corali?<->Australia<->Japonia<->Indonezia<->Jamaica<<-->>Pe teritoriul carei tari se afla vulcanul Fuji?<->Japonia<->Hawaii<->Stromboli<->USA<<-->> Care stat european este renumit pentru calitatea ciocolatei<->Belgia<->Franta<->Finlanda<->Spania<<-->>Care este cea mai mare statiutine balneo climaterica din Europa?<->Baden Baden<->Grindavik<->Vals<->Bath<<-->> In ce regiune din America de sud se afla Machu Picchu<->Peru<->Columbia<->Brazilia<->Bolivia<<-->>Cel mai mare aeroport din Europa este localizat in ?<->Charles de Gaulle<->Heathrow<->Amsterdam<->Frankfurt',0,6);

INSERT INTO `lesson` VALUES (5,3,'Geografie Special','Provocare<<-->> Esti pregatit sa faci fata ultimei provocari?
 Celelalte teste au fost doar incalzirea.
',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Care este cel mai mare continent(ca lungime)<->Asia<->Antartica<->America de Nord<->Africa<<-->>Este Canada cea mai apropiata tara  de Polul Nord?<->T<<-->>Ce este un arhipelag?<->O adunare sau grupare de mai multe insule <->O sectiune de pamant aproape fiind inconjurata de ape<->O insula mica, de mica inaltime, pe un recif de corali<->O intindere de uscat care se prelungeste spre un corp de apa <<-->>În Islanda, puteti traversa pe doua placi tectonice. Care dintre ele, mai exact?<->EuroAsiatica si Nord Americana<->EuroAsiatica si Sud Americana<->EuroAsiatica si Antartica<->EuroAsiatica si Indo-Australiana<<-->>Care este cel mai uscat deșert din lume în afara regiunilor polare??<->Atacama<->Kalahari<->Gobi<->Sahara<<-->>Kazakhstan este tara care produce cel mai mult uraniu de pe mapamond?<->T<<-->> In Africa de Sud se afla Cascada Victoria<->T<<-->>In Insula Pastelui se gaseste piatra Moai?<->T<<-->> Prin ce tara traverseaza Tropicul Capricornului<->Australia<->China<->Mexic<->Bolivia<<-->>Fort Knox se gaseste in statul American Kentucky? ?<->T',0,1);


INSERT INTO `lesson` VALUES (2,2,'Anatomie usor','Oasele<<-->>Osul reprezintă elementul de bază al scheletului vertebratelor, caracterizat prin structura lui dură, solidă și rezistentă.
Numărul oaselor se reduce la om, prin fuzionare, odată cu vârsta, de la 350 la un nou-născut la 206 la un adult.
Cel mai lung os este femurul piciorului, de obicei de peste 50 cm, iar cel mic este „scărița” din ureche. Între ele, oasele se leagă prin articulații și sunt mobilizate de mușchi.
Rolul oaselor:
   •rol de parghii ale aparatului locomotor(articulatii)
   •rol de protectie a unor organe vitale
','Inima<<-->>Inima sau cordul este organul reprezentativ al aparatului cardiovascular, ea fiind situată în cutia toracică, în mediastin (spațiul dintre plămâni). Are un rol vital în circulația sângelui și implicit în menținerea vieții.
Inima este localizată la nivelul toracelui,în mediastinul mijlociu, o treime din aceasta fiind localizată la dreapta față de linia mediană și două treimi fiind localizate la stânga liniei mediene. Inima omului, de altfel ca și inima tuturor mamiferelor, are patru camere: atriu drept și stâng, și ventricul drept și stâng.
Frecvența cardiacă normală este de 60-80 bătăi pe minut, cu un debit cardiac de 3-4 l/min.
•sistolică - 115-140 mmHg
•diastolică - de 75-90 mmHg
Afectiuni ale inimii
•Miocardite - inflamații ale miocardului.
•Pericardite - inflamații ale pericardului.
',' Dintele <<-->>Dintele este un organ dur, de culoare alb-galbuie, cu sediul in cavitatea orala ,compus dintr-o coroană liberă și una sau mai multe rădăcini implantate în regiunea alveolara a oaselor maxilare (maxilar și mandibulă), și destinat îndeosebi la tăierea, la zdrobirea și la măcinarea alimentelor.
  Structura dintelui:
  • Coroana dintelui este alcatuita dintr-un strat neuniform de smalț, care este un țesut ectodermic format în perioada embriogenezei.
  •Rădăcina prezintă la suprafață cement, o substanță organo-minerală de origine mezodermică, proliferat pe întreaga perioadă a existenței dintelui și dispus sub formă de fibre de colagen.
  •Profund în dinte se găsește pulpa dentară, plină cu țesut moale conector. Aici se găsesc nervi și vase de sânge care pătrund în dinte printr-un canal apical al rădăcinii. Pulpa este adesea denumită „nervul dintelui”.
  Un om adult are 32 de dinți, ce pot fi împărțiți în patru tipuri: 8 incisivi, 4 canini, 8 premolari și 12 molari.
',' Sangele<<-->> Sângele  este o substanță lichidă de culoare roșie, compusă din plasmă și din globule (albe și roșii), care circulă prin vene și artere, capilare asigurând nutriția și oxigenarea organismului la animalele superioare.
 Circulația sângelui este asigurată în primul rând prin contracțiile mușchiului cardiac, ajutat de valvulele venoase în combinație cu contracțiile mușchilor scheletici.
 În general vasele de sânge bogate în oxigen care pornind de la inimă și irigă țesuturile se numesc artere iar cele care sosesc la inimă și transportă produsele de catabolism de la țesuturi încărcate cu dioxid de carbon se numesc vene.
  Rolul sângelui este cel de a transporta substanțele nutritive prin corp, dar în el se pot transporta și trombocitele ce ajută la repararea țesutului (plăgii).
  Boli ale sangelui :
 • Hemofiliile sunt sangerari patologice ereditare, frecvent intalnite, produse prin deficitul unuia dintre factorii de coagulare VII sau IX.
',' Epiglota<<-->>Epiglota este o clapă formată din țesut cartilaginos elastic acoperită cu membrană mucoasă, atașată la intrarea laringelui.
 Aceasta este așezată oblic în sus, între limbă și osul hioid, întreptându-se dorsal. Pe epiglotă se află papile gustative.
','Creierul<<-->>Creierul este compus din 2 emisfere cerebrale ( cele mai mari structure),cerebel ( localizat posterior de emeisferele cerebrale) si trunchiul cerebral( situate anterior de cerebel si postero-inferior de emisferele cerebrale).
   Creierul este acoperit de un invelis dur numit duramater, protejata la randul sau spre exterior de oasele craniului.
   Emisferele cerebrale sunt compuse din 4 lobii:frontal, temporal, parietal și occipital.
  •Lobii frontali: au rol intr-o varietate de functii incluzand: personalitate,comportament si aptitudini sociale, emotii si dispozitie, rationament si luarea deciizilor, initiativa si planificare.
  •Lobii temporali: au rol in vorbirea si intelegea cuvintelor, memorie, auz, emotii.
  • Lobii parietali, localizati posterior de lobii frontalii au rol in : Sensibilitatea tactila,termica si dureroasa ( termo-algica), integrarea multiplelor informatii senzoriale.
  • Lobii occipitali, situati in portiunea posterioara a creierului si sunt principalele zone ale creierului responsabile cu vederea.
',' Arterele<<-->>Artera este un vas de sânge care duce sângele de la inimă către una sau mai multe părți ale corpului (țesuturi, plămâni, creier).
 Majoritatea arterelor transporta sânge oxigenat: cele două excepții sunt artera pulmonară și artera ombilicală, care transportă sângele neoxigenat către organele care îl oxigenează (plămâni și, respectiv, placentă). Arterele fac parte din sistemul circulator, care este responsabil pentru transportul oxigenului și a substanțelor nutritive către toate celulele.
 Artele se împart în 3 mari categorii:
•Arterele pulmonare: sunt acele vase responsabile pentru transportarea sângelui neoxigenat și a produselor reziduale de la inimă către plămâni.
• Arterele sistemice se ocupă transferul sângelui oxigenat și a substanțelor nutritive de la inimă la toate organele și țesuturile din corp.
• Aorta este vasul arterial elementar al corpului uman. Își are originea din ventriculul stâng al inimii și este compusă din două porțiuni, aorta toracică și cea abdominală.
','Keratina<<-->> Keratina  este una dintr-o familie de proteine structurale fibroase cunoscute sub numele de scleroproteine. α-Keratina este un tip de keratină care se găsește la vertebrate.
Este materialul structural cheie care alcătuiește părul, unghiile, penele, coarnele, ghearele, copitele, calusurile și stratul exterior al pielii printre vertebrate.
Keratina protejează de asemenea celulele epiteliale de deteriorare sau stres.
','Pielea<<-->> Pielea constituie un înveliș neîntrerupt care se continuă la nivelul marilor orificii (gură, nas) cu o semimucoasă (parțial cheratinizată) și care, în interiorul cavităților respective, devine o mucoasă propriu-zisă. Pielea reprezintă o suprafață receptorie extrem de vastă, care asigură o sensibilitate diversă, protejează corpul de leziuni mecanice (răni) și microorganisme, participă la secretarea unor produse finale ale metabolismului și îndeplinește de asemenea un important rol de termoregulație, execută funcțiile de respirație, conține rezerve energetice, leagă mediul înconjurător cu tot organismul.
Pielea este invelisul protector al corpului. Este cel mai mare organ al corpului, cantareste 16% din greutatea corporala si are o suprafat de aproximativ 1,8-2mp.
Pielea este structurata in 3 straturi: epiderma, derma si hipoderma.
',NULL,'Este pielea cel mai mare organ al corpului uman?<->A<<-->>Tibia este cel mai lung os al corpului?<->F<<-->>Inima este compusa din 4 camere?<->A<<-->>Artera aorta este cea mai mare aorta din corp?<->A<<-->>Un om ajuns la maturitate are 42 de dinti?<->F<<-->>Scheletul unui om ajuns la maturitate are intre 206 si 210  de oase?<->A<<-->>Hemofilia este o boala specifica sistemului nervos?<->F<<-->>Keratina se regaseste in unghii si firul de par?<->A<<-->>Epiglota se regaseste in torace?<->F<<-->>Lobul parietal este responsabil cu controlul motrocitatii?<->F',0,9);


INSERT INTO `lesson` VALUES (4,2,'Anatomie mediu','Ochiul<<-->>Ochiul este un organ a cărui principală funcție este cea de a detecta lumina. Se compune dintr-un sistem sensibil la schimbările de lumină, capabil să le transforme în impulsuri nervoase.
 Ochiul are o formă sferică, este umplut de o substanță transparentă, gelationoasă numită umoare vitroasă, are o lentilă de focalizare numită cristalin și, adeseori, un mușchi numit iris, care reglează cantitatea de lumină care intră.
 Cele mai des întâlnite defecte de vedere ale ochiului uman sunt:
 Diferențele dintre defectele principale de vedere
• Miopia este cel mai des întâlnit defect de vedere, aceasta având un caracter patologic(apare la naștere) și ia loc atunci când globul ocular al ochiului miop este mai mare decât cel al ochiului normal, imaginea formându-se în fața retinei.
 •Hipermetropia este de asemenea un defect patologic, aceasta însă luând loc mai rar decât miopia. Globul ocular al ochiului hipermetrop este mai mic decât cel al ochiului normal, în consecință imaginea formându-se în spatele retinei.
 • Daltonismul se mai numeşte şi cecitate cromatică, iar persoanele afectate pot avea probleme în distingerea şi a altor culori, în afară de roşu şi verde.
','Rinichiul<<-->>Rinichii  sunt o pereche de organe, fiind parte esențială a aparatului excretor. Rolul principal al rinchilor este excreția, realizat prin filtrarea sângelui, eliminarea prin urină a substanțelor inutile sau dăunătoare, produse de organismul propriu sau luate din mediul exterior.
 Rinichii regulează controlul compoziției urinei, prin producția hormonală.
 La om rinichiul este așezat retroperitoneal de o parte și alta a coloanei vertebrale, sub diafragmă, apărat de un strat de grăsime (adipos).
  În principiu funcția renală constă din două etape:
• o filtrare primară fără elemente de resturi celulare, cu o urină diluată.
• o filtrare secundară când se va resorbi înapoi din urina primară o parte din lichidul eliminat împreună cu glucide, aminoacizi și electroliți rezultând o urină mai concentrată.
','Urechea<<-->>Urechea este organul de auz al vertebratelor, la mamifere fiind și organ de simț al echilibrului. Termenul se poate referi la întreg sistemul responsabil pentru colectarea și procesarea primitivă a sunetului (începutul sistemului auditiv), sau doar la partea vizibilă a acestuia.
  Structura:
 Urechea externă este partea vizibilă a urechii, numită pavilion, captează undele sonore din aer și le transmite  spre urechea interioară.
În  urechea medie  se află trei oscioare, fiecare dintre ele cu o formă caracteristică (ciocănaș, nicovală, scăriță).
 Urechea medie este cavernoasă. Dacă omul ajunge într-un mediu cu altitudine ridicată, sau sare în apă, se va stabili o diferență de presiune între urechea medie și mediul înconjurător. Această presiune expune timpanul la riscul de a se sparge dacă nu este depresurizat. Acesta este unul dintre rolurile trompei lui Eustachio, prin intermediul căreia urechea medie comunică cu cavitatea nazală (faringe).
 Urechea internă cuprinde atât organul de auz  cât și aparatul vestibular, un organ de echilibru format din trei canale semicirculare și vestibul.
 ','Coloana vertebrala<<-->>Coloană vertebrală, cunoscută și sub numele de șira spinării , face parte din scheletul axial.
  Coloana vertebrală adăpostește canalul spinal, o cavitate care cuprinde și protejează măduva spinării.
 Coloana vertebrală este constituită din 34 de vertebre și are 5 regiuni :
  •regiunea cervicală - din 7 vertebre (primele două se numesc atlas și axis datorita funcției de susținere pe care le îndeplinesc)
  •regiunea toracică - din 12 vertebre
  •regiunea lombară - din 5 vertebre
  • regiunea sacrală - din 5 vertebre sudate (sacrum)
  • regiunea coccigiană - din 4/5 vertebre reduse (coccis).
 ','Aparatul respirator<<-->>Aparatul respirator  sau sistemul respirator  constituie totalitatea organelor care servesc la schimbul gazos între organism și mediu, asigurând organismul cu oxigen, indispensabil vieții celulelor, și eliminând din organism dioxidul de carbon rezultat din oxidări.
 Anatomia aparatului aspirator:
 Cavitate nazală - sunt căptușite cu mucoasa nazala.
• Faringe - este organul comun sistemului digestiv și sistemului respirator.
•Laringe - are în peretele său numeroși mușchi și piese cartilaginoase protectoare.
•Trahee - conține în peretele său inele cartilaginoase suprapuse care țin mereu deschis.
• Bronhii - au țesut cartilaginos. Mucoasa traheei și bronhiilor produce mucus care retine particulele străine, iar cilii prezenți împing corpurile străine spre ieșire, prin mișcarea lor permanenta.
• Saci alveolari - sunt extremitățile bronhiolelor.
• Alveole pulmonare (în plămâni)de unde oxigenul trece în sânge, apoi în celule.
 ',NULL,NULL,NULL,NULL,NULL,'Cum se numeste incapacitatea de a percepe culorile rosu si verde?<->daltonism<->cataracta<->strabism<->miopie<<-->>Ce denumire mai poarta celula nervoasa?<->neuron<->nucleu<->sinapsa<->celula eucariota<<-->>Din cate falange sunt formate degetele de la mana(fara cel mare)<->3<->4<->2<->5<<-->>Care este rolul rinichilor?<->filtrarea toxinelor<->eliminare urina<->absorbtie nutrienti<->eliminare depuneri<<-->>Unde este localizata Trompeta lui Eustache?<->ureche<->tibie<->torace<->coloana vertebrala<<-->>Rolul globulelor albe este?<->de a proteja organismul<->optimizarea vederii nocturne<->mentinerea echilibrului<->produc enzime<<-->>Din cate regiuni este formata coloana vertebrala?<->5<->4<->3<->2<<-->>Unde se regaseste plasma?<->sange<->limfa<->maduva<->os<<-->>Cate  perechi coaste are un om normal<->12<->6<->10<->8<<-->>Unde se gasesc sacii alveolari?<->plamani<->inima<->ficat<->pancreas',0,5);


INSERT INTO `lesson` VALUES (6,3,'Anatomie special','Provocare<<-->> Esti pregatit sa faci fata ultimei provocari?
 Celelalte teste au fost doar incalzirea.
 ',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Cum se numeste incapacitatea de a percepe culorile rosu si verde?<->daltonism<->cataracta<->strabism<->miopie<<-->>Ce denumire mai poarta celula nervoasa?<->neuron<->nucleu<->sinapsa<->celula eucariota<<-->>Din cate falange sunt formate degetele de la mana(fara cel mare)<->3<->4<->2<->5<<-->>Care este rolul rinichilor?<->filtrarea toxinelor<->eliminare urina<->absorbtie nutrienti<->eliminare depuneri<<-->>Unde este localizata Trompeta lui Eustache?<->ureche<->tibie<->torace<->coloana vertebrala<<-->>Rolul globulelor albe este?<->de a proteja organismul<->optimizarea vederii nocturne<->mentinerea echilibrului<->produc enzime<<-->>Din cate regiuni este formata coloana vertebrala?<->5<->4<->3<->2<<-->>Unde se regaseste plasma?<->sange<->limfa<->maduva<->os<<-->>Cate  perechi coaste are un om normal<->12<->6<->10<->8<<-->>Unde se gasesc sacii alveolari?<->plamani<->inima<->ficat<->pancreas',0,1);

CREATE TABLE IF NOT EXISTS `course` (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`title`	TEXT
);
INSERT INTO `course` VALUES (1,'Geografie');
INSERT INTO `course` VALUES (2,'Anatomie');
INSERT INTO `course` VALUES (3,'Spicy');



COMMIT;
