CREATE DATABASE feedApp;

-- USERID TABLE
DROP TABLE IF EXISTS "UserID" CASCADE;
CREATE TABLE  "UserID" (
  "username" varchar(255) NOT NULL,
  "emailID" varchar(255) NOT NULL,
  "phoneNumber" varchar(255),
  "userPassword" varchar(255)
);

INSERT INTO "UserID" ("username", "emailID", "phoneNumber", "userPassword") VALUES ('JD', 'JDn@mail.com', '416', '123');
INSERT INTO "UserID" ("username", "emailID", "phoneNumber", "userPassword") VALUES ('Jane', 'JL@dmail.com', '905', '123');
INSERT INTO "UserID" ("username", "emailID", "phoneNumber", "userPassword") VALUES ('Kim', 'KS@mail.com', '613', '123');
INSERT INTO "UserID" ("username", "emailID", "phoneNumber", "userPassword") VALUES ('Tom', 'TM@mail.com', '413', '123');
INSERT INTO "UserID" ("username", "emailID", "phoneNumber", "userPassword") VALUES ('Sam', 'SS@mail.com', '347', '123');

UPDATE "UserID" SET "username" = 'JackDan' WHERE "username" = 'JD';

DELETE FROM "UserID" WHERE "username" = 'JackDan';

BEGIN;
INSERT INTO "UserID" ("username", "emailID", "phoneNumber","userPassword") VALUES ('JD', 'JDn@mail.com', '416', '123');
COMMIT;

ALTER TABLE "UserID" ADD PRIMARY KEY ("username");

-- POST TABLE
DROP TABLE IF EXISTS "Post" CASCADE;
CREATE TABLE  "Post" (
  "postID" varchar(255) NOT NULL,
  "postType" varchar(255),
  "usernameKey" varchar(255)
);

INSERT INTO "Post" ("postID", "postType", "usernameKey") VALUES ('123abc', 'vlog', 'Jane');
INSERT INTO "Post" ("postID", "postType", "usernameKey") VALUES ('456def', 'blog', 'Kim');

UPDATE "Post" SET "postID" = '789xyz' WHERE "postID" = '456def';

DELETE FROM "Post" WHERE "postID" = '789xyz';

BEGIN;
INSERT INTO "Post" ("postID", "postType", "usernameKey") VALUES ('456def', 'blog', 'Kim');
COMMIT;

ALTER TABLE "Post" ADD PRIMARY KEY ("postID");

ALTER TABLE "Post"
ADD CONSTRAINT "username_fkey" 
FOREIGN KEY ("usernameKey") 
REFERENCES "UserID" ("username");

-- IMAGEMETADATA
DROP TABLE IF EXISTS "ImageMetaData" CASCADE;
CREATE TABLE  "ImageMetaData" (
  "imageID" varchar(255) NOT NULL,
  "imageName" varchar(255) NOT NULL,
  "imageSize" varchar(255),
  "imageFormat" varchar(255),
  "imageDate" varchar(255),
  "resolution" varchar(255),
  "postKey" varchar(255)
);

INSERT INTO "ImageMetaData" ("imageID", "imageName", "imageSize", "imageFormat", "imageDate", "resolution", "postKey") 
VALUES ('01', 'OW', '200mb', 'png', '01/01/0001', '400x400', '123abc');

INSERT INTO "ImageMetaData" ("imageID", "imageName", "imageSize", "imageFormat", "imageDate", "resolution", "postKey") 
VALUES ('02', 'OW2', '400mb', 'jpeg', '02/02/0002', '600x400', '456def');

UPDATE "ImageMetaData" SET "postKey" = '789xyz' WHERE "postKey" = '456def';

DELETE FROM "ImageMetaData" WHERE "postKey" = '789xyz';

BEGIN;
INSERT INTO "ImageMetaData" ("imageID", "imageName", "imageSize", "imageFormat", "imageDate", "resolution", "postKey") 
VALUES ('02', 'OW2', '400mb', 'jpeg', '02/02/0002', '600x400', '456def');
COMMIT;

ALTER TABLE "ImageMetaData" ADD PRIMARY KEY ("imageID");

ALTER TABLE "ImageMetaData"
ADD CONSTRAINT "post_fkey" 
FOREIGN KEY ("postKey") 
REFERENCES "Post" ("postID");

-- ADDRESS
DROP TABLE IF EXISTS "Address" CASCADE;
CREATE TABLE  "Address" (
  "address" varchar(255) NOT NULL,
  "city" varchar(255) NOT NULL,
  "state" varchar(255),
  "country" varchar(255),
  "pincode" varchar(255),
  "usernameKey" varchar(255)
);

INSERT INTO "Address" ("address", "city", "state", "country", "pincode", "usernameKey")
VALUES ('NopeTown', 'NoWhere', 'No', 'NoState', '010101', 'Tom');

INSERT INTO "Address" ("address", "city", "state", "country", "pincode", "usernameKey")
VALUES ('BillStreet', 'Money', '$$$', 'MilliRow', '999', 'Sam');

UPDATE "Address" SET "address" = 'Broke' WHERE "address" = 'NopeTown';

DELETE FROM "Address" WHERE "address" = 'Broke';

BEGIN;
INSERT INTO "Address" ("address", "city", "state", "country", "pincode", "usernameKey")
VALUES ('NopeTown', 'NoWhere', 'No', 'NoState', '010101', 'Tom');
COMMIT; 

ALTER TABLE "Address" ADD PRIMARY KEY ("usernameKey");

ALTER TABLE "Address"
ADD CONSTRAINT "address-usernameKey_fkey" 
FOREIGN KEY ("usernameKey") 
REFERENCES "UserID" ("username");