package com.jay.imall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jay.imall.coupon.entity.PmsSkuImagesEntity;
import com.jay.imall.coupon.service.PmsSkuImagesService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.common.utils.R;



/**
 * sku图片
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 11:10:33
 */
@RestController
@RequestMapping("coupon/pmsskuimages")
public class PmsSkuImagesController {
    @Autowired
    private PmsSkuImagesService pmsSkuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:pmsskuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("coupon:pmsskuimages:info")
    public R info(@PathVariable("id") Long id){
		PmsSkuImagesEntity pmsSkuImages = pmsSkuImagesService.getById(id);

        return R.ok().put("pmsSkuImages", pmsSkuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:pmsskuimages:save")
    public R save(@RequestBody PmsSkuImagesEntity pmsSkuImages){
		pmsSkuImagesService.save(pmsSkuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:pmsskuimages:update")
    public R update(@RequestBody PmsSkuImagesEntity pmsSkuImages){
		pmsSkuImagesService.updateById(pmsSkuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:pmsskuimages:delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
