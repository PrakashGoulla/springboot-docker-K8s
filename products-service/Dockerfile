FROM azul/zulu-openjdk-alpine:11 as packager

ENV JAVA_MINIMAL=/opt/jre

RUN jlink \
    --verbose \
    --add-modules \
        java.base,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument,jdk.unsupported \
    --compress 2 \
    --strip-debug \
    --no-header-files \
    --no-man-pages \
    --output "$JAVA_MINIMAL"

# Stage 2
FROM alpine:latest

ENV JAVA_MINIMAL=/opt/jre
ENV PATH="$PATH:$JAVA_MINIMAL/bin"

COPY --from=packager "$JAVA_MINIMAL" "$JAVA_MINIMAL"
COPY "target/products-service-0.0.1.jar" "/app.jar"

EXPOSE 8010
CMD ["java", "-jar", "/app.jar" ]