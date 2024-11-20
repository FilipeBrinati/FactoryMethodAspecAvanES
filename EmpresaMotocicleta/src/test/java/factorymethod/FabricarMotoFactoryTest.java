package factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricarMotoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            @SuppressWarnings("unused")
			IFabricarMoto fabricarmoto = FabricarMotoFactory.obterFabricarMoto("Roadsters");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabricar moto inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            @SuppressWarnings("unused")
			IFabricarMoto fabricarmoto = FabricarMotoFactory.obterFabricarMoto("ModelForTestingImplements");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabricar moto inválido", e.getMessage());
        }
    }

}
