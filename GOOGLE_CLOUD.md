# Pre-requisites

Read [GOOGLE_CLOUD.md](https://github.com/cduployez/ansible-playbook/blob/main/GOOGLE_CLOUD.md) from [ansible-playbook project](https://github.com/cduployez/ansible-playbook) to:
* Init project
* Init cluster
* Init artifact registry

# Init

## Build container on Google Cloud

```sh
cd ~/workspace/back-resume
mvn clean install
gcloud builds submit --tag europe-west9-docker.pkg.dev/back-resume/resume-repository/back-resume .
```

Output:
```
Creating temporary tarball archive of 29 file(s) totalling 110.0 KiB before compression.
Some files were not included in the source upload.

Check the gcloud log [/home/cduployez/.config/gcloud/logs/2023.07.14/21.17.18.474404.log] to see which files and the contents of the
default gcloudignore file used (see `$ gcloud topic gcloudignore` to learn
more).

Uploading tarball of [.] to [gs://back-resume_cloudbuild/source/1689362238.530258-7c3de1e1361c42e383d2ce4b48fe2059.tgz]
Created [https://cloudbuild.googleapis.com/v1/projects/back-resume/locations/global/builds/88753229-3e8f-455e-a281-01115a62a3b1].
Logs are available at [ https://console.cloud.google.com/cloud-build/builds/88753229-3e8f-455e-a281-01115a62a3b1?project=486595493439 ].
---------------------------------------------------------------------------------------------- REMOTE BUILD OUTPUT ----------------------------------------------------------------------------------------------
starting build "88753229-3e8f-455e-a281-01115a62a3b1"

FETCHSOURCE
Fetching storage object: gs://back-resume_cloudbuild/source/1689362238.530258-7c3de1e1361c42e383d2ce4b48fe2059.tgz#1689362239134128
Copying gs://back-resume_cloudbuild/source/1689362238.530258-7c3de1e1361c42e383d2ce4b48fe2059.tgz#1689362239134128...
/ [1 files][ 70.7 KiB/ 70.7 KiB]
Operation completed over 1 objects/70.7 KiB.
BUILD
Already have image (with digest): gcr.io/cloud-builders/docker
Sending build context to Docker daemon  152.1kB
Step 1/11 : FROM maven:3.9.3-eclipse-temurin-17-alpine as builder
3.9.3-eclipse-temurin-17-alpine: Pulling from library/maven
31e352740f53: Already exists
8aadc9aaa732: Already exists
fc61c42d98a4: Already exists
8b872839787b: Already exists
08218ceda15a: Pulling fs layer
755dbbe39cfc: Pulling fs layer
51950c7e8b89: Pulling fs layer
24f44bae082a: Pulling fs layer
42cdc03779ef: Pulling fs layer
24f44bae082a: Waiting
42cdc03779ef: Waiting
51950c7e8b89: Download complete
08218ceda15a: Verifying Checksum
08218ceda15a: Download complete
755dbbe39cfc: Verifying Checksum
755dbbe39cfc: Download complete
24f44bae082a: Verifying Checksum
24f44bae082a: Download complete
42cdc03779ef: Verifying Checksum
42cdc03779ef: Download complete
08218ceda15a: Pull complete
755dbbe39cfc: Pull complete
51950c7e8b89: Pull complete
24f44bae082a: Pull complete
42cdc03779ef: Pull complete
Digest: sha256:0f7b35edc8e35098bbe5e8b08a7287729e277d8c1a78d28d7150ac2134c440f2
Status: Downloaded newer image for maven:3.9.3-eclipse-temurin-17-alpine
 ---> 23fb19272c74
Step 2/11 : WORKDIR /app
 ---> Running in 1c48851b92c9
Removing intermediate container 1c48851b92c9
 ---> a74b743c82a3
Step 3/11 : COPY pom.xml ./
 ---> a2851532d4e6
Step 4/11 : COPY src ./src/
 ---> 16972db9bd5c
Step 5/11 : RUN mvn clean package -DskipTests
 ---> Running in bd54d6027391
[INFO] Scanning for projects...
...
[INFO] Replacing main artifact /app/target/back-resume-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to /app/target/back-resume-0.0.1-SNAPSHOT.jar.original
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  24.160 s
[INFO] Finished at: 2023-07-14T19:18:04Z
[INFO] ------------------------------------------------------------------------
Removing intermediate container bd54d6027391
 ---> 3c5f9ad22907
Step 6/11 : FROM eclipse-temurin:17-jdk-alpine
17-jdk-alpine: Pulling from library/eclipse-temurin
31e352740f53: Already exists
8aadc9aaa732: Already exists
fc61c42d98a4: Already exists
8b872839787b: Already exists
Digest: sha256:2478889d707f1883cd7c2682bba048b680261b09088c4af8ae735bc1d8a10d55
Status: Downloaded newer image for eclipse-temurin:17-jdk-alpine
 ---> 07496613e2ad
Step 7/11 : VOLUME /tmp
 ---> Running in a2fbbb725a2f
Removing intermediate container a2fbbb725a2f
 ---> 998e55895672
Step 8/11 : EXPOSE 8080
 ---> Running in a9bbf266415f
Removing intermediate container a9bbf266415f
 ---> b4bf5c5baa68
Step 9/11 : COPY --from=builder /app/target/*.jar /home/back-resume.jar
 ---> c409473e1df6
Step 10/11 : CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=8080","-jar","/home/back-resume.jar"]
 ---> Running in 0004539161fe
Removing intermediate container 0004539161fe
 ---> 9cf2085026a4
Step 11/11 : HEALTHCHECK CMD curl -s -f http://localhost:8080/actuator/health | grep UP
 ---> Running in 659f5ab47c58
Removing intermediate container 659f5ab47c58
 ---> 410ef2ddaf25
Successfully built 410ef2ddaf25
Successfully tagged europe-west9-docker.pkg.dev/back-resume/resume-repository/back-resume:latest
PUSH
Pushing europe-west9-docker.pkg.dev/back-resume/resume-repository/back-resume
The push refers to repository [europe-west9-docker.pkg.dev/back-resume/resume-repository/back-resume]
04309e6e6b6f: Preparing
6070969b2edd: Preparing
8fc7141d6d9f: Preparing
4aab2363d488: Preparing
78a822fe2a2d: Preparing
6070969b2edd: Pushed
78a822fe2a2d: Pushed
04309e6e6b6f: Pushed
4aab2363d488: Pushed
8fc7141d6d9f: Pushed
latest: digest: sha256:125f1be1dfb33c0355f88948175c7e4605930ddf19297c5d0a107b0246fd3679 size: 1371
DONE
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
ID                                    CREATE_TIME                DURATION  SOURCE                                                                                     IMAGES
                                      STATUS
88753229-3e8f-455e-a281-01115a62a3b1  2023-07-14T19:17:19+00:00  1M22S     gs://back-resume_cloudbuild/source/1689362238.530258-7c3de1e1361c42e383d2ce4b48fe2059.tgz  europe-west9-docker.pkg.dev/back-resume/resume-repository/back-resume (+1 more)  SUCCESS
```

# Deploy app

```sh
cd helm-chart
kubectl apply -f deployment.yaml
```

Output:
```
Warning: autopilot-default-resources-mutator:Autopilot updated Deployment default/back-resume: adjusted resources to meet requirements for containers [back-resume] (see http://g.co/gke/autopilot-resources)
deployment.apps/back-resume created
```
