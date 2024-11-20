package factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricarMotoEdicaoEspecialTest {

	@Test
    void deveExecutarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("EdicaoEspecial");
        assertEquals("Montando moto de modelo edicao especial", fabricarMoto.executar());
    }

    @Test
    void deveCancelarMontagemMotoAdventure() {
        IFabricarMoto fabricarMoto = FabricarMotoFactory.obterFabricarMoto("EdicaoEspecial");
        assertEquals("Cancelamento da montagem da moto de modelo edicao especial", fabricarMoto.cancelar());
    }
}
