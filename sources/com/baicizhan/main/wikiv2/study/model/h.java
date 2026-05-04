package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class h extends e {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25900h = 8;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f25901c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f25902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25903e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MutableLiveData<Boolean> f25904f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final MutableLiveData<Boolean> f25905g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@k String tvPath, @k String tvSnapshot) {
        super(R.string.wiki_item_title_tv);
        g0.p(tvPath, "tvPath");
        g0.p(tvSnapshot, "tvSnapshot");
        this.f25901c = tvPath;
        this.f25902d = tvSnapshot;
        this.f25904f = new SingleLiveEvent();
        this.f25905g = new SingleLiveEvent();
    }

    @k
    public final MutableLiveData<Boolean> b() {
        return this.f25905g;
    }

    public final boolean c() {
        return this.f25903e;
    }

    @k
    public final String d() {
        return this.f25901c;
    }

    @k
    public final String e() {
        return this.f25902d;
    }

    public final void f(boolean z11) {
        this.f25903e = z11;
    }

    @k
    public final MutableLiveData<Boolean> h() {
        return this.f25904f;
    }
}
