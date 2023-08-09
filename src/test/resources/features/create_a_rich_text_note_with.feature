#Author:yinaa56@hotmail.com

Feature: Create a text note
  I want to write a text note and add bold to it 

  Scenario: Write note in bold
    Given user It is located on the notepad page
    When user write rich text 'Prueba Automatizada'
    Then validates the bold text


 