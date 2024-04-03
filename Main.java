public class Main {

    public static void main(String[] args){
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
        GroundTransportation ground1 = new GroundTransportation("ABC123");
        AirTransportation air1 = new AirTransportation("Boing kazezinhu", 53);
        AirTransportation air2 = new AirTransportation("Boing Patricio", 70);
        Lorry lorry1 = new Lorry("1A69", 50, 2);
        Van van1 = new Van("1A70", 40);
        company.add(ground1);
        company.add(air1);
        company.add(air2);
        company.add(lorry1);
        company.add(van1);
        company.toString();
    }
}
