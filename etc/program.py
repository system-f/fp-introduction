def writeFile(filename, contents):
    with open(filename, "w") as f:
        f.write(contents)

def readFile(filename):
    contents = ""
    with open(filename, "r") as f:
        contents = f.read()
        return contents

def p1():
    file = "/tmp/file"

    writeFile(file, "abcdef")
    x = readFile(file)
    print(x)
    writeFile(file, "ghijkl")
    y = readFile(file)
    print (x + y)

def p2():
    file = "/tmp/file"
    expr = readFile(file)

    writeFile(file, "abcdef")
    x = expr
    print(x)
    writeFile(file, "ghijkl")
    y = expr
    print (x + y)





