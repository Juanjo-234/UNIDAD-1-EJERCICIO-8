class TermometroIoT{
    double temperaturaCelsius;

public TermometroIoT(double temperaturaCelsius){
    this.temperaturaCelsius = temperaturaCelsius;
}


public double obtenerFahrenheit(){
   return this.temperaturaCelsius * (9.0 / 5.0) + 32;
}


void mostrarDatos(){
    System.out.println("--------------------------------------------------");
    System.out.println("Temperatura en grados Celsius: " + temperaturaCelsius);
    System.out.println("Temperatura en grados Farenheit: " + obtenerFahrenheit());
    System.out.println("--------------------------------------------------");
}

public static void main(String[] args) {
    TermometroIoT t1 = new TermometroIoT(20);
    t1.mostrarDatos();
   
}
}