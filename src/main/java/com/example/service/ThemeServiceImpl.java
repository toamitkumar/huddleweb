package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Theme;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {
	
	@PersistenceContext
    EntityManager em;

    @Transactional
    public List<Theme> allThemes() {
        CriteriaQuery<Theme> c = em.getCriteriaBuilder().createQuery(Theme.class);
        c.from(Theme.class);
        return em.createQuery(c).getResultList();
    }
    
    @Transactional
    public Theme getThemeById(int theme) {
    	Query q = (Query) em.createQuery("SELECT x FROM Theme x WHERE x.id = ?1");
    	return (Theme)q.setParameter(1, theme).getResultList().get(0);
    }
}
