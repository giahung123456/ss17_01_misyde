user@laptop:~$ docker exec -it redis-cache redis-cli
127.0.0.1:6379> ping
PONG
127.0.0.1:6379> keys *
1) "foods::1"
   127.0.0.1:6379> get "foods::1"
   "[\"java.util.Arrays$ArrayList\",[{\"@class\":\"com.example.ss17_01.FoodItem\",\"id\":1,\"name\":\"Pho Bo Tai\",\"price\":45000.0},{\"@class\":\"com.example.ss17_01.FoodItem\",\"id\":2,\"name\":\"Com Tam Suon Bi\",\"price\":50000.0}]]"