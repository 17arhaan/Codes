car = {
    'Maruti' :'Swift',
    'Hyundai':'Santro',
    'Tata'   :'Indica',
    'Toyota' :'Innova'
}
print(car.keys()) 

for key,value in car.items():
    print(f"{key} ~~ {value}")