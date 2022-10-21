DROP TABLE IF EXISTS "Profile" CASCADE;
CREATE TABLE  "Profile" (
  "position" varchar(255) NOT NULL,
  "company" varchar(255) NOT NULL,
  "companyAddress" varchar(255) NOT NULL,
  "interests" varchar(255) NOT NULL,
  "experience" varchar(255) NOT NULL,
  "education" varchar(255) NOT NULL,
  "certification" varchar(255) NOT NULL,
  "skills" varchar(255) NOT NULL,
  "language" varchar(255) NOT NULL,
  "usernameKey" varchar(255) PRIMARY KEY REFERENCES "UserID"("username")
);