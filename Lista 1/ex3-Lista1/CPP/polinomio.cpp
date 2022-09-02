#include "../HEADER/polinomio.h"

polinomio::polinomio (int grau, int *cte) {
    this->grau = grau;
    p = new monomio*[grau];

    for (int i = 0; i <= grau; i++) {
        p[i] = new monomio(i, cte[i]);
    }
}

void polinomio::printPolinomio () {
    for (int i = grau; i >= 0; i--) {
        p[i]->printMonomio();
        if (i != 0) {
            cout << " + ";
        } else {
            cout << endl;
        }
    }
}