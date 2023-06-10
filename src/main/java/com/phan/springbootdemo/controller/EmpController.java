package com.phan.springbootdemo.controller;

import java.util.List;

import com.phan.springbootdemo.entity.AjaxResult;
import com.phan.springbootdemo.entity.Emp;
import com.phan.springbootdemo.log.BusinessType;
import com.phan.springbootdemo.log.Log;
import com.phan.springbootdemo.page.TableDataInfo;
import com.phan.springbootdemo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/emp")
public class EmpController extends BaseController
{
    @Autowired
    private IEmpService empService;

    /**
     * 查询【请填写功能名称】列表
     */

    @GetMapping("/list")
    public TableDataInfo list(Emp emp)
    {
        startPage();
        List<Emp> list = empService.selectEmpList(emp);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */


    /**
     * 获取【请填写功能名称】详细信息
     */

    @GetMapping(value = "/{EMPNO}")
    public AjaxResult getInfo(@PathVariable("EMPNO") Long EMPNO)
    {
        return success(empService.selectEmpByEMPNO(EMPNO));
    }

    /**
     * 新增【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Emp emp)
    {
        return toAjax(empService.insertEmp(emp));
    }

    /**
     * 修改【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Emp emp)
    {
        return toAjax(empService.updateEmp(emp));
    }

    /**
     * 删除【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{EMPNOs}")
    public AjaxResult remove(@PathVariable Long[] EMPNOs)
    {
        return toAjax(empService.deleteEmpByEMPNOs(EMPNOs));
    }
}
