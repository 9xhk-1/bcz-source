package com.baicizhan.client.business.util;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SpannableWrapper {
    public static final int $stable = 8;
    private int end;
    private boolean isBold;

    @m80.l
    private x00.l<? super View, g2> onClick;
    private int start;

    @m80.k
    private String content = "";
    private int textColor = -1;
    private int sizeDp = -1;

    @m80.k
    public final String getContent() {
        return this.content;
    }

    public final int getEnd() {
        return this.end;
    }

    @m80.l
    public final x00.l<View, g2> getOnClick() {
        return this.onClick;
    }

    public final int getSizeDp() {
        return this.sizeDp;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final void setBold(boolean z11) {
        this.isBold = z11;
    }

    public final void setContent(@m80.k String str) {
        g0.p(str, "<set-?>");
        this.content = str;
    }

    public final void setEnd(int i11) {
        this.end = i11;
    }

    public final void setOnClick(@m80.l x00.l<? super View, g2> lVar) {
        this.onClick = lVar;
    }

    public final void setSizeDp(int i11) {
        this.sizeDp = i11;
    }

    public final void setStart(int i11) {
        this.start = i11;
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
    }
}
