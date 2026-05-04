package com.huawei.hms.common.internal;

import fr.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f35595a;

    /* renamed from: b, reason: collision with root package name */
    private final l<TResult> f35596b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, l<TResult> lVar) {
        super(1);
        this.f35595a = taskApiCall;
        this.f35596b = lVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f35595a;
    }

    public l<TResult> getTaskCompletionSource() {
        return this.f35596b;
    }
}
