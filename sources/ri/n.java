package ri;

import a00.h0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import gs.oe;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f84153d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f84154e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f84155f = "LookupTipAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f84156a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0 f84157b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<i0.z> f84158c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final String a(int i11) {
            switch (i11) {
                case 1:
                    return "词根";
                case 2:
                    return "谐音";
                case 3:
                    return "联想";
                case 4:
                    return "押韵";
                case 5:
                    return "象形";
                case 6:
                    return "小斩助记";
                case 7:
                    return "发音助记";
                default:
                    return "助记";
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<oe> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f84159e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k n nVar, oe binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f84159e = nVar;
        }

        @m80.k
        public final oe i() {
            return b();
        }
    }

    public n(@m80.k LifecycleOwner lifecycleOwner, @m80.k o0 viewModel) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f84156a = lifecycleOwner;
        this.f84157b = viewModel;
        this.f84158c = h0.J();
    }

    @m80.k
    public final List<i0.z> b() {
        return this.f84158c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k b holder, int i11) {
        g0.p(holder, "holder");
        i0.z zVar = this.f84158c.get(i11);
        oe i12 = holder.i();
        i12.f56218c.setText(f84153d.a(zVar.g()));
        if (zVar.g() == 5) {
            i12.f56217b.setVisibility(8);
            i12.f56216a.setVisibility(0);
            com.bumptech.glide.c.F(i12.getRoot().getContext()).load(zVar.e()).into(i12.f56216a);
        } else {
            i12.f56217b.setVisibility(0);
            i12.f56216a.setVisibility(8);
            i12.f56217b.setText(zVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        oe e11 = oe.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new b(this, e11);
    }

    public final void f(@m80.k List<i0.z> value) {
        g0.p(value, "value");
        this.f84158c = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84158c.size();
    }
}
