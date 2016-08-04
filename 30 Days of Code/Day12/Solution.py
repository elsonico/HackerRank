class Student(Person):
    def __init__(self, firstName, lastName, idNumber,scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores
    
    def calculate(self):
        totalscore = 0
        for score in range(len(self.scores)):
            totalscore = totalscore + self.scores[score]
            average = (totalscore/len(self.scores))
        if (average < 40):
            ascore = 'T'
        elif (40 <= average < 55):
            ascore = 'D'
        elif ( 55 <= average < 70):
            ascore = 'P'
        elif ( 70 <= average < 80):
            ascore = 'A'
        elif (80 <= average < 90):
            ascore = 'E'
        else:
            ascore = 'O'
        return ascore
