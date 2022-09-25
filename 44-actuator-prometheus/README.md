
```docker
docker pull bitnami/prometheus:2.38.0
```

```docker
docker pull grafana/grafana:9.1.6 
```

```docker
 docker run -itd --name prom -p 9090:9090 \
 -v /tmp/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus \
 bitnami/prometheus:2.38.0 
```

```docker
docker exec -it -u 0  prom /bin/bash 

apt-get update -y

apt-get install -y vim
```


```docker
docker run \
      -itd \
      -p 3000:3000 \
      --name=grafana \
      --link=prom \
      grafana/grafana:9.1.6
```