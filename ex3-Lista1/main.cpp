#include <iostream>
#include "./HEADER/polinomio.h"

using namespace std;

int main () {
    int grau, *cte;
    polinomio *p;

    cout << "Digite o grau do polinomio: ";
    cin >> grau;
    cout << endl;

    cte = new int[grau];
    for (int i = grau; i >= 0; i--) {
        cout << "Digite a constante do monomio x^" << i << ": ";
        cin >> cte[i];
        cout << endl;
    }    
    p = new polinomio(grau, cte);
    cout << "Seu polinomio eh: ";
    p->printPolinomio();
    cout << endl;

    return 0;
}

