package factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FabricarMotoAdventureTest {

    @Test
    void deveExecutarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("Adventure");
        assertEquals("Montando moto de modelo adventure", fabricarMoto.executar());
    }

    @Test
    void deveCancelarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("Adventure");
        assertEquals("Cancelamento da montagem da moto de modelo adventure", fabricarMoto.cancelar());
    }
}
