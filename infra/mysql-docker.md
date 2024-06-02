# 도커 설치

```bash
$ docker -v
```

# 도커 실행 툴 OrbStack 다운로드

```bash
$ brew install orbstack
```

https://orbstack.dev/

# MySQL 도커 이미지 다운로드

```bash
$ docker pull mysql:latest
```

# 다운로드한 도커 이미지 확인

```bash
$ docker images
```

# MySQL 도커 컨테이너 생성 및 실행

```bash
$ docker run --name spring-security-mysql -e MYSQL_ROOT_PASSWORD=admin -d -p 3306:3306 mysql:latest
```

# 도커 컨테이너 리스트 출력 

```bash
$ docker ps -a
```