package GeneratorPal.FilterObjects;

import GeneratorPal.ActorObjects.Actor;
import GeneratorPal.StructureObjects.AssetPack;

import java.util.HashSet;

public class Option extends FilterObject {
    //Optional fields
    private HashSet<Tag> tags;
    private Actor actor;

    //Constructors
    public Option(String name, String description, AssetPack assetPack) {
        //required Fields
        super(name, description, assetPack);
        //optional Fields
        this.tags = new HashSet<>();
        this.actor = null;
    }

    //Primary Methods
    public Boolean isActorOption(){return null;}

    //Secondary Methods
    ///Getters and Setters
    public HashSet<Tag> getTags() {
        return tags;
    }
    public void setTags(HashSet<Tag> tags) {
        this.tags = tags;
    }
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }


    //old stuff
//    private String rules;
//    public Option(String name, AssetPack assetPack){}
//
//    public void setRules(){}
//    public String getRules(){}
//
//    public void setTags(){}
//    public HashMap<String, Tag> getTags(){}
//    public void removeTag(){}
//    public void addTag(){}
//
//    public Actor getActor(){}
//    public void setActor(){}
//
//    @Override
//    public void updateAssetPack() {
//
//    }
}
