package pe;

import a00.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import fd.h3;
import gs.rd;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d extends zf.b<qe.b, a> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f80386i = 8;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b f80387g;

    /* renamed from: h, reason: collision with root package name */
    public int f80388h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends zf.d {

        /* renamed from: g, reason: collision with root package name */
        public static final int f80389g = 8;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final TextView f80390e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final TextView f80391f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@m80.k gs.rd r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r2.<init>(r0)
                android.widget.TextView r0 = r3.f56642c
                java.lang.String r1 = "title"
                kotlin.jvm.internal.g0.o(r0, r1)
                r2.f80390e = r0
                android.widget.TextView r3 = r3.f56641b
                java.lang.String r0 = "switchType"
                kotlin.jvm.internal.g0.o(r3, r0)
                r2.f80391f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.d.a.<init>(gs.rd):void");
        }

        @k
        public final TextView l() {
            return this.f80391f;
        }

        @k
        public final TextView m() {
            return this.f80390e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void n(int i11, int i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k LifecycleOwner owner, @l b bVar) {
        super(owner, null, 2, null);
        g0.p(owner, "owner");
        this.f80387g = bVar;
    }

    public static final g2 G(qe.b bVar, a aVar, d dVar, View it) {
        g0.p(it, "it");
        List<String> g11 = bVar.g();
        h3 h3Var = new h3(aVar.itemView.getContext());
        h3Var.b(dVar.f80388h, g11);
        h3Var.a(dVar.new c(aVar, g11, bVar));
        h3Var.setCancelable(true);
        h3Var.show();
        return g2.f100423a;
    }

    @Override // zf.b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(@k final a holder, @k final qe.b item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        q.t(holder.l(), 0, new x00.l() { // from class: pe.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 G;
                G = d.G(qe.b.this, holder, this, (View) obj);
                return G;
            }
        }, 1, null);
        holder.m().setText(item.h());
        q.p(holder.l(), item.g().size() > 1 ? (CharSequence) r0.b3(item.g(), this.f80388h) : null);
    }

    @Override // zf.b
    @k
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public a u(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        rd d11 = rd.d(inflater, parent, false);
        g0.o(d11, "inflate(...)");
        return new a(d11);
    }

    public /* synthetic */ d(LifecycleOwner lifecycleOwner, b bVar, int i11, v vVar) {
        this(lifecycleOwner, (i11 & 2) != 0 ? null : bVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f80393b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f80394c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qe.b f80395d;

        public c(a aVar, List<String> list, qe.b bVar) {
            this.f80393b = aVar;
            this.f80394c = list;
            this.f80395d = bVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            d.this.f80388h = i11;
            q.p(this.f80393b.l(), this.f80394c.get(i11));
            b bVar = d.this.f80387g;
            if (bVar != null) {
                bVar.n(i11, this.f80395d.f());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
