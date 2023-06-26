require 'date' 
module PersonData
  class Person
    attr_accessor :fname, :lname, :birth_date, :age
    
    def initialize(fname = "", lname = "", birth_date = "", age = 0)
      @fname = fname
      @lname = lname
      @birth_date = birth_date
      @age = age
    end
    
    def get_person_data
      puts "Enter your first name:"
      @fname = gets.chomp
      
      puts "Enter your last name:"
      @lname = gets.chomp
      
      puts "Enter your birth date (YYYY-MM-DD):"
      @birth_date = gets.chomp
      
      calculate_age
    end
    
    def calculate_age
      birth_date = Date.parse(@birth_date)
      today = Date.today
      @age = today.year - birth_date.year
      @age -= 1 if today.month < birth_date.month || (today.month == birth_date.month && today.day < birth_date.day)
    end
    
    def welcome
      puts "Welcome, #{@fname} #{@lname}!"
      puts "Your age is #{@age} years."
      puts "You are #{@age * 12} months old."
      puts "You are #{@age * 365} days old."
    end
  end
end

# Example usage
include PersonData

person = Person.new
person.get_person_data
person.welcome
