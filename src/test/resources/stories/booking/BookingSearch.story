Meta:
@Bug

Narrative:
In order to perform search correctly
As a user
I want to be able to see the list of found hotels, located in NY

Scenario: User should have possibility to see the list of found hotels, using own searching criterias

Given user has opened 'Booking.com' site

When user selects 'Destination' by using following values:
| destination                   | checkInDate       | checkOutDate      |
| New York, New York State, USA | September 2017,29 | September 2017,30 |

And user click on 'Search' button

When user clicks on 'Superb' checkbox
And user clicks on another 'Free cancellation' checkbox
Then each items from 'Search Result' list contains 'Superb'
And each item from 'Search Result' list contain 'FREE cancellation'
!--And all item from 'Search Result' list contains 'New York'
!--Examples:
!--| destinationValue              | checkInDateValue  |checkOutDateValue |
!--| New York, New York State, USA | September 2017,29 |September 2017,30 |


