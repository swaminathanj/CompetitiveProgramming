
public class Flower_Bouquet_Test {

	public static void main(String args[]) {
	FlowerBouquet roseBouquet = new RoseBouquet();
    System.out.println(roseBouquet.getDescription()
            + " $ " + roseBouquet.cost());
     /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
    FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
    decoratedRoseBouquet=new PaperWrapper(decoratedRoseBouquet);
    decoratedRoseBouquet=new RibbonBow(decoratedRoseBouquet);
    decoratedRoseBouquet=new Glitter(decoratedRoseBouquet);
    System.out.println(decoratedRoseBouquet.getDescription()
            + " $ " + decoratedRoseBouquet.cost());
     /*Orchid bouquet with double paper wrapper and ribbon bow*/
    FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
    decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
    decoratedOrchidBouquet=new PaperWrapper(decoratedOrchidBouquet);
    decoratedOrchidBouquet=new RibbonBow(decoratedOrchidBouquet);
    System.out.println(decoratedOrchidBouquet.getDescription()
            + " $ " + decoratedOrchidBouquet.cost());

}


}
