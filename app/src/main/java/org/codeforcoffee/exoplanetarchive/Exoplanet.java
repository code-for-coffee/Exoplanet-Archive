package org.codeforcoffee.exoplanetarchive;



/**
 * Created by codeforcoffee on 7/5/16.
 * Variables named based off Kepler Confirmed Planet API documentation
 * http://exoplanetarchive.ipac.caltech.edu/docs/API_kepcandidate_columns.html
 */
public class Exoplanet {

    private String kepId;       //kepid†	Kepler Identification or KepID
    private String kepoiName;   //kepoi_name†	KOI Name
    private String name;        //kepler_name†	Kepler Name
    private Double radius;      //koi_prad†	Planetary Radius (Earth radii)
    private Double mass;        // mpl_bmassj†	Planet Mass or M*sin(i) [Jupiter mass]
    // Best planet mass measurement in units of masses of Jupiter. Either Mass, M*sin(i)/sin(i), or M*sin(i).
    private String planetType;  //

    public Exoplanet(String kepId, String kepoiName, String name, String radius) {
        this.kepId = kepId;
        this.kepoiName = kepoiName;
        this.name = name;
        this.radius = Double.valueOf(radius);
    }


}
