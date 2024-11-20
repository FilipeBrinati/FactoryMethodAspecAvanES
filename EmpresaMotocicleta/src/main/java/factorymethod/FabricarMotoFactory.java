package factorymethod;

public class FabricarMotoFactory {

	public static IFabricarMoto obterFabricarMoto(String fabricarmoto) {
		Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.FabricarMoto" + fabricarmoto);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabricar moto inexistente");
        }
        if (!(objeto instanceof IFabricarMoto)) {
            throw new IllegalArgumentException("Fabricar moto inválido");
        }
        return (IFabricarMoto) objeto;
    }
}