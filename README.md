# SYSC4806 [![Build Status](https://travis-ci.com/GabrielCiolac/SYSC4806.svg?branch=add-sam-to-readme)](https://travis-ci.com/GabrielCiolac/SYSC4806)
Mini-Survey Monkey

## Description
Surveyor can create a survey with a list of Questions. Questions can be open-ended (text), asking for a number within a
range, or asking to choose among many options.  Users fill out a survey that is a form generated based on the type of 
questions in the survey. Surveyor can close the survey whenever they want
(thus not letting in new users to fill out the survey), and at that point a survey result is generated, compiling the
answers: for open-ended questions, the answers are just listed as-is, for number questions a histogram of the answers is
generated, for choice questions a pie chart is generated

## Contributions
1. Open an issue with your requested change
2. Be descriptive in the issue, list the goals of the change
3. Open a branch with the same name as the issue
4. Checkout your local into that branch
5. Change README *Build Status* to point to that branch
6. Write Tests
7. Write Code
8. Test Code
9. Deploy to branch
10. If Build Status is passing and code is complete close issue, change README to point back to development
11. Merge code into development
12. Check to see if development is still passing
13. If development is passing open a Pull Request into main, and assign everyone to the PR
14. Wait for approval

## Contributors
Gabriel Ciolac - 101071319  
Britney Baker - 101039860  
Mathew Smith - 101029870  
Samantha Tripp - 101089563

## Todo

- [ ] **Write tests**
- [ ] Create a form repository
- [ ] Create a form repository service
- [ ] Create a form controller  
- [ ] Create a form object
- [ ] Decide question architecture (i.e. abstract question class)
- [ ] Implement question architecture  
- [ ] Create HTML page serving a list of forms
- [ ] Create HTML page serving an individual form  
- [ ] Set up base REST API service for form creation
- [ ] Set REST API service for form accesses
- [ ] Persistence of form responses
- [ ] Create HTML page serving form responses, given form ID