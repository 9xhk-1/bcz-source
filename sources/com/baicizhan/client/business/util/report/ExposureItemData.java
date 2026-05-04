package com.baicizhan.client.business.util.report;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExposureItemData {
    public static final int $stable = 8;

    @k
    private final Object data;
    private final int position;

    public ExposureItemData(@k Object data, int i11) {
        g0.p(data, "data");
        this.data = data;
        this.position = i11;
    }

    public static /* synthetic */ ExposureItemData copy$default(ExposureItemData exposureItemData, Object obj, int i11, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = exposureItemData.data;
        }
        if ((i12 & 2) != 0) {
            i11 = exposureItemData.position;
        }
        return exposureItemData.copy(obj, i11);
    }

    @k
    public final Object component1() {
        return this.data;
    }

    public final int component2() {
        return this.position;
    }

    @k
    public final ExposureItemData copy(@k Object data, int i11) {
        g0.p(data, "data");
        return new ExposureItemData(data, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposureItemData)) {
            return false;
        }
        ExposureItemData exposureItemData = (ExposureItemData) obj;
        return g0.g(this.data, exposureItemData.data) && this.position == exposureItemData.position;
    }

    @k
    public final Object getData() {
        return this.data;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Integer.hashCode(this.position);
    }

    @k
    public String toString() {
        return "ExposureItemData(data=" + this.data + ", position=" + this.position + j.f81007d;
    }
}
