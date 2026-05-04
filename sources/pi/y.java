package pi;

import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import gs.yi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class y extends c<x, yi> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80649k = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<x, yi>.a holder, @m80.k x item) {
        TextView textView;
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        yi c11 = holder.c();
        if (c11 == null || (textView = c11.f57615b) == null) {
            return;
        }
        textView.setText(item.e());
    }

    @Override // pi.c
    @m80.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public yi z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return yi.c(inflater);
    }
}
