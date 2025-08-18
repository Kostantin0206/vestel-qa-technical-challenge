Vestel QA technical challenge
1. **A developer needs to write a function for converting age (a whole number), into life
   period using the following algorithm:**
- If age is zero, it should return INVALID
- If age is greater than zero and less than 18, function should return CHILD
  - If age is greater than or equal to 18, function should return ADULT.
    Define the optimal (effective and efficient) set of boundary test cases to test the
    function

![img_6.png](img_6.png)

2. **A QA engineer is performing regression testing on a software application after a bug
   fix. The engineer wants to ensure that the bug fix did not introduce new issues or
   impact existing functionalities. Which approach would be most suitable for
   regression testing?**

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

3. **Write a query to display all OrderID where the quantity is between 5 and 15.**

   SELECT OrderID, Quantity

   FROM OrderDetails

   WHERE Quantity BETWEEN 5 AND 15

   ORDER BY OrderID, Quantity;

4. **Create a bug report based on the following scenario:
- Access Swag Labs (saucedemo.com).
- Input a username.
- Input a password.
- 'Login' button is not visible (only on mobile devices).**

Bug Report: Login Button Not Visible on Mobile Devices

Summary: Login Button Not Visible on Mobile Viewport (Responsive UI Issue)

1. Basic Information
Application: Swag Labs (saucedemo.com)

Environment:

Device: Mobile (iPhone 12, Samsung Galaxy S21)

Browser: Chrome Mobile vXX / Safari Mobile vXX

OS: iOS 15 / Android 12
Priority: High (Blocks core functionality)

Severity: Major

2. Steps to Reproduce
Open saucedemo.com on a mobile device

Enter a valid username (standard_user)

Enter a valid password (secret_sauce)

Observe the Login button is not visible or interactable
3. Expected Result

Login button should be visible and clickable after entering credentials, regardless of device

4. Actual Result

Login button is hidden, off-screen, or unresponsive on mobile viewports
Users cannot proceed to the dashboard

5. Evidence

Screenshot:
screenshot.jpg

6. Impact

All mobile users are blocked from accessing the application

Business Impact: Loss of mobile traffic and potential revenue



















