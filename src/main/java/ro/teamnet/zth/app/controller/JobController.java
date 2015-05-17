package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Job;
import ro.teamnet.zth.app.service.JobService;
import ro.teamnet.zth.app.service.JobServiceImpl;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/6/2015
 */
@Controller
@RequestMapping(value = "/jobs")
public class JobController {

    private JobService jobService = new JobServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Job> getAllJobs() {
        return jobService.findAllJobs();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idJob}")
    public @ResponseBody Job getOneJob(@PathVariable("idJob") String idJob) {
        Integer id = Integer.valueOf(idJob);
        return jobService.findOneJob(id);
    }

    @RequestMapping(value = "/{idJob}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("idJob") String idJob) {
        Integer id = Integer.valueOf(idJob);
        jobService.deleteJob(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void insert(@RequestBody Job job) {
        jobService.insertJob(job);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Job job) {
        jobService.updateJob(job);
    }


}
