package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AppTest {
    @ParameterizedTest
    @Timeout(20)
    @CsvSource({"bgvyzdsv,0000", "gkecghrp,000000", "hgybmaep,0000000"})
    void should_resolve_block_hash(String blockPhrase, String networkTarget) {
        var node = new DartyCoinMiningNode();

        var resolutionPhrase = node.resolveBlockHash(blockPhrase, networkTarget);

        var resultHash = DigestUtils.md5Hex(resolutionPhrase);

        assertTrue(resultHash.startsWith(networkTarget));
    }
}