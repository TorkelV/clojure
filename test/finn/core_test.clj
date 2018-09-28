(ns finn.core-test
  (:require [clojure.test :refer :all]
            [finn.core :refer :all]
            [hickory.core :as hick]
            [finn.test-data :as test-data]))


(deftest ad-links-test)

(deftest description-test
  (testing "Should get correct description"
    (is (= (description test-data/example-ad) "Centric er et av Europas mest offensive IT selskaper, med over 5000 ansatte.\nI Norge har vi en spennende reise foran oss. Vi har en ambisios maalsetning om sterk vekst og er derfor \npaa jakt etter de beste IT-hodene som kan gjore en forskjell. I Centric vil du faa utfordrende oppdrag i et sterkt fagmiljo. Vi tilbyr faglig utvikling og en tilpasset karriereplan innenfor ditt kompetanseomraade. Vi har vaart hovedkontor i Oslo og regionskontorer som dekker omraadene Akershus, Buskerud, Vestfold, Hedmark, Oppland, Rogaland, Hordaland, Trondelag og Troms..\nTil kunden vaar er vi paa jakt etter nye teammedlemmer til deres leveranse- og integrasjonsutviklingsteam. Er du en person som liker aa ta ansvar, komme med forslag, og ser utviklingsmuligheter, da kan dette vaere stillingen for deg!\nArbeidsoppgaver\nLeveranse til kunder\nKonfigurering\nSystemutvikling\nProgrammering\nonskede kvalifikasjoner\nGode programmeringskunnskaper\nGod kunnskap om Microsoft-teknologi\nFordel om du har erfaring fra en teknisk konsulentrolle\nUtdanning innen IT fra hoyskole eller universitet\nGlodende interesse for teknologi og produktutvikling kan kompensere for manglende erfaring\nPersonlige egenskaper:\nHar god teknisk forstaaelse og er faglig engasjert\nEr initiativrik\nHar gode samarbeidsevner\nEr serviceinnstilt, fleksibel og strukturert\nEr kreativ og skapende\nEr flytende i norsk og engelsk, skriftlig og muntlig\nVi kan tilby\nMulighet for fri tilgang til Skillport, en online laeringsportal med e-boker, lydboker, kurs, videoer og eksamenstester. Med Skillsoft kan du laere naar du vil, hvor du vil!\nInside Centric: Faa tilgang til en rekke tilbud og fordeler innen kategoriene Helse, Work Life Balance og Reise. Vi tilbyr f. eks. rabatt paa SATS Elixia, Norges storste treningssenterkjede.\nGratis MTA-sertifisering. Faa en innforing i Microsofts ulike teknologier innen infrastruktur, database og programmering.\nGode muligheter for karriereutvikling\nInvitasjon til konsulentsamlinger\nPersonlig og tett oppfolging av konsulentansvarlig\nFor sporsmaal om stillingen, kontakt Guro Fray paa guro.fray@centric.eu eller 98037002.\nSokere vil bli vurdert fortlopende."))))


(deftest title-test
  (testing "Should get correct title"
    (is (= (title test-data/example-ad) "Onsker du aa jobbe med leveranser/integrasjoner  i et spennende selskap?"))))


(deftest keyed-description-test
  (testing "Should get correct title"
    (is (= (keyed-description test-data/example-ad) '(("Arbeidsgiver" "Centric IT Professionals AS")
                                          ("Stillingstittel" "Konsulent")
                                          ("Sted" "Stavanger")
                                          ("Frist" "Snarest")
                                          ("Varighet" "Engasjement")
                                          ("Sektor" "Privat")
                                          ("Antall stillinger" "3")
                                          ("Sted" "4016 Stavanger")
                                          ("Bransje" "IT" "IT - programvare")
                                          ("Stillingsfunksjon" "IT utvikling / Utvikler (generell)" "IT utvikling / Systemarkitekt" "Ingenior"))))))

