# sbt-java-junit-scalaTest
This is example project to java project with Junit using ScalaTest library.

we are using ScalaTest library to write junit test cases.

To run this project, we need following entries in sbt configuration file(built.sbt)


libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12",
  "org.pegdown" % "pegdown" % "1.6.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.0" % Test
 
)

#follwing test options to generate HTML and XML reports.

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports"),
  Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")
)


We need to Extend our Junit test classes with org.scalatest.junit.JUnitSuite as follows.

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Test1 extends org.scalatest.junit.JUnitSuite{

    @Test
    public void testAdd(){
        double result= 2 + 4;
        assertTrue(result == 6);
        System.out.println("Test1 Passed");
    }
}



