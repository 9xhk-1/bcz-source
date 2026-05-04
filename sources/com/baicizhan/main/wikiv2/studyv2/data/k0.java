package com.baicizhan.main.wikiv2.studyv2.data;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class k0 extends y implements l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f26060h = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f26061c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Uri f26062d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26063e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f26064f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f26065g;

    public /* synthetic */ k0(String str, Uri uri, boolean z11, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, int i11, kotlin.jvm.internal.v vVar) {
        this(str, uri, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new MutableLiveData() : mutableLiveData, (i11 & 16) != 0 ? new MutableLiveData() : mutableLiveData2);
    }

    public static /* synthetic */ k0 k(k0 k0Var, String str, Uri uri, boolean z11, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = k0Var.f26061c;
        }
        if ((i11 & 2) != 0) {
            uri = k0Var.f26062d;
        }
        if ((i11 & 4) != 0) {
            z11 = k0Var.f26063e;
        }
        if ((i11 & 8) != 0) {
            mutableLiveData = k0Var.f26064f;
        }
        if ((i11 & 16) != 0) {
            mutableLiveData2 = k0Var.f26065g;
        }
        MutableLiveData mutableLiveData3 = mutableLiveData2;
        boolean z12 = z11;
        return k0Var.j(str, uri, z12, mutableLiveData, mutableLiveData3);
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.l0
    @m80.k
    public MutableLiveData<Boolean> a() {
        return this.f26064f;
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.l0
    public void b(boolean z11) {
        this.f26063e = z11;
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.l0
    @m80.k
    public MutableLiveData<Boolean> c() {
        return this.f26065g;
    }

    @m80.k
    public final String e() {
        return this.f26061c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.g0.g(this.f26061c, k0Var.f26061c) && kotlin.jvm.internal.g0.g(this.f26062d, k0Var.f26062d) && this.f26063e == k0Var.f26063e && kotlin.jvm.internal.g0.g(this.f26064f, k0Var.f26064f) && kotlin.jvm.internal.g0.g(this.f26065g, k0Var.f26065g);
    }

    @m80.k
    public final Uri f() {
        return this.f26062d;
    }

    public final boolean g() {
        return this.f26063e;
    }

    @m80.k
    public final MutableLiveData<Boolean> h() {
        return this.f26064f;
    }

    public int hashCode() {
        return (((((((this.f26061c.hashCode() * 31) + this.f26062d.hashCode()) * 31) + Boolean.hashCode(this.f26063e)) * 31) + this.f26064f.hashCode()) * 31) + this.f26065g.hashCode();
    }

    @m80.k
    public final MutableLiveData<Boolean> i() {
        return this.f26065g;
    }

    @Override // com.baicizhan.main.wikiv2.studyv2.data.l0
    public boolean isPlaying() {
        return this.f26063e;
    }

    @m80.k
    public final k0 j(@m80.k String tvPath, @m80.k Uri tvSnapshot, boolean z11, @m80.k MutableLiveData<Boolean> playStatus, @m80.k MutableLiveData<Boolean> fullscreenStatus) {
        kotlin.jvm.internal.g0.p(tvPath, "tvPath");
        kotlin.jvm.internal.g0.p(tvSnapshot, "tvSnapshot");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        kotlin.jvm.internal.g0.p(fullscreenStatus, "fullscreenStatus");
        return new k0(tvPath, tvSnapshot, z11, playStatus, fullscreenStatus);
    }

    @m80.k
    public final String l() {
        return this.f26061c;
    }

    @m80.k
    public final Uri m() {
        return this.f26062d;
    }

    @m80.k
    public String toString() {
        return "Tv(tvPath=" + this.f26061c + ", tvSnapshot=" + this.f26062d + ", isPlaying=" + this.f26063e + ", playStatus=" + this.f26064f + ", fullscreenStatus=" + this.f26065g + pn.j.f81007d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@m80.k String tvPath, @m80.k Uri tvSnapshot, boolean z11, @m80.k MutableLiveData<Boolean> playStatus, @m80.k MutableLiveData<Boolean> fullscreenStatus) {
        super(m0.f26071e);
        kotlin.jvm.internal.g0.p(tvPath, "tvPath");
        kotlin.jvm.internal.g0.p(tvSnapshot, "tvSnapshot");
        kotlin.jvm.internal.g0.p(playStatus, "playStatus");
        kotlin.jvm.internal.g0.p(fullscreenStatus, "fullscreenStatus");
        this.f26061c = tvPath;
        this.f26062d = tvSnapshot;
        this.f26063e = z11;
        this.f26064f = playStatus;
        this.f26065g = fullscreenStatus;
    }
}
