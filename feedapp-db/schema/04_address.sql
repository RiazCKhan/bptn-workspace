DROP TABLE IF EXISTS "Address" CASCADE;
CREATE TABLE  "Address" (
  "address" varchar(255) NOT NULL,
  "city" varchar(255) NOT NULL,
  "state" varchar(255),
  "country" varchar(255),
  "pincode" varchar(255),
  "usernameKey" varchar(255) PRIMARY KEY REFERENCES "UserID"("username")
);