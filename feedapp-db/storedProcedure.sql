CREATE OR REPLACE PROCEDURE user_insert_data(
  "_name" VARCHAR,
  "_emailID" VARCHAR,
  "_phoneNumber" VARCHAR,
  "_userPassword" VARCHAR,
  "_username" VARCHAR
  )
LANGUAGE plpgsql
AS 
$$
  BEGIN
    INSERT INTO "UserID" ("name", "emailID", "phoneNumber", "userPassword", "username") 
      VALUES (  "_name", "_emailID", "_phoneNumber", "_userPassword", "_username");
  END; 
$$;

CALL user_insert_data ('Timmy Dow', 'TD@mail.com', '321', '123', 'TTDow');

CREATE OR REPLACE PROCEDURE post_insert_data(
  "_postID" VARCHAR,
  "_postType" VARCHAR,
  "_usernameKey" VARCHAR
  )
LANGUAGE plpgsql
AS 
$$
  BEGIN
    INSERT INTO "Post" ("postID", "postType", "usernameKey") 
      VALUES (  "_postID", "_postType", "_usernameKey");
  END; 
$$;

CALL post_insert_data ('999', 'TwitchLog', 'TTDOW');