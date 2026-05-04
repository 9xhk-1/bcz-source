package com.baicizhan.client.business.dataset.models;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ZExtension {
    public static final int $stable = 8;

    @k
    @c(TtmlNode.BOLD)
    private final List<String> bold;

    @k
    @c("order")
    private final List<Integer> order;

    /* JADX WARN: Multi-variable type inference failed */
    public ZExtension() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @k
    public final List<String> getBold() {
        return this.bold;
    }

    @k
    public final List<Integer> getOrder() {
        return this.order;
    }

    public ZExtension(@k List<Integer> order, @k List<String> bold) {
        g0.p(order, "order");
        g0.p(bold, "bold");
        this.order = order;
        this.bold = bold;
    }

    public /* synthetic */ ZExtension(List list, List list2, int i11, v vVar) {
        this((i11 & 1) != 0 ? h0.J() : list, (i11 & 2) != 0 ? h0.J() : list2);
    }
}
