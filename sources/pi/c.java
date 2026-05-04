package pi;

import a00.d1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;
import gs.vi;
import java.util.Iterator;
import pi.a;
import pi.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nBasicTitleBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTitleBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/BasicTitleBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1869#2,2:140\n*S KotlinDebug\n*F\n+ 1 BasicTitleBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/BasicTitleBinder\n*L\n59#1:140,2\n*E\n"})
/* loaded from: classes3.dex */
public class c<T extends pi.a, CB extends ViewBinding> extends e0<T, c<T, CB>.a, vi> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f80528h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f80529i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f80530j = c.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public Boolean f80531f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public c<T, CB>.a f80532g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final CB f80533a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final ImageView f80534b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final TextView f80535c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final ImageView f80536d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final View f80537e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c<T, CB> f80538f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final c cVar, @m80.l vi binding, CB cb2) {
            super(binding.f57198f);
            kotlin.jvm.internal.g0.p(binding, "binding");
            this.f80538f = cVar;
            this.f80533a = cb2;
            ImageView root = binding.f57200h.getRoot();
            kotlin.jvm.internal.g0.o(root, "getRoot(...)");
            this.f80534b = root;
            TextView title = binding.f57199g;
            kotlin.jvm.internal.g0.o(title, "title");
            this.f80535c = title;
            ImageView expand = binding.f57196d;
            kotlin.jvm.internal.g0.o(expand, "expand");
            this.f80536d = expand;
            View expandedArea = binding.f57197e;
            kotlin.jvm.internal.g0.o(expandedArea, "expandedArea");
            this.f80537e = expandedArea;
            if (cb2 != null) {
                sa.q.t(expandedArea, 0, new x00.l() { // from class: pi.b
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 b11;
                        b11 = c.a.b(c.this, this, (View) obj);
                        return b11;
                    }
                }, 1, null);
            } else {
                sa.q.z(expand, false);
            }
        }

        public static final g2 b(c cVar, a aVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            cVar.D(Boolean.valueOf(!cVar.p().D(aVar.getAdapterPosition())));
            cVar.p().f0(aVar.getAdapterPosition());
            return g2.f100423a;
        }

        @m80.l
        public final CB c() {
            return this.f80533a;
        }

        @m80.k
        public final ImageView d() {
            return this.f80536d;
        }

        @m80.k
        public final View e() {
            return this.f80537e;
        }

        @m80.k
        public final TextView f() {
            return this.f80535c;
        }

        @m80.k
        public final ImageView g() {
            return this.f80534b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    public static /* synthetic */ void y(c cVar, View view, ConstraintSet constraintSet, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfigConstraint");
        }
        if ((i15 & 4) != 0) {
            i11 = R.id.title;
        }
        int i16 = i11;
        if ((i15 & 8) != 0) {
            i12 = R.id.root;
        }
        int i17 = i12;
        if ((i15 & 16) != 0) {
            i13 = R.id.content_left_guideline;
        }
        int i18 = i13;
        if ((i15 & 32) != 0) {
            i14 = R.id.content_right_guideline;
        }
        cVar.x(view, constraintSet, i16, i17, i18, i14);
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c<T, CB>.a r(@m80.k vi binding, @m80.k View v11) {
        kotlin.jvm.internal.g0.p(binding, "binding");
        kotlin.jvm.internal.g0.p(v11, "v");
        c<T, CB>.a aVar = new a(this, binding, t(v11 instanceof ViewGroup ? (ViewGroup) v11 : null));
        this.f80532g = aVar;
        C(aVar);
        return aVar;
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public vi s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        vi d11 = vi.d(inflater, parent, false);
        kotlin.jvm.internal.g0.o(d11, "inflate(...)");
        return d11;
    }

    public void C(@m80.k c<T, CB>.a holder) {
        kotlin.jvm.internal.g0.p(holder, "holder");
    }

    public final void D(@m80.l Boolean bool) {
        this.f80531f = bool;
    }

    public final void E(c<T, CB>.a aVar, boolean z11) {
        View view = aVar.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator<Integer> it = g10.u.W1(0, viewGroup.getChildCount()).iterator();
            while (it.hasNext()) {
                View childAt = viewGroup.getChildAt(((d1) it).nextInt());
                if (childAt == null || kotlin.jvm.internal.g0.g(childAt, aVar.f()) || kotlin.jvm.internal.g0.g(childAt, aVar.d()) || kotlin.jvm.internal.g0.g(childAt, aVar.e()) || kotlin.jvm.internal.g0.g(childAt, aVar.g())) {
                    childAt = null;
                }
                if (childAt != null) {
                    sa.q.z(childAt, z11);
                }
            }
        }
    }

    public final void F(@m80.l c<T, CB>.a aVar) {
        this.f80532g = aVar;
    }

    public final CB t(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        kotlin.jvm.internal.g0.o(from, "from(...)");
        CB z11 = z(from);
        View root = z11 != null ? z11.getRoot() : null;
        if (root != null) {
            if (root.getId() == -1) {
                root.setId(View.generateViewId());
            }
            viewGroup.addView(root);
            ConstraintSet constraintSet = new ConstraintSet();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            constraintSet.clone(constraintLayout);
            constraintSet.constrainWidth(root.getId(), 0);
            constraintSet.connect(root.getId(), 3, R.id.title, 4);
            constraintSet.connect(root.getId(), 1, R.id.content_left_guideline, 1);
            constraintSet.connect(root.getId(), 2, R.id.content_right_guideline, 2);
            constraintSet.connect(root.getId(), 4, R.id.root, 4);
            constraintSet.setMargin(root.getId(), 3, xb.f.a(constraintLayout.getContext(), 8.0f));
            constraintSet.setMargin(root.getId(), 4, xb.f.a(constraintLayout.getContext(), 12.0f));
            y(this, root, constraintSet, 0, 0, 0, 0, 60, null);
            constraintSet.applyTo(constraintLayout);
        }
        return z11;
    }

    @m80.l
    public final Boolean u() {
        return this.f80531f;
    }

    @m80.l
    public final c<T, CB>.a v() {
        return this.f80532g;
    }

    @Override // pi.e0, p50.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<T, CB>.a holder, @m80.k T item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.f().setText(item.d());
        Boolean bool = this.f80531f;
        int i11 = R.drawable.ic_wiki_fold_no;
        if (bool != null) {
            kotlin.jvm.internal.g0.m(bool);
            E(holder, bool.booleanValue());
            ImageView d11 = holder.d();
            Boolean bool2 = this.f80531f;
            kotlin.jvm.internal.g0.m(bool2);
            if (bool2.booleanValue()) {
                i11 = R.drawable.ic_wiki_fold;
            }
            d11.setImageResource(i11);
            this.f80531f = null;
        } else {
            E(holder, item.c());
            ImageView d12 = holder.d();
            if (item.c()) {
                i11 = R.drawable.ic_wiki_fold;
            }
            d12.setImageResource(i11);
        }
        super.g(holder, item);
    }

    public void x(@m80.k View v11, @m80.k ConstraintSet set, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(v11, "v");
        kotlin.jvm.internal.g0.p(set, "set");
    }

    @m80.l
    public CB z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return null;
    }
}
