package com.baicizhan.main.home.plan.module.exam;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class Extra {
    public static final int $stable = 0;

    @l
    private final String content;

    @l
    private final String link;

    @l
    private final String title;

    public Extra(@l String str, @l String str2, @l String str3) {
        this.title = str;
        this.content = str2;
        this.link = str3;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = extra.title;
        }
        if ((i11 & 2) != 0) {
            str2 = extra.content;
        }
        if ((i11 & 4) != 0) {
            str3 = extra.link;
        }
        return extra.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.title;
    }

    @l
    public final String component2() {
        return this.content;
    }

    @l
    public final String component3() {
        return this.link;
    }

    @k
    public final Extra copy(@l String str, @l String str2, @l String str3) {
        return new Extra(str, str2, str3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return g0.g(this.title, extra.title) && g0.g(this.content, extra.content) && g0.g(this.link, extra.link);
    }

    @l
    public final String getContent() {
        return this.content;
    }

    @l
    public final String getLink() {
        return this.link;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Extra(title=" + this.title + ", content=" + this.content + ", link=" + this.link + j.f81007d;
    }
}
