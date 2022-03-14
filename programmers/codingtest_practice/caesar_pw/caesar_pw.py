def solution(s, n):
    answer = ''
    for i in s:
        if i == " ":
            answer += " "
            continue
        code = ord(i)
        if code <= 90:
            answer += chr((code + n)%90 + 64) if code + n > 90 else chr(code+n)
        else :
            answer += chr((code + n)%122 + 96) if code + n > 122 else chr(code+n)
    return answer