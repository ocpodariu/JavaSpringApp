package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.LocationDao;
import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public class LocationServiceImpl implements LocationService {

    private LocationDao locationDao = new LocationDao();

    @Override
    public List<Location> findAllLocations() {
        return locationDao.getAllLocations();
    }

    @Override
    public Location findOneLocation(Integer id) {
        return locationDao.getLocationById(id);
    }

    @Override
    public void deleteLocation(Integer id) {
        Location location = locationDao.getLocationById(id);
        locationDao.deleteLocation(location);
    }

    @Override
    public void insertLocation(Location location) {
        locationDao.insertLocation(location);
    }

    @Override
    public void updateLocation(Location location) {
        locationDao.updateLocation(location);
    }
}
