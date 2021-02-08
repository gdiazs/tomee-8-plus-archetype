FROM tomee:8.0.4-plus
ENV CATALINA_OPTS=-Dtomee.mp.scan=all
RUN rm -rf  /usr/local/tomee/webapps/*
COPY  target/*.war /usr/local/tomee/webapps/ROOT.war
