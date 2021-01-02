
Feature:Facebook Sign Up feature

Scenario Outline:facebook Sign Up page validation

Given user is on the facebook Signup page
When user are on the right URL
And user can see the titile of the page
And user can start creating a new account
When user enter the FirstName "<FirstName>" in facebook
And user  enter the LastName "<LastName>" in facebook
And user  enter the Email "<Email>" in facebook
And user  enter the ConfirmEmail "<ConfirmEmail>" in facebook
And user  enter the Password "<Password>" in facebook
And user  enter the Month "<Month>" in facebook
And user  enter the Day "<Day>" in facebook
And user  enter the Birthy "<Birthy>" in facebook
And user  enter the Gender "<Gender>" in facebook
Then user should be able to closer the browser

Examples:
    
  | FirstName | LastName | Email            | ConfirmEmail     | Password  | Month | Day | Birthy | 
  | Garrick   | Ramsey   | Garrick@test.com | Garrick@test.com | Garrick12 | Jul   |  10 |   1980 | 
  | Megan     | Brigs    | Meganb@test.com  | Meganb@test.com  | Megan22   | Aug   |  15 |   1981 | 
  | Jamie     | Miracle  | Jamiem@test.com  | Jamiem@test.com  | Jamiem09  | Sep   |  20 |   1982 | 
  | Darren    | Weber    | Darrenw@test.com | Darrenw@test.com | Darrenw29 | Oct   |  25 |   1983 | 
  | Amie      | Miracle  | Amiem@test.com   | Amiem@test.com   | Amiem99   | Dec   |  30 |   1984 | 
