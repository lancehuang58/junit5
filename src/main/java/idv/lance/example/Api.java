package idv.lance.example;

public class Api {
//
  public boolean validate() {
    return true;
  }

  public void transfer() {
    throw new RuntimeException();
  }

  public String getName() {
    return Api.class.getSimpleName();
  }

  public void commit() throws Exception {
    throw new Exception("");
  }
}
