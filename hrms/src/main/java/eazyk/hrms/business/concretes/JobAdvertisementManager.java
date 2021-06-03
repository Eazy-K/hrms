package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.JobAdvertisementDao;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.CandidateDto;
import eazyk.hrms.entitites.dtos.JobAdvertisementDto;
import eazyk.hrms.entitites.dtos.JobDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    @Autowired
    private JobAdvertisementDao jobAdvertisementDao;
    @Autowired
    private ModelMapper modelMapper;

    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı oluşturuldu.");
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getAll() {

        List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.findAll();
        List<JobAdvertisementDto> jobAdvertisementDtos = jobAdvertisements.stream().map(jobAdvertisement -> modelMapper.map(jobAdvertisement, JobAdvertisementDto.class)).collect(Collectors.toList());

         return new SuccessDataResult<List<JobAdvertisementDto>>
                 ("Data listelendi.", jobAdvertisementDtos);
    }




}
