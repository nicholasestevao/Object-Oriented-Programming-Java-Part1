#include "../HEADER/Termo.h"

Termo::Termo (int grau, int cte) {
    this->grau = grau;
    this->cte = cte;
}

int Termo::getCte() {
    return cte;
}

int Termo::getGrau() {
    return grau;
}

void Termo::addCte (int add_cte) {
    cte += add_cte;
}

void Termo::mostra() {
    if (grau == 0) {
        cout << cte;
    } else {
        cout << cte << "x^" << grau;
    }
}