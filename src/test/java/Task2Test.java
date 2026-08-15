import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ============================================================================
 * IMPORTANT RECONSTRUCTION / ACCESSIBILITY DISCLOSURE
 * ============================================================================
 * The official UMGC Virtual Lab / course VM that was supposed to contain the
 * instructor-provided unit8_lab1 project and original Task2Test.java file was
 * inaccessible during completion of this lab. Multiple reasonable remediation
 * attempts were made, but the VM session continued to fail before the Windows
 * desktop/project files could be reached.
 *
 * Because the original JUnit file could not be retrieved, this Task2Test class
 * is a RECONSTRUCTED, FUNCTIONALLY SIMILAR test suite created with assistance
 * from an AI large language model (OpenAI ChatGPT). It was derived from the
 * visible assignment instructions and the provided BuggyProgram.java starter.
 * It is NOT represented as an exact copy of the instructor's hidden/original
 * tests. Its purpose is to provide a comparable JUnit debugging exercise so the
 * lab workflow (test -> diagnose -> fix -> retest -> commit) can still be done.
 *
 * If the official tests become available, they should take precedence and the
 * final BuggyProgram.java should be verified against them before grading.
 * ============================================================================
 */
public class Task2Test {

    @Test
    void sumsOnlyEvenNumbersFromMixedArray() {
        assertEquals(12, BuggyProgram.sumEvenNumbers(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    void returnsZeroWhenNoEvenNumbersExist() {
        assertEquals(0, BuggyProgram.sumEvenNumbers(new int[]{1, 3, 5, 7}));
    }

    @Test
    void sumsAllEvenNumbers() {
        assertEquals(20, BuggyProgram.sumEvenNumbers(new int[]{2, 4, 6, 8}));
    }

    @Test
    void handlesNegativeAndPositiveEvenNumbers() {
        assertEquals(4, BuggyProgram.sumEvenNumbers(new int[]{-6, -3, 2, 8, 5}));
    }

    @Test
    void emptyArrayHasSumZero() {
        assertEquals(0, BuggyProgram.sumEvenNumbers(new int[]{}));
    }
}
