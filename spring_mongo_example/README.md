
Mongo configuration in ubuntu 16
--------------------------------
refer:https://www.digitalocean.com/community/tutorials/how-to-install-mongodb-on-ubuntu-16-04

to start server up: sudo systemctl start mongod
to stop : sudo systemctl stop mongod
to status check: sudo systemctl status mongod
to enable on system startup : sudo systemctl enable mongod  

To view all the databases : show dbs  
to use db : use <dbname>  
show collections
show users  
show roles  
show profile  
show databases  
load()   
To create database:  https://www.mkyong.com/mongodb/how-to-create-database-or-collection-in-mongodb/  
to create a user for that database:  db.createUser({ user: "username", pwd: "password", roles:[{role:"dbAdmin", db:"dbname"}]});


To set profiles for maven  
-------------------------
write application_dev<prod><test>.properties file.
then include every avilable profiles inside pom.xml.  
then use the build command to build :: mvn -Pdev clean install
then run the jar file using :: java -jar -Dspring.profiles.active=dev spring_mongo_example-0.0.1-SNAPSHOT.jar
[to run spring boot app we have another command] ::  mvn spring-boot:run -Drun.profiles=dev



