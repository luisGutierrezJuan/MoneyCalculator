package modelo;

import persistencia.CurrencyLoader;

public class CurrencyExchange {
    
    private final String divisaOrigen;
    private final String divisaDestino;
    private float cambio;
    
    public CurrencyExchange(String origen, String destino){
        this.divisaOrigen = CurrencyLoader.loadCurrency(origen);
        this.divisaDestino = CurrencyLoader.loadCurrency(destino);
        this.cambio = CurrencyLoader.loadCurrencyExchange(this.divisaOrigen, this.divisaDestino);
    }
    
    public float getCambio(){
        return this.cambio;
    }
}
