def solution(arr, divisor):
    return sorted([i for i in arr if i % divisor == 0]) or [-1]