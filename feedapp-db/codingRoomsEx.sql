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
