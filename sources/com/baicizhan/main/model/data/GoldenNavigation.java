package com.baicizhan.main.model.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import zg.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GoldenNavigation {
    public static final int $stable = 8;

    @k
    private final List<a> items;

    /* JADX WARN: Multi-variable type inference failed */
    public GoldenNavigation(@k List<? extends a> items) {
        g0.p(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldenNavigation copy$default(GoldenNavigation goldenNavigation, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = goldenNavigation.items;
        }
        return goldenNavigation.copy(list);
    }

    @k
    public final List<a> component1() {
        return this.items;
    }

    @k
    public final GoldenNavigation copy(@k List<? extends a> items) {
        g0.p(items, "items");
        return new GoldenNavigation(items);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoldenNavigation) && g0.g(this.items, ((GoldenNavigation) obj).items);
    }

    @k
    public final List<a> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @k
    public String toString() {
        return "GoldenNavigation(items=" + this.items + j.f81007d;
    }
}
