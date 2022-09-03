#ifndef __MONOMIO_H__
#define __MONOMIO_H__

#include <iostream>

using std::cout;

class monomio {
    private:
        int grau, cte;

    public:
        monomio (int grau, int cte);  
        int getCte ();  
        int getGrau ();
        void addCte (int add_cte);
        void printMonomio ();
};

#endif