package com.baicizhan.main.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AdItem implements NoProguard {
    public static final int $stable = 8;

    @l
    private String image;

    @l
    private String link;

    @l
    private String report;

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getLink() {
        return this.link;
    }

    @l
    public final String getReport() {
        return this.report;
    }

    public final void setImage(@l String str) {
        this.image = str;
    }

    public final void setLink(@l String str) {
        this.link = str;
    }

    public final void setReport(@l String str) {
        this.report = str;
    }
}
