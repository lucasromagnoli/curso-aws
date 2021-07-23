FROM openjdk:11
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/BOOT-INF/classes /app
COPY ${DEPENDENCY}/META-INF /app/META-INF
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "br.com.lucasromagnoli.cursoaws1.CursoAws1Application"]
