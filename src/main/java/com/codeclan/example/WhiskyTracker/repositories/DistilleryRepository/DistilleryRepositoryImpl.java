package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

}
