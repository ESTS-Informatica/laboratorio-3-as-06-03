public class GroundTransportation extends Transport{

    private String licensePlate;

    public GroundTransportation(String licensePlate){
        this.licensePlate = licensePlate;
        setFees(0.03);
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        if(licensePlate != null){
            this.licensePlate = licensePlate;
        }
    }

    public double getPriceWithFees(){
        return getPrice()+getPrice()*getFees();
    }

    public String getTransportType(){
        return "Terrestre";
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

        return sb.toString();
    }
}
