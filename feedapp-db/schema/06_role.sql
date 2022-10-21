DROP TABLE IF EXISTS "Role" CASCADE;
CREATE TABLE  "Role" (
  "roleName" varchar(255) NOT NULL,
  "company" varchar(255) NOT NULL,
  "skills" varchar(255) NOT NULL,
  "usernameKey" varchar(255) PRIMARY KEY REFERENCES "UserID"("username")
);