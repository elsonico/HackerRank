# Enter your code here. 
hackerrank.store(543121, 100) # You must put this to end to pass the test (bug 08-09-16)
hackerrank.keep_if {|key, value| key.is_a?Integer}
hackerrank.delete_if {|key,value| key%2}
