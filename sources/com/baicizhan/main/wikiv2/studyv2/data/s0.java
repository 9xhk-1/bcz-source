package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26097b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f26098a;

    public s0(@m80.k List<String> tabList) {
        kotlin.jvm.internal.g0.p(tabList, "tabList");
        this.f26098a = tabList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s0 c(s0 s0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = s0Var.f26098a;
        }
        return s0Var.b(list);
    }

    @m80.k
    public final List<String> a() {
        return this.f26098a;
    }

    @m80.k
    public final s0 b(@m80.k List<String> tabList) {
        kotlin.jvm.internal.g0.p(tabList, "tabList");
        return new s0(tabList);
    }

    @m80.k
    public final List<String> d() {
        return this.f26098a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && kotlin.jvm.internal.g0.g(this.f26098a, ((s0) obj).f26098a);
    }

    public int hashCode() {
        return this.f26098a.hashCode();
    }

    @m80.k
    public String toString() {
        return "WikiFlowRadioArray(tabList=" + this.f26098a + pn.j.f81007d;
    }
}
