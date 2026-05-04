package com.baicizhan.client.business.webview.hwpay.db.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Entity(tableName = "hw_pay_order")
/* loaded from: classes4.dex */
public final class HwPayOrderInfo {
    public static final int $stable = 0;

    @ColumnInfo(name = "count")
    private final int count;

    @ColumnInfo(name = "extra")
    @k
    private final String extra;

    @PrimaryKey
    @ColumnInfo(name = "product_id")
    @k
    private final String productId;

    @ColumnInfo(name = "product_type")
    private final int productType;

    @ColumnInfo(name = "sub_item_id")
    private final int subitemId;

    public HwPayOrderInfo(@k String productId, int i11, int i12, int i13, @k String extra) {
        g0.p(productId, "productId");
        g0.p(extra, "extra");
        this.productId = productId;
        this.productType = i11;
        this.count = i12;
        this.subitemId = i13;
        this.extra = extra;
    }

    public static /* synthetic */ HwPayOrderInfo copy$default(HwPayOrderInfo hwPayOrderInfo, String str, int i11, int i12, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hwPayOrderInfo.productId;
        }
        if ((i14 & 2) != 0) {
            i11 = hwPayOrderInfo.productType;
        }
        if ((i14 & 4) != 0) {
            i12 = hwPayOrderInfo.count;
        }
        if ((i14 & 8) != 0) {
            i13 = hwPayOrderInfo.subitemId;
        }
        if ((i14 & 16) != 0) {
            str2 = hwPayOrderInfo.extra;
        }
        String str3 = str2;
        int i15 = i12;
        return hwPayOrderInfo.copy(str, i11, i15, i13, str3);
    }

    @k
    public final String component1() {
        return this.productId;
    }

    public final int component2() {
        return this.productType;
    }

    public final int component3() {
        return this.count;
    }

    public final int component4() {
        return this.subitemId;
    }

    @k
    public final String component5() {
        return this.extra;
    }

    @k
    public final HwPayOrderInfo copy(@k String productId, int i11, int i12, int i13, @k String extra) {
        g0.p(productId, "productId");
        g0.p(extra, "extra");
        return new HwPayOrderInfo(productId, i11, i12, i13, extra);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HwPayOrderInfo)) {
            return false;
        }
        HwPayOrderInfo hwPayOrderInfo = (HwPayOrderInfo) obj;
        return g0.g(this.productId, hwPayOrderInfo.productId) && this.productType == hwPayOrderInfo.productType && this.count == hwPayOrderInfo.count && this.subitemId == hwPayOrderInfo.subitemId && g0.g(this.extra, hwPayOrderInfo.extra);
    }

    public final int getCount() {
        return this.count;
    }

    @k
    public final String getExtra() {
        return this.extra;
    }

    @k
    public final String getProductId() {
        return this.productId;
    }

    public final int getProductType() {
        return this.productType;
    }

    public final int getSubitemId() {
        return this.subitemId;
    }

    public int hashCode() {
        return (((((((this.productId.hashCode() * 31) + Integer.hashCode(this.productType)) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.subitemId)) * 31) + this.extra.hashCode();
    }

    @k
    public String toString() {
        return "HwPayOrderInfo(productId=" + this.productId + ", productType=" + this.productType + ", count=" + this.count + ", subitemId=" + this.subitemId + ", extra=" + this.extra + j.f81007d;
    }
}
