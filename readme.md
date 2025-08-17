Vestel QA technical challenge
1. A developer needs to write a function for converting age (a whole number), into life
   period using the following algorithm:
- If age is zero, it should return INVALID
- If age is greater than zero and less than 18, function should return CHILD
- If age is greater than or equal to 18, function should return ADULT.
  Define the optimal (effective and efficient) set of boundary test cases to test the
  function

Boundary Test Cases
TC#	Input	Expected Output	EP	BVA
1	-1	"INVALID"	Yes (Invalid Negative)	Lower Invalid
2	0	"INVALID"	Yes (Invalid Zero)	N/A
3	1	"CHILD"	Yes (Child Min)	Lower Valid
4	12	"CHILD"	Yes (Child Mid)	No
5	17	"CHILD"	Yes (Child Max)	Upper Valid
6	18	"ADULT"	Yes (Adult Min)	Lower Valid
7	35	"ADULT"	Yes (Adult Mid)	No
8	120	"ADULT"	Yes (Adult Extreme)	No
