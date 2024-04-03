public class Lorry extends GroundTransportation{
    private int numberOfPallets;
    private int trailers;
    public Lorry(String licensePlate, int numberOfPallets, int trailers) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets(){
        return numberOfPallets;
    }

    public int getTrailers(){
        return trailers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("%15s: %15s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("%15s: %15s\n", "Número de atrelados", getTrailers()));
        sb.append(String.format("%15s: %15s\n", "Número de paletes", getNumberOfPallets()));

        return sb.toString();
    }
}
