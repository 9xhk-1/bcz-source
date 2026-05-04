package com.baicizhan.main.word_book.pdf;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.view.AspectRoundImageView;
import com.baicizhan.main.word_book.pdf.ExportTemplateActivity;
import com.baicizhan.online.user_activity_api.ExportActivityInfo;
import com.baicizhan.online.user_activity_api.ExportTemplateInfo;
import com.jiongji.andriod.card.R;
import gs.j0;
import gs.se;
import hj.p;
import ij.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import qj.n;
import sa.q;
import x00.l;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nExportTemplateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportTemplateActivity.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1869#2,2:243\n*S KotlinDebug\n*F\n+ 1 ExportTemplateActivity.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateActivity\n*L\n114#1:243,2\n*E\n"})
/* loaded from: classes5.dex */
public final class ExportTemplateActivity extends BaseAppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f27675c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f27676d = 8;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f27677e = "ExportTemplateActivity";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f27678f = "book_id";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f27679g = "order_type";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f27680a = e0.c(new x00.a() { // from class: qj.k
        @Override // x00.a
        public final Object invoke() {
            j0 e12;
            e12 = ExportTemplateActivity.e1(ExportTemplateActivity.this);
            return e12;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public n f27681b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Context context, long j11, int i11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) ExportTemplateActivity.class);
            intent.putExtra("book_id", j11);
            intent.putExtra("order_type", i11);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.Adapter<a> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f27682b = 8;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ExportTemplateInfo> f27683a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final se f27684a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f27685b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@k b bVar, se mBinding) {
                super(mBinding.getRoot());
                g0.p(mBinding, "mBinding");
                this.f27685b = bVar;
                this.f27684a = mBinding;
            }

            @k
            public final se a() {
                return this.f27684a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k List<? extends ExportTemplateInfo> templateUrlList) {
            g0.p(templateUrlList, "templateUrlList");
            this.f27683a = templateUrlList;
        }

        @k
        public final List<ExportTemplateInfo> b() {
            return this.f27683a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@k a holder, int i11) {
            g0.p(holder, "holder");
            String img_url = this.f27683a.get(i11).img_url;
            g0.o(img_url, "img_url");
            ic.c j11 = hc.c.l(img_url).j(R.drawable.img_template_default);
            AspectRoundImageView templateImg = holder.a().f56750a;
            g0.o(templateImg, "templateImg");
            j11.o(templateImg);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            se e11 = se.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new a(this, e11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f27683a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f27686a;

        public c(l function) {
            g0.p(function, "function");
            this.f27686a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f27686a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27686a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends ViewPager2.OnPageChangeCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f27688b;

        public d(List<String> list) {
            this.f27688b = list;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            ExportTemplateActivity.this.g1(i11, this.f27688b);
        }
    }

    private final void X0() {
        final n nVar = this.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        nVar.m().observe(this, new c(new l() { // from class: qj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Y0;
                Y0 = ExportTemplateActivity.Y0(ExportTemplateActivity.this, (Boolean) obj);
                return Y0;
            }
        }));
        nVar.o().observe(this, new c(new l() { // from class: qj.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Z0;
                Z0 = ExportTemplateActivity.Z0(ExportTemplateActivity.this, (ExportActivityInfo) obj);
                return Z0;
            }
        }));
        nVar.i().observe(this, new c(new l() { // from class: qj.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 a12;
                a12 = ExportTemplateActivity.a1(ExportTemplateActivity.this, (Integer) obj);
                return a12;
            }
        }));
        nVar.l().observe(this, new c(new l() { // from class: qj.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = ExportTemplateActivity.b1(ExportTemplateActivity.this, nVar, (Boolean) obj);
                return b12;
            }
        }));
        nVar.y(getIntent().getIntExtra("order_type", 2));
    }

    public static final g2 Y0(ExportTemplateActivity exportTemplateActivity, Boolean bool) {
        g0.m(bool);
        LoadingDialogActivity.setLoading$default(exportTemplateActivity, bool.booleanValue(), 0L, null, 6, null);
        if (bool.booleanValue()) {
            View root = exportTemplateActivity.W0().f55390l.getRoot();
            g0.o(root, "getRoot(...)");
            q.z(root, false);
        }
        return g2.f100423a;
    }

    public static final g2 Z0(ExportTemplateActivity exportTemplateActivity, ExportActivityInfo exportActivityInfo) {
        if (exportActivityInfo != null) {
            List<ExportTemplateInfo> template_infos = exportActivityInfo.template_infos;
            g0.o(template_infos, "template_infos");
            exportTemplateActivity.n1(template_infos);
            ViewPager2 viewPager2 = exportTemplateActivity.W0().f55392n;
            List<ExportTemplateInfo> template_infos2 = exportActivityInfo.template_infos;
            g0.o(template_infos2, "template_infos");
            viewPager2.setAdapter(new b(template_infos2));
        } else {
            View root = exportTemplateActivity.W0().f55390l.getRoot();
            g0.o(root, "getRoot(...)");
            q.z(root, true);
        }
        return g2.f100423a;
    }

    public static final g2 a1(ExportTemplateActivity exportTemplateActivity, Integer num) {
        exportTemplateActivity.W0().f55386h.setText(exportTemplateActivity.getString(R.string.word_book_export_remaining, num));
        return g2.f100423a;
    }

    public static final g2 b1(ExportTemplateActivity exportTemplateActivity, n nVar, Boolean bool) {
        BczWebExecutorKt.startNormalWeb$default(exportTemplateActivity, exportTemplateActivity.getString(R.string.url_export_pdf_list, String.valueOf(nVar.k())), null, false, 0, null, 60, null);
        return g2.f100423a;
    }

    private final void c1() {
        j0 W0 = W0();
        n nVar = this.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        W0.j(nVar);
        W0.f55379a.D(new View.OnClickListener() { // from class: qj.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportTemplateActivity.d1(ExportTemplateActivity.this, view);
            }
        });
    }

    public static final void d1(ExportTemplateActivity exportTemplateActivity, View view) {
        exportTemplateActivity.finish();
    }

    public static final j0 e1(ExportTemplateActivity exportTemplateActivity) {
        return j0.e(exportTemplateActivity.getLayoutInflater());
    }

    public static final void f1(ExportTemplateActivity exportTemplateActivity, e it) {
        g0.p(it, "it");
        Application application = exportTemplateActivity.getApplication();
        g0.o(application, "getApplication(...)");
        exportTemplateActivity.f27681b = (n) new ViewModelProvider(exportTemplateActivity, new mj.g0(application, it.O(), exportTemplateActivity.getIntent().getLongExtra("book_id", -1L))).get(n.class);
        Lifecycle lifecycle = exportTemplateActivity.getLifecycle();
        n nVar = exportTemplateActivity.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        lifecycle.addObserver(nVar);
        exportTemplateActivity.c1();
        exportTemplateActivity.X0();
    }

    public static final g2 h1(int i11, j0 j0Var, View it) {
        g0.p(it, "it");
        if (i11 > 0) {
            j0Var.f55392n.setCurrentItem(i11 - 1, true);
        }
        return g2.f100423a;
    }

    public static final g2 i1(int i11, List list, j0 j0Var, View it) {
        g0.p(it, "it");
        if (i11 < list.size() - 1) {
            j0Var.f55392n.setCurrentItem(i11 + 1, true);
        }
        return g2.f100423a;
    }

    public static final g2 j1(ExportTemplateActivity exportTemplateActivity, int i11, View it) {
        g0.p(it, "it");
        n nVar = exportTemplateActivity.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        nVar.z(i11);
        return g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kc.d, kc.h] */
    public static final g2 k1(final ExportTemplateActivity exportTemplateActivity, final int i11, View it) {
        g0.p(it, "it");
        mc.a.p(exportTemplateActivity, ((u.a) d.a.J(d.a.s(mc.a.f(exportTemplateActivity).V("是否支付1000铜板兑换一次该模板？"), "再想想", null, 2, null), gi.k.f53787g, null, new l() { // from class: qj.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l12;
                l12 = ExportTemplateActivity.l1(ExportTemplateActivity.this, i11, (View) obj);
                return l12;
            }
        }, 2, null)).d(), null, 2, null);
        return g2.f100423a;
    }

    public static final g2 l1(ExportTemplateActivity exportTemplateActivity, int i11, View it) {
        g0.p(it, "it");
        n nVar = exportTemplateActivity.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        nVar.g(i11);
        return g2.f100423a;
    }

    public static final g2 m1(ExportTemplateActivity exportTemplateActivity, int i11, View it) {
        g0.p(it, "it");
        n nVar = exportTemplateActivity.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        nVar.z(i11);
        return g2.f100423a;
    }

    public final j0 W0() {
        return (j0) this.f27680a.getValue();
    }

    public final void g1(final int i11, final List<String> list) {
        final j0 W0 = W0();
        W0.f55391m.setText(list.get(i11));
        W0.f55389k.setText(i11 > 0 ? list.get(i11 - 1) : "");
        TextView preTitle = W0.f55389k;
        g0.o(preTitle, "preTitle");
        q.t(preTitle, 0, new l() { // from class: qj.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h12;
                h12 = ExportTemplateActivity.h1(i11, W0, (View) obj);
                return h12;
            }
        }, 1, null);
        W0.f55387i.setText(i11 < list.size() - 1 ? list.get(i11 + 1) : "");
        TextView nextTitle = W0.f55387i;
        g0.o(nextTitle, "nextTitle");
        q.t(nextTitle, 0, new l() { // from class: qj.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i12;
                i12 = ExportTemplateActivity.i1(i11, list, W0, (View) obj);
                return i12;
            }
        }, 1, null);
        n nVar = this.f27681b;
        if (nVar == null) {
            g0.S("mViewModel");
            nVar = null;
        }
        int i12 = nVar.p().get(i11).cost;
        FrameLayout costBottomContainer = W0.f55382d;
        g0.o(costBottomContainer, "costBottomContainer");
        q.z(costBottomContainer, i12 > 0);
        View root = W0.f55381c.getRoot();
        g0.o(root, "getRoot(...)");
        q.z(root, i12 <= 0);
        if (i12 <= 0) {
            TextView confirmBtn = W0.f55381c.f57405b;
            g0.o(confirmBtn, "confirmBtn");
            q.t(confirmBtn, 0, new l() { // from class: qj.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m12;
                    m12 = ExportTemplateActivity.m1(ExportTemplateActivity.this, i11, (View) obj);
                    return m12;
                }
            }, 1, null);
            return;
        }
        n nVar2 = this.f27681b;
        if (nVar2 == null) {
            g0.S("mViewModel");
            nVar2 = null;
        }
        int j11 = nVar2.j();
        TextView costRemainingBadge = W0.f55386h;
        g0.o(costRemainingBadge, "costRemainingBadge");
        q.z(costRemainingBadge, i12 <= j11);
        if (i12 > j11) {
            W0.f55385g.setText("1000铜板");
            ImageView costBtnIcon = W0.f55384f;
            g0.o(costBtnIcon, "costBtnIcon");
            q.z(costBtnIcon, true);
            View costBtn = W0.f55383e;
            g0.o(costBtn, "costBtn");
            q.t(costBtn, 0, new l() { // from class: qj.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 k12;
                    k12 = ExportTemplateActivity.k1(ExportTemplateActivity.this, i11, (View) obj);
                    return k12;
                }
            }, 1, null);
            return;
        }
        W0.f55386h.setText(getString(R.string.word_book_export_remaining, Integer.valueOf(j11)));
        W0.f55385g.setText(getString(R.string.export_pdf_btn_title));
        ImageView costBtnIcon2 = W0.f55384f;
        g0.o(costBtnIcon2, "costBtnIcon");
        q.z(costBtnIcon2, false);
        View costBtn2 = W0.f55383e;
        g0.o(costBtn2, "costBtn");
        q.t(costBtn2, 0, new l() { // from class: qj.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j12;
                j12 = ExportTemplateActivity.j1(ExportTemplateActivity.this, i11, (View) obj);
                return j12;
            }
        }, 1, null);
    }

    public final void n1(List<? extends ExportTemplateInfo> list) {
        if (list.isEmpty()) {
            qb.c.q(f27677e, "exportTemplateInfo list is Empty", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String title = ((ExportTemplateInfo) it.next()).title;
            g0.o(title, "title");
            arrayList.add(title);
        }
        int size = (list.size() - 1) / 2;
        ViewPager2 viewPager2 = W0().f55392n;
        viewPager2.setAdapter(new b(list));
        int screenHeight = (KotlinExtKt.getScreenHeight() - KotlinExtKt.getStatusBarHeight()) - KotlinExtKt.getDpPixels(240);
        int dpPixels = KotlinExtKt.getDpPixels(8) * 2;
        int min = Math.min(screenHeight, KotlinExtKt.getDpPixels(410) + dpPixels);
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        layoutParams.height = min;
        viewPager2.setLayoutParams(layoutParams);
        int screenWidth = (KotlinExtKt.getScreenWidth() - ((((min - dpPixels) * 29) / 41) + dpPixels)) / 2;
        g0.m(viewPager2);
        cg.b.b(viewPager2, screenWidth, 0, 2, null);
        viewPager2.registerOnPageChangeCallback(new d(arrayList));
        W0().f55388j.a(viewPager2);
        viewPager2.setCurrentItem(size, true);
        g1(size, arrayList);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(W0().getRoot());
        p.d(this, new rj.e() { // from class: qj.a
            @Override // rj.e
            public final void a(ij.e eVar) {
                ExportTemplateActivity.f1(ExportTemplateActivity.this, eVar);
            }
        });
    }
}
