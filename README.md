# remote-method-invocation
This is a simple implementation of Remote Method Invocation (RMI)  in java
## How run 
clone the project 
```sh
git clone https://github.com/daakibenja/remote-method-invocation.git
cd remote-method-invocation
```
```sh
javac *.java 
```

Go to the terminal and start the rmiregistry 
```sh
rmiregistry 
```

Then run the client and the server 
```sh
java HotelServer
java HotelClient
```
Note that all the Last three commands should be run
in different terminals and in the that sequence 
