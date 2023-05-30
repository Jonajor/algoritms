public class Teste {

    private static Teste instance;

    private Teste(){}

    public static Teste getInstance() {
        if(instance == null) {
            instance = new Teste();
        }
        return instance;
    }
}
/*
<profiles>
  <!-- Profile for parallel execution -->
  <profile>
    <id>parallel-execution</id>
    <build>
      <plugins>
        <!-- Configure Surefire plugin for parallel execution -->
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <configuration>
            <parallel>methods</parallel>
            <threadCount>4</threadCount>
            <includes>
              <!-- Include tests to run in parallel -->
              <include>**/Test1.java</include>
              <include>**/Test2.java</include>
            </includes>
            <excludes>
              <!-- Exclude tests from parallel execution -->
              <exclude>**/Test3.java</exclude>
              <exclude>**/Test4.java</exclude>
            </excludes>
          </configuration>
        </plugin>
      </plugins>
    </build>
  </profile>

  <!-- Profile for sequential execution -->
  <profile>
    <id>sequential-execution</id>
    <build>
      <plugins>
        <!-- Configure Surefire plugin for sequential execution -->
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <configuration>
            <parallel>none</parallel>
            <includes>
              <!-- Include tests to run sequentially -->
              <include>**/Test3.java</include>
              <include>**/Test4.java</include>
            </includes>
          </configuration>
        </plugin>
      </plugins>
    </build>
  </profile>
</profiles>


*/
