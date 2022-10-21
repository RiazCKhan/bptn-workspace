DROP TABLE IF EXISTS "History" CASCADE;
CREATE TABLE  "History" (
  "postID" varchar(255) PRIMARY KEY NOT NULL,
  "date" varchar(255) NOT NULL,
  "postType" varchar(255) NOT NULL,
  "postUpload" varchar(255),
  "usernameKey" varchar(255) REFERENCES "UserID"("username")
);