project {
  modelVersion '4.0.0'
  groupId 'org.seattle-transit-reliability'
  artifactId 'site'
  version '1.0-SNAPSHOT'
  packaging 'war'
  name 'Web Interface'
  url 'http://maven.apache.org'
  dependencies {
    dependency {
      groupId 'junit'
      artifactId 'junit'
      version '3.8.1'
      scope 'test'
    }
  }
  build {
    finalName 'sea-trans'
    plugins {
      plugin {
        artifactId 'maven-compiler-plugin'
        version '3.2'
        configuration {
          source '1.8'
          target '1.8'
        }
      }
    }
  }
}
