rm -r ./target/generated-sources/ws
mkdir ./target/generated-sources/ws
wsimport -d ./target/generated-sources/ws -p ru.ais.courses.integration.ws.client -keep "http://localhost:1212/hello?wsdl"
rm ./target/generated-sources/ws/ru/ais/courses/integration/ws/client/*.class
