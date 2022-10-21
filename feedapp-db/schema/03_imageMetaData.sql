DROP TABLE IF EXISTS "ImageMetaData" CASCADE;
CREATE TABLE  "ImageMetaData" (
  "imageID" varchar(255) PRIMARY KEY NOT NULL,
  "imageName" varchar(255) NOT NULL,
  "imageSize" varchar(255),
  "imageFormat" varchar(255),
  "imageDate" varchar(255),
  "resolution" varchar(255),
  "postKey" varchar(255) REFERENCES "Post"("postID")
);