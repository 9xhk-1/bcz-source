package bj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.a0;
import com.baicizhan.main.wikiv2.studyv2.data.f0;
import com.baicizhan.main.wikiv2.studyv2.data.h0;
import com.baicizhan.main.wikiv2.studyv2.data.s0;
import com.baicizhan.main.wikiv2.studyv2.data.w0;
import com.baicizhan.main.wikiv2.studyv2.data.x0;
import com.baicizhan.main.wikiv2.studyv2.data.z;
import fj.d0;
import fj.e;
import fj.f;
import fj.i;
import fj.l;
import fj.p;
import fj.s;
import fj.t;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import p50.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6842d = 8;

    public a(@k LifecycleOwner lifecycleOwner, @k StudyWikiV2ViewModel vm2) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        i(x0.class, new d0(lifecycleOwner, vm2));
        i(com.baicizhan.main.wikiv2.studyv2.data.a.class, new t(lifecycleOwner));
        i(h0.class, new f(lifecycleOwner, vm2));
        i(a0.class, new l(lifecycleOwner));
        i(z.class, new e(lifecycleOwner, vm2));
        i(f0.class, new p(lifecycleOwner, vm2));
        i(w0.class, new s(lifecycleOwner, vm2));
        i(s0.class, new i(lifecycleOwner, vm2));
    }

    public final void o(@k List<?> oldList, @k List<?> newList) {
        g0.p(oldList, "oldList");
        g0.p(newList, "newList");
        m(newList);
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new b(oldList, newList), false);
        g0.o(calculateDiff, "calculateDiff(...)");
        calculateDiff.dispatchUpdatesTo(this);
    }
}
