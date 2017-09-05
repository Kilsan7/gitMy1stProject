#*****************************************************
# 
# Sololearn Ruby Example : Date Class
# Output : Input date's information
# Characteristics : Weekday finding using Case statement
#                   User input data conversion using String method
# Input data format : YYYY.MM.DD ex) 1993.05.31, 1993.5.31, 1993. 5. 31 etc.
# (2017. 8. 5)
#
#*****************************************************/

t = Time.now        #current time

puts "I. Let's compare t.inspect to just t."
puts "-" * 40       # This line is just for spacing and decoration
puts "1. puts t.inpect : #{t.inspect}" 
puts "2. puts t        : #{t}"
puts "The outputs are all the same!"
print "\nThe current date in YYYY, MM, DD format : "   #Current year, month, day
print t.year
print ", "
print t.month
print ", "
puts t.day

# This is a weekday finding method. we'll use below statements
def weekday (wday)
  case wday
    when 0
      return "Sunday"
    when 1
      return "Monday"
    when 2
      return "Tuesday"
    when 3
      return "Wednesday"
    when 4
      return "Thursday"
    when 5
      return "Friday"
    when 6
      return "Saturday"
  end
end

# Getting custom input date
puts "\nII. Input date what you want to check, in yyyy.mm.dd format!"
puts "-" * 40       
inputdate = gets.chomp             # get data without new line
puts "Youn entered : #{inputdate}"
puts "This is a string and the inputdate.length is : #{inputdate.length}"     # equal to "puts inputdate.size"

inputdate = inputdate.split(".")         # This code eliminates dot and makes string into array
puts "\nIII. Your input date after split"
puts "-" * 40       
puts "inputdate[0] is : #{inputdate[0]}"
puts "inputdate[1] is : #{inputdate[1]}"
puts "inputdate[2] is : #{inputdate[2]}"
puts "Now the inputdate.length is : #{inputdate.length}"

# Now let's convert string into integer
i_year = inputdate[0].to_i               # The prefix i means input(^^)
i_month = inputdate[1].to_i
i_day = inputdate[2].to_i

# The below statement makes a new Time instance using Time Class
t = Time.new(i_year, i_month , i_day)
puts "\nIV. Here are the informations what you want to know."
puts "-" * 40            
wday = t.wday
puts "Your input date's weekday is #{weekday(wday)}"      # We just used the above weekday method!
puts "Your input date's days of the month is #{t.mday}"   # so natural you don't need to display(^^)   
puts "Your input date's days of the year is #{t.yday}"    # The total day passed in the year
