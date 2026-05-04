package com.baicizhan.main.home.plan;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.notify.NotifyResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21900b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final NotifyResult f21901a;

    public a(@m80.k NotifyResult notify) {
        kotlin.jvm.internal.g0.p(notify, "notify");
        this.f21901a = notify;
    }

    public static /* synthetic */ a c(a aVar, NotifyResult notifyResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notifyResult = aVar.f21901a;
        }
        return aVar.b(notifyResult);
    }

    @m80.k
    public final NotifyResult a() {
        return this.f21901a;
    }

    @m80.k
    public final a b(@m80.k NotifyResult notify) {
        kotlin.jvm.internal.g0.p(notify, "notify");
        return new a(notify);
    }

    @m80.k
    public final NotifyResult d() {
        return this.f21901a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f21901a, ((a) obj).f21901a);
    }

    public int hashCode() {
        return this.f21901a.hashCode();
    }

    @m80.k
    public String toString() {
        return "Advertisement(notify=" + this.f21901a + pn.j.f81007d;
    }
}
