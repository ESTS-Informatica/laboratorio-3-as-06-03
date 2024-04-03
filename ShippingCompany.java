import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder();

        for(Transport transport : this){
            sb.append(transport.toString());
        }

        return sb.toString();
    }

    private Transport getTransportation(String id){
        for(Transport transport : this){
            if(transport.getId().equals(id)){
                return transport;
            }
        }
        return null;
    }

    public void makeTransportation(String id, String origin, String destination, int price){
        Transport transport = getTransportation(id);
        if(transport != null){
            System.out.println("Nenhum transporte com o ID especificado encontrado.");
            return;
        }
        if(transport.isAvailable()){
            transport.setAvailable(false);
            inService.add(transport);
            this.remove(transport);
            System.out.println("Transporte em serviço.");
        }else System.out.println("Transporte não disponível");

    }

    public void finalizeTransportation(String id){
        for(int i = 0; i < inService.size(); i++){
            if(inService.get(i).getId().equals(id)){
                inService.get(i).resetValues();
                this.add(inService.get(i));
                inService.remove(inService.get(i));

            }
        }
    }
}
