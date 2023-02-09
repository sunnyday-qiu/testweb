package com.sunnyday.multitenant.intercepter;

import com.sunnyday.multitenant.resolver.TenantIdResolver;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class TenantIdInterceptor implements HandlerInterceptor {

    private final TenantIdResolver tenantIdResolver;

    public TenantIdInterceptor(TenantIdResolver tenantIdResolver) {
        this.tenantIdResolver = tenantIdResolver;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        tenantIdResolver.setCurrentTenant(request.getHeader("x-tenant-id"));
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
