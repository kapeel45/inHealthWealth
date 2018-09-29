from sqlalchemy import *
from datetime import datetime

db = create_engine('mysql+pymysql://shindek:Hare*108Krishn@@localhost:3306/kharchadb');
db.echo = False

#TODO: depending upon food i m choosing can predict health and future hospital expence prediction
# Can plan proper diet upon 2 Month of analysis on outside food intake
# reminders to recurring payments to do
# Reminders to change the tyres depending upon durability of tyre if did tyre change for vehicle or recurring service track
# climate and weather will also affect the changes in body
days = ['Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday']
expenseName = 'Petrol in Apace'
payMode = 'Card'
category = 'Fuel'
value = 220
txnRef = 'NA'
txnType = 'Debit'
review = 'NA' #Awesome, Very Good, Good, Bad, Very Bad
#paidBy = ''
comment = 'NA'
day = datetime.today().weekday()
row = 'NA'

if (payMode.lower() != 'cash' and  payMode.lower() != 'card' and (txnRef.lower() == 'na' or txnRef.lower() == '')):
	print ('Please provide transaction number for digital payment')
#elif (category.lower() == 'food' and (review.lower() == 'NA' or review.lower() == '')): 
#	print 'Please provide review for food category'
else:
	metadata = MetaData(db)

	users = Table('expenditure', metadata, autoload=True)
	i = users.insert()

	i.execute(expense_name = expenseName, category = category, value_in_rs = value, pay_mode = payMode, 
	txn_reference = txnRef, txn_type = txnType, spent_day = days[day],review = review, comment = comment)
	
	s = users.select()
	rs = s.execute()

	row = rs.fetchall()
print(row[len(row)-1])
print(days[day])
#print('{:%A}'.format(datetime.now()))