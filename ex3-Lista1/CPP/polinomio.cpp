#include "../HEADER/polinomio.h"

polinomio::polinomio (int grau_m) {
    this->grau_m = grau_m;
}

polinomio::~polinomio() {
    p.clear();
}

void polinomio::add(monomio x) {
    if (x.getGrau() <= grau_m) {
        if(p.size() == 0) {
            p.push_front(x);
        } else {
            list<monomio>::iterator it;
            for (it = p.begin(); it != p.end(); it++) {
                if(x.getGrau() == it->getGrau()) {
                    it->addCte(x.getCte());
                    return;
                }
            }
            it = p.begin();
            while (it != p.end() && it->getGrau() < x.getGrau()) {
                it++;
            }
            if (it == p.begin()) {
                p.push_front(x);
            } else {
                p.insert(it, x);
            }
        }
    }
}

void polinomio::mostra () {
    list<monomio>::reverse_iterator it;
    int i = 1;
    for (it = p.rbegin(); it != p.rend(); it++) {
        it->printMonomio();
        if (i != p.size()) {
            cout << " + ";
        } else {
            cout << endl;
        }
        i++;
    }
}

double polinomio::calcula(double x) {
    double val_mono, val_poli = 0;
    list<monomio>::iterator it;
    for (it = p.begin(); it != p.end(); it++) {
        val_mono = 1;
        if (it->getGrau() == 0) {
            val_poli += it->getCte(); 
        } else {
            for (int i = 1; i <= it->getGrau(); i++) {
                val_mono *= x;
            }
            val_poli += (val_mono * it->getCte());
        }
    }
    return val_poli;
}