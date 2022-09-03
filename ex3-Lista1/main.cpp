#include <iostream>
#include "./HEADER/monomio.h"
#include "./HEADER/polinomio.h"

using namespace std;

int main () {
    int grau, cte;
    int menu = 1;
    polinomio *p;

    cout << "Digite o grau maximo do polinomio: ";
    cin >> grau;
    cout << endl;
    p = new polinomio(grau);

    while (menu != 4) {
        cout << "Menu: " << endl << "\t1) Add" << endl << "\t2) Mostra" << endl << "\t3) Calcula" << endl << "\t4) Sai" << endl;
        cout << "Digite o numero da opcao: ";
        cin >> menu;

        switch (menu) {
            case 1:
                cout << "Digite o grau do monomio a ser adicionado: ";
                cin >> grau;
                cout << "Digite a constante do monomio a ser adicionado: ";
                cin >> cte;
                p->add(monomio(grau, cte));
            break;

            case 2:
                cout << "Seu plinomio eh: ";
                p->mostra();
                cout << endl;
            break;

            case 3:
                int x;
                cout << "Digite um valor para x: ";
                cin >> x;
                cout << "O resultado eh: " << p->calcula(x) << endl;
            break;

            case 4:
                cout << "Saindo...";
                delete p;
            break;    
        }
    }

    return 0;
}

