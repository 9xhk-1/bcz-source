package dj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.wikiv2.studyv2.data.x;
import gs.nf;
import java.util.List;
import kotlin.jvm.internal.g0;
import li.d;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends d<a> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f48019e = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<x> f48020d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<nf> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f48021e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k b bVar, nf itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f48021e = bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k List<x> means, @k LifecycleOwner lifeOwner) {
        super(lifeOwner);
        g0.p(means, "means");
        g0.p(lifeOwner, "lifeOwner");
        this.f48020d = means;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f48020d.size();
    }

    @k
    public final List<x> k() {
        return this.f48020d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k a holder, int i11) {
        g0.p(holder, "holder");
        nf b11 = holder.b();
        b11.f56064c.setText(this.f48020d.get(i11).g());
        b11.f56062a.setText(this.f48020d.get(i11).f());
        b11.f56063b.setText(this.f48020d.get(i11).h());
        c(holder);
    }

    @Override // li.d
    @k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a f(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        nf e11 = nf.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }
}
