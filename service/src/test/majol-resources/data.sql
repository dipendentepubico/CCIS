
INSERT INTO fin_mandati (pkid, cod,des,eu,anno, data)
VALUES (1, 56,'descrizione del mandato','E',2021, '2021-05-19 00:00:00');

INSERT INTO an1_dettagli(pkid, partita_iva)
VALUES (1, 'piva');

INSERT INTO an1_anagrafe_unica(pkid, id_dettagli, codice_fiscale)
VALUES (1, 1, 'cf');

INSERT INTO fin_mandati_nomi (pkid, id_mandato, id_an1)
VALUES (1,1 , 1);

INSERT INTO fel_import_flussi(pkid, identificativo_sdi)
VALUES (1, 544);

INSERT INTO fel_import_fatture(pkid, id_flusso, numero, descrizione, importo)
VALUES (1, 1, '278/4', 'fattura 278/4', 1536 );

INSERT INTO fel_import_dettagli(pkid, id_fattura, natura_aliquota)
VALUES (1, 1, 'c4');