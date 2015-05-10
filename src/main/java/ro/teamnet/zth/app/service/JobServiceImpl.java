package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.JobDao;
import ro.teamnet.zth.app.domain.Job;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public class JobServiceImpl implements JobService {

    private JobDao jobDao = new JobDao();

    @Override
    public List<Job> findAllJobs() {
        return jobDao.getAllJobs();
    }

    @Override
    public Job findOneJob(Integer id) {
        return jobDao.getJobById(id);
    }

    @Override
    public void deleteJob(Integer id) {
        Job job = jobDao.getJobById(id);
        jobDao.deleteJob(job);
    }

    @Override
    public void insertJob(Job job) {
        jobDao.insertJob(job);
    }

    @Override
    public void updateJob(Job job) {
        jobDao.updateJob(job);
    }
}
