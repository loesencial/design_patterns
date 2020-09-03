package HouseBuilderExample;

public class IglooBuilder implements HouseBuilder {
    private House house;

    public IglooBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Ice Blocks");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Ice Carvings");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Ice Dome");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
