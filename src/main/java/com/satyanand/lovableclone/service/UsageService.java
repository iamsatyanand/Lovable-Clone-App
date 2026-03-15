package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.subscription.PlanLimitsResponse;
import com.satyanand.lovableclone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
