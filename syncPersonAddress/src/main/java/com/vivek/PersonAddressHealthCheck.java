package com.vivek;

import com.codahale.metrics.health.HealthCheck;

public class PersonAddressHealthCheck extends HealthCheck {

	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
