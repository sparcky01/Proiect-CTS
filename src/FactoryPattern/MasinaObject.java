package FactoryPattern;

public class MasinaObject {

int id;
String nume;
int pret;
int nrLocuri;
String NrInmatriculare;
String Culoare;

public String getCuloare() {
	return Culoare;
}

public void setCuloare(String culoare) {
	Culoare = culoare;
}

public String getNrInmatriculare(){
	return NrInmatriculare;
}

public void setNrInmatriculare(String NrInmatriculare){
	this.NrInmatriculare=NrInmatriculare;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public int getPret() {
	return pret;
}
public void setPret(int pret) {
	this.pret = pret;
}
public int getNrLocuri() {
	return nrLocuri;
}
public void setNrLocuri(int nrLocuri) {
	this.nrLocuri = nrLocuri;
}
}
