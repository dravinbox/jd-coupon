FROM java:8-jre-alpine

RUN mkdir /app

WORKDIR /app

ADD target/jd-coupon-0.0.1-SNAPSHOT.jar /app

ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk/jre \
    LANG=C.UTF-8 \

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/app/jd-coupon-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080