package pi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import gs.aj;
import pi.c;
import qi.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class l0 extends c<j0, aj> {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f80583k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f80584l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final String f80585m = l0.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    public static final g2 I(c.a aVar, View view, j.b info) {
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        kotlin.jvm.internal.g0.p(info, "info");
        qb.c.b(f80585m, "wiki navigate to [" + info + "]", new Object[0]);
        WordWikiActivity.a aVar2 = WordWikiActivity.f25556b;
        Context context = aVar.itemView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        WordWikiActivity.a.d(aVar2, context, info.e(), 0, null, 12, null);
        return g2.f100423a;
    }

    @Override // pi.c
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k final c<j0, aj>.a holder, @m80.k j0 item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        aj c11 = holder.c();
        if (c11 == null) {
            return;
        }
        c11.f54186b.setWords(item.e().d());
        c11.f54186b.setOnWordClickListener(new x00.p() { // from class: pi.k0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 I;
                I = l0.I(c.a.this, (View) obj, (j.b) obj2);
                return I;
            }
        });
        super.g(holder, item);
    }

    @Override // pi.c
    @m80.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public aj z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return aj.c(inflater);
    }

    @Override // pi.c
    public void x(@m80.k View v11, @m80.k ConstraintSet set, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(v11, "v");
        kotlin.jvm.internal.g0.p(set, "set");
        Context context = v11.getContext();
        set.connect(v11.getId(), 3, i11, 4);
        set.connect(v11.getId(), 1, i12, 1);
        set.connect(v11.getId(), 2, i12, 2);
        set.connect(v11.getId(), 4, i12, 4);
        set.setMargin(v11.getId(), 3, xb.f.a(context, 2.0f));
        set.setMargin(v11.getId(), 1, xb.f.a(context, 10.0f));
        set.setMargin(v11.getId(), 2, xb.f.a(context, 10.0f));
        set.setMargin(v11.getId(), 4, xb.f.a(context, 6.0f));
    }
}
