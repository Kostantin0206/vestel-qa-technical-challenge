Vestel QA technical challenge
1. A developer needs to write a function for converting age (a whole number), into life
   period using the following algorithm:
- If age is zero, it should return INVALID
- If age is greater than zero and less than 18, function should return CHILD
  - If age is greater than or equal to 18, function should return ADULT.
    Define the optimal (effective and efficient) set of boundary test cases to test the
    function

![img_6.png](img_6.png)

2. A QA engineer is performing regression testing on a software application after a bug
   fix. The engineer wants to ensure that the bug fix did not introduce new issues or
   impact existing functionalities. Which approach would be most suitable for
   regression testing?

According to ISTQB standards, the most suitable approach for regression testing after a bug fix is:

Targeted Regression Testing with Risk Based Prioritization
1.	Impact Analysis

o	Identify modified components and their dependencies

o	Use traceability matrices to map affected functionalities
2.	Prioritize Test Cases 

o	High Priority:

	Test cases covering the fixed bug and its direct dependencies

	Critical business workflows

o	Medium Priority:

	Features sharing integration points with the modified code

o	Low Priority:

	Unaffected functionalities (may be skipped if time-constrained)

3.	Test Suite Selection

o	Re-execute:

	All tests for the fixed feature

	Sanity tests for core functionalities

o	Automate: High-priority regression tests for efficiency

4.	Partial vs. Full Regression

o	Partial Regression: If the fix is localized and low-risk

o	Full Regression: If the change impacts critical/core modules





