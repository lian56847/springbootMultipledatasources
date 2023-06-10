package com.phan.springbootdemo.service.impl;

import java.util.List;

import com.phan.springbootdemo.entity.Emp;
import com.phan.springbootdemo.mapper.mapper2.EmpMapper;
import com.phan.springbootdemo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-09
 */
@Service
public class EmpServiceImpl implements IEmpService
{
   /* @Autowired
    private EmpMapper empMapper;*/
   @Autowired
    private EmpMapper empMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param EMPNO 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Emp selectEmpByEMPNO(Long EMPNO)
    {
        return empMapper.selectEmpByEMPNO(EMPNO);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param emp 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Emp> selectEmpList(Emp emp)
    {/*
        List<Emp> objects = new ArrayList<>();
        Emp emp1 = new Emp();
        emp1.setENAME("565665");
        objects.add( emp1);
        return  objects;*/
       return empMapper.selectEmpList(emp);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param emp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmp(Emp emp)
    {
        return empMapper.insertEmp(emp);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param emp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmp(Emp emp)
    {
        return empMapper.updateEmp(emp);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param EMPNOs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmpByEMPNOs(Long[] EMPNOs)
    {
        return empMapper.deleteEmpByEMPNOs(EMPNOs);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param EMPNO 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmpByEMPNO(Long EMPNO)
    {
        return empMapper.deleteEmpByEMPNO(EMPNO);
    }
}
