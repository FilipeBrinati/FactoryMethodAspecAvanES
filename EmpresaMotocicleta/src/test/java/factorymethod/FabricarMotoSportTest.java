package factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricarMotoSportTest {

    @Test
    void deveExecutarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("Sport");
        assertEquals("Montando moto de modelo sport", fabricarMoto.executar());
    }

    @Test
    void deveCancelarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("Sport");
        assertEquals("Cancelamento da montagem da moto de modelo sport", fabricarMoto.cancelar());
    }
}
