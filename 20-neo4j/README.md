
```
docker pull neo4j:4.2.2
```

```
docker run -d \
--name neo4j \
-p 7474:7474 \
-p 7687:7687 \
-e NEO4J_AUTH=neo4j/123456 \
neo4j:4.2.2
```

```
http://localhost:7474/
```