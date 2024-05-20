
Vehicle -> Entry gate -> Entry Ticket -> Parking spot -> Exit gate -> Payment 

Requirements:
1. How many entrances we have?
A. Let it be one entry and one exit but it should be scalable.

2. What are different types of spots like 2 Wheeler 4 wheeler?
A. Keeping it for 2 and 4 but should be scalable

3. What is the charging system hourly/minutes? 
A. Mix

4. Do we have to provide nearest parking spot to the entrance gate if there are multiple entrances?
A. Yes

4. Floors?
A. No

Objects:
1. Vehicle -> Vehicle no, vehicle type (enum)
2. Ticket -> Entrytime, parking spot
3. Entrance gate -> find parking space available, update parking space, generate ticket
4. Parking spot -> id, empty?, vehicle standing, price, type 
5. Exit gate -> cost calculation, payment, update parking spot



























