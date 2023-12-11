class Random:
    def __init__(self,name):
        self.object = name
        print("this is a constructor.")
    def method1(self):
        print("this is a method.")
    def method2(self):
        print(f"{self.object} is the object called.")
def main(): 
    object = Random("hehehe")
    object.method1()
    object.method2()

if __name__ == "__main__":
    main()
