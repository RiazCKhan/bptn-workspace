DROP TABLE IF EXISTS "UserID" CASCADE;
CREATE TABLE "UserID" (
  "name" varchar(255) NOT NULL,
  "username" PRIMARY KEY VARCHAR(255) NOT NULL,
  "emailID" VARCHAR(255) NOT NULL,
  "phoneNumber" VARCHAR(255),
  "userPassword" VARCHAR(255)
);