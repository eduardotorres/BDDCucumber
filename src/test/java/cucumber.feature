Feature: Learn Cucumber
Like a student
I wanna learn to use cucumber
For automating acception 

Scenario: Should execute specification

Given that I created the file correctly
When I execute
Then the specification should finalize with success

Scenario: Should calculate delay in delivery

Given that the deadline is 29/08/2020
When the delivery is delayed in 2 days
Then the delivery will be in 31/08/2020

Scenario: Should calculate delay in delivery in China

Given that the deadline is 29/08/2020
When the delivery is delayed in 2 months
Then the delivery will be in 29/10/2020

Scenario: Should create generals steps to this sequence

Given that the ticket it is AF345
Given that the value of the ticket it is R$ 230.00
Given that the name of the passenger is "Fulano da Silva"
Given that the phone number is 9999-9999
When create the steps
Then the test will pass

Scenario: Should reuse the previous steps
 
Given that the ticket it is AB167
Given that the special ticket it is AB167
Given that the value of the ticket it is R$ 1120.23
Given that the name of the passenger is "Cicrano de Oliveira"
Given that the phone number is 9888-8888

Scenario: Should deny all the previous steps

Given that the ticket it is CD123
Given that the ticket it is AG1234
Given that the value of the ticket it is R$ 1.1345.56
Given that the name of the passenger is "Beltrano Souza Matos de Alcântara Azevedo"
Given that the phone number is 1234-5678
Given that the phone number is 999-2223 