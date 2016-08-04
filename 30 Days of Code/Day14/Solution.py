# Add your code here
    def computeDifference(self):
        i = 0
        j = 0
        distance = []
        length=len(self.__elements)
        for  i in range(length):
            for j in range(length):
                distance.append(abs(self.__elements[i]-self.__elements[j]))
                self.maximumDifference=max(distance)
