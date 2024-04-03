public class Van extends GroundTransportation{
    private int packages;
    public Van(String licensePlate, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages(){
        return packages;
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
        sb.append(String.format("%15s: %15s\n", "Número de pacotes", getPackages()));

        return sb.toString();
    }
}
