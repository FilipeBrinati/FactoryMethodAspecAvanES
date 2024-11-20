package factorymethod;

public class FabricarMotoEdicaoEspecial implements IFabricarMoto{

	public String executar() {
		return "Montando moto de modelo edicao especial";
	}

	public String cancelar() {
		return "Cancelamento da montagem da moto de modelo edicao especial";
	}

}
