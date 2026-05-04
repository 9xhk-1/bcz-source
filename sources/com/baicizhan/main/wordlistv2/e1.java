package com.baicizhan.main.wordlistv2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.wordlistv2.repo.OrderType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f27867e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f27868a = new MutableLiveData<>();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f27869b = new MutableLiveData<>(0);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f27870c = new MutableLiveData<>(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<OrderType> f27871d = new MutableLiveData<>();

    @m80.k
    public final MutableLiveData<Boolean> a() {
        return this.f27870c;
    }

    @m80.k
    public final MutableLiveData<Integer> b() {
        return this.f27869b;
    }

    @m80.k
    public final MutableLiveData<OrderType> c() {
        return this.f27871d;
    }

    @m80.k
    public final MutableLiveData<Integer> d() {
        return this.f27868a;
    }
}
