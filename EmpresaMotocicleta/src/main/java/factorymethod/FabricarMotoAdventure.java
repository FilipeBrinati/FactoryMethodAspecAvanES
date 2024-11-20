package factorymethod;

public class FabricarMotoAdventure implements IFabricarMoto{

	public String executar() {
		return "Montando moto de modelo adventure";
	}

	public String cancelar() {
		return "Cancelamento da montagem da moto de modelo adventure";
	}
}
