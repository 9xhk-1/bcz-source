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
public final class Action {
    public static final int $stable = 0;

    @k
    private final String action;

    @k
    private final String color;

    @k
    private final Extra extra;

    @k
    private final String text;

    public Action(@k String text, @k String color, @k String action, @k Extra extra) {
        g0.p(text, "text");
        g0.p(color, "color");
        g0.p(action, "action");
        g0.p(extra, "extra");
        this.text = text;
        this.color = color;
        this.action = action;
        this.extra = extra;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, Extra extra, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = action.text;
        }
        if ((i11 & 2) != 0) {
            str2 = action.color;
        }
        if ((i11 & 4) != 0) {
            str3 = action.action;
        }
        if ((i11 & 8) != 0) {
            extra = action.extra;
        }
        return action.copy(str, str2, str3, extra);
    }

    @k
    public final String component1() {
        return this.text;
    }

    @k
    public final String component2() {
        return this.color;
    }

    @k
    public final String component3() {
        return this.action;
    }

    @k
    public final Extra component4() {
        return this.extra;
    }

    @k
    public final Action copy(@k String text, @k String color, @k String action, @k Extra extra) {
        g0.p(text, "text");
        g0.p(color, "color");
        g0.p(action, "action");
        g0.p(extra, "extra");
        return new Action(text, color, action, extra);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return g0.g(this.text, action.text) && g0.g(this.color, action.color) && g0.g(this.action, action.action) && g0.g(this.extra, action.extra);
    }

    @k
    public final String getAction() {
        return this.action;
    }

    @k
    public final String getColor() {
        return this.color;
    }

    @k
    public final Extra getExtra() {
        return this.extra;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + this.action.hashCode()) * 31) + this.extra.hashCode();
    }

    @k
    public String toString() {
        return "Action(text=" + this.text + ", color=" + this.color + ", action=" + this.action + ", extra=" + this.extra + j.f81007d;
    }
}
