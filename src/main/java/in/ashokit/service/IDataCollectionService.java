package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.DataCollectionChildrens;
import in.ashokit.entity.DataCollectionEducationInfo;
import in.ashokit.entity.DataCollectionIncome;
import in.ashokit.entity.Plan;

public interface IDataCollectionService {
    public Integer search(Integer appId);
    public List<Plan> getAllPlanNames();
    public boolean registerIncomeDtls(DataCollectionIncome inc);
    public boolean registerEducationDtls(DataCollectionEducationInfo info);
    public boolean registerChildernsDtls(DataCollectionChildrens child);
    public List<DataCollectionEducationInfo> getCitizenEducationInfo();
    public List<DataCollectionChildrens> getCitizenChildrensInfo();
    public List<DataCollectionIncome> getCitizenIncomeInfo();
    
    
}
