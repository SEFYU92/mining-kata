package org.example.benchmark;

import org.example.DartyCoinMiningNode;
import org.openjdk.jmh.annotations.*;

public class MiningBenchmark {
    @Benchmark
    @Fork(value = 1, warmups = 0)
    @Timeout(time = 20)
    @BenchmarkMode(Mode.SingleShotTime)
    public void benchmarkConcurrentMining(BenchmarkExecutionPlan executionPlan) {
        var node = new DartyCoinMiningNode();
        node.resolveBlockHashConcurrently("hgybmaep", "0000000",executionPlan.threadNumber);
    }
}
