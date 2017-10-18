from os.path import join


    # def main():
    #     write()


def write():
    print ( 'Creating a new file to save to CSV' )
    filePath = 'C:/Users/zeele/Desktop/myCsvFile.txt'

    try:

        print ( 'path = ' + filePath )

        fileHandler = open( filePath, 'w' )
        fileHandler.write('hello, my name is: Zacarias')

        fileHandler.close()

    except:
        print( 'you gone messed up zac')

write()


# if __name__ == "__main__":
#     main()