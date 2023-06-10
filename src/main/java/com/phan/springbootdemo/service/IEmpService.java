package com.phan.springbootdemo.service;

import com.phan.springbootdemo.entity.Emp;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-06-09
 */
public interface IEmpService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param EMPNO 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Emp selectEmpByEMPNO(Long EMPNO);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param emp 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Emp> selectEmpList(Emp emp);

    /**
     * 新增【请填写功能名称】
     *
     * @param emp 【请填写功能名称】
     * @return 结果
     */
    public int insertEmp(Emp emp);

    /**
     * 修改【请填写功能名称】
     *
     * @param emp 【请填写功能名称】
     * @return 结果
     */
    public int updateEmp(Emp emp);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param EMPNOs 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmpByEMPNOs(Long[] EMPNOs);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param EMPNO 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmpByEMPNO(Long EMPNO);
}
