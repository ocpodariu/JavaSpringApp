package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public interface LocationService {

    List<Location> findAllLocations();

    Location findOneLocation(Integer id);

    void deleteLocation(Integer id);

    void insertLocation(Location location);

    void updateLocation(Location location);

}
