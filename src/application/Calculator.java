package application;

/**
 * Berechnet das Formelrad
 * @author Mehmet Guel
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		if(leistung >= 100) {
			System.out.println("der durchschnittliche Mensch erbringt eine leistung von 100 Watt pro Tag");
		}
		return leistung;
	}
	
	public double getSpannung() {
		if(spannung > 240) {
			System.out.println("Diese Menge Spannung ist tödlich für den Menschen !");
		}
		return spannung;
	}

	public double getStrom() {
		if(strom > 0.85) {
			System.out.println("Diese menge Strom ist tödlich für den Menschen !");
		}
		return strom;
	}

	public double getWiderstand() {
		if (widerstand > 100) {
			System.out.println("Das ist mehr wiederstand als der Menschliche Körper erbringt.");
		}
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		if(Double.isNaN(this.leistung) && Double.isNaN(this.strom)) {
			this.leistung = pAusUundR(this.spannung, this.widerstand);
			this.strom = iAusUundR(this.spannung, this.widerstand);
		}
		if (Double.isNaN(this.leistung) && Double.isNaN(this.spannung)) {
			this.leistung = pAusRundI(this.strom, this.widerstand);
			this.spannung = UAusRundI(this.strom, this.widerstand);
		}
		if(Double.isNaN(this.leistung) && Double.isNaN(this.widerstand)) {
			this.leistung = pAusUundI(this.spannung, this.strom);
			this.widerstand = rAusUundI(this.spannung, this.strom);
		}
		if(Double.isNaN(this.spannung) && Double.isNaN(this.strom)) {
			this.spannung = UAusRundP(this.widerstand, this.leistung);
			this.strom = UAusRundP(this.widerstand, this.leistung);
		}
		if(Double.isNaN(this.spannung) && Double.isNaN(this.widerstand)){
			this.spannung = UAusPundI(this.leistung, this.strom);
			this.widerstand = rAusPundI(this.leistung, this.strom);
		}
		if(Double.isNaN(this.strom) && Double.isNaN(this.widerstand)) {
			this.strom = iAusPundU(this.leistung, this.spannung);
			this.widerstand = rAusPundU(this.leistung, this.spannung);
		}
		
	}
	
	public double pAusUundR (double u, double r) {
		
		
		System.out.println("(u*u)/r");
		return (u*u)/r;
		
		
	}
	
	public double pAusUundI (double u, double i) {
		System.out.println("u*i");
		return u*i;
	}
	
	public double pAusRundI (double i, double r) {
		System.out.println("(i*i)*r");
		return (i*i)*r;
	}
	
	public double iAusPundR (double p, double r) {
		System.out.println("Math.sqrt(p/r)");
		return Math.sqrt(p/r);
	}
	
	public double iAusPundU (double p, double u) {
		System.out.println("p/u");
		return p/u;
	}
	
	public double iAusUundR (double u, double r) {
		System.out.println("u/r");
		return u/r;
	}
	
	public double rAusPundU (double p, double u) {
		System.out.println("(u*u)/p");
		return (u*u)/p;
	}
		
	public double rAusPundI (double p, double i) {
		System.out.println("p/(i*i)");
		return p/(i*i);
	}
	
	public double rAusUundI (double u, double i) {
		System.out.println("u/i");
		return u/i;
	}
	
	public double UAusRundI (double r, double i) {
		System.out.println("r*i");
		return r*i;
	}
	
	public double UAusPundI (double p, double i) {
		System.out.println("p/i");
		return p/i;
	}
	
	public double UAusRundP (double r, double p) {
		System.out.println("Math.sqrt(p/r)");
		return Math.sqrt(p/r);
	}
	
	
	
	
}
