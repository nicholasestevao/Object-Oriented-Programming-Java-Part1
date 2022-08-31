#include "../HEADER/monomio.h"

monomio::monomio (int grau, int cte) {
    this->grau = grau;
    this->cte = cte;
}

int monomio::getCte() {
    return cte;
}

int monomio::getGrau() {
    return grau;
}

void monomio::printMonomio() {
    if (grau == 0) {
        cout << cte;
    } else {
        cout << cte << "x^" << grau;
    }
}