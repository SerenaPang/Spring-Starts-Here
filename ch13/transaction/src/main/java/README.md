#How to compile and run the main class

curl http://localhost:8080/accounts

curl -XPOST -H "content-type:application/json" -d '{"senderAccountId":1, "receiverAccountId":2, "amount":100}' http://localhost:8080/transfer 

#check all process:
ps -fea | grep java

kill the process:
kill -9 22317


#start the spring boot
mvn clean

mvn package

mvn spring-boot:run

mvn package assembly:single  










