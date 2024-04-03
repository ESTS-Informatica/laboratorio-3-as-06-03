public class AirTransportation extends Transport{

    private String name;
    private int numberOfContainers;

    public AirTransportation( String name, int numberOfContainers){
        setFees(0.04);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }


    //Nome
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }


    //Numero de contentores
    public int getNumberOfContainers(){
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers >= 0){
            this.numberOfContainers = numberOfContainers;
        }
    }

    public double getPriceWithFees(){
        return getPrice() + getPrice()*getFees();
    }

    public String getTransportType(){
        return " Aéreo";
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", this.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", this.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", this.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", this.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));

        return sb.toString();
    }
}
