package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZVariant {
    public static final int $stable = 0;

    @k
    @c("type")
    private final String type;

    @c("vId")
    private final long vId;

    @k
    @c(t.f26103e)
    private final String variant;

    public ZVariant(long j11, @k String type, @k String variant) {
        g0.p(type, "type");
        g0.p(variant, "variant");
        this.vId = j11;
        this.type = type;
        this.variant = variant;
    }

    public static /* synthetic */ ZVariant copy$default(ZVariant zVariant, long j11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zVariant.vId;
        }
        if ((i11 & 2) != 0) {
            str = zVariant.type;
        }
        if ((i11 & 4) != 0) {
            str2 = zVariant.variant;
        }
        return zVariant.copy(j11, str, str2);
    }

    public final long component1() {
        return this.vId;
    }

    @k
    public final String component2() {
        return this.type;
    }

    @k
    public final String component3() {
        return this.variant;
    }

    @k
    public final ZVariant copy(long j11, @k String type, @k String variant) {
        g0.p(type, "type");
        g0.p(variant, "variant");
        return new ZVariant(j11, type, variant);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZVariant)) {
            return false;
        }
        ZVariant zVariant = (ZVariant) obj;
        return this.vId == zVariant.vId && g0.g(this.type, zVariant.type) && g0.g(this.variant, zVariant.variant);
    }

    @k
    public final String getType() {
        return this.type;
    }

    public final long getVId() {
        return this.vId;
    }

    @k
    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (((Long.hashCode(this.vId) * 31) + this.type.hashCode()) * 31) + this.variant.hashCode();
    }

    @k
    public String toString() {
        return "ZVariant(vId=" + this.vId + ", type=" + this.type + ", variant=" + this.variant + j.f81007d;
    }
}
