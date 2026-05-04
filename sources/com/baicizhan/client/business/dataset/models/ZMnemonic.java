package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZMnemonic {
    public static final int $stable = 0;

    @l
    @c("content")
    private final String content;

    @l
    @c("imgContent")
    private final String imgContent;

    @c("type")
    private final int type;

    public ZMnemonic(int i11, @l String str, @l String str2) {
        this.type = i11;
        this.content = str;
        this.imgContent = str2;
    }

    public static /* synthetic */ ZMnemonic copy$default(ZMnemonic zMnemonic, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = zMnemonic.type;
        }
        if ((i12 & 2) != 0) {
            str = zMnemonic.content;
        }
        if ((i12 & 4) != 0) {
            str2 = zMnemonic.imgContent;
        }
        return zMnemonic.copy(i11, str, str2);
    }

    public final int component1() {
        return this.type;
    }

    @l
    public final String component2() {
        return this.content;
    }

    @l
    public final String component3() {
        return this.imgContent;
    }

    @k
    public final ZMnemonic copy(int i11, @l String str, @l String str2) {
        return new ZMnemonic(i11, str, str2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZMnemonic)) {
            return false;
        }
        ZMnemonic zMnemonic = (ZMnemonic) obj;
        return this.type == zMnemonic.type && g0.g(this.content, zMnemonic.content) && g0.g(this.imgContent, zMnemonic.imgContent);
    }

    @l
    public final String getContent() {
        return this.content;
    }

    @l
    public final String getImgContent() {
        return this.imgContent;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.type) * 31;
        String str = this.content;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgContent;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ZMnemonic(type=" + this.type + ", content=" + this.content + ", imgContent=" + this.imgContent + j.f81007d;
    }
}
