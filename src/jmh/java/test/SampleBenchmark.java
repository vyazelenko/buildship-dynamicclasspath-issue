package test;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

public class SampleBenchmark {
  private String data;

  private char c;

  @Setup
  public void setUp() {
    data = "Some very strange data!";
    c = 'e';
  }

  @Benchmark
  public int countMatches() {
    return StringUtils.countMatches(data, c);
  }
}
