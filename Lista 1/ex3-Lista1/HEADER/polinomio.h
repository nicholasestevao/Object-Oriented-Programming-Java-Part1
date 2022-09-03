#ifndef __POLINOMIO_H__
#define __POLINOMIO_H__

#include <iostream>
#include <cmath>
#include <list>
#include "Termo.h"

using std::cout;
using std::endl;
using std::list;

class Polinomio {
    private:
        std::list<Termo> p;
        int grau_m;
    public:
        Polinomio(int grau_m);
        ~Polinomio();
        void add(Termo x);
        void mostra();
        double calcula(double x);    
};

#endif