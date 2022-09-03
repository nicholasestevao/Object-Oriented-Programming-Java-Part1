#ifndef __TERMO_H__
#define __TERMO_H__

#include <iostream>

using std::cout;

class Termo {
    private:
        int grau, cte;

    public:
        Termo (int grau, int cte);  
        int getCte ();  
        int getGrau ();
        void addCte (int add_cte);
        void mostra ();
};

#endif