package factorymethod;

public class FabricarMotoSport implements IFabricarMoto{

	public String executar() {
		return "Montando moto de modelo sport";
	}

	public String cancelar() {
		return "Cancelamento da montagem da moto de modelo sport";
	}

}
