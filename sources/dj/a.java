package dj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.studyv2.data.b0;
import gs.hf;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import li.d;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a extends d<C0570a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f48015f = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<b0> f48016d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48017e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dj.a$a, reason: collision with other inner class name */
    public final class C0570a extends li.b<hf> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a f48018e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0570a(@k a aVar, hf itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f48018e = aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k List<b0> means, boolean z11, @k LifecycleOwner lifeOwner) {
        super(lifeOwner);
        g0.p(means, "means");
        g0.p(lifeOwner, "lifeOwner");
        this.f48016d = means;
        this.f48017e = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f48016d.size();
    }

    @k
    public final List<b0> k() {
        return this.f48016d;
    }

    public final boolean l() {
        return this.f48017e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k C0570a holder, int i11) {
        g0.p(holder, "holder");
        hf b11 = holder.b();
        b0 b0Var = this.f48016d.get(i11);
        b11.f55194b.setText(b0Var.h());
        if (!this.f48017e || b0Var.f() == null) {
            b11.f55193a.setText(this.f48016d.get(i11).g());
        } else {
            TextView content = b11.f55193a;
            g0.o(content, "content");
            KotlinExtKt.setTextHighLightWithBold(content, b0Var.g(), b0Var.f().getFirst().intValue(), b0Var.f().getSecond().intValue());
        }
        c(holder);
    }

    @Override // li.d
    @k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0570a f(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        hf e11 = hf.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new C0570a(this, e11);
    }

    public /* synthetic */ a(List list, boolean z11, LifecycleOwner lifecycleOwner, int i11, v vVar) {
        this(list, (i11 & 2) != 0 ? false : z11, lifecycleOwner);
    }
}
