# helix-spark-iam


## How to build the Application
* JDK 17
* Maven 3.8.4
* MySql 8

## Utility Tools
* Lombok




## How to install MySQL By Docker
* 拉去 Mac 版本 Docker
```shell
docker pull mysql/mysql-server:latest
```
* 创建 MySql Container
```shell

docker run \
--name helix-spark \
--privileged=true \
-p 39307:3306 \
--restart unless-stopped \
-v /Users/allen/build/docker/mysql/log:/var/log/mysql \
-v /Users/allen/build/docker/mysql/data:/var/lib/mysql \
-v /Users/allen/build/docker/mysql/conf:/etc/mysql \
-v /Users/allen/build/docker/mysql/mysql-files:/var/lib/mysql-files \
-e MYSQL_ROOT_PASSWORD=Win2008 \
mysql/mysql-server:latest
```
* 创建用户
```sql
Create user 'helix_spark_developer' identified with mysql_native_password by 'Win2008@';
```
```sql
Grant all privileges on *.* to 'helix_spark_developer';
```
```sql
Flush privileges;
```
* 创建数据库
```sql
CREATE DATABASE  helix_spark_iam  DEFAULT CHARACTER  SET utf8 COLLATE utf8_general_ci;
```

