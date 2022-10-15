package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.DataCollectionCases;
import in.ashokit.entity.DataCollectionChildrens;
import in.ashokit.entity.DataCollectionEducationInfo;
import in.ashokit.entity.DataCollectionIncome;
import in.ashokit.entity.Plan;
import in.ashokit.repo.DCCasesRepo;
import in.ashokit.repo.DCChidrensRepo;
import in.ashokit.repo.DCEducationRepo;
import in.ashokit.repo.DCIncomeRepo;
import in.ashokit.repo.DCPlanRepo;

@Service
public class DataCollectionServiceImpl implements IDataCollectionService {
	@Autowired
	private DCCasesRepo casesRepo;
	@Autowired
	private DCChidrensRepo childernRepo;
	@Autowired
	private DCEducationRepo educRepo;
	@Autowired
	private DCIncomeRepo incomeRepo;
	@Autowired
	private DCPlanRepo planRepo;

	@Override
	public Integer search(Integer appId) {
		Optional<DataCollectionCases> findById = casesRepo.findById(appId);
		if (findById.isPresent()) {
			DataCollectionCases entity = new DataCollectionCases();
			entity.setCaseID(appId);
		}
		return null;
	}

	@Override
	public List<Plan> getAllPlanNames() {
		List<Plan> findAll = planRepo.findAll();
		return findAll;
	}

	@Override
	public boolean registerIncomeDtls(DataCollectionIncome inc) {
		DataCollectionIncome save = incomeRepo.save(inc);
		Integer incomeId = save.getIncomeId();
		if (incomeId > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean registerEducationDtls(DataCollectionEducationInfo info) {
		DataCollectionEducationInfo save = educRepo.save(info);
		Integer educationId = save.getEducationId();
		if (educationId > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean registerChildernsDtls(DataCollectionChildrens child) {
		DataCollectionChildrens save = childernRepo.save(child);
		Integer childernId = save.getChildernId();
		if (childernId > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<DataCollectionEducationInfo> getCitizenEducationInfo() {
		List<DataCollectionEducationInfo> findAll = educRepo.findAll();
		if (!findAll.isEmpty()) {
			return findAll;
		}
		return null;
	}

	@Override
	public List<DataCollectionChildrens> getCitizenChildrensInfo() {
		List<DataCollectionChildrens> findAll = childernRepo.findAll();
		if (!findAll.isEmpty()) {
			return findAll;
		}
		return null;
	}

	@Override
	public List<DataCollectionIncome> getCitizenIncomeInfo() {
		List<DataCollectionIncome> findAll = incomeRepo.findAll();
		if (!findAll.isEmpty()) {
			return findAll;
		}
		return null;
	}

}
