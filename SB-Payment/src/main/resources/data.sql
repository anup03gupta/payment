INSERT INTO account (id, accountname, accountno, amount, branchno, branchname, status) VALUES  (2019001012, 'J Van den Berg', 123456789, 5000.00, 51001, 'Standard Bank Generic', 'Audit Addition');
INSERT INTO account (id, accountname, accountno, amount, branchno, branchname, status) VALUES  (987654321, 'Test Sav Acnt2', 123456789, 6000.00, 51001, 'Standard Bank Generic', 'Audit Addition');
INSERT INTO account (id, accountname, accountno, amount, branchno, branchname, status) VALUES  (777777777, 'Test Current Acnt3', 123456789, 7000.00, 51001, 'Standard Bank Generic', 'Audit Addition');
INSERT INTO account (id, accountname, accountno, amount, branchno, branchname, status) VALUES  (888888888, 'Test Current Acnt1', 123456789, 8000.00, 51001, 'Standard Bank Generic', 'Audit Addition');
INSERT INTO account (id, accountname, accountno, amount, branchno, branchname, status) VALUES  (999999999, 'Test Sav Acnt2', 123456789, 9000.00, 51001, 'Standard Bank Generic', 'Audit Addition');


INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (101, 1, 'TEST STAT REF1', 'Active', 2019001012, 987654321);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (102, 2, 'TEST STAT REF2', 'Active', 2019001012, 777777777);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (103, 3, 'TEST STAT REF3', 'Active', 2019001012, 888888888);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (104, 4, 'TEST STAT REF4', 'Active', 2019001012, 999999999);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (105, 5, 'TEST STAT REF5', 'Active', 987654321, 2019001012);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (106, 6, 'TEST STAT REF6', 'Active', 987654321, 777777777);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (107, 7, 'TEST STAT REF7', 'Active', 987654321, 888888888);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (108, 7, 'TEST STAT REF8', 'Active', 777777777, 888888888);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (118, 7, 'TEST STAT REF8', 'Active', 777777777, 987654321);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (128, 7, 'TEST STAT REF8', 'Active', 777777777, 999999999);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (109, 7, 'TEST STAT REF8', 'Active', 888888888, 888888888);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (119, 7, 'TEST STAT REF8', 'Active', 888888888, 987654321);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (129, 7, 'TEST STAT REF8', 'Active', 888888888, 987654321);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (110, 7, 'TEST STAT REF8', 'Active', 999999999, 888888888);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (120, 7, 'TEST STAT REF8', 'Active', 999999999, 987654321);
INSERT INTO beneficiary (id, ben_code, statement_references, status, from_account_id, to_account_id) VALUES  (130, 7, 'TEST STAT REF8', 'Active', 999999999, 777777777);


INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001001, 500.00, 'POC Payment1', 2019001001, 123456789, 'Release', '2019-12-16', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001002, 500.00, 'POC Payment2', 2019001002, 123456789, 'Locked', '2019-11-12', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001003, 500.00, 'POC Payment3', 2019001003, 123456789, 'Locked', '2019-10-12', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001004, 500.00, 'POC Payment4', 2019001004, 123456789, 'Locked', '2019-09-12', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001005, 500.00, 'POC Payment5', 2019001005, 123456789, 'Locked', '2019-12-14', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001006, 500.00, 'POC Payment6', 2019001006, 123456789, 'Locked', '2019-12-15', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001007, 500.00, 'POC Payment7', 2019001007, 123456789, 'Locked', '2019-12-16', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001008, 500.00, 'POC Payment8', 2019001008, 123456789, 'Locked', '2019-12-10', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001009, 500.00, 'POC Payment9', 2019001009, 123456789, 'Locked', '2019-12-08', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001010, 500.00, 'POC Payment10', 2019001010, 123456789, 'Locked', '2019-12-12', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001011, 500.00, 'POC Payment11', 2019001011, 123456789, 'Locked', '2019-12-12', 2019001012, 987654321);
INSERT INTO payment (id, amount, desc, batch_id, from_account, status, valuedate, from_account_id, to_account_id) VALUES (2019001012, 500.00, 'POC Payment12', 2019001012, 123456789, 'Locked', '2019-12-12', 2019001012, 987654321);

