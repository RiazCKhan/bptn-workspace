DROP TABLE IF EXISTS "AuthenticationUser" CASCADE;
CREATE TABLE "AuthenticationUser" (
  "usernameKey" varchar(255) PRIMARY KEY REFERENCES "UserID"("username")
  "userPassword" varchar(255) NOT NULL,
  "phoneNumber" varchar(255) NOT NULL,
  "securityQuestion1" varchar(255) NOT NULL,
  "securityQuestion2" varchar(255) NOT NULL,
  "securityQuestion3" varchar(255) NOT NULL,
  "securityAnswer1" varchar(255) NOT NULL,
  "securityAnswer2" varchar(255) NOT NULL,
  "securityAnswer3" varchar(255) NOT NULL
);