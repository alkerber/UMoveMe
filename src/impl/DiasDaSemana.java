package impl;

public enum DiasDaSemana {
	SEGUNDA(),
	TERCA(),
	QUARTA(),
	QUINTA(),
	SEXTA(),
	SABADO(),
	DOMINGO();
	
	DiasDaSemana(){
		
	}
	
	private int percentualDesconto;
	
	public int retornaPercentualDesconto(){
		return percentualDesconto;
	}
	
	
	
	
}

/*Exemplo enum para completar a classe:
public enum Planet {
MERCURY (3.303e+23, 2.4397e6),
NEPTUNE (1.024e+26, 2.4746e7);

private final double mass;   // in kilograms
private final double radius; // in meters
Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
}
private double mass() { return mass; }
private double radius() { return radius; }

// universal gravitational constant  (m3 kg-1 s-2)
public static final double G = 6.67300E-11;
*/