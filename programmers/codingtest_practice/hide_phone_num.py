def solution(phone_number):
    seperator = len(phone_number)-4;
    return "*"*seperator + phone_number[seperator:]
