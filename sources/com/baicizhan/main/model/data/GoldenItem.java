package com.baicizhan.main.model.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import zg.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GoldenItem {
    public static final int $stable = 0;
    private final int aid;

    @k
    private final String icon;

    @k
    private final String intent;
    private final int itemType;

    @k
    private final String name;
    private final int type;

    public GoldenItem(int i11, @k String icon, @k String name, int i12, @d int i13, @k String intent) {
        g0.p(icon, "icon");
        g0.p(name, "name");
        g0.p(intent, "intent");
        this.aid = i11;
        this.icon = icon;
        this.name = name;
        this.itemType = i12;
        this.type = i13;
        this.intent = intent;
    }

    public static /* synthetic */ GoldenItem copy$default(GoldenItem goldenItem, int i11, String str, String str2, int i12, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = goldenItem.aid;
        }
        if ((i14 & 2) != 0) {
            str = goldenItem.icon;
        }
        if ((i14 & 4) != 0) {
            str2 = goldenItem.name;
        }
        if ((i14 & 8) != 0) {
            i12 = goldenItem.itemType;
        }
        if ((i14 & 16) != 0) {
            i13 = goldenItem.type;
        }
        if ((i14 & 32) != 0) {
            str3 = goldenItem.intent;
        }
        int i15 = i13;
        String str4 = str3;
        return goldenItem.copy(i11, str, str2, i12, i15, str4);
    }

    public final int component1() {
        return this.aid;
    }

    @k
    public final String component2() {
        return this.icon;
    }

    @k
    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.itemType;
    }

    public final int component5() {
        return this.type;
    }

    @k
    public final String component6() {
        return this.intent;
    }

    @k
    public final GoldenItem copy(int i11, @k String icon, @k String name, int i12, @d int i13, @k String intent) {
        g0.p(icon, "icon");
        g0.p(name, "name");
        g0.p(intent, "intent");
        return new GoldenItem(i11, icon, name, i12, i13, intent);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoldenItem)) {
            return false;
        }
        GoldenItem goldenItem = (GoldenItem) obj;
        return this.aid == goldenItem.aid && g0.g(this.icon, goldenItem.icon) && g0.g(this.name, goldenItem.name) && this.itemType == goldenItem.itemType && this.type == goldenItem.type && g0.g(this.intent, goldenItem.intent);
    }

    public final int getAid() {
        return this.aid;
    }

    @k
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final String getIntent() {
        return this.intent;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.aid) * 31) + this.icon.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.itemType)) * 31) + Integer.hashCode(this.type)) * 31) + this.intent.hashCode();
    }

    @k
    public String toString() {
        return "GoldenItem(aid=" + this.aid + ", icon=" + this.icon + ", name=" + this.name + ", itemType=" + this.itemType + ", type=" + this.type + ", intent=" + this.intent + j.f81007d;
    }
}
