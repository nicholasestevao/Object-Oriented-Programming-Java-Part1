#ifndef __POLINOMIO_H__
#define __POLINOMIO_H__

#include <iostream>
#include <cmath>
#include <list>
#include "monomio.h"

using std::cout;
using std::endl;
using std::list;

class polinomio {
    private:
        std::list<monomio> p;
        int grau_m;
    public:
        polinomio(int grau_m);
        ~polinomio();
        void add(monomio x);
        void mostra();
        double calcula(double x);    
};

#endif