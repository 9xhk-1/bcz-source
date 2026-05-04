package fj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import gs.qg;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class t extends li.e<com.baicizhan.main.wikiv2.studyv2.data.a, a> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f51969e = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<qg> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f51970e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k t tVar, qg binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f51970e = tVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
    }

    @Override // p50.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.studyv2.data.a allMeans) {
        g0.p(holder, "holder");
        g0.p(allMeans, "allMeans");
        RecyclerView recyclerView = holder.b().f56509a;
        recyclerView.setLayoutManager(new LinearLayoutManager(holder.b().getRoot().getContext()));
        recyclerView.setAdapter(new dj.a(allMeans.d(), true, p()));
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount; i11++) {
            recyclerView.removeItemDecorationAt(i11);
        }
        Context context = recyclerView.getContext();
        g0.o(context, "getContext(...)");
        xl.c cVar = new xl.c(context, 1, 0, allMeans.d().size() - 1, false, 16, null);
        Drawable drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_12dp);
        g0.m(drawable);
        cVar.setDrawable(drawable);
        recyclerView.addItemDecoration(cVar);
    }

    @Override // li.e
    @m80.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        qg e11 = qg.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }
}
