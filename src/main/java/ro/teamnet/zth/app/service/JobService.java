package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Job;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public interface JobService {

    List<Job> findAllJobs();

    Job findOneJob(Integer id);

    void deleteJob(Integer id);

    void insertJob(Job job);

    void updateJob(Job job);

}
