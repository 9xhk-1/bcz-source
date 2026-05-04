package com.baicizhan.main.word_book.detail;

import a00.h0;
import a00.k1;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c40.a1;
import c40.r0;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.baicizhan.main.vld.model.FavoritePlanInfo;
import com.baicizhan.main.word_book.detail.WordBookDetailActivity;
import com.baicizhan.main.word_book.list.FavoriteAddingMode;
import com.baicizhan.main.word_book.list.WordBookCreateActivity;
import com.baicizhan.main.word_book.list.WordFavoriteAddActivity;
import com.baicizhan.main.word_book.list.i3;
import com.baicizhan.main.word_book.list.j3;
import com.baicizhan.main.word_book.pdf.ExportTemplateActivity;
import com.jiongji.andriod.card.R;
import gs.cm;
import gs.z2;
import ij.n;
import ij.q;
import ij.z;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji.t1;
import kc.d;
import kc.u;
import ki.j;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import mj.i0;
import mj.w0;
import oe.l1;
import x00.p;
import yg.i2;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordBookDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookDetailActivity.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,641:1\n1#2:642\n1#2:653\n1#2:674\n1617#3,9:643\n1869#3:652\n1870#3:654\n1626#3:655\n1878#3,3:656\n1869#3,2:659\n1878#3,3:661\n1617#3,9:664\n1869#3:673\n1870#3:675\n1626#3:676\n35#4:677\n*S KotlinDebug\n*F\n+ 1 WordBookDetailActivity.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailActivity\n*L\n367#1:653\n570#1:674\n367#1:643,9\n367#1:652\n367#1:654\n367#1:655\n369#1:656,3\n397#1:659,2\n401#1:661,3\n570#1:664,9\n570#1:673\n570#1:675\n570#1:676\n312#1:677\n*E\n"})
/* loaded from: classes5.dex */
public final class WordBookDetailActivity extends BaseAppCompatActivity {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f26698n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f26699o = 8;

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final String f26700p = "WordBookDetailActivity";

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final String f26701q = "book_id";

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final String f26702r = "device_id";

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final String f26703s = "plan_info";

    /* renamed from: a, reason: collision with root package name */
    public z2 f26704a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f26705b;

    /* renamed from: e, reason: collision with root package name */
    public long f26708e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public FavoritePlanInfo f26709f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ActivityResultLauncher<Intent> f26710g;

    /* renamed from: i, reason: collision with root package name */
    @l
    public be.h f26712i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public PopupWindow f26713j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26715l;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f26706c = e0.c(new x00.a() { // from class: mj.s
        @Override // x00.a
        public final Object invoke() {
            w0 U1;
            U1 = WordBookDetailActivity.U1(WordBookDetailActivity.this);
            return U1;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public long f26707d = -1;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c0 f26711h = e0.c(new x00.a() { // from class: mj.t
        @Override // x00.a
        public final Object invoke() {
            ij.n x22;
            x22 = WordBookDetailActivity.x2();
            return x22;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public boolean f26714k = true;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final List<RecyclerView.ItemDecoration> f26716m = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, long j11, long j12, FavoritePlanInfo favoritePlanInfo, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j12 = 0;
            }
            long j13 = j12;
            if ((i11 & 8) != 0) {
                favoritePlanInfo = null;
            }
            return aVar.a(context, j11, j13, favoritePlanInfo);
        }

        public static /* synthetic */ void d(a aVar, Context context, long j11, long j12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j12 = 0;
            }
            aVar.c(context, j11, j12);
        }

        @k
        public final Intent a(@k Context context, long j11, long j12, @l FavoritePlanInfo favoritePlanInfo) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) WordBookDetailActivity.class);
            intent.putExtra("book_id", j11);
            intent.putExtra("device_id", j12);
            intent.putExtra("plan_info", favoritePlanInfo);
            return intent;
        }

        public final void c(@k Context context, long j11, long j12) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) WordBookDetailActivity.class);
            intent.putExtra("book_id", j11);
            intent.putExtra("device_id", j12);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends sa.c {
        public b() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            WordBookDetailActivity.this.z1();
            WordBookDetailActivity.this.p2();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            WordBookDetailActivity.this.z1();
            WordBookDetailActivity.this.Y1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailActivity$initVM$1$4$1", f = "WordBookDetailActivity.kt", i = {}, l = {353}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26719a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordBookDetailActivity.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26719a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f26719a = 1;
                if (a1.b(300L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            be.h hVar = WordBookDetailActivity.this.f26712i;
            if (hVar != null) {
                l00.a.a(be.h.d(hVar, false, null, 3, null));
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailActivity$onCreate$2$1", f = "WordBookDetailActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.e f26722b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WordBookDetailActivity f26723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ij.e eVar, WordBookDetailActivity wordBookDetailActivity, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f26722b = eVar;
            this.f26723c = wordBookDetailActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f26722b, this.f26723c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object j02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26721a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                q O = this.f26722b.O();
                long j11 = this.f26723c.f26707d;
                this.f26721a = 1;
                j02 = O.j0(j11, this);
                if (j02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                j02 = ((Result) obj).m6317unboximpl();
            }
            if (Result.m6314isFailureimpl(j02)) {
                this.f26723c.n2();
                return g2.f100423a;
            }
            WordBookDetailActivity wordBookDetailActivity = this.f26723c;
            ViewDataBinding contentView = DataBindingUtil.setContentView(wordBookDetailActivity, R.layout.activity_word_book_detail);
            g0.o(contentView, "setContentView(...)");
            wordBookDetailActivity.f26704a = (z2) contentView;
            WordBookDetailActivity wordBookDetailActivity2 = this.f26723c;
            WordBookDetailActivity wordBookDetailActivity3 = this.f26723c;
            Application application = this.f26723c.getApplication();
            g0.o(application, "getApplication(...)");
            wordBookDetailActivity2.f26705b = (i0) new ViewModelProvider(wordBookDetailActivity3, new mj.g0(application, this.f26722b.O(), this.f26723c.f26707d)).get(i0.class);
            this.f26723c.S1();
            this.f26723c.N1();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailActivity$onCreate$4", f = "WordBookDetailActivity.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super Result<? extends FavoritePlanInfo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26724a;

        public f(j00.c<? super f> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookDetailActivity.this.new f(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<FavoritePlanInfo>> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26724a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ki.c a12 = ki.e.a();
                long j11 = WordBookDetailActivity.this.f26708e;
                this.f26724a = 1;
                a11 = a12.a(j11, this);
                if (a11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                a11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(a11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends FavoritePlanInfo>> cVar) {
            return invoke2((j00.c<? super Result<FavoritePlanInfo>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailActivity$performShare$2", f = "WordBookDetailActivity.kt", i = {}, l = {581}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.l<j00.c<? super Result<? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26726a;

        public g(j00.c<? super g> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookDetailActivity.this.new g(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<String>> cVar) {
            return ((g) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object s11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26726a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0 i0Var = WordBookDetailActivity.this.f26705b;
                if (i0Var == null) {
                    g0.S("mViewModel");
                    i0Var = null;
                }
                this.f26726a = 1;
                s11 = i0Var.s(this);
                if (s11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                s11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(s11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends String>> cVar) {
            return invoke2((j00.c<? super Result<String>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f26728a;

        public h(x00.l function) {
            g0.p(function, "function");
            this.f26728a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f26728a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26728a.invoke(obj);
        }
    }

    public static final void D1(WordBookDetailActivity wordBookDetailActivity, View view) {
        wordBookDetailActivity.finish();
    }

    public static final boolean E1(WordBookDetailActivity wordBookDetailActivity, View view) {
        i9.f.j(wordBookDetailActivity, i9.f.E, false);
        i9.f.n(wordBookDetailActivity, i9.f.F, "", false);
        return true;
    }

    public static final g2 F1(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        t1.b(wordBookDetailActivity, wordBookDetailActivity.f26708e, wordBookDetailActivity.f26707d);
        return g2.f100423a;
    }

    public static final g2 G1(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        i0 i0Var = wordBookDetailActivity.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        kj.a value = i0Var.w().getValue();
        if (value != null) {
            WordBookCreateActivity.f26739b.c(wordBookDetailActivity, value.j(), value.k(), a00.r0.Z5(value.l()));
        }
        return g2.f100423a;
    }

    public static final g2 H1(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        if (wordBookDetailActivity.f26708e != 0) {
            Pair<FavoritePlanInfo, ScheduleType> a11 = l1.a(wordBookDetailActivity.f26707d, wordBookDetailActivity.f26709f);
            FavoritePlanInfo component1 = a11.component1();
            ScheduleType component2 = a11.component2();
            ActivityResultLauncher<Intent> activityResultLauncher = wordBookDetailActivity.f26710g;
            g0.m(activityResultLauncher);
            activityResultLauncher.launch(EditScheduleActivity.f18908j.a(wordBookDetailActivity, wordBookDetailActivity.f26708e, component1, component2));
        } else {
            CollectReviewActivity.u1(wordBookDetailActivity, wordBookDetailActivity.f26707d);
            i0 i0Var = wordBookDetailActivity.f26705b;
            if (i0Var == null) {
                g0.S("mViewModel");
                i0Var = null;
            }
            ma.l.e(t.f73012k, ma.a.W3, a00.l1.W(h1.a("word_num", Integer.valueOf(i0Var.r())), h1.a(ma.b.B0, Long.valueOf(wordBookDetailActivity.f26707d))));
        }
        return g2.f100423a;
    }

    public static final g2 I1(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        ExportTemplateActivity.a aVar = ExportTemplateActivity.f27675c;
        long j11 = wordBookDetailActivity.f26707d;
        i0 i0Var = wordBookDetailActivity.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        aVar.a(wordBookDetailActivity, j11, i0Var.o());
        ma.l.a(t.f73012k, ma.a.Q4);
        return g2.f100423a;
    }

    public static final g2 J1(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        wordBookDetailActivity.A1().J();
        return g2.f100423a;
    }

    public static final g2 K1(View it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final void L1(WordBookDetailActivity wordBookDetailActivity, View view) {
        view.setSelected(!view.isSelected());
        wordBookDetailActivity.A1().o(view.isSelected());
    }

    public static final void M1(WordBookDetailActivity wordBookDetailActivity, z2 z2Var, RadioGroup radioGroup, int i11) {
        int i12;
        int i13;
        i0 i0Var;
        qb.c.b(f26700p, "order checked changed:" + i11, new Object[0]);
        i0 i0Var2 = wordBookDetailActivity.f26705b;
        if (i0Var2 == null) {
            g0.S("mViewModel");
            i0Var2 = null;
        }
        if (i0Var2.l()) {
            wordBookDetailActivity.z1();
            switch (i11) {
                case R.id.letter_order /* 2131362818 */:
                    i12 = 3;
                    i13 = i12;
                    break;
                case R.id.letter_reverse /* 2131362819 */:
                    i12 = 4;
                    i13 = i12;
                    break;
                case R.id.time_order /* 2131363784 */:
                    i12 = 1;
                    i13 = i12;
                    break;
                case R.id.time_reverse /* 2131363785 */:
                    i12 = 2;
                    i13 = i12;
                    break;
                default:
                    i13 = -1;
                    break;
            }
            if (i13 != -1) {
                i0 i0Var3 = wordBookDetailActivity.f26705b;
                if (i0Var3 == null) {
                    g0.S("mViewModel");
                    i0Var3 = null;
                }
                if (i13 != i0Var3.o()) {
                    wordBookDetailActivity.f26714k = false;
                    i0 i0Var4 = wordBookDetailActivity.f26705b;
                    if (i0Var4 == null) {
                        g0.S("mViewModel");
                        i0Var = null;
                    } else {
                        i0Var = i0Var4;
                    }
                    i0.G(i0Var, i13, null, false, 6, null);
                    z2Var.B.scrollToPosition(0);
                    ma.l.e(t.f73012k, ma.a.X3, k1.k(h1.a("order_type", Integer.valueOf(i13))));
                }
            }
        }
    }

    public static final g2 O1(WordBookDetailActivity wordBookDetailActivity, kj.a aVar) {
        if (aVar != null) {
            z2 z2Var = wordBookDetailActivity.f26704a;
            if (z2Var == null) {
                g0.S("mBinding");
                z2Var = null;
            }
            ic.c j11 = hc.c.l(aVar.i()).j(R.drawable.img_word_book_default);
            ImageView detailWordBookImg = z2Var.f57705e;
            g0.o(detailWordBookImg, "detailWordBookImg");
            j11.o(detailWordBookImg);
            z2Var.f57726z.setText(aVar.k());
            z2Var.f57724x.setText(wordBookDetailActivity.getString(R.string.word_book_detail_content_count, Integer.valueOf(aVar.n())));
            ImageView editBookName = z2Var.f57706f;
            g0.o(editBookName, "editBookName");
            sa.q.z(editBookName, !aVar.o());
            wordBookDetailActivity.l2(aVar.l());
        }
        return g2.f100423a;
    }

    public static final g2 P1(WordBookDetailActivity wordBookDetailActivity, Integer num) {
        z2 z2Var = wordBookDetailActivity.f26704a;
        i0 i0Var = null;
        if (z2Var == null) {
            g0.S("mBinding");
            z2Var = null;
        }
        z2Var.f57715o.setEnabled(num.intValue() > 0);
        z2 z2Var2 = wordBookDetailActivity.f26704a;
        if (z2Var2 == null) {
            g0.S("mBinding");
            z2Var2 = null;
        }
        ImageView imageView = z2Var2.f57711k;
        i0 i0Var2 = wordBookDetailActivity.f26705b;
        if (i0Var2 == null) {
            g0.S("mViewModel");
        } else {
            i0Var = i0Var2;
        }
        imageView.setSelected(num.intValue() == i0Var.r());
        return g2.f100423a;
    }

    public static final g2 Q1(WordBookDetailActivity wordBookDetailActivity, List list) {
        z2 z2Var = null;
        qb.c.b(f26700p, "word list change:" + (list != null ? Integer.valueOf(list.size()) : null), new Object[0]);
        w0 A1 = wordBookDetailActivity.A1();
        g0.m(list);
        A1.K(list, wordBookDetailActivity.f26714k);
        wordBookDetailActivity.f26714k = true;
        z2 z2Var2 = wordBookDetailActivity.f26704a;
        if (z2Var2 == null) {
            g0.S("mBinding");
        } else {
            z2Var = z2Var2;
        }
        RecyclerView wordDataRecycler = z2Var.B;
        g0.o(wordDataRecycler, "wordDataRecycler");
        List list2 = list;
        sa.q.z(wordDataRecycler, !list2.isEmpty());
        RadioGroup bookRadioGroup = z2Var.f57703c;
        g0.o(bookRadioGroup, "bookRadioGroup");
        sa.q.z(bookRadioGroup, !list2.isEmpty());
        z2Var.f57708h.setEnabled(!list2.isEmpty());
        z2Var.f57707g.setEnabled(!list2.isEmpty());
        z2Var.f57701a.f54089e.setEnabled(true ^ list2.isEmpty());
        z2Var.f57701a.f54089e.setAlpha(!list2.isEmpty() ? 1.0f : 0.3f);
        Group wbGroupNoWordView = z2Var.f57723w;
        g0.o(wbGroupNoWordView, "wbGroupNoWordView");
        sa.q.z(wbGroupNoWordView, list2.isEmpty());
        RadioGroup bookRadioGroupDisable = z2Var.f57704d;
        g0.o(bookRadioGroupDisable, "bookRadioGroupDisable");
        sa.q.z(bookRadioGroupDisable, list2.isEmpty());
        wordBookDetailActivity.i2(list);
        return g2.f100423a;
    }

    public static final g2 R1(WordBookDetailActivity wordBookDetailActivity, Boolean bool) {
        g0.m(bool);
        LoadingDialogActivity.setLoading$default(wordBookDetailActivity, bool.booleanValue(), 0L, null, 6, null);
        if (!bool.booleanValue()) {
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(wordBookDetailActivity), null, null, wordBookDetailActivity.new d(null), 3, null);
        }
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        z2 z2Var = this.f26704a;
        z2 z2Var2 = null;
        if (z2Var == null) {
            g0.S("mBinding");
            z2Var = null;
        }
        RecyclerView recyclerView = z2Var.B;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(A1());
        if (this.f26708e != 0) {
            z2 z2Var3 = this.f26704a;
            if (z2Var3 == null) {
                g0.S("mBinding");
                z2Var3 = null;
            }
            z2Var3.f57708h.setText(getString(R.string.word_favorite_books_btn_set_plan));
            z2 z2Var4 = this.f26704a;
            if (z2Var4 == null) {
                g0.S("mBinding");
                z2Var4 = null;
            }
            z2Var4.f57702b.setVisibility(8);
        }
        if (B1().a()) {
            z2 z2Var5 = this.f26704a;
            if (z2Var5 == null) {
                g0.S("mBinding");
            } else {
                z2Var2 = z2Var5;
            }
            TextView export = z2Var2.f57707g;
            g0.o(export, "export");
            sa.q.z(export, true);
        }
        C1();
        getLifecycle().addObserver(A1());
    }

    public static final w0 U1(WordBookDetailActivity wordBookDetailActivity) {
        i0 i0Var = wordBookDetailActivity.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        return new w0(i0Var);
    }

    public static final void V1(WordBookDetailActivity wordBookDetailActivity, ij.e it) {
        g0.p(it, "it");
        c40.k.f(LifecycleKt.getCoroutineScope(wordBookDetailActivity.getLifecycle()), null, null, new e(it, wordBookDetailActivity, null), 3, null);
    }

    public static final g2 W1(WordBookDetailActivity wordBookDetailActivity, FavoritePlanInfo it) {
        g0.p(it, "it");
        wordBookDetailActivity.f26709f = it;
        return g2.f100423a;
    }

    public static final void X1(WordBookDetailActivity wordBookDetailActivity, ActivityResult it) {
        g0.p(it, "it");
        wordBookDetailActivity.setResult(it.getResultCode(), it.getData());
        wordBookDetailActivity.finish();
    }

    public static final g2 Z1(final WordBookDetailActivity wordBookDetailActivity, u.a prompt) {
        g0.p(prompt, "$this$prompt");
        prompt.V("使用单词本分享功能时，请遵守《百词斩用户协议》第四条“服务使用规则”，文明分享，抵制低俗内容，共建绿色学习环境");
        prompt.O(false, "不再提示", new p() { // from class: mj.w
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 a22;
                a22 = WordBookDetailActivity.a2(WordBookDetailActivity.this, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
                return a22;
            }
        });
        d.a.J(prompt, "我已知悉", null, null, 6, null);
        return g2.f100423a;
    }

    public static final g2 a2(WordBookDetailActivity wordBookDetailActivity, boolean z11, int i11) {
        if (i11 == 1) {
            if (z11) {
                i9.f.j(wordBookDetailActivity, i9.f.E, true);
            }
            wordBookDetailActivity.b2();
        }
        return g2.f100423a;
    }

    public static final g2 c2(String str, String str2, int i11, WordBookDetailActivity wordBookDetailActivity, String code) {
        g0.p(code, "code");
        BczWebExecutorKt.startNormalWeb$default(wordBookDetailActivity, "https://activity.baicizhan.com/univs/word-book-share/?title=" + URLEncoder.encode(str, "UTF-8") + "&tag=" + URLEncoder.encode(str2, "UTF-8") + "&count=" + i11 + "&code=" + URLEncoder.encode(code, "UTF-8") + "&userBookId=" + wordBookDetailActivity.f26707d, null, false, 0, null, 60, null);
        return g2.f100423a;
    }

    public static final g2 f2(x00.l lVar, WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        lVar.invoke(it);
        wordBookDetailActivity.z1();
        return g2.f100423a;
    }

    public static final g2 h2(x00.l lVar, WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        lVar.invoke(it);
        PopupWindow popupWindow = wordBookDetailActivity.f26713j;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        return g2.f100423a;
    }

    private final void i2(List<? extends Object> list) {
        int L = list != null ? h0.L(list) : -1;
        if (list != null) {
            Iterator<T> it = this.f26716m.iterator();
            while (true) {
                z2 z2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                RecyclerView.ItemDecoration itemDecoration = (RecyclerView.ItemDecoration) it.next();
                z2 z2Var2 = this.f26704a;
                if (z2Var2 == null) {
                    g0.S("mBinding");
                } else {
                    z2Var = z2Var2;
                }
                z2Var.B.removeItemDecoration(itemDecoration);
            }
            this.f26716m.clear();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                if (1 <= i11 && i11 <= L) {
                    int i13 = i11 - 1;
                    if ((list.get(i13) instanceof z) && (obj instanceof z)) {
                        z2 z2Var3 = this.f26704a;
                        if (z2Var3 == null) {
                            g0.S("mBinding");
                            z2Var3 = null;
                        }
                        RecyclerView recyclerView = z2Var3.B;
                        xl.c cVar = new xl.c(this, 1, i13, i11, false, 16, null);
                        Drawable drawable = getResources().getDrawable(R.drawable.divider_height_1dp_color_gray06, null);
                        g0.o(drawable, "getDrawable(...)");
                        cVar.setDrawable(drawable);
                        this.f26716m.add(cVar);
                        recyclerView.addItemDecoration(cVar);
                        i11 = i12;
                    }
                }
                i11 = i12;
            }
        }
    }

    private final void m2() {
        z2 z2Var = this.f26704a;
        z2 z2Var2 = null;
        if (z2Var == null) {
            g0.S("mBinding");
            z2Var = null;
        }
        RecyclerView wordDataRecycler = z2Var.B;
        g0.o(wordDataRecycler, "wordDataRecycler");
        if (sa.q.m(wordDataRecycler)) {
            A1().H(true);
            z2 z2Var3 = this.f26704a;
            if (z2Var3 == null) {
                g0.S("mBinding");
                z2Var3 = null;
            }
            Group wbGroupBottomDeleteOperate = z2Var3.f57722v;
            g0.o(wbGroupBottomDeleteOperate, "wbGroupBottomDeleteOperate");
            sa.q.z(wbGroupBottomDeleteOperate, true);
            z2 z2Var4 = this.f26704a;
            if (z2Var4 == null) {
                g0.S("mBinding");
            } else {
                z2Var2 = z2Var4;
            }
            z2Var2.f57715o.setEnabled(false);
            this.f26715l = true;
        }
    }

    public static final g2 o2(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        wordBookDetailActivity.finish();
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2() {
        PopupWindow popupWindow;
        z2 z2Var = null;
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.popup_word_book_detail_menu, null, false);
        g0.o(inflate, "inflate(...)");
        cm cmVar = (cm) inflate;
        PopupWindow popupWindow2 = new PopupWindow(cmVar.getRoot());
        popupWindow2.setWidth(KotlinExtKt.getDimenPx(R.dimen.word_book_detail_pop_width));
        popupWindow2.setHeight(-2);
        popupWindow2.setFocusable(true);
        d2(0.75f);
        popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: mj.b0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                WordBookDetailActivity.q2(WordBookDetailActivity.this);
            }
        });
        this.f26713j = popupWindow2;
        final i0 i0Var = this.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        TextView showHideEnglish = cmVar.f54507f;
        g0.o(showHideEnglish, "showHideEnglish");
        boolean q11 = i0Var.q();
        int i11 = R.drawable.img_word_book_menu_show;
        j2(showHideEnglish, q11 ? R.drawable.img_word_book_menu_hide : R.drawable.img_word_book_menu_show);
        TextView showHideChinese = cmVar.f54506e;
        g0.o(showHideChinese, "showHideChinese");
        if (i0Var.p()) {
            i11 = R.drawable.img_word_book_menu_hide;
        }
        j2(showHideChinese, i11);
        TextView addWord = cmVar.f54502a;
        g0.o(addWord, "addWord");
        j2(addWord, R.drawable.ic_word_book_menu_add);
        TextView editBook = cmVar.f54504c;
        g0.o(editBook, "editBook");
        j2(editBook, R.drawable.img_word_book_menu_edit);
        TextView changeVoice = cmVar.f54503b;
        g0.o(changeVoice, "changeVoice");
        j2(changeVoice, R.drawable.img_word_book_menu_voice);
        if (B1().a()) {
            TextView textView = cmVar.f54505d;
            g0.m(textView);
            sa.q.z(textView, true);
            j2(textView, R.drawable.ic_history);
        }
        cmVar.f54507f.setText(getString(i0Var.q() ? R.string.word_book_menu_switch_hide_en : R.string.word_book_menu_switch_show_en));
        cmVar.f54506e.setText(getString(i0Var.p() ? R.string.word_book_menu_switch_hide_ch : R.string.word_book_menu_switch_show_ch));
        String string = getString(i0Var.u() ? R.string.word_book_menu_switch_voice_england : R.string.word_book_menu_switch_voice_america);
        g0.o(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        if (i0Var.l()) {
            spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.main_color_red)), 2, 3, 33);
        }
        cmVar.f54503b.setText(spannableString);
        cmVar.f54507f.setEnabled(i0Var.l());
        cmVar.f54506e.setEnabled(i0Var.l());
        cmVar.f54504c.setEnabled(i0Var.l());
        cmVar.f54503b.setEnabled(i0Var.l());
        TextView showHideEnglish2 = cmVar.f54507f;
        g0.o(showHideEnglish2, "showHideEnglish");
        g2(showHideEnglish2, new x00.l() { // from class: mj.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r22;
                r22 = WordBookDetailActivity.r2(i0.this, this, (View) obj);
                return r22;
            }
        });
        TextView showHideChinese2 = cmVar.f54506e;
        g0.o(showHideChinese2, "showHideChinese");
        g2(showHideChinese2, new x00.l() { // from class: mj.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s22;
                s22 = WordBookDetailActivity.s2(i0.this, this, (View) obj);
                return s22;
            }
        });
        TextView addWord2 = cmVar.f54502a;
        g0.o(addWord2, "addWord");
        g2(addWord2, new x00.l() { // from class: mj.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t22;
                t22 = WordBookDetailActivity.t2(WordBookDetailActivity.this, (View) obj);
                return t22;
            }
        });
        TextView editBook2 = cmVar.f54504c;
        g0.o(editBook2, "editBook");
        g2(editBook2, new x00.l() { // from class: mj.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u22;
                u22 = WordBookDetailActivity.u2(WordBookDetailActivity.this, (View) obj);
                return u22;
            }
        });
        TextView changeVoice2 = cmVar.f54503b;
        g0.o(changeVoice2, "changeVoice");
        g2(changeVoice2, new x00.l() { // from class: mj.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v22;
                v22 = WordBookDetailActivity.v2(i0.this, (View) obj);
                return v22;
            }
        });
        TextView pdfHistory = cmVar.f54505d;
        g0.o(pdfHistory, "pdfHistory");
        g2(pdfHistory, new x00.l() { // from class: mj.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 w22;
                w22 = WordBookDetailActivity.w2(WordBookDetailActivity.this, (View) obj);
                return w22;
            }
        });
        PopupWindow popupWindow3 = this.f26713j;
        if (popupWindow3 == null || popupWindow3.isShowing() || (popupWindow = this.f26713j) == null) {
            return;
        }
        z2 z2Var2 = this.f26704a;
        if (z2Var2 == null) {
            g0.S("mBinding");
        } else {
            z2Var = z2Var2;
        }
        popupWindow.showAsDropDown(z2Var.f57701a.f54088d, KotlinExtKt.getDimenPx(R.dimen.word_book_detail_pop_x_offset), 0);
    }

    public static final void q2(WordBookDetailActivity wordBookDetailActivity) {
        wordBookDetailActivity.d2(1.0f);
    }

    public static final g2 r2(i0 i0Var, WordBookDetailActivity wordBookDetailActivity, View view) {
        g0.p(view, "<unused var>");
        ma.l.e(t.f73012k, ma.a.f72717b4, k1.k(h1.a("button_type", i0Var.q() ? ma.b.K0 : ma.b.L0)));
        wordBookDetailActivity.f26714k = false;
        i0 i0Var2 = wordBookDetailActivity.f26705b;
        if (i0Var2 == null) {
            g0.S("mViewModel");
            i0Var2 = null;
        }
        i0Var2.P();
        return g2.f100423a;
    }

    public static final g2 s2(i0 i0Var, WordBookDetailActivity wordBookDetailActivity, View view) {
        g0.p(view, "<unused var>");
        ma.l.e(t.f73012k, ma.a.f72717b4, k1.k(h1.a("button_type", i0Var.p() ? ma.b.M0 : ma.b.N0)));
        wordBookDetailActivity.f26714k = false;
        i0 i0Var2 = wordBookDetailActivity.f26705b;
        if (i0Var2 == null) {
            g0.S("mViewModel");
            i0Var2 = null;
        }
        i0Var2.O();
        return g2.f100423a;
    }

    public static final g2 t2(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        ma.l.e(t.f73012k, ma.a.f72717b4, k1.k(h1.a("button_type", ma.b.O0)));
        i0 i0Var = wordBookDetailActivity.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        if (i0Var.r() >= 3000) {
            KotlinExtKt.showToast(KotlinExtKt.getToStr(R.string.word_book_cannot_add_word));
        } else {
            WordFavoriteAddActivity.a.b(WordFavoriteAddActivity.f26754c, wordBookDetailActivity, wordBookDetailActivity.f26707d, j.f66587b.a() ? FavoriteAddingMode.DESCRIPTION_AND_CAM : FavoriteAddingMode.DESCRIPTION, 0L, 8, null);
        }
        return g2.f100423a;
    }

    public static final g2 u2(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        ma.l.e(t.f73012k, ma.a.f72717b4, k1.k(h1.a("button_type", ma.b.P0)));
        wordBookDetailActivity.m2();
        return g2.f100423a;
    }

    public static final g2 v2(i0 i0Var, View view) {
        g0.p(view, "<unused var>");
        ma.l.e(t.f73012k, ma.a.f72717b4, k1.k(h1.a("button_type", i0Var.u() ? ma.b.Q0 : ma.b.R0)));
        i0Var.M(!i0Var.u());
        return g2.f100423a;
    }

    public static final g2 w2(WordBookDetailActivity wordBookDetailActivity, View it) {
        g0.p(it, "it");
        BczWebExecutorKt.startNormalWeb$default(wordBookDetailActivity, wordBookDetailActivity.getString(R.string.url_export_pdf_list, String.valueOf(wordBookDetailActivity.f26707d)), null, false, 0, null, 60, null);
        return g2.f100423a;
    }

    public static final n x2() {
        return ij.p.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1() {
        if (this.f26715l) {
            A1().H(false);
            z2 z2Var = this.f26704a;
            z2 z2Var2 = null;
            if (z2Var == null) {
                g0.S("mBinding");
                z2Var = null;
            }
            Group wbGroupBottomDeleteOperate = z2Var.f57722v;
            g0.o(wbGroupBottomDeleteOperate, "wbGroupBottomDeleteOperate");
            sa.q.z(wbGroupBottomDeleteOperate, false);
            z2 z2Var3 = this.f26704a;
            if (z2Var3 == null) {
                g0.S("mBinding");
            } else {
                z2Var2 = z2Var3;
            }
            z2Var2.f57711k.setSelected(false);
            this.f26715l = false;
        }
        SwipeMenuLayout.f20172i.e();
    }

    public final w0 A1() {
        return (w0) this.f26706c.getValue();
    }

    public final n B1() {
        return (n) this.f26711h.getValue();
    }

    public final void C1() {
        final z2 z2Var = this.f26704a;
        if (z2Var == null) {
            g0.S("mBinding");
            z2Var = null;
        }
        gs.a aVar = z2Var.f57701a;
        aVar.D(new View.OnClickListener() { // from class: mj.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordBookDetailActivity.D1(WordBookDetailActivity.this, view);
            }
        });
        aVar.L(new b());
        aVar.M(new c());
        if (this.f26708e != 0) {
            ImageView detailWordBookImg = z2Var.f57705e;
            g0.o(detailWordBookImg, "detailWordBookImg");
            e2(detailWordBookImg, new x00.l() { // from class: mj.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 F1;
                    F1 = WordBookDetailActivity.F1(WordBookDetailActivity.this, (View) obj);
                    return F1;
                }
            });
        }
        ImageView editBookName = z2Var.f57706f;
        g0.o(editBookName, "editBookName");
        e2(editBookName, new x00.l() { // from class: mj.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 G1;
                G1 = WordBookDetailActivity.G1(WordBookDetailActivity.this, (View) obj);
                return G1;
            }
        });
        TextView goStudy = z2Var.f57708h;
        g0.o(goStudy, "goStudy");
        e2(goStudy, new x00.l() { // from class: mj.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H1;
                H1 = WordBookDetailActivity.H1(WordBookDetailActivity.this, (View) obj);
                return H1;
            }
        });
        TextView export = z2Var.f57707g;
        g0.o(export, "export");
        e2(export, new x00.l() { // from class: mj.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I1;
                I1 = WordBookDetailActivity.I1(WordBookDetailActivity.this, (View) obj);
                return I1;
            }
        });
        TextView noproguardBtnDoDelete = z2Var.f57715o;
        g0.o(noproguardBtnDoDelete, "noproguardBtnDoDelete");
        e2(noproguardBtnDoDelete, new x00.l() { // from class: mj.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J1;
                J1 = WordBookDetailActivity.J1(WordBookDetailActivity.this, (View) obj);
                return J1;
            }
        });
        TextView noproguardBtnCancelDelete = z2Var.f57714n;
        g0.o(noproguardBtnCancelDelete, "noproguardBtnCancelDelete");
        e2(noproguardBtnCancelDelete, new x00.l() { // from class: mj.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K1;
                K1 = WordBookDetailActivity.K1((View) obj);
                return K1;
            }
        });
        z2Var.f57711k.setOnClickListener(new View.OnClickListener() { // from class: mj.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordBookDetailActivity.L1(WordBookDetailActivity.this, view);
            }
        });
        z2Var.f57703c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: mj.r
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                WordBookDetailActivity.M1(WordBookDetailActivity.this, z2Var, radioGroup, i11);
            }
        });
    }

    public final void N1() {
        i0 i0Var = this.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        i0Var.w().observe(this, new h(new x00.l() { // from class: mj.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O1;
                O1 = WordBookDetailActivity.O1(WordBookDetailActivity.this, (kj.a) obj);
                return O1;
            }
        }));
        A1().q().observe(this, new h(new x00.l() { // from class: mj.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P1;
                P1 = WordBookDetailActivity.P1(WordBookDetailActivity.this, (Integer) obj);
                return P1;
            }
        }));
        i0Var.v().observe(this, new h(new x00.l() { // from class: mj.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Q1;
                Q1 = WordBookDetailActivity.Q1(WordBookDetailActivity.this, (List) obj);
                return Q1;
            }
        }));
        i0Var.n().observe(this, new h(new x00.l() { // from class: mj.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R1;
                R1 = WordBookDetailActivity.R1(WordBookDetailActivity.this, (Boolean) obj);
                return R1;
            }
        }));
        i0Var.start();
        getLifecycle().addObserver(i0Var);
    }

    public final boolean T1() {
        return this.f26715l;
    }

    public final void Y1() {
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        String g11 = i9.f.g(this, i9.f.F, false);
        if (i9.f.c(this, i9.f.E) || g0.g(g11, format)) {
            b2();
        } else {
            i9.f.n(this, i9.f.F, format, false);
            mc.a.j(this, null, null, new x00.l() { // from class: mj.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 Z1;
                    Z1 = WordBookDetailActivity.Z1(WordBookDetailActivity.this, (u.a) obj);
                    return Z1;
                }
            }, 3, null);
        }
    }

    public final void b2() {
        Object obj;
        i0 i0Var = this.f26705b;
        if (i0Var == null) {
            g0.S("mViewModel");
            i0Var = null;
        }
        kj.a value = i0Var.w().getValue();
        if (value == null) {
            return;
        }
        final String k11 = value.k();
        List<Integer> l11 = value.l();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = l11.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Iterator<T> it2 = i3.b0().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((j3) obj).e() == intValue) {
                        break;
                    }
                }
            }
            j3 j3Var = (j3) obj;
            String f11 = j3Var != null ? j3Var.f() : null;
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        final String r32 = a00.r0.r3(arrayList, ",", null, null, 0, null, null, 62, null);
        final int n11 = value.n();
        i2.C(this, false, false, 0L, new x00.l() { // from class: mj.y
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 c22;
                c22 = WordBookDetailActivity.c2(k11, r32, n11, this, (String) obj2);
                return c22;
            }
        }, null, new g(null), 23, null);
    }

    public final void d2(float f11) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = f11;
        getWindow().setAttributes(attributes);
    }

    public final void e2(View view, final x00.l<? super View, g2> lVar) {
        sa.q.t(view, 0, new x00.l() { // from class: mj.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f22;
                f22 = WordBookDetailActivity.f2(x00.l.this, this, (View) obj);
                return f22;
            }
        }, 1, null);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableImmerseStatusBar() {
        return false;
    }

    public final void g2(@k View view, @k final x00.l<? super View, g2> listener) {
        g0.p(view, "<this>");
        g0.p(listener, "listener");
        sa.q.t(view, 0, new x00.l() { // from class: mj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h22;
                h22 = WordBookDetailActivity.h2(x00.l.this, this, (View) obj);
                return h22;
            }
        }, 1, null);
    }

    public final void j2(@k TextView textView, int i11) {
        g0.p(textView, "<this>");
        Drawable drawable = KotlinExtKt.getDrawable(i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(16));
        }
        textView.setCompoundDrawablePadding(KotlinExtKt.getDpPixels(4));
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public final void k2(boolean z11) {
        this.f26715l = z11;
    }

    public final void l2(List<Integer> list) {
        Object obj;
        z2 z2Var = this.f26704a;
        if (z2Var == null) {
            g0.S("mBinding");
            z2Var = null;
        }
        LinearLayout linearLayout = z2Var.A;
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Iterator<T> it2 = i3.b0().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((j3) obj).e() == intValue) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            j3 j3Var = (j3) obj;
            String f11 = j3Var != null ? j3Var.f() : null;
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        g0.m(linearLayout);
        sa.q.z(linearLayout, !arrayList.isEmpty());
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            TextView textView = new TextView(this);
            textView.setText((String) obj2);
            textView.setTextSize(12.0f);
            textView.setTextColor(getColor(R.color.main_color_word_7e));
            textView.setBackgroundResource(R.drawable.bg_word_book_detail_tag);
            textView.setPadding(KotlinExtKt.getDpPixels(6), KotlinExtKt.getDpPixels(1), KotlinExtKt.getDpPixels(6), KotlinExtKt.getDpPixels(3));
            TextViewCompat.setLineHeight(textView, (int) TypedValue.applyDimension(2, 18.0f, textView.getResources().getDisplayMetrics()));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            if (i11 > 0) {
                marginLayoutParams.setMarginStart(KotlinExtKt.getDpPixels(8));
            }
            linearLayout.addView(textView, marginLayoutParams);
            i11 = i12;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kc.d, kc.h] */
    public final void n2() {
        mc.a.p(this, ((u.a) d.a.J(mc.a.f(this).b0(ButtonType.SINGLE_POSITIVE).V("无可用单词本"), "退出", null, new x00.l() { // from class: mj.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o22;
                o22 = WordBookDetailActivity.o2(WordBookDetailActivity.this, (View) obj);
                return o22;
            }
        }, 2, null)).d(), null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r8.longValue() != (-1)) goto L18;
     */
    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@m80.l android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            android.content.Intent r2 = r12.getIntent()
            r3 = 0
            r5 = -1
            r7 = 0
            if (r2 == 0) goto L84
            java.lang.String r0 = "book_id"
            long r8 = r2.getLongExtra(r0, r5)
            r12.f26707d = r8
            java.lang.String r0 = "device_id"
            long r8 = r2.getLongExtra(r0, r3)
            r12.f26708e = r8
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto L74
            java.lang.String r8 = r0.getPath()
            java.lang.String r9 = "/vld"
            r10 = 2
            r11 = 0
            boolean r8 = u30.f0.d2(r8, r9, r11, r10, r7)
            if (r8 == 0) goto L74
            java.lang.String r8 = "bookId"
            java.lang.String r8 = r0.getQueryParameter(r8)     // Catch: java.lang.Exception -> L43
            if (r8 == 0) goto L45
            long r8 = java.lang.Long.parseLong(r8)     // Catch: java.lang.Exception -> L43
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L43
            goto L46
        L43:
            r0 = move-exception
            goto L6d
        L45:
            r8 = r7
        L46:
            if (r8 != 0) goto L49
            goto L51
        L49:
            long r9 = r8.longValue()     // Catch: java.lang.Exception -> L43
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 == 0) goto L52
        L51:
            r11 = 1
        L52:
            if (r11 == 0) goto L55
            goto L56
        L55:
            r8 = r7
        L56:
            if (r8 == 0) goto L84
            long r8 = r8.longValue()     // Catch: java.lang.Exception -> L43
            r12.f26707d = r8     // Catch: java.lang.Exception -> L43
            java.lang.String r8 = "deviceId"
            java.lang.String r0 = r0.getQueryParameter(r8)     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L84
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L43
            r12.f26708e = r8     // Catch: java.lang.Exception -> L43
            goto L74
        L6d:
            java.lang.String r8 = "WordBookDetailActivity"
            java.lang.String r9 = ""
            qb.c.c(r8, r9, r0)
        L74:
            java.lang.String r0 = "plan_info"
            java.io.Serializable r0 = r2.getSerializableExtra(r0)
            boolean r2 = r0 instanceof com.baicizhan.main.vld.model.FavoritePlanInfo
            if (r2 == 0) goto L81
            com.baicizhan.main.vld.model.FavoritePlanInfo r0 = (com.baicizhan.main.vld.model.FavoritePlanInfo) r0
            goto L82
        L81:
            r0 = r7
        L82:
            r12.f26709f = r0
        L84:
            long r8 = r12.f26707d
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L8e
            r12.n2()
            goto Lc6
        L8e:
            mj.f r0 = new mj.f
            r0.<init>()
            hj.p.d(r12, r0)
            long r5 = r12.f26708e
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto Lc6
            com.baicizhan.main.vld.model.FavoritePlanInfo r0 = r12.f26709f
            if (r0 != 0) goto Lb6
            mj.g r6 = new mj.g
            r6.<init>()
            com.baicizhan.main.word_book.detail.WordBookDetailActivity$f r8 = new com.baicizhan.main.word_book.detail.WordBookDetailActivity$f
            r8.<init>(r7)
            r9 = 22
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r1 = r12
            yg.i2.C(r1, r2, r3, r4, r6, r7, r8, r9, r10)
        Lb6:
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r0.<init>()
            mj.h r2 = new mj.h
            r2.<init>()
            androidx.activity.result.ActivityResultLauncher r0 = r12.registerForActivityResult(r0, r2)
            r12.f26710g = r0
        Lc6:
            com.baicizhan.main.wikiv2.studyv2.data.u0 r0 = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a
            com.baicizhan.main.wikiv2.studyv2.data.EntryPage r2 = com.baicizhan.main.wikiv2.studyv2.data.EntryPage.MY_WORD_BOOK_LIST
            r0.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.detail.WordBookDetailActivity.onCreate(android.os.Bundle):void");
    }
}
