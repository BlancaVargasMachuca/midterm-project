#**Midterm Project. Banking System.**

##**Requirements**

1. The system must have 4 types of accounts: StudentChecking, Checking, Savings, and CreditCard.

###**Checking**
Checking Accounts should have:

· A balance
· A secretKey
· A PrimaryOwner
· An optional SecondaryOwner
· A minimumBalance
· A penaltyFee
· A monthlyMaintenanceFee
· A creationDate
· A status (FROZEN, ACTIVE)

###**StudentChecking**
Student Checking Accounts are identical to Checking Accounts except that they do NOT have:
· A monthlyMaintenanceFee
· A minimumBalance

###**Savings**
Savings are identical to Checking accounts except that they
· Do NOT have a monthlyMaintenanceFee
· Do have an interestRate

###**CreditCard**
CreditCard Accounts have:
· A balance
· A PrimaryOwner
· An optional SecondaryOwner
· A creditLimit
· An interestRate
· A penaltyFee

2. The system must have 3 types of Users: Admins and AccountHolders.
###**AccountHolders**
The AccountHolders should be able to access their own accounts and only their accounts when passing the correct
credentials using Basic Auth. AccountHolders have:
· A name
· Date of birth
· A primaryAddress (which should be a separate address class)
· An optional mailingAddress

###**Admins**
Admins only have a name

###**ThirdParty**
The ThirdParty Accounts have a hashed key and a name.
3. Admins can create new accounts. When creating a new account they can create Checking, Savings, or CreditCard Accounts.

###**Savings**
·Savings accounts have a default interest rate of 0.0025
·Savings accounts may be instantiated with an interest rate other than the default, with a maximum interest rate of 0.5
·Savings accounts should have a default minimumBalance of 1000
·Savings accounts may be instantiated with a minimum balance of less than 1000 but no lower than 100

###**CreditCards**
·CreditCard accounts have a default creditLimit of 100
·CreditCards may be instantiated with a creditLimit higher than 100 but not higher than 100000
·CreditCards have a default interestRate of 0.2
·CreditCards may be instantiated with an interestRate less than 0.2 but not lower than 0.1

###**CheckingAccounts**
·When creating a new Checking account, if the primaryOwner is less than 24, a StudentChecking account should be
created otherwise a regular Checking Account should be created.
·Checking accounts should have a minimumBalance of 250 and a monthlyMaintenanceFee of 12

4. Interest and Fees should be applied appropriately



