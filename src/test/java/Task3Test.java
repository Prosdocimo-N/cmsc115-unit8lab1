import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ============================================================================
 * IMPORTANT RECONSTRUCTION / ACCESSIBILITY DISCLOSURE
 * ============================================================================
 * The official UMGC Virtual Lab / course VM that was supposed to contain the
 * instructor-provided unit8_lab1 project and original Task3Test.java file was
 * inaccessible during completion of this lab. Multiple reasonable remediation
 * attempts were made, but the VM session continued to fail before the Windows
 * desktop/project files could be reached.
 *
 * Because the original JUnit file could not be retrieved, this Task3Test class
 * is a RECONSTRUCTED, FUNCTIONALLY SIMILAR test suite created with assistance
 * from an AI large language model (OpenAI ChatGPT). It was derived from the
 * visible assignment instructions and the provided BuggyProgram.java starter.
 * It is NOT represented as an exact copy of the instructor's hidden/original
 * tests. Its purpose is to provide a comparable JUnit debugging exercise so the
 * lab workflow (test -> diagnose -> fix -> retest -> commit) can still be done.
 *
 * IMPORTANT TASK 3 ASSUMPTION: The visible assignment says the official tests
 * are intended to reveal the expected range behavior, but those tests could not
 * be accessed. This reconstruction therefore uses a reasonable equivalent rule:
 * sumRange(start, end) includes BOTH endpoints and works whether start is less
 * than, equal to, or greater than end. This assumption is explicitly disclosed
 * rather than being presented as the instructor's exact hidden requirement.
 *
 * If the official tests become available, they should take precedence and the
 * final BuggyProgram.java should be verified against them before grading.
 * ============================================================================
 */
public class Task3Test {

    @Test
    void sumsAscendingRangeInclusively() {
        assertEquals(15, BuggyProgram.sumRange(1, 5));
    }

    @Test
    void sameStartAndEndReturnsThatValue() {
        assertEquals(4, BuggyProgram.sumRange(4, 4));
    }

    @Test
    void handlesRangeContainingNegativeAndPositiveValues() {
        assertEquals(0, BuggyProgram.sumRange(-2, 2));
    }

    @Test
    void sumsDescendingRangeInclusively() {
        assertEquals(15, BuggyProgram.sumRange(5, 1));
    }

    @Test
    void sumsNegativeDescendingRangeInclusively() {
        assertEquals(-6, BuggyProgram.sumRange(-1, -3));
    }
}
