import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {
		
        Order o = new Order();
        o.add(new Item("Café", 8.0, 2));   // 16.0
        o.add(new Item("Bolo", 12.5, 1));  // 12.5 -> subtotal 28.5
        
        System.out.println("--- Recibo com Taxa Padrão (10%) ---");
        String receiptDefault = new ReceiptService().generate(o);
        System.out.println(receiptDefault);
        
        System.setProperty("tax.rate", "0.08"); 
        
        System.out.println("\n--- Recibo com Taxa Configurável (8%) ---");
        String receiptConfigured = new ReceiptService().generate(o);
        System.out.println(receiptConfigured);
	}
}
