public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alfredo", 49578691);
        Carro carro = new Carro("Fusca-69", "Teusla", "103ABC");
        
        OrdemServiço ordServ = new OrdemServiço (0, "28-10-2022", cliente, carro);
        
        Peça p1 = new Peça("Chave de girar parafuso", 0, 100);
        Peça p2 = new Peça("Peça que você queria", 0, 400);
        Peça p3 = new Peça("Peça de vrum vrum", 0, 300);

        ordServ.setPeças(p1);
        ordServ.setPeças(p2);
        ordServ.setPeças(p3);

        Serviço s1 = new Serviço("Fazer programa", 500);
        Serviço s2 = new Serviço("Girar o parafuso", 300);
        Serviço s3 = new Serviço("Hackear a Nasa e descobrir informações ultra-secretas do governo dos Estados" + "Unidos, assim começando uma nova guerra fria com o Brasil vs EUA", 100);
        
        ordServ.setServiços(s1);
        ordServ.setServiços(s2);
        ordServ.setServiços(s3);

        ordServ.imprimir();
   }
}