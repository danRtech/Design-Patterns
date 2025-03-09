package org.danrtech.type_safe_enum;

/**
 * "Type-safe enum" design pattern example.
 */
public enum SpaceshipType {
    Scout("Scout"),
    Transport("Transport"),
    Battleship("Battleship"),
    Varies("Varies");

    private String tag;

    private SpaceshipType(String tag){
        this.tag = tag;
    }

    public static SpaceshipType findByTag(String theTag){
        for(SpaceshipType shipType : SpaceshipType.values()){
            if(shipType.tag.equalsIgnoreCase(theTag)){
                return shipType;
            }
        }
        return null;
    }
}
