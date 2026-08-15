# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

> ## IMPORTANT ACCESSIBILITY / RECONSTRUCTION DISCLOSURE
> The UMGC Virtual Lab / course VM required to access the instructor-provided
> `unit8_lab1` project was inaccessible during this lab despite repeated
> remediation attempts. The VM failed before the Windows desktop and official
> `Task1Test.java`, `Task2Test.java`, and `Task3Test.java` files could be reached.
>
> To preserve the intended JUnit debugging and Git workflow, functionally similar
> replacement test classes were created with assistance from an AI large language
> model (OpenAI ChatGPT) using the visible assignment directions and the supplied
> `BuggyProgram.java` starter code. These replacement tests are **not claimed to
> be exact copies of the instructor's original/hidden tests**. They are intended
> to approximate the same level and learning objectives so the lab can be
> completed in good faith while the official VM is unavailable.
>
> Task 3 required an explicit reconstruction assumption because the assignment
> says the official `Task3Test` reveals the expected range behavior. The local
> replacement tests define the range as inclusive of both endpoints and support
> ascending, equal, and descending bounds. If official tests become accessible,
> they should supersede these reconstructed tests for final verification.

## Student Name
Nicholas Prosdocimo

## GitHub Repository URL
https://github.com/Prosdocimo-N/cmsc115-unit8lab1

---

# Commit 1: Initial Commit

## What did you include in this commit?
- I included the initial BuggyProgram starter code, the reconstructed JUnit test files for Tasks 1 through 3, the Maven project configuration, the README reflection file, and the reconstruction notice.

## What was the purpose of this commit?
- The purpose of this commit was to create a baseline version of the project before making any debugging changes. This provides a clean starting point in Git so later fixes can be compared against the original starter code.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- The tests for the Exceeds and Meets classifications, including the boundary-value tests, were failing.

## What was the issue in the code?
- The Exceeds and Meets return values were reversed, and the comparisons used greater-than instead of greater-than-or-equal-to.

## What change did you make to fix it?
- I changed scores of 90 or greater to return "Exceeds", scores of 80 through 89 to return "Meets", and lower scores to return "Does Not Meet".

## How did the tests help guide your fix?
- The tests showed the difference between the expected and actual classifications and helped identify both the incorrect return values and boundary conditions.

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- The tests that calculated sums from arrays were failing, and the loop could attempt to access an index outside the array.

## What was the issue in the code?
- The sum variable started at 1 instead of 0, and the loop condition used i <= values.length instead of i < values.length.

## What change did you make to fix it?
- I initialized sum to 0 and changed the loop condition so the loop stops before values.length.

## How did the tests help guide your fix?
- The tests exposed both the incorrect calculated totals and the array-boundary problem, which made the two errors easier to identify.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
-

## What was the issue in the code?
-

## What change did you make to fix it?
-

## How did the tests help guide your fix?
-

---

# Overall Reflection

## Which task was the easiest to fix? Why?
-

## Which task was the most difficult? Why?
-

## How did Git help you track your progress through the debugging process?
-

## Why is it important to make small, frequent commits when debugging code?
-

## What did you learn about using JUnit tests to guide debugging?
-

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
-

## Why is it useful to document your work after completing a programming task?
-
