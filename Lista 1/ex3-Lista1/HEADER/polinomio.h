#ifndef __POLINOMIO_H__
#define __POLINOMIO_H__

#include <iostream>
#include "monomio.h"

using std::cout;
using std::endl;

class polinomio {
    private:
        monomio **p;
        int grau;
    public:
        polinomio (int grau, int *cte);
        void printPolinomio ();    
};

#endif