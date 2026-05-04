package fj;

import a00.l1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.i0;
import com.baicizhan.main.wikiv2.studyv2.data.k0;
import com.baicizhan.main.wikiv2.studyv2.data.n0;
import com.jiongji.andriod.card.R;
import gs.zf;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikExtensionBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikExtensionBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikExtensionBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1869#2,2:209\n*S KotlinDebug\n*F\n+ 1 WikExtensionBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikExtensionBinder\n*L\n54#1:209,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e extends li.e<com.baicizhan.main.wikiv2.studyv2.data.z, a> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f51908g = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51909e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51910f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<zf> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f51911e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k e eVar, zf itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f51911e = eVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f51912a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f51912a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f51912a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51912a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m80.k LifecycleOwner lifecycleOwner, @m80.k StudyWikiV2ViewModel vm2) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        this.f51909e = vm2;
        this.f51910f = true;
    }

    public static final void B(WikiVideoView wikiVideoView, e eVar, zf zfVar, k0 k0Var) {
        if (wikiVideoView.n()) {
            eVar.F(zfVar);
        } else {
            eVar.J(zfVar);
        }
        k0Var.c().setValue(Boolean.valueOf(wikiVideoView.n()));
    }

    public static final void C(k0 k0Var, e eVar, boolean z11) {
        k0Var.b(z11);
        if (z11) {
            eVar.f51909e.s();
        }
    }

    public static final g2 D(e eVar, zf zfVar, Boolean bool) {
        if (!bool.booleanValue()) {
            eVar.F(zfVar);
        }
        return g2.f100423a;
    }

    public static final g2 E(WikiVideoView wikiVideoView, Boolean bool) {
        if (!bool.booleanValue()) {
            wikiVideoView.u();
        }
        return g2.f100423a;
    }

    public final void A(final zf zfVar, final k0 k0Var) {
        final WikiVideoView wikiVideoView = zfVar.f57784b;
        wikiVideoView.setFullscreenEnabled(true);
        wikiVideoView.setVideoURI(m9.c.d(k0Var.l()));
        wikiVideoView.setSnapshot(k0Var.m().toString());
        wikiVideoView.setOnFullscreenListener(new WikiVideoView.e() { // from class: fj.a
            @Override // com.baicizhan.client.business.widget.WikiVideoView.e
            public final void a() {
                e.B(WikiVideoView.this, this, zfVar, k0Var);
            }
        });
        wikiVideoView.setOnToggleListener(new WikiVideoView.f() { // from class: fj.b
            @Override // com.baicizhan.client.business.widget.WikiVideoView.f
            public final void a(boolean z11) {
                e.C(k0.this, this, z11);
            }
        });
        k0Var.c().removeObservers(p());
        k0Var.c().observe(p(), new b(new x00.l() { // from class: fj.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 D;
                D = e.D(e.this, zfVar, (Boolean) obj);
                return D;
            }
        }));
        k0Var.a().removeObservers(p());
        k0Var.a().observe(p(), new b(new x00.l() { // from class: fj.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = e.E(WikiVideoView.this, (Boolean) obj);
                return E;
            }
        }));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void F(zf zfVar) {
        Window window;
        View decorView;
        if (!(p() instanceof Fragment) || (window = ((Fragment) p()).requireActivity().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) decorView;
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WikiVideoView) {
                viewGroup.removeView(childAt);
                zfVar.f57785c.removeAllViews();
                zfVar.f57785c.addView(childAt);
                break;
            }
            i11++;
        }
        zfVar.f57784b.setFullscreen(false);
        ((Fragment) p()).requireActivity().setRequestedOrientation(1);
    }

    @m80.k
    public final StudyWikiV2ViewModel G() {
        return this.f51909e;
    }

    @Override // p50.e
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.studyv2.data.z ext) {
        g0.p(holder, "holder");
        g0.p(ext, "ext");
        qb.c.b(StudyWikiV2ViewModel.f25926p, "ext bind", new Object[0]);
        holder.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ext.d().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.baicizhan.main.wikiv2.studyv2.data.y) it.next()).d());
        }
        Integer num = this.f51909e.l().get(Integer.valueOf(holder.getAdapterPosition()));
        int intValue = num != null ? num.intValue() : 0;
        z(ext.d().get(intValue), holder);
        if (!this.f51910f) {
            this.f51909e.b(ma.a.G4, l1.W(h1.a(ma.b.f72944s1, Integer.valueOf(intValue)), h1.a(ma.b.f72941r1, arrayList.get(intValue))));
        }
        this.f51910f = false;
    }

    @Override // li.e
    @m80.k
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        zf e11 = zf.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    public final void J(zf zfVar) {
        Window window;
        View decorView;
        if (!(p() instanceof Fragment) || (window = ((Fragment) p()).requireActivity().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        zfVar.f57785c.removeView(zfVar.f57784b);
        ((ViewGroup) decorView).addView(zfVar.f57784b);
        zfVar.f57784b.setFullscreen(true);
        ((Fragment) p()).requireActivity().setRequestedOrientation(0);
    }

    public final void z(com.baicizhan.main.wikiv2.studyv2.data.y yVar, a aVar) {
        RecyclerView.Adapter jVar;
        Drawable drawable;
        int i11;
        int size;
        zf b11 = aVar.b();
        FrameLayout videoContainer = b11.f57785c;
        g0.o(videoContainer, "videoContainer");
        boolean z11 = yVar instanceof k0;
        sa.q.z(videoContainer, z11);
        RecyclerView extList = b11.f57783a;
        g0.o(extList, "extList");
        sa.q.z(extList, !z11);
        if (z11) {
            A(b11, (k0) yVar);
            return;
        }
        RecyclerView recyclerView = b11.f57783a;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Drawable drawable2 = KotlinExtKt.getDrawable(R.drawable.divider_transparent_8dp);
        if (yVar instanceof com.baicizhan.main.wikiv2.studyv2.data.c0) {
            com.baicizhan.main.wikiv2.studyv2.data.c0 c0Var = (com.baicizhan.main.wikiv2.studyv2.data.c0) yVar;
            i11 = c0Var.h().size();
            drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_12dp);
            jVar = new cj.i(c0Var.h());
        } else {
            if (yVar instanceof n0) {
                n0 n0Var = (n0) yVar;
                size = n0Var.h().size();
                jVar = new cj.k(n0Var.h());
            } else if (yVar instanceof com.baicizhan.main.wikiv2.studyv2.data.u) {
                com.baicizhan.main.wikiv2.studyv2.data.u uVar = (com.baicizhan.main.wikiv2.studyv2.data.u) yVar;
                size = uVar.h().size();
                jVar = new cj.b(uVar.h());
            } else if (yVar instanceof com.baicizhan.main.wikiv2.studyv2.data.v) {
                com.baicizhan.main.wikiv2.studyv2.data.v vVar = (com.baicizhan.main.wikiv2.studyv2.data.v) yVar;
                size = vVar.h().size();
                jVar = new cj.c(vVar.h());
            } else {
                if (yVar instanceof i0) {
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    jVar = new cj.j(((i0) yVar).h());
                } else if (yVar instanceof com.baicizhan.main.wikiv2.studyv2.data.b) {
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    jVar = new cj.j(((com.baicizhan.main.wikiv2.studyv2.data.b) yVar).h());
                } else {
                    if (!(yVar instanceof com.baicizhan.main.wikiv2.studyv2.data.g0)) {
                        throw new Exception("illegal data type");
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    jVar = new cj.j(((com.baicizhan.main.wikiv2.studyv2.data.g0) yVar).h());
                }
                drawable = drawable2;
                i11 = 0;
            }
            int i12 = size;
            drawable = drawable2;
            i11 = i12;
        }
        recyclerView.setAdapter(jVar);
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i13 = 0; i13 < itemDecorationCount; i13++) {
            recyclerView.removeItemDecorationAt(i13);
        }
        Context context = recyclerView.getContext();
        g0.o(context, "getContext(...)");
        xl.c cVar = new xl.c(context, 1, 0, i11 - 1, false, 16, null);
        g0.m(drawable);
        cVar.setDrawable(drawable);
        recyclerView.addItemDecoration(cVar);
    }
}
