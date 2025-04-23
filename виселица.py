from random import choice
print('Сосали за одежду 2 гуся')

HANGMAN = (
    """
     ------
     |    |
     |
     |
     |
     |
     |
    ----------
    """,
    """
     ------
     |    |
     |    O
     |
     |
     |
     |
    ----------
    """,
    """
     ------
     |    |
     |    O
     |    |
     | 
     |   
     |    
    ----------
    """,
    """
     ------
     |    |
     |    O
     |   /|
     |   
     |   
     |   
    ----------
    """,
    """
     ------
     |    |
     |    O
     |   /|\\
     |   
     |   
     |     
    ----------
    """,
    """
     ------
     |    |
     |    O
     |   /|\\
     |   /
     |   
     |    
    ----------
    """,
    """
     ------
     |    |
     |    O
     |   /|\\
     |   / \\
     |   
     |   
    ----------
    """
)






max_wrong = len(HANGMAN) - 1
words = ('сентябрь', 'июнь', 'абзаково', 'люблю', 'мальборо', 'чыпырка', 'зайвал', 'бильярд', 'гиперактивность')

word = choice(words)
so_far = '_' * len(word)
wrong = 0
used =[]

while wrong < max_wrong and so_far != word:
    print(HANGMAN[wrong])
    print('\nВы использовали следующие буквы:\n', used)
    print('\nНа данный момент слово выглядит так:\n', so_far)

    guess = input('\n\nВведите свое предложение: ')

    while guess in used:
        print('Вы уже вводили букву', guess)
        guess = input('Введите свое предположение: ')

    used.append(guess)

    if guess in word:
        print('\nДа!', guess, 'есть в слове!')
        new = ''
        for i in range(len(word)):
            if guess == word[i]:
                new += guess
            else:
                new += so_far[i]
        so_far = new
    else:
        print('\nИзвините, буквы \'' + guess + '\' нет в слове')
        wrong += 1

if wrong == max_wrong:
    print(HANGMAN[wrong])
    print('\nТебя повесили!')
else:
    print('\nВы угадали слово!')

print('\nЗагаданное слово было \'' + word + '\'')