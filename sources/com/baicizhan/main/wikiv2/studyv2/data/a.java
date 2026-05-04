package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26011b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<b0> f26012a;

    public a(@m80.k List<b0> allMean) {
        kotlin.jvm.internal.g0.p(allMean, "allMean");
        this.f26012a = allMean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a c(a aVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aVar.f26012a;
        }
        return aVar.b(list);
    }

    @m80.k
    public final List<b0> a() {
        return this.f26012a;
    }

    @m80.k
    public final a b(@m80.k List<b0> allMean) {
        kotlin.jvm.internal.g0.p(allMean, "allMean");
        return new a(allMean);
    }

    @m80.k
    public final List<b0> d() {
        return this.f26012a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f26012a, ((a) obj).f26012a);
    }

    public int hashCode() {
        return this.f26012a.hashCode();
    }

    @m80.k
    public String toString() {
        return "AllMeans(allMean=" + this.f26012a + pn.j.f81007d;
    }
}
