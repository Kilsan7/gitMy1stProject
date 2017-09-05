# Brief and powerful coding
text = "AAA is the rating result produced by the trust evsluation company. BBB CCC are also...I am learning Ruby and it is fun! During each iteration, the char variable is assigned the corresponding character in our text string and then the value of that character's frequency is incremented in the freqs hash.
So, for example, if the letter \"c\" appears twice in the text, freqs[] will be equal to 2 after the iterator executes.
So, freqs will hold all the characters of the string with their corresponding occurrence number."
#text.downcase!
freqs = {}
freqs.default = 0

text.each_char { |char| freqs[char] += 1}

("A".."z").each {|x| puts "#{x} : #{freqs[x]}" }