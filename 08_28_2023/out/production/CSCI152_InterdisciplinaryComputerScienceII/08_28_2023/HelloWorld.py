import sys

def main(args):
    print("Hello World!")
    for i in range(len(args)):
        print(args[i])


if __name__ == '__main__':
    main(sys.argv[1:])
