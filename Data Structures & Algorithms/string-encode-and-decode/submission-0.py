class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for s in strs:
            res+= str(len(s))+ "#" + s #add a delimiter with the lenght of each string before the delimiter (checkpoint)
        return res
    def decode(self, s: str) -> List[str]:
        res, i= [],0
        while i<len(s):
            j =i
            while s[j] != "#":
                j+=1 #increment till #
            length = int(s[i:j]) #gets the integer number at the start of the string 
            res.append(s[j+1:j+1+length]) #j+1 is to go past the # sign and append the string based on the length
            i = j+1 +length
        return res



