package kc;

import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.State;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final int f66448a = 255;

    /* renamed from: b, reason: collision with root package name */
    public static final int f66449b = 65280;

    public static final int a(@m80.k Location location, @m80.k State s11) {
        g0.p(location, "<this>");
        g0.p(s11, "s");
        return location.ordinal() | (s11.ordinal() << 8);
    }

    public static final int b(@m80.k State state, @m80.k Location l11) {
        g0.p(state, "<this>");
        g0.p(l11, "l");
        return (state.ordinal() << 8) | l11.ordinal();
    }

    @m80.k
    public static final Location c(int i11) {
        return Location.values()[i11 & 255];
    }

    @m80.k
    public static final State d(int i11) {
        return State.values()[(i11 & 65280) >> 8];
    }
}
