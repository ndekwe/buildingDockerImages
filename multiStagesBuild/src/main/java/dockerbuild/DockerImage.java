package dockerbuild;

public class DockerImage {
  public static void main(String[] args) {
    Build build = new Build();
    System.out.println(build.multiStage());
  }
}
