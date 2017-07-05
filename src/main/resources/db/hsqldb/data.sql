INSERT INTO doctors VALUES (1, 'Samuel', 'Church', '4171 Westport Rd.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (2, 'Donald', 'Gilbert', '3430 Newburg Rd.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (3, 'Stacie', 'Gratefeld', '4130 Dutchmans Ln.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (4, 'Jermey', 'Lemon', '825 Barret Ave.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (5, 'Sharon', 'Lynn', '825 Barret Ave.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (6, 'Analisa', 'Livera', '217 Beckenridge Ln.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (7, 'Curtis', 'Segelon', '217 Beckenridge Ln.', 'Louisville', 'KY');
INSERT INTO doctors VALUES (8, 'Sarah', 'Bailen', '217 Beckenridge Ln.', 'Louisville', 'KY');

INSERT INTO specialties VALUES (1, 'pediatrics');
INSERT INTO specialties VALUES (2, 'orthopedic surgeon');
INSERT INTO specialties VALUES (3, 'physiatrist');

INSERT INTO doctor_specialties VALUES (1, 1);
INSERT INTO doctor_specialties VALUES (2, 1);
INSERT INTO doctor_specialties VALUES (3, 2);
INSERT INTO doctor_specialties VALUES (4, 3);
INSERT INTO doctor_specialties VALUES (5, 3);
INSERT INTO doctor_specialties VALUES (6, 1);
INSERT INTO doctor_specialties VALUES (7, 1);
INSERT INTO doctor_specialties VALUES (8, 1);

INSERT INTO gender VALUES (1, 'Male');
INSERT INTO gender VALUES (2, 'Female');


INSERT INTO parents VALUES (1, 'George', 'Franklin', '252 Earnhardt Dr.', 'Louisville', 'KY', '5026362851', 'george11');
INSERT INTO parents VALUES (2, 'Betty', 'Davis', '2564 Cerullo Rd.', 'Louisville', 'KY', '5023639141', 'betty11');
INSERT INTO parents VALUES (3, 'Eduardo', 'Rodriquez', '3728 Radford St.', 'Louisville', 'KY', '5022300979', 'eduardo11');
INSERT INTO parents VALUES (4, 'Harold', 'Davis', '1925 Martha St.', 'Prospect', 'KY', '9286914895', 'harold11');
INSERT INTO parents VALUES (5, 'Soap', 'McTavish', '3339 Diamond Cove', 'Louisville', 'KY', '4013290144', 'peter11');
INSERT INTO parents VALUES (6, 'Jean', 'Coleman', '3046 Coventry Ct.', 'Louisville', 'KY', '2282405240', 'jean11');
INSERT INTO parents VALUES (7, 'Jeff', 'Black', '1170 Hornor Ave.', 'Louisville', 'KY', '9183242359', 'jeff11');
INSERT INTO parents VALUES (8, 'Maria', 'Escobito', '3711 Cerullo Rd.', 'Louisville', 'KY', '5023720026', 'maria11');
INSERT INTO parents VALUES (9, 'Dennis', 'Schroeder', '3404 Hinkle Deegan Lake Rd.', 'Louisville', 'KY', '6072724695', 'dennis11');
INSERT INTO parents VALUES (10, 'Carlos', 'Estaban', '2567 Karen Ln.', 'Louisville', 'KY', '5028978172', 'carlos11');

INSERT INTO kids VALUES (1, 'Alyssa', '2000-09-07', 2, 1, 'Claritin', 'None');
INSERT INTO kids VALUES (2, 'Joe', '2002-08-06', 1, 2, 'None', 'Lipitor');
INSERT INTO kids VALUES (3, 'Lauren', '2001-04-17', 2, 3, 'None', 'None');
INSERT INTO kids VALUES (4, 'Nicole', '2000-03-07', 2, 3, 'Penicilin', 'None');
INSERT INTO kids VALUES (5, 'Thomas', '2000-11-30', 1, 4, 'None', 'Plavix');
INSERT INTO kids VALUES (6, 'Samantha', '2000-01-20', 2, 5, 'Latex', 'Advair Diskus');
INSERT INTO kids VALUES (7, 'George', '1995-09-04', 1, 6, 'Insulin', 'None');
INSERT INTO kids VALUES (8, 'Max', '1995-09-04', 1, 6, 'None', 'Singulair');
INSERT INTO kids VALUES (9, 'Brendan', '1999-08-06', 1, 7, 'None', 'Actos');
INSERT INTO kids VALUES (10, 'Elizabeth', '1997-02-24', 2, 8, 'None', 'None');
INSERT INTO kids VALUES (11, 'Lucy', '2000-03-09', 2, 9, 'Iodine', 'None');
INSERT INTO kids VALUES (12, 'Sunny', '2000-06-24', 2, 10, 'None', 'None');
INSERT INTO kids VALUES (13, 'Conner', '2002-06-08', 1, 10, 'None', 'Epogen');

INSERT INTO visits VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits VALUES (3, 8, '2013-01-03', 'cold');
INSERT INTO visits VALUES (4, 7, '2013-01-04', 'flu');

INSERT INTO reviews VALUES (1, 'They Helped Save My Child!', 'Dr. Stevens helped diagnose my child with a rare disease! He saved my kids life!', 'Samuel Church', 'Jeff Black');
INSERT INTO reviews VALUES (2, 'Extremely Clean Facility!', 'Everyone keeps a super clean office which makes me feel much more comfortable!', 'Sarah Bailen', 'Maria Escobito');
INSERT INTO reviews VALUES (3, 'Wonderful Kind Staff!', 'Everytime I walk into the office, the staff is always smiling and ready to help my child. They are truely an amazing staff!', 'Analisa Livera', 'Dennis Schroeder');