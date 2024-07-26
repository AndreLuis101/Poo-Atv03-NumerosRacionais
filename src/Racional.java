public class Racional {
    int numerador;
    int denominador;
    
    //Método construtor
    Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //COMEÇO: Bloco dos métodos auxilares
    int copiaNumerador(){
        return numerador;
    }

    int copiaDenominador(){
        return denominador;
    }

        //Numerador de r2, elemento que vai de parametro ();
    void novoNumerador(int numerador){
        this.numerador = numerador;
    }

        //Denominador de r2, elemento que vai de parametro ();
    void novoDenominador(int denominador){
        this.denominador = denominador;
    }

    int calculaMDC(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    Racional minimo(){
        int mdc = calculaMDC(this.numerador, this.denominador);
        return new Racional(this.numerador/mdc, this.denominador/mdc);
    }
    //FINAL: Bloco dos métodos auxilares 

    //COMEÇO: Bloco com Métodos das operaçoes
    Racional adiciona(Racional r){
        int novoNumerador = this.denominador*r.copiaNumerador() + r.copiaDenominador()*this.numerador ;
        int novoDenominador = this.denominador * r.copiaDenominador();
        return new Racional(novoNumerador, novoDenominador);
    }

    Racional subtrai(Racional r){
        int novoNumerador = r.copiaDenominador()*this.numerador - this.denominador*r.copiaNumerador();
        int novoDenominador = this.denominador * r.copiaDenominador();
        return new Racional(novoNumerador, novoDenominador);
    }

    Racional multiplica(Racional r){
        int novoNumerador = r.copiaNumerador() * this.numerador;
        int novoDenominador = r.copiaDenominador() * this.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    Racional divide(Racional r){
        int novoNumerador= this.numerador*r.copiaDenominador();
        int novoDenominador= this.denominador*r.copiaNumerador();
        return new Racional(novoNumerador, novoDenominador);
    }
    //FINAL: Bloco com Métodos das operaçoes

    //Método igual;
    Boolean igual(Racional r){
        Racional r1Min = this.minimo();
        Racional r2Min = r.minimo();
        return r1Min.numerador == r2Min.numerador && r1Min.denominador == r2Min.denominador; 
    }

    //Método Converte para String;
    String converteParaString(){
        Racional rMin = this.minimo();
        if(rMin.denominador < 0) {
            rMin.denominador = rMin.denominador * -1;
            rMin.numerador = rMin.numerador * -1;
        }

        return String.format("%d/%d", rMin.numerador, rMin.denominador);
    }
}
