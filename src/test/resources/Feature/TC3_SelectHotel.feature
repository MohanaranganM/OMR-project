@SelectHotel
Feature: Verifying the Select Adactin Hotel Room

  Scenario Outline: Verifying the Select Hotel Room
    Given User is on the Adactin Page
    When User Should Perform Login "<userName>" and "<password>"
    Then User Should Verify After Login Success Message "Hello ArunpriyaM!"
    And User should Search the Hotel Details "<location>","<hotels>","<roomType>","<noOfRooms>","<CheckInDate>","<CheckOutDate>","<adultsRoom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform select hotel
    Then User Should Verify After Select Hotel Success Message "Book A Hotel"

    Examples: 
      | userName   | password | location  | hotels         | roomType | noOfRooms | CheckInDate | CheckOutDate | adultsRoom | childrenRoom |
      | ArunpriyaM |   123456 | Melbourne | Hotel Sunshine | Double   | 2 - Two   | 21/01/2023  | 22/01/2023   | 2 - Two    | 1 - One      |

  Scenario Outline: Verifying the Select Hotel Without any Fields
    Given User is on the Adactin Page
    When User Should Perform Login "<userName>" and "<password>"
    Then User Should Verify After Login Success Message "Hello ArunpriyaM!"
    And User should Search the Hotel Details "<location>","<hotels>","<roomType>","<noOfRooms>","<CheckInDate>","<CheckOutDate>","<adultsRoom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform  without selecting hotel field
    Then User should Verify After selecting hotel error Message "Please Select a Hotel"

    Examples: 
      | userName   | password | location  | hotels         | roomType | noOfRooms | CheckInDate | CheckOutDate | adultsRoom | childrenRoom |
      | ArunpriyaM |   123456 | Melbourne | Hotel Sunshine | Double   | 2 - Two   | 21/01/2023  | 22/01/2023   | 2 - Two    | 1 - One      |
