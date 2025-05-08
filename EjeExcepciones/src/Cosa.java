class Cosa {
    private int valor;
    
    Cosa (int valor) throws ExceptionCero {
    	if (valor == 0) throw new ExceptionCero();
        this.valor = valor;
    }
      
    int getValor (){
        return valor;
    }
    
}