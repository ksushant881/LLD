Payment gateway acts as a mediator between user and financial institution and helps to transfer money

Peer to peer
Peer to merchant (refund and all)

User -> add, update, delete
Instrument (account, card, balance) -> add, update, delete
Payment -> search user, amount, funding instrument, pass this info to processor (bank)
Notification -> operation on user, debit payment, credit payment
History -> all transactions


Main entities:
1. User
2. Instrument
3. Transaction
4. Transaction history
5. Notification
6. Processor

UserService -> manages user
Instrument user -> adds intruments to user
Txn Service -> does transactions on instrument
Processor
Notification