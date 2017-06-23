INSERT INTO doctors VALUES (1, 'James', 'Carter', '3424 University Ave.', 'Madison', 'WI');
INSERT INTO doctors VALUES (2, 'Helen', 'Leary', '750 Hilldale Way', 'Madison', 'WI');
INSERT INTO doctors VALUES (3, 'Linda', 'Douglas', '6136 University Ave.', 'Middleton', 'WI');
INSERT INTO doctors VALUES (4, 'Rafael', 'Ortega', '8300 Airport Rd.', 'Middleton', 'WI');
INSERT INTO doctors VALUES (5, 'Henry', 'Stevens', '876 Jupiter Dr.', 'Madison', 'WI');
INSERT INTO doctors VALUES (6, 'Sharon', 'Jenkins', '4905 Monona Dr.', 'Monona', 'WI');

INSERT INTO doctor_names VALUES (1, 'Carter');
INSERT INTO doctor_names VALUES (2, 'Leary');
INSERT INTO doctor_names VALUES (3, 'Douglas');
INSERT INTO doctor_names VALUES (4, 'Ortega');
INSERT INTO doctor_names VALUES (5, 'Stevens');
INSERT INTO doctor_names VALUES (6, 'Jenkins');


INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO doctor_specialties VALUES (2, 1);
INSERT INTO doctor_specialties VALUES (3, 2);
INSERT INTO doctor_specialties VALUES (3, 3);
INSERT INTO doctor_specialties VALUES (4, 2);
INSERT INTO doctor_specialties VALUES (5, 1);

INSERT INTO gender VALUES (1, 'Male');
INSERT INTO gender VALUES (2, 'Female');


INSERT INTO parents VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', 'WI', '6085551023', 'george11');
INSERT INTO parents VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', 'WI', '6085551749', 'betty11');
INSERT INTO parents VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', 'AZ', '6085558763', 'eduardo11');
INSERT INTO parents VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', 'CO', '6085553198', 'harold11');
INSERT INTO parents VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', 'WI', '6085552765', 'peter11');
INSERT INTO parents VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', 'WI', '6085552654', 'jean11');
INSERT INTO parents VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', 'WI', '6085555387', 'jeff11');
INSERT INTO parents VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', 'WI', '6085557683', 'maria11');
INSERT INTO parents VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', 'WI', '6085559435', 'david11');
INSERT INTO parents VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', 'WI', '6085555487', 'carlos11');

INSERT INTO kids VALUES (1, 'Alyssa', '2010-09-07', 2, 1, 'Claritin', 'None');
INSERT INTO kids VALUES (2, 'Joe', '2012-08-06', 1, 2, 'None', 'Lipitor');
INSERT INTO kids VALUES (3, 'Lauren', '2011-04-17', 2, 3, 'None', 'None');
INSERT INTO kids VALUES (4, 'Nicole', '2010-03-07', 2, 3, 'Penicilin', 'None');
INSERT INTO kids VALUES (5, 'Thomas', '2010-11-30', 1, 4, 'None', 'Plavix');
INSERT INTO kids VALUES (6, 'Samantha', '2010-01-20', 2, 5, 'Latex', 'Advair Diskus');
INSERT INTO kids VALUES (7, 'George', '2015-09-04', 1, 6, 'Insulin', 'None');
INSERT INTO kids VALUES (8, 'Max', '2015-09-04', 1, 6, 'None', 'Singulair');
INSERT INTO kids VALUES (9, 'Brendan', '2017-08-06', 1, 7, 'None', 'Actos');
INSERT INTO kids VALUES (10, 'Elizabeth', '2017-02-24', 2, 8, 'None', 'None');
INSERT INTO kids VALUES (11, 'Lucy', '2010-03-09', 2, 9, 'Iodine', 'None');
INSERT INTO kids VALUES (12, 'Sunny', '2010-06-24', 2, 10, 'None', 'None');
INSERT INTO kids VALUES (13, 'Conner', '2012-06-08', 1, 10, 'None', 'Epogen');

INSERT INTO visits VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits VALUES (3, 8, '2013-01-03', 'cold');
INSERT INTO visits VALUES (4, 7, '2013-01-04', 'flu');


INSERT INTO reviews VALUES (1, 'James', 'Carter', 'Jeff', 'Black', 'Great doctor', 'Dr. Carter was very patient in answering all our questions.');
INSERT INTO reviews VALUES (2, 'Helen', 'Leary', 'Eduardo', 'Rodriquez', 'Horrible doctor', 'Dr. Leary will not stop calling my house.');

