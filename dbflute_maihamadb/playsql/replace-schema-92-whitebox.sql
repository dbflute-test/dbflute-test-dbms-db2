
CREATE TABLE WHITE_EXCEPT(
	EXCEPT_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	EXCEPT_NAME VARCHAR(256)
);

CREATE TABLE WHITE_REF_EXCEPT(
	REF_EXCEPT_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	EXCEPT_ID NUMERIC(16) NOT NULL
);

CREATE TABLE WHITE_TARGET(
	TARGET_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TARGET_NAME VARCHAR(256)
);

CREATE TABLE WHITE_REF_TARGET(
	REF_TARGET_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TARGET_ID NUMERIC(16) NOT NULL
);

ALTER TABLE WHITE_REF_EXCEPT ADD CONSTRAINT FK_WHITE_REF_EXCEPT
	FOREIGN KEY (EXCEPT_ID) REFERENCES WHITE_EXCEPT (EXCEPT_ID) ;
	
ALTER TABLE WHITE_REF_TARGET ADD CONSTRAINT FK_WHITE_REF_TARGET
	FOREIGN KEY (TARGET_ID) REFERENCES WHITE_TARGET (TARGET_ID) ;
