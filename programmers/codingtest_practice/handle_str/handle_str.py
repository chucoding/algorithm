def solution(s):
    try:
        int(s)
    except:
        return False
    return len(s) == 4 or len(s) == 6