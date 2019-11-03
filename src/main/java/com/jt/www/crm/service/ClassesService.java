package com.jt.www.crm.service;

import com.jt.www.crm.model.Classes;

public interface ClassesService {
    public Classes saveClasses(Classes classes);
    public Classes findById(String cid);
    public void deleteClasses(String cid);
    public void updateClasses(String cid);

}
