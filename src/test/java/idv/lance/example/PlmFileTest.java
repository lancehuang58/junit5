package idv.lance.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlmFileTest {

  @Test
  void file_status() {
    PlmFile file = new PlmFileImpl();
    assertThat(file.fileStatus()).as("file status should be under review.").isEqualTo(FileStatus.UNDER_REVIEW);
  }
}
