package pe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;
import gs.qd;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b extends zf.b<qe.c, a> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C0987b f80371h = new C0987b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f80372i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f80373j = b.class.getSimpleName();

    /* renamed from: g, reason: collision with root package name */
    @l
    public final c f80374g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends zf.d {

        /* renamed from: l, reason: collision with root package name */
        public static final int f80375l = 8;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Resources f80376e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ImageView f80377f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final TextView f80378g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final TextView f80379h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final TextView f80380i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final Group f80381j;

        /* renamed from: k, reason: collision with root package name */
        public int f80382k;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@m80.k gs.qd r4) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r4.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r3.<init>(r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r4.getRoot()
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r1 = "getResources(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r3.f80376e = r0
                com.baicizhan.main.view.AspectRoundImageView r0 = r4.f56488c
                java.lang.String r1 = "bookCover"
                kotlin.jvm.internal.g0.o(r0, r1)
                r3.f80377f = r0
                android.widget.TextView r0 = r4.f56490e
                java.lang.String r1 = "bookName"
                kotlin.jvm.internal.g0.o(r0, r1)
                r3.f80378g = r0
                android.widget.TextView r1 = r4.f56489d
                java.lang.String r2 = "bookDesc"
                kotlin.jvm.internal.g0.o(r1, r2)
                r3.f80379h = r1
                android.widget.TextView r1 = r4.f56491f
                java.lang.String r2 = "bookWordsSum"
                kotlin.jvm.internal.g0.o(r1, r2)
                r3.f80380i = r1
                androidx.constraintlayout.widget.Group r1 = r4.f56487b
                java.lang.String r2 = "added"
                kotlin.jvm.internal.g0.o(r1, r2)
                r3.f80381j = r1
                androidx.constraintlayout.widget.ConstraintLayout r4 = r4.getRoot()
                android.content.Context r4 = r4.getContext()
                java.lang.String r1 = "getContext(...)"
                kotlin.jvm.internal.g0.o(r4, r1)
                int r4 = r3.o(r4)
                r0.setMaxWidth(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.b.a.<init>(gs.qd):void");
        }

        @k
        public final Group l() {
            return this.f80381j;
        }

        @k
        public final ImageView m() {
            return this.f80377f;
        }

        @k
        public final TextView n() {
            return this.f80379h;
        }

        public final int o(Context context) {
            if (this.f80382k == 0) {
                this.f80382k = ((xb.f.i(context) - (context.getResources().getDimensionPixelSize(R.dimen.books_content_padding_lr) * 2)) - context.getResources().getDimensionPixelSize(R.dimen.books_book_cover_width)) - context.getResources().getDimensionPixelSize(R.dimen.books_name_margin_left);
            }
            return this.f80382k;
        }

        @k
        public final TextView p() {
            return this.f80378g;
        }

        @k
        public final Resources q() {
            return this.f80376e;
        }

        @k
        public final TextView r() {
            return this.f80380i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pe.b$b, reason: collision with other inner class name */
    public static final class C0987b {
        public /* synthetic */ C0987b(v vVar) {
            this();
        }

        public C0987b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void k(@k qe.c cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k LifecycleOwner owner, @l c cVar) {
        super(owner, null, 2, null);
        g0.p(owner, "owner");
        this.f80374g = cVar;
    }

    public static final g2 E(b bVar, qe.c cVar, View it) {
        g0.p(it, "it");
        c cVar2 = bVar.f80374g;
        if (cVar2 != null) {
            cVar2.k(cVar);
        }
        return g2.f100423a;
    }

    @Override // zf.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s(@k a holder, @k final qe.c item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        View itemView = holder.itemView;
        g0.o(itemView, "itemView");
        q.t(itemView, 0, new x00.l() { // from class: pe.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = b.E(b.this, item, (View) obj);
                return E;
            }
        }, 1, null);
        hc.c.l(item.k()).j(R.drawable.ic_book_cover_default).f(R.drawable.ic_book_cover_default).o(holder.m());
        holder.p().setText(item.n());
        Drawable drawable = ResourcesCompat.getDrawable(holder.q(), R.drawable.ic_hot, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            TextView p11 = holder.p();
            if (item.o() != 1) {
                drawable = null;
            }
            p11.setCompoundDrawables(null, null, drawable, null);
        }
        holder.n().setText(item.l());
        holder.r().setText(holder.q().getString(R.string.books_words_sum, Integer.valueOf(item.p())));
        q.z(holder.l(), item.j());
        holder.itemView.setBackground(item.j() ? null : ResourcesCompat.getDrawable(holder.q(), R.drawable.bg_books_book_item, null));
    }

    @Override // zf.b
    @k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        qd d11 = qd.d(inflater, parent, false);
        g0.o(d11, "inflate(...)");
        return new a(d11);
    }

    public /* synthetic */ b(LifecycleOwner lifecycleOwner, c cVar, int i11, v vVar) {
        this(lifecycleOwner, (i11 & 2) != 0 ? null : cVar);
    }
}
