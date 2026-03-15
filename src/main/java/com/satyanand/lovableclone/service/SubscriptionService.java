package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.subscription.CheckoutRequest;
import com.satyanand.lovableclone.dto.subscription.CheckoutResponse;
import com.satyanand.lovableclone.dto.subscription.PortalResponse;
import com.satyanand.lovableclone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
