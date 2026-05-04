package fj;

import a00.k1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.h0;
import com.jiongji.andriod.card.R;
import gs.lf;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiExamMeanBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiExamMeanBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiExamMeanBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes3.dex */
public final class f extends li.e<h0, a> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f51913g = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51915f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<lf> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f51916e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k f fVar, lf binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f51916e = fVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k LifecycleOwner lifeOwner, @m80.k StudyWikiV2ViewModel vm2) {
        super(lifeOwner);
        g0.p(lifeOwner, "lifeOwner");
        g0.p(vm2, "vm");
        this.f51914e = vm2;
        this.f51915f = true;
    }

    @m80.k
    public final StudyWikiV2ViewModel v() {
        return this.f51914e;
    }

    @Override // p50.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k h0 splitMeans) {
        int i11;
        g0.p(holder, "holder");
        g0.p(splitMeans, "splitMeans");
        lf b11 = holder.b();
        b11.f55772a.setLayoutManager(new LinearLayoutManager(b11.getRoot().getContext()));
        RecyclerView meanList = b11.f55772a;
        g0.o(meanList, "meanList");
        sa.q.z(meanList, true);
        TextView noContentInfo = b11.f55773b;
        g0.o(noContentInfo, "noContentInfo");
        sa.q.z(noContentInfo, false);
        Integer num = this.f51914e.l().get(Integer.valueOf(holder.getAdapterPosition()));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == 0) {
            b11.f55772a.setAdapter(new dj.a(splitMeans.f(), false, p(), 2, null));
            i11 = splitMeans.f().size();
        } else {
            List<com.baicizhan.main.wikiv2.studyv2.data.x> g11 = splitMeans.g();
            if (g11 == null || g11.isEmpty()) {
                RecyclerView meanList2 = b11.f55772a;
                g0.o(meanList2, "meanList");
                sa.q.z(meanList2, false);
                TextView noContentInfo2 = b11.f55773b;
                g0.o(noContentInfo2, "noContentInfo");
                sa.q.z(noContentInfo2, true);
                i11 = 0;
            } else {
                b11.f55772a.setAdapter(new dj.b(splitMeans.g(), p()));
                i11 = splitMeans.g().size();
            }
        }
        RecyclerView recyclerView = b11.f55772a;
        g0.m(recyclerView);
        if (!sa.q.m(recyclerView)) {
            recyclerView = null;
        }
        if (recyclerView != null) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i12 = 0; i12 < itemDecorationCount; i12++) {
                recyclerView.removeItemDecorationAt(i12);
            }
            Context context = recyclerView.getContext();
            g0.o(context, "getContext(...)");
            xl.c cVar = new xl.c(context, 1, 0, i11 - 1, false, 16, null);
            Drawable drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_8dp);
            g0.m(drawable);
            cVar.setDrawable(drawable);
            recyclerView.addItemDecoration(cVar);
        }
        if (!this.f51915f) {
            this.f51914e.b(ma.a.F4, k1.k(h1.a(ma.b.f72938q1, Integer.valueOf(intValue))));
        }
        this.f51915f = false;
    }

    @Override // li.e
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        lf e11 = lf.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }
}
