package lg;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.home.plan.WordPlanFragment;
import com.baicizhan.main.home.plan.a3;
import zf.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class a<T, VH extends zf.d> extends zf.b<T, VH> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f71210g = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@m80.k androidx.lifecycle.LifecycleOwner r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof com.baicizhan.main.home.plan.WordPlanFragment
            r1 = 0
            if (r0 == 0) goto Le
            r0 = r3
            com.baicizhan.main.home.plan.WordPlanFragment r0 = (com.baicizhan.main.home.plan.WordPlanFragment) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L15
            androidx.lifecycle.LifecycleRegistry r1 = r0.R0()
        L15:
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.a.<init>(androidx.lifecycle.LifecycleOwner):void");
    }

    @m80.l
    public final a3 C() {
        LifecycleOwner q11 = q();
        WordPlanFragment wordPlanFragment = q11 instanceof WordPlanFragment ? (WordPlanFragment) q11 : null;
        if (wordPlanFragment != null) {
            return wordPlanFragment.Y0();
        }
        return null;
    }
}
