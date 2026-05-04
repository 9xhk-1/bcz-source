package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26124b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f26125a;

    public w0(@m80.k List<String> tabList) {
        kotlin.jvm.internal.g0.p(tabList, "tabList");
        this.f26125a = tabList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w0 c(w0 w0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = w0Var.f26125a;
        }
        return w0Var.b(list);
    }

    @m80.k
    public final List<String> a() {
        return this.f26125a;
    }

    @m80.k
    public final w0 b(@m80.k List<String> tabList) {
        kotlin.jvm.internal.g0.p(tabList, "tabList");
        return new w0(tabList);
    }

    @m80.k
    public final List<String> d() {
        return this.f26125a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && kotlin.jvm.internal.g0.g(this.f26125a, ((w0) obj).f26125a);
    }

    public int hashCode() {
        return this.f26125a.hashCode();
    }

    @m80.k
    public String toString() {
        return "WikiTabArray(tabList=" + this.f26125a + pn.j.f81007d;
    }
}
