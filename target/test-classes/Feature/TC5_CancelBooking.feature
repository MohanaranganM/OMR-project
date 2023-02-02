@CancelBooking
Feature: Verifying the Adactin Hotel Cancel Order ID

  @a
  Scenario Outline: Verifying to Cancel the Generated Order Id
    Given User is on the Adactin Page
    When User Should Perform Login "<userName>" and "<password>"
    Then User Should Verify After Login Success Message "Hello ArunpriyaM!"
    And User should Search the Hotel Details "<location>","<hotels>","<roomType>","<noOfRooms>","<CheckInDate>","<CheckOutDate>","<adultsRoom>" and "<childrenRoom>"
    Then User should verify After Search Hotel Get the Success Message "Select Hotel"
    And User Should perform select hotel
    Then User Should Verify After Select Hotel Success Message "Book A Hotel"
    And User Should Book the Hotel "<firstName>","<lastName>" and "<billingAddress>"
      | cc_num           | cc_type          | cc_exp_month | cc_exp_year | cc_cvv |
      | 9876543215671234 | American Express | June         |        2022 |    896 |
      | 9876543215671235 | VISA             | July         |        2021 |    897 |
      | 9876543215671236 | Master Card      | May          |        2020 |    898 |
      | 9876543215671237 | Other            | April        |        2019 |    899 |
    Then User Should Verify After Book the Hotel Get Success Message "Booking Confirmation" and Save the Generated OrderId
    And User Should Cancel the Generated Order Id
    Then User Should Verify After Cancel Order Id Get success Message "The booking has been cancelled."

    Examples: 
      | userName   | password | location  | hotels         | roomType | noOfRooms | CheckInDate | CheckOutDate | adultsRoom | childrenRoom | firstName | lastName | billingAddress |
      | ArunpriyaM |   123456 | Melbourne | Hotel Sunshine | Double   | 2 - Two   | 21/01/2023  | 22/01/2023   | 2 - Two    | 1 - One      | Akilan    | Arumugam | Chennai        |

  @b
  Scenario Outline: Verifying to Cancel Existing the Order Id
    Given User is on the Adactin Page
    When User Should Perform Login "<userName>" and "<password>"
    Then User Should Verify After Login Success Message "Hello ArunpriyaM!"
    And User Should Cancel the Existing Order Id "<orderId>"
    Then User Should Verify After Cancel Order Id Get success Message "The booking has been cancelled."

    Examples: 
      | userName   | password | orderId    |
      | ArunpriyaM |   123456 | 18IYX778I3 |
