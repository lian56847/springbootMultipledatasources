package com.phan.springbootdemo.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.phan.springbootdemo.annotation.Excel;
import com.phan.springbootdemo.entity.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 emp
 *
 * @author ruoyi
 * @date 2023-06-09
 */
public class Emp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long EMPNO;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ENAME;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String JOB;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long MGR;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date HIREDATE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal SAL;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal COMM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long DEPTNO;

    public void setEMPNO(Long EMPNO)
    {
        this.EMPNO = EMPNO;
    }

    public Long getEMPNO()
    {
        return EMPNO;
    }
    public void setENAME(String ENAME)
    {
        this.ENAME = ENAME;
    }

    public String getENAME()
    {
        return ENAME;
    }
    public void setJOB(String JOB)
    {
        this.JOB = JOB;
    }

    public String getJOB()
    {
        return JOB;
    }
    public void setMGR(Long MGR)
    {
        this.MGR = MGR;
    }

    public Long getMGR()
    {
        return MGR;
    }
    public void setHIREDATE(Date HIREDATE)
    {
        this.HIREDATE = HIREDATE;
    }

    public Date getHIREDATE()
    {
        return HIREDATE;
    }
    public void setSAL(BigDecimal SAL)
    {
        this.SAL = SAL;
    }

    public BigDecimal getSAL()
    {
        return SAL;
    }
    public void setCOMM(BigDecimal COMM)
    {
        this.COMM = COMM;
    }

    public BigDecimal getCOMM()
    {
        return COMM;
    }
    public void setDEPTNO(Long DEPTNO)
    {
        this.DEPTNO = DEPTNO;
    }

    public Long getDEPTNO()
    {
        return DEPTNO;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("EMPNO", getEMPNO())
            .append("ENAME", getENAME())
            .append("JOB", getJOB())
            .append("MGR", getMGR())
            .append("HIREDATE", getHIREDATE())
            .append("SAL", getSAL())
            .append("COMM", getCOMM())
            .append("DEPTNO", getDEPTNO())
            .toString();
    }
}
