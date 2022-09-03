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

void monomio::addCte (int add_cte) {
    cte += add_cte;
}

void monomio::printMonomio() {
    if (grau == 0) {
        cout << cte;
    } else {
        cout << cte << "x^" << grau;
    }
}