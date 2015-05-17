package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.service.LocationService;
import ro.teamnet.zth.app.service.LocationServiceImpl;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/6/2015
 */
@Controller
@RequestMapping(value  = "/locations")
public class LocationController {

    private LocationService locationService = new LocationServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Location> getAllLocations() {
        return locationService.findAllLocations();
    }

    @RequestMapping(value = "/{idLocation}", method = RequestMethod.GET)
    public @ResponseBody Location getOneLocation(@PathVariable("idLocation") String idLocation) {
        Integer id = Integer.valueOf(idLocation);
        return locationService.findOneLocation(id);
    }

    @RequestMapping(value = "/{idLocation}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("idLocation") String idLocation) {
        Integer id = Integer.valueOf(idLocation);
        locationService.deleteLocation(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void insert(@RequestBody Location Location) {
        locationService.insertLocation(Location);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Location Location) {
        locationService.updateLocation(Location);
    }


}
