package xa;

import android.view.LayoutInflater;
import android.widget.Toast;
import com.baicizhan.client.business.managers.winningstreak.d;
import com.jiongji.andriod.card.R;
import gs.po;
import kotlin.jvm.internal.g0;
import m80.k;
import va.h;
import x00.l;
import xb.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {
    public static final void b(@k d win) {
        g0.p(win, "win");
        final String string = g0.g(win, d.c.f16515b) ? pb.a.a().getString(R.string.winning_streak_win_other_day) : win instanceof d.C0269d ? pb.a.a().getString(R.string.winning_streak_win_today, Integer.valueOf(((d.C0269d) win).d())) : null;
        if (string != null) {
            h.a(new l() { // from class: xa.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 c11;
                    c11 = b.c(string, (Toast) obj);
                    return c11;
                }
            });
        }
    }

    public static final g2 c(String str, Toast customizedToast) {
        g0.p(customizedToast, "$this$customizedToast");
        customizedToast.setDuration(1);
        po d11 = po.d(LayoutInflater.from(pb.a.a()));
        d11.f56419a.setText(str);
        customizedToast.setView(d11.getRoot());
        customizedToast.setGravity(48, 0, 0);
        customizedToast.setMargin(f.a(pb.a.a(), 16.0f), 0.0f);
        return g2.f100423a;
    }
}
