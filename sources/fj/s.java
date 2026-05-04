package fj;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.w0;
import com.google.android.material.tabs.TabLayout;
import gs.dg;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiTabBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiTabBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiTabBinder\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n35#2:90\n35#2:93\n1869#3,2:91\n*S KotlinDebug\n*F\n+ 1 WikiTabBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiTabBinder\n*L\n37#1:90\n64#1:93\n47#1:91,2\n*E\n"})
/* loaded from: classes3.dex */
public final class s extends li.e<w0, b> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f51963g = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51964e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public a f51965f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<dg> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f51968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k s sVar, dg binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f51968e = sVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@m80.k LifecycleOwner lifecycleOwner, @m80.k StudyWikiV2ViewModel vm2) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        this.f51964e = vm2;
    }

    public final void A(@m80.l a aVar) {
        this.f51965f = aVar;
    }

    @m80.l
    public final a v() {
        return this.f51965f;
    }

    @m80.k
    public final StudyWikiV2ViewModel w() {
        return this.f51964e;
    }

    @Override // p50.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k b holder, @m80.k w0 data) {
        g0.p(holder, "holder");
        g0.p(data, "data");
        TabLayout tabLayout = holder.b().f54629a;
        tabLayout.L();
        for (String str : data.d()) {
            TabLayout.i I = tabLayout.I();
            I.D(str);
            I.f32310i.setLongClickable(false);
            if (Build.VERSION.SDK_INT >= 26) {
                I.f32310i.setTooltipText("");
            }
            tabLayout.i(I);
        }
        tabLayout.t();
        a aVar = new a(this, holder);
        tabLayout.h(aVar);
        this.f51965f = aVar;
        Integer num = this.f51964e.l().get(Integer.valueOf(holder.getAdapterPosition() + 1));
        if (num != null) {
            tabLayout.R(tabLayout.D(num.intValue()));
        }
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        dg e11 = dg.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new b(this, e11);
    }

    @Override // li.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k b holder) {
        g0.p(holder, "holder");
        super.t(holder);
        if (this.f51965f != null) {
            holder.b().f54629a.t();
        }
        this.f51965f = null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWikiTabBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiTabBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiTabBinder$OnTabListener\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,89:1\n35#2:90\n*S KotlinDebug\n*F\n+ 1 WikiTabBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiTabBinder$OnTabListener\n*L\n74#1:90\n*E\n"})
    public final class a implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final b f51966a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f51967b;

        public a(@m80.k s sVar, b holder) {
            g0.p(holder, "holder");
            this.f51967b = sVar;
            this.f51966a = holder;
        }

        @m80.k
        public final b a() {
            return this.f51966a;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(@m80.l TabLayout.i iVar) {
            Integer valueOf = iVar != null ? Integer.valueOf(iVar.k()) : null;
            s sVar = this.f51967b;
            if (valueOf != null) {
                sVar.w().y(this.f51966a.getAdapterPosition() + 1, valueOf.intValue());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(@m80.l TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(@m80.l TabLayout.i iVar) {
        }
    }
}
