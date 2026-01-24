# logging details
EMAIL="pakaya@example.com"
PASSWORD="Pakaya@123"

# welcome messages and login instructions
puts "Welcome to Non Shall Pass - A Password Manager"
puts "Please, sign in to continue"
print "Enter Emial: "

# get input as user_email for EMAIL
user_email=gets.chomp

# check whether user input is corect or wrong
if user_email==EMAIL
  print "Enter Password: "
  user_password=gets.chomp
else
  puts "Invaild Email"
  exit
end

# if password is right then these messages will display 
unless user_password != PASSWORD
  puts "Hello, #{user_email}."
  puts "What whould you like ro do?"
  puts "1. Add service credentials"
  puts "2. Retrieve and existing service credentials"
end