package idv.lance.example;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class PlmFileImpl implements PlmFile {

  @Override
  public FileStatus fileStatus() {
    return FileStatus.UNDER_REVIEW;
  }

  @Override
  public String uuid() {
    return UUID.randomUUID().toString();
  }

  @Override
  public Long id() {
    return ThreadLocalRandom.current().nextLong(1000L);
  }

  @Override
  public String name() {
    return null;
  }
}
