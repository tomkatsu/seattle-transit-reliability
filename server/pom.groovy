project {
  modelVersion '4.0.0'
  groupId 'org.seattle-transit-reliability'
  artifactId 'server'
  version '1.0'
  name 'Server Java Code'
  url 'http://maven.apache.org'
  dependencies {
    dependency {
      groupId 'junit'
      artifactId 'junit'
      version '3.8.1'
      scope 'test'
    }
    dependency {
      groupId 'org.mongodb.morphia'
      artifactId 'morphia'
      version '1.0.0'
    }
    dependency {
      groupId 'org.glassfish.jersey.core'
      artifactId 'jersey-client'
      version '2.9.1'
    }
  }
  build {
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
