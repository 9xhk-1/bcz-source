package com.baicizhan.main.operate.share_code;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ButtonInfo implements NoProguard {
    public static final int $stable = 0;

    @l
    private final String action;

    @l
    private final String text;

    public ButtonInfo(@l String str, @l String str2) {
        this.text = str;
        this.action = str2;
    }

    public static /* synthetic */ ButtonInfo copy$default(ButtonInfo buttonInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonInfo.text;
        }
        if ((i11 & 2) != 0) {
            str2 = buttonInfo.action;
        }
        return buttonInfo.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.text;
    }

    @l
    public final String component2() {
        return this.action;
    }

    @k
    public final ButtonInfo copy(@l String str, @l String str2) {
        return new ButtonInfo(str, str2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonInfo)) {
            return false;
        }
        ButtonInfo buttonInfo = (ButtonInfo) obj;
        return g0.g(this.text, buttonInfo.text) && g0.g(this.action, buttonInfo.action);
    }

    @l
    public final String getAction() {
        return this.action;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ButtonInfo(text=" + this.text + ", action=" + this.action + j.f81007d;
    }
}
