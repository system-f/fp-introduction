p1 ::
  IO ()
p1 =
  let file = "/tmp/file"
  in  do  _ <- writeFile file "abcdef"
          x <- readFile file
          _ <- putStrLn x
          _ <- writeFile file "ghijkl"
          y <- readFile file
          putStrLn (show (x, y))

p2 ::
  IO ()
p2 =
  let file = "/tmp/file"
      expr = readFile file
  in  do  _ <- writeFile file "abcdef"
          x <- expr
          _ <- putStrLn x
          _ <- writeFile file "ghijkl"
          y <- expr
          putStrLn (show (x, y))
