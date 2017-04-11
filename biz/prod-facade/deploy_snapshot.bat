call mvn clean deploy -Dmaven.test.skip=true -DaltDeploymentRepository=nexus-snapshots::default::http://192.168.0.0:8081/nexus/content/repositories/snapshots
cmd