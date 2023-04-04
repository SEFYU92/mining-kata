package org.example.benchmark;

import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class BenchmarkExecutionPlan {
    @Param({"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"})
    public int threadNumber;
}
