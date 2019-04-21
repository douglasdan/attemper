package com.sse.attemper.core.controller.job;

import com.sse.attemper.common.constant.APIPath;
import com.sse.attemper.common.param.dispatch.trigger.TriggerGetParam;
import com.sse.attemper.common.result.CommonResult;
import com.sse.attemper.common.result.dispatch.trigger.TriggerResult;
import com.sse.attemper.core.service.job.TriggerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author ldang
 */
@Api("Trigger")
@RestController
public class TriggerController {
	
	@Autowired
	private TriggerService service;

	@ApiOperation("Get trigger info by job")
	@ApiImplicitParam(value = "TriggerGetParam", name = "param", dataType = "TriggerGetParam", required = true)
	@GetMapping(APIPath.TriggerPath.GET)
	public CommonResult<TriggerResult> get(TriggerGetParam param) {
		return CommonResult.putResult(service.get(param));
	}

}
