package kc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.R;
import com.baicizhan.framework.common.magicdialog.State;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class i extends e {
    public final int B = R.style.MagicDefault_Options;
    public final int C = R.attr.magicOptionsAppearance;
    public final int D = v.a(Location.BOTTOM, State.FULL);

    @Override // kc.g
    public int D() {
        return this.C;
    }

    @Override // kc.g
    public int G() {
        return this.D;
    }

    @Override // kc.d
    @m80.l
    public final View V(@m80.k LayoutInflater inflater) {
        String string;
        g0.p(inflater, "inflater");
        lc.b c11 = lc.b.c(inflater);
        TextView title = c11.f71048c;
        g0.o(title, "title");
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null && (string = arguments.getString("title")) != null && !k0.O3(string)) {
            str = string;
        }
        am.a.f(title, str);
        Space topSpacing = c11.f71049d;
        g0.o(topSpacing, "topSpacing");
        TextView title2 = c11.f71048c;
        g0.o(title2, "title");
        am.a.o(topSpacing, !am.a.d(title2));
        View i02 = i0(inflater);
        if (i02 != null) {
            c11.f71047b.addView(i02);
        }
        return c11.getRoot();
    }

    @m80.l
    public abstract View i0(@m80.k LayoutInflater layoutInflater);

    @Override // kc.h
    public int x() {
        Integer t11 = mc.b.t(this, R.attr.magicAnimation);
        return t11 == null ? R.style.OptionDialogAnimation : t11.intValue();
    }

    @Override // kc.h
    public int z() {
        return this.B;
    }
}
