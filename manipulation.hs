confused :: String -> Int -> String
confused a b
  | even b = a
  | otherwise = reverse a

boustrophedon :: [String] -> [String]
boustrophedon xs = map (\x -> confused x (length x)) xs
