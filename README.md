# Remote-method-invocation
This is a simple implementation of Remote Method Invocation (RMI)  in java
## How run 
#### Clone the project 
```sh
git clone https://github.com/daakibenja/remote-method-invocation.git
cd remote-method-invocation
```
#### Compile the code
```sh
javac *.java 
```

#### Start the rmiregistry 
```sh
rmiregistry 
```

#### Run  the server and then the client 
```sh
java HotelServer
java HotelClient
```
#### NOTE
This is how you can run the client
```
 java HotelClient list <server address>                             -To see the avaible rooms details
 java HotelClient book <server address> <room type> <guest name>    -To book a room
 java HotelClient guests <server address>                            -To view all registered guests
 java HotelClient revenue <server address>                           -To print the revenue breakdown based on the booked rooms and their types
 ```
Note that all the Last three commands should be run
in different terminals and in the that sequence 
