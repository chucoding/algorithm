def recursive(a, b, i, j) :
    if i < 0 or j < 0 or i > len(board)-1 or j > len(board[i])-1 or ((i!=a or j!=b) and board[i][j] == board[a][b]) or visited[i][j] == 1 :
        return
    visited[i][j] = 1
    global cnt
    cnt+=1
    recursive(i, j, i, j-1)
    recursive(i, j, i-1, j)
    recursive(i, j, i, j+1)
    recursive(i, j, i+1, j)

num = input().split(" ")
board = []
visited = [[0]*int(num[1]) for _ in range(int(num[0]))]
for i in range(int(num[0])) :
    l = []
    for s in input() :
        l.append(s)
    board.append(l)

result = []
for i, y in enumerate(visited) :
    for j, x in enumerate(visited[i]) :
        if x == 0 :
            cnt = 0
            recursive(i, j, i, j)
            result.append(cnt)
print(result)