package pi;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;
import gs.zi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n0 extends c<m0, zi> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80602k = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements hc.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zi f80603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f80604b;

        public a(zi ziVar, m0 m0Var) {
            this.f80603a = ziVar;
            this.f80604b = m0Var;
        }

        @Override // hc.d
        public void a(Exception exc) {
            zi ziVar = this.f80603a;
            ziVar.f57793b.setBackground(ziVar.getRoot().getResources().getDrawable(R.drawable.bg_wiki_deformation));
            qb.c.d("WordPictogramBinder", "failed: " + this.f80604b.e(), new Object[0]);
        }

        @Override // hc.d
        public void onSuccess() {
            zi ziVar = this.f80603a;
            ziVar.f57793b.setBackground(ziVar.getRoot().getResources().getDrawable(R.drawable.bg_wiki_deformation));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<m0, zi>.a holder, @m80.k m0 item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        zi c11 = holder.c();
        if (c11 != null) {
            c11.f57793b.setBackground(c11.getRoot().getResources().getDrawable(R.drawable.bg_wiki_deformation_loading));
            ic.c f11 = hc.c.j(item.e()).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
            ImageView pic = c11.f57793b;
            kotlin.jvm.internal.g0.o(pic, "pic");
            f11.g(pic, new a(c11, item));
        }
        super.g(holder, item);
    }

    @Override // pi.c
    @m80.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public zi z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return zi.c(inflater);
    }
}
