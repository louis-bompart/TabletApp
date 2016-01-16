package fr.geobulance.tabletapp.ObjectType;

/**
 * Created by juhel on 16/01/2016.
 */
public class Ambulances {
    private String _id;
    private double lat;
    private double lng;
    private String immatriculation;
    private String created;
    private String name;

    public Ambulances(String uuid, double lat, double lng, String immatriculation, String created, String name){
        this._id = _id;
        this.lat = lat;
        this.lng = lng;
        this.immatriculation = immatriculation;
        this.created = created;
        this.name = name;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _idid) {
        this._id = _id;
    }



    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
