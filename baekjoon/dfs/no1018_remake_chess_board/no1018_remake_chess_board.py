global visited
global cnt

def recursive(a, b, i, j, board) :
    if i < 0 or j < 0 or i > len(board)-1 or j > len(board[i])-1 or board[i][j] == board[a][b]:
        return
    visited[i][j] = 1
    cnt+=1
    recursive(i, j, i, j+1, board)
    recursive(i, j, i+1, j, board)

num = input().split(" ")
board = []
visited = [[0]*int(num[1]) for _ in range(int(num[0]))]
for i in range(int(num[0])) :
    l = []
    for s in input() :
        l.append(s)
    board.append(l)

for i, y in enumerate(visited) :
    for j, x in enumerate(visited[i]) :
        if x == 0 :
            cnt = 0
            recursive(i, j, i, j+1, board)
            print(cnt)