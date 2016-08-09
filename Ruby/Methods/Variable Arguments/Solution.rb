# Your code here
def full_name(first,*rest)
    fullname=first
    rest.reduce(first) {|f,l| fullname.concat(" #{l}")}
end
