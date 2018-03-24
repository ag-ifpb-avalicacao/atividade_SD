FROM postgres
ENV POSTGRES_USER="postgres"
ENV POSTGRES_PASS="equinox"
ENV POSTGRES_DB="userdb"
COPY create_schema.sql /docker-entrypoint-initdb.d/
