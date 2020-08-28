/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.Skills;
import com.company.entity.User;
import java.util.List;

/**
 *
 * @author Hp
 */
public interface SkillDaoInter {

    public List<Skills> getAllSkill();

    public Skills getSkillById(int userId);

    public boolean updateSkill(Skills s);

    public boolean addSkill(Skills u);

    public boolean removeSkill(int id);
}
