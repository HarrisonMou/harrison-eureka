#FROM java:8
FROM java:8
ARG JAR_FILE_NAME
###复制文件到容器app-springboot
COPY ${JAR_FILE_NAME}  /app.jar
###声明启动端口号
EXPOSE 10020
###配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]
