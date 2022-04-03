import re

def solution(dartResult):
    nums = [0]
    found = re.findall('[0-9]{1,2}|[SDT]|[#*]', dartResult)
    for i in found :
        if i == 'S' :
            continue
        elif i == 'D' :
            nums[-1]**=2
        elif i == 'T' :
            nums[-1]**=3
        elif i == '*' :
            nums[-1]*=2
            nums[-2]*=2
        elif i == '#' :
            nums[-1]=-nums[-1]
        else :
            nums.append(int(i))
    return sum(nums)