#unit test with JUnit5
A truly practical approach to the fundamentals of test driven development in Java, featuring JUnit and Mockito

### What is TDD?
Tests drive the code.

Red -> Green -> Refactor
1. A new test will initially fail
2. We work to get the test to pass
3. We finally optimise our code, and tests

### What to test?
Each test will cover a single scenario for a single piece of logic.

### Given-When-Then
The essential idea is to break down writing a scenario(or test) into tree sections:
- The **given** part describes the state of the world before you  begin the behavior
you're specifying in this scenario. You can think of it as the pre-conditions to the test.
- The **when** section is that behavior that you're specifying.
- Finally the **then** section describes the changes you expect due to the specified behavior. 