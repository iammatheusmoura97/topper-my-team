# Use uma imagem oficial do OpenJDK como base
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Adiciona uma etapa para limpar o cache do Docker
RUN rm -f app.jar

# Copia o JAR mais recente para o container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expõe a porta em que o Spring Boot está configurado para rodar (geralmente 8080)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]