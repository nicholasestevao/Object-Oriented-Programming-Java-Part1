
# __Compila_Programa__
all: polinomios

# __Roda_Programa__
run:
	./polinomios

# __Linking_.O_Files__

polinomios: main.o Termo.o Polinomio.o
	g++ -std=c++11 -o3 -march=native -o polinomios ./bin/main.o ./bin/Termo.o ./bin/Polinomio.o
## __.O_Files__

main.o: main.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/main.o -c main.cpp

Termo.o: ./cpp/Termo.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/Termo.o -c ./CPP/Termo.cpp

Polinomio.o: ./cpp/Polinomio.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/Polinomio.o -c ./CPP/Polinomio.cpp

#__Remove_.EXE_.O__
clear:
	rm *.exe 
	rm ./BIN/*.o 
	clear	