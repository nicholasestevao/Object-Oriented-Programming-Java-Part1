
# __Compila_Programa__
all: polinomios

# __Roda_Programa__
run:
	./polinomios

# __Linking_.O_Files__

polinomios: main.o monomio.o polinomio.o
	g++ -std=c++11 -o3 -march=native -o polinomios ./bin/main.o ./bin/monomio.o ./bin/polinomio.o
## __.O_Files__

main.o: main.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/main.o -c main.cpp

monomio.o: ./cpp/monomio.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/monomio.o -c ./CPP/monomio.cpp

polinomio.o: ./cpp/polinomio.cpp
	g++ -std=c++11 -o3 -march=native -o ./bin/polinomio.o -c ./CPP/polinomio.cpp

#__Remove_.EXE_.O__
clear:
	rm *.exe 
	rm ./BIN/*.o 
	clear	