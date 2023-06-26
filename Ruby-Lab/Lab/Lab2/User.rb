class User
  @@name = "user"
  
  def initialize(name = nil)
    @name = name
  end
  
  def self.name
    @@name
  end
  
  def self.change_name(new_name)
    @@name = new_name
  end
  
  def name=(new_name)
    @name = new_name
  end
  
  def name
    @name
  end
end

# Example usage
user1 = User.new("John")
puts user1.name  # Output: John

user2 = User.new
p user2.name  # Output: nil

puts User.name   # Output: user

User.change_name("admin")
puts User.name   # Output: admin

user1.name = "Alice"
puts user1.name  # Output: Alice

user3 = User.new
puts user3.name  # Output: (empty line)
p user3.name  # Output: nil
if user3.name.nil?
  puts "user2.name is nil"
else
  puts user3.name
end

