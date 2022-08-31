# 使用docker搭建 kafka

先搭建zookeeper

```docker
docker pull wurstmeister/kafka
docker run  -d --name kafka1 -p 9092:9092 -e KAFKA_BROKER_ID=0 -e KAFKA_ZOOKEEPER_CONNECT=10.220.176.165:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://10.220.176.165:9092 -e KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:9092 -t wurstmeister/kafka

kafka-topics.sh --create --zookeeper 10.220.176.165:2181 --replication-factor 1 --partitions 1 --topic tcoding
```