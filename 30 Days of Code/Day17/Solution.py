class Calculator:
    def power(self,n,p):
        if (n >= 0 and p >= 0):
            result = n**p
            return result
        else:
            return Exception('n and p should be non-negative')
