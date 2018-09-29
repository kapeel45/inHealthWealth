ALTER TABLE expenditure CHANGE 'spent_date' 'spent_date' TIMESTAMP
 NOT NULL DEFAULT CURRENT_TIMESTAMP
 ON UPDATE CURRENT_TIMESTAMP
 COMMENT 'Spend Datetime';
 
ALTER TABLE expenditure CHANGE spent_date spent_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE expenditure CHANGE is_cash pay_mode VARCHAR(50) NOT NULL;

ALTER TABLE expenditure CHANGE txn_type txn_type ENUM('DEBIT','CREDIT','NA') NOT NULL;

ALTER TABLE expenditure CHANGE txn_id txn_reference;

ALTER TABLE expenditure CHANGE value_in_rs value_in_rs DECIMAL(12,4) NOT NULL;

ALTER TABLE expenditure ADD id BIGINT PRIMARY KEY AUTO_INCREMENT;

ALTER TABLE expenditure ADD comment VARCHAR(255) NOT NULL DEFAULT 'NA';

SELECT SUM(value_in_rs) FROM kharchadb.expenditure where txn_type = 'Debit' and category IN ('Home','Fuel','Food','Office') order by spent_date ASC;



