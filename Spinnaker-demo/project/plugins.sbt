
// `javacpp` are packaged with maven-plugin packaging, we need to make SBT aware that it should be added to class path.
classpathTypes += "maven-plugin"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  // Use local maven repo for local javacv builds
  Resolver.mavenLocal
)

// javacpp `Loader` is used to determine `platform` classifier in the project`s `build.sbt`
// We define dependency here (in folder `project`) since it is used by the build itself.
libraryDependencies += "org.bytedeco" % "javacpp" % "1.5.4"
