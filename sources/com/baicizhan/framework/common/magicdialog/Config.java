package com.baicizhan.framework.common.magicdialog;

import android.content.Context;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class Config implements Serializable {

    @k
    public static final a Companion = new a(null);

    @l
    private final Action actionCancel;

    @l
    private final Action actionNeutral;

    @l
    private final Action actionOk;

    @k
    private final CharSequence cancel;

    @l
    private final CharSequence neutral;

    /* renamed from: ok, reason: collision with root package name */
    @k
    private final CharSequence f17793ok;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Config a(@k Context context, @l CharSequence charSequence) {
            g0.p(context, "context");
            if (charSequence == null) {
                charSequence = context.getString(R.string.dialog_btn_cancel);
                g0.o(charSequence, "context.getString(R.string.dialog_btn_cancel)");
            }
            CharSequence charSequence2 = charSequence;
            String string = context.getString(R.string.dialog_btn_ok);
            g0.o(string, "context.getString(R.string.dialog_btn_ok)");
            return new Config(charSequence2, string, null, null, null, null, 60, null);
        }

        @k
        public final Config b(@k Context context, @l CharSequence charSequence) {
            g0.p(context, "context");
            String string = context.getString(R.string.dialog_btn_cancel);
            g0.o(string, "context.getString(R.string.dialog_btn_cancel)");
            String string2 = context.getString(R.string.dialog_btn_ok);
            g0.o(string2, "context.getString(R.string.dialog_btn_ok)");
            return new Config(string, string2, charSequence, null, null, null, 56, null);
        }

        @k
        public final Config c(@k Context context) {
            g0.p(context, "context");
            String string = context.getString(R.string.dialog_btn_cancel);
            g0.o(string, "context.getString(R.string.dialog_btn_cancel)");
            String string2 = context.getString(R.string.dialog_btn_ok);
            g0.o(string2, "context.getString(R.string.dialog_btn_ok)");
            return new Config(string, string2, null, null, null, null, 60, null);
        }

        @k
        public final Config d(@k Context context, @l CharSequence charSequence, @l Action action) {
            g0.p(context, "context");
            String string = context.getString(R.string.dialog_btn_cancel);
            g0.o(string, "context.getString(R.string.dialog_btn_cancel)");
            if (charSequence == null) {
                charSequence = context.getString(R.string.dialog_btn_ok);
                g0.o(charSequence, "context.getString(R.string.dialog_btn_ok)");
            }
            return new Config(string, charSequence, null, null, action, null, 44, null);
        }

        public a() {
        }
    }

    public Config(@k CharSequence cancel, @k CharSequence ok2, @l CharSequence charSequence, @l Action action, @l Action action2, @l Action action3) {
        g0.p(cancel, "cancel");
        g0.p(ok2, "ok");
        this.cancel = cancel;
        this.f17793ok = ok2;
        this.neutral = charSequence;
        this.actionCancel = action;
        this.actionOk = action2;
        this.actionNeutral = action3;
    }

    public static /* synthetic */ Config copy$default(Config config, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Action action, Action action2, Action action3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = config.cancel;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = config.f17793ok;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = config.neutral;
        }
        if ((i11 & 8) != 0) {
            action = config.actionCancel;
        }
        if ((i11 & 16) != 0) {
            action2 = config.actionOk;
        }
        if ((i11 & 32) != 0) {
            action3 = config.actionNeutral;
        }
        Action action4 = action2;
        Action action5 = action3;
        return config.copy(charSequence, charSequence2, charSequence3, action, action4, action5);
    }

    @k
    public final CharSequence component1() {
        return this.cancel;
    }

    @k
    public final CharSequence component2() {
        return this.f17793ok;
    }

    @l
    public final CharSequence component3() {
        return this.neutral;
    }

    @l
    public final Action component4() {
        return this.actionCancel;
    }

    @l
    public final Action component5() {
        return this.actionOk;
    }

    @l
    public final Action component6() {
        return this.actionNeutral;
    }

    @k
    public final Config copy(@k CharSequence cancel, @k CharSequence ok2, @l CharSequence charSequence, @l Action action, @l Action action2, @l Action action3) {
        g0.p(cancel, "cancel");
        g0.p(ok2, "ok");
        return new Config(cancel, ok2, charSequence, action, action2, action3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return g0.g(this.cancel, config.cancel) && g0.g(this.f17793ok, config.f17793ok) && g0.g(this.neutral, config.neutral) && this.actionCancel == config.actionCancel && this.actionOk == config.actionOk && this.actionNeutral == config.actionNeutral;
    }

    @l
    public final Action getActionCancel() {
        return this.actionCancel;
    }

    @l
    public final Action getActionNeutral() {
        return this.actionNeutral;
    }

    @l
    public final Action getActionOk() {
        return this.actionOk;
    }

    @k
    public final CharSequence getCancel() {
        return this.cancel;
    }

    @l
    public final CharSequence getNeutral() {
        return this.neutral;
    }

    @k
    public final CharSequence getOk() {
        return this.f17793ok;
    }

    public int hashCode() {
        int hashCode = ((this.cancel.hashCode() * 31) + this.f17793ok.hashCode()) * 31;
        CharSequence charSequence = this.neutral;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Action action = this.actionCancel;
        int hashCode3 = (hashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.actionOk;
        int hashCode4 = (hashCode3 + (action2 == null ? 0 : action2.hashCode())) * 31;
        Action action3 = this.actionNeutral;
        return hashCode4 + (action3 != null ? action3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Config(cancel=" + ((Object) this.cancel) + ", ok=" + ((Object) this.f17793ok) + ", neutral=" + ((Object) this.neutral) + ", actionCancel=" + this.actionCancel + ", actionOk=" + this.actionOk + ", actionNeutral=" + this.actionNeutral + ')';
    }

    public /* synthetic */ Config(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Action action, Action action2, Action action3, int i11, v vVar) {
        this(charSequence, charSequence2, (i11 & 4) != 0 ? null : charSequence3, (i11 & 8) != 0 ? null : action, (i11 & 16) != 0 ? null : action2, (i11 & 32) != 0 ? null : action3);
    }
}
