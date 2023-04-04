package org.example;

import org.apache.commons.codec.digest.DigestUtils;

public class DartyCoinMiningNode {
    public String resolveBlockHash(String blockPhrase, String networkTarget) {
        DigestUtils.md5Hex(blockPhrase);
        throw new RuntimeException();
    }

    public String resolveBlockHashConcurrently(String blockPhrase, String networkTarget, int threadNumber) {
        throw new RuntimeException();
    }
}
