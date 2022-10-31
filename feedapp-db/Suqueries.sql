-- -- COLUMNS
-- -- DEMO 1: rename Email ID to Email
-- SELECT "emailID" AS "Email" FROM "UserID";

-- -- DEMO  2 ERROR: showcase ambiguity between Profile and Role Table
-- SELECT "skills" FROM "Profile"
-- INNER JOIN "Role" ON "Role"."usernameKey" = "Profile"."usernameKey";

-- -- DEMO 2 SOLUTION
-- SELECT "Profile"."skills" AS "Profile Skills", "Role"."skills" AS "Role Skills" FROM "Profile"
-- INNER JOIN "Role" ON "Role"."usernameKey" = "Profile"."usernameKey";

-- -- TABLES
-- -- DEMO 1
-- SELECT "UserID"."name", im."imageName" FROM "UserID"
-- INNER JOIN "Post" ON "UserID"."username" = "Post"."usernameKey" 
-- INNER JOIN "ImageMetaData" AS im ON "Post"."postID" = im."postKey";


SELECT "username" FROM "UserID" INTERSECT 
SELECT "username" FROM "Post";