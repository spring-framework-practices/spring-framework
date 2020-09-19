package com.habuma.spitter.service;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.persistence.SpitterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static java.lang.Math.*;
import static java.util.Collections.*;

@Service("spitterService")
@Transactional(propagation = Propagation.REQUIRED)
public class SpitterServiceImpl implements SpitterService {

    @Autowired
    SpitterDao spitterDao;

    public void saveSpittle(Spittle spittle) {
        spittle.setWhen(new Date());
        spitterDao.saveSpittle(spittle);
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Spittle> getRecentSpittles(int count) {
        List<Spittle> recentSpittles =
                spitterDao.getRecentSpittle();

        reverse(recentSpittles);

        return recentSpittles.subList(0,
                min(49, recentSpittles.size()));
    }

    public void saveSpitter(Spitter spitter) {
        if (spitter.getId() == null) {
            spitterDao.addSpitter(spitter);
        } else {
            spitterDao.saveSpitter(spitter);
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Spitter getSpitter(long id) {
        return spitterDao.getSpitterById(id);
    }

    public void startFollowing(Spitter follower, Spitter followee) {
        // TODO Auto-generated method stub
    }

    public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
        return spitterDao.getSpittlesForSpitter(spitter);
    }

    public List<Spittle> getSpittlesForSpitter(String username) {
        Spitter spitter = spitterDao.getSpitterByUsername(username);
        return getSpittlesForSpitter(spitter);
    }

    public Spitter getSpitter(String username) {
        return spitterDao.getSpitterByUsername(username);
    }

    public void deleteSpittle(long id) {
        spitterDao.deleteSpittle(id);
    }

    public List<Spitter> getAllSpitters() {
        return spitterDao.findAllSpitters();
    }

    public Spittle getSpittleById(long id) {
        return spitterDao.getSpittleById(id);
    }
}