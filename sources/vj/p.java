package vj;

import a00.l1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import c40.r0;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.main.wordlistv2.WordTodayCategory;
import com.baicizhan.main.wordlistv2.c1;
import com.baicizhan.main.wordlistv2.repo.EditAction;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import com.baicizhan.main.wordlistv2.t;
import com.baicizhan.main.wordlistv2.w0;
import com.jiongji.andriod.card.R;
import gs.hh;
import gs.jh;
import gs.lh;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import sa.q;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordListV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListV2Adapter.kt\ncom/baicizhan/main/wordlistv2/list/WordListV2Adapter\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,303:1\n35#2:304\n*S KotlinDebug\n*F\n+ 1 WordListV2Adapter.kt\ncom/baicizhan/main/wordlistv2/list/WordListV2Adapter\n*L\n177#1:304\n*E\n"})
/* loaded from: classes5.dex */
public final class p extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f94008f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f94009g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f94010h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f94011i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f94012j = 3;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WordListType f94013a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final w0 f94014b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final t f94015c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Object> f94016d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94017e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final hh f94018a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f94019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k p pVar, hh binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f94019b = pVar;
            this.f94018a = binding;
        }

        @m80.k
        public final hh a() {
            return this.f94018a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final lh f94020a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f94021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k p pVar, lh binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f94021b = pVar;
            this.f94020a = binding;
        }

        @m80.k
        public final lh a() {
            return this.f94020a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94022a;

        static {
            int[] iArr = new int[EditAction.values().length];
            try {
                iArr[EditAction.RELEARN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditAction.UNKILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditAction.KILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94022a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final jh f94023a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f94024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k p pVar, jh binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f94024b = pVar;
            this.f94023a = binding;
        }

        @m80.k
        public final jh a() {
            return this.f94023a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.list.WordListV2Adapter", f = "WordListV2Adapter.kt", i = {0}, l = {57}, m = "diffSetData", n = {"newList"}, s = {"L$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94025a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f94026b;

        /* renamed from: d, reason: collision with root package name */
        public int f94028d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94026b = obj;
            this.f94028d |= Integer.MIN_VALUE;
            return p.this.m(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.list.WordListV2Adapter$diffSetData$diff$1", f = "WordListV2Adapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super DiffUtil.DiffResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94029a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Object> f94031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<? extends Object> list, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f94031c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return p.this.new g(this.f94031c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super DiffUtil.DiffResult> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f94029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return DiffUtil.calculateDiff(new vj.f(p.this.f94016d, this.f94031c));
        }
    }

    public p(@m80.k WordListType type, @m80.k w0 activityVm, @m80.k t viewModel) {
        g0.p(type, "type");
        g0.p(activityVm, "activityVm");
        g0.p(viewModel, "viewModel");
        this.f94013a = type;
        this.f94014b = activityVm;
        this.f94015c = viewModel;
        this.f94016d = new ArrayList();
    }

    public static final g2 q(c1 c1Var, jh jhVar, p pVar, View it) {
        g0.p(it, "it");
        c1Var.B(!c1Var.p());
        View hideMeanView = jhVar.f55501a;
        g0.o(hideMeanView, "hideMeanView");
        View hideMeanView2 = jhVar.f55501a;
        g0.o(hideMeanView2, "hideMeanView");
        q.z(hideMeanView, !q.m(hideMeanView2));
        ma.l.e(ma.t.f73011j, ma.a.f72760h5, l1.W(h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(pVar.f94013a)), h1.a("topic_id", Integer.valueOf(c1Var.v()))));
        return g2.f100423a;
    }

    public static final g2 r(c1 c1Var, jh jhVar, p pVar, View it) {
        g0.p(it, "it");
        c1Var.C(!c1Var.z());
        jhVar.f55506f.setSelected(c1Var.z());
        pVar.f94015c.i(c1Var.z());
        return g2.f100423a;
    }

    public static final g2 s(p pVar, c1 c1Var, final jh jhVar, View it) {
        g0.p(it, "it");
        pVar.f94015c.K(c1Var.o(), new x00.a() { // from class: vj.n
            @Override // x00.a
            public final Object invoke() {
                g2 t11;
                t11 = p.t(jh.this);
                return t11;
            }
        }, new x00.a() { // from class: vj.o
            @Override // x00.a
            public final Object invoke() {
                g2 u11;
                u11 = p.u(jh.this);
                return u11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 t(jh jhVar) {
        jhVar.f55511k.setTextColor(KotlinExtKt.getColorInt(R.color.main_color_blue_dark));
        return g2.f100423a;
    }

    public static final g2 u(jh jhVar) {
        jhVar.f55511k.setTextColor(KotlinExtKt.getColorInt(R.color.color_on_surface));
        return g2.f100423a;
    }

    public static final g2 v(RecyclerView.ViewHolder viewHolder, c1 c1Var, p pVar, View it) {
        g0.p(it, "it");
        WordWikiActivity.a aVar = WordWikiActivity.f25556b;
        Context context = viewHolder.itemView.getContext();
        g0.o(context, "getContext(...)");
        WordWikiActivity.a.d(aVar, context, c1Var.v(), 0, null, 12, null);
        ma.l.e(ma.t.f73011j, ma.a.f72767i5, l1.W(h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(pVar.f94013a)), h1.a("topic_id", Integer.valueOf(c1Var.v()))));
        return g2.f100423a;
    }

    public static final g2 w(p pVar, EditAction editAction, c1 c1Var, View it) {
        String str;
        g0.p(it, "it");
        pVar.f94014b.d(editAction, a00.g0.l(Integer.valueOf(c1Var.v())));
        SwipeMenuLayout.f20172i.e();
        Pair a11 = h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(pVar.f94013a));
        Pair a12 = h1.a("topic_id", Integer.valueOf(c1Var.v()));
        int i11 = d.f94022a[editAction.ordinal()];
        if (i11 == 1) {
            str = "review";
        } else if (i11 == 2) {
            str = "unhash";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "hash";
        }
        ma.l.e(ma.t.f73011j, ma.a.f72774j5, l1.W(a11, a12, h1.a("click_type", str)));
        return g2.f100423a;
    }

    public static final g2 x(final p pVar, final c1 c1Var, final jh jhVar, View it) {
        g0.p(it, "it");
        hj.m l02 = pVar.f94014b.l0();
        if (l02 != null) {
            l02.r(nj.a.f75140b.a(c1Var), new hj.o() { // from class: vj.g
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    p.y(p.this, c1Var, jhVar, bool, jArr);
                }
            });
        }
        return g2.f100423a;
    }

    public static final void y(p pVar, c1 c1Var, jh jhVar, Boolean bool, long[] jArr) {
        g0.p(jArr, "<unused var>");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            c1Var.A(booleanValue);
            jhVar.f55503c.setSelected(booleanValue);
        }
        SwipeMenuLayout.f20172i.e();
        ma.l.e(ma.t.f73011j, ma.a.f72774j5, l1.W(h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(pVar.f94013a)), h1.a("topic_id", Integer.valueOf(c1Var.v())), h1.a("click_type", g0.g(bool, Boolean.TRUE) ? "collect" : "uncollect")));
    }

    public final void A(@m80.l Boolean bool) {
        this.f94017e = g0.g(bool, Boolean.TRUE);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94016d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        Object obj = this.f94016d.get(i11);
        if (obj instanceof c1) {
            return 1;
        }
        return obj instanceof WordTodayCategory ? 2 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@m80.k java.util.List<? extends java.lang.Object> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vj.p.f
            if (r0 == 0) goto L13
            r0 = r7
            vj.p$f r0 = (vj.p.f) r0
            int r1 = r0.f94028d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94028d = r1
            goto L18
        L13:
            vj.p$f r0 = new vj.p$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94026b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94028d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f94025a
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r7)
            goto L4d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            c40.m0 r7 = c40.h1.a()
            vj.p$g r2 = new vj.p$g
            r4 = 0
            r2.<init>(r6, r4)
            r0.f94025a = r6
            r0.f94028d = r3
            java.lang.Object r7 = c40.i.h(r7, r2, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            androidx.recyclerview.widget.DiffUtil$DiffResult r7 = (androidx.recyclerview.widget.DiffUtil.DiffResult) r7
            com.baicizhan.main.wordlistv2.w0 r0 = r5.f94014b
            androidx.lifecycle.MutableLiveData r0 = r0.o()
            r1 = 0
            java.lang.Boolean r1 = l00.a.a(r1)
            r0.setValue(r1)
            r7.dispatchUpdatesTo(r5)
            java.util.List<java.lang.Object> r7 = r5.f94016d
            r7.clear()
            java.util.List<java.lang.Object> r7 = r5.f94016d
            java.util.Collection r6 = (java.util.Collection) r6
            r7.addAll(r6)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.p.m(java.util.List, j00.c):java.lang.Object");
    }

    @m80.k
    public final WordListType n() {
        return this.f94013a;
    }

    @m80.k
    public final t o() {
        return this.f94015c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@m80.k final RecyclerView.ViewHolder holder, int i11) {
        String str;
        String sb2;
        g0.p(holder, "holder");
        Object obj = this.f94016d.get(i11);
        if (!(holder instanceof e)) {
            if (holder instanceof a) {
                hh a11 = ((a) holder).a();
                g0.n(obj, "null cannot be cast to non-null type com.baicizhan.main.wordlistv2.WordTodayCategory");
                WordTodayCategory wordTodayCategory = (WordTodayCategory) obj;
                TextView textView = a11.f55200b;
                WordTodayCategory wordTodayCategory2 = WordTodayCategory.LEARN;
                textView.setBackgroundTintList(ColorStateList.valueOf(KotlinExtKt.getColorInt(wordTodayCategory == wordTodayCategory2 ? R.color.color_tertiary_container : R.color.color_primary_container)));
                a11.f55200b.setText(wordTodayCategory == wordTodayCategory2 ? com.baicizhan.main.home.experiment.repo.q.f21581c : com.baicizhan.main.home.experiment.repo.q.f21582d);
                return;
            }
            if (holder instanceof c) {
                lh a12 = ((c) holder).a();
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    a12.f55777b.setText(str2);
                    return;
                }
                return;
            }
            return;
        }
        final jh a13 = ((e) holder).a();
        g0.n(obj, "null cannot be cast to non-null type com.baicizhan.main.wordlistv2.WordListWordModel");
        final c1 c1Var = (c1) obj;
        a13.f55505e.setImageDrawable(new vj.d(KotlinExtKt.getDpValue(4), KotlinExtKt.getDpValue(52), com.baicizhan.main.wordlistv2.b.a(c1Var)));
        a13.f55511k.setText(c1Var.w());
        a13.f55508h.setText(c1Var.r());
        View hideMeanView = a13.f55501a;
        g0.o(hideMeanView, "hideMeanView");
        q.z(hideMeanView, c1Var.p());
        TextView tvMean = a13.f55508h;
        g0.o(tvMean, "tvMean");
        q.t(tvMean, 0, new x00.l() { // from class: vj.h
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 q11;
                q11 = p.q(c1.this, a13, this, (View) obj2);
                return q11;
            }
        }, 1, null);
        ImageView selectCheck = a13.f55506f;
        g0.o(selectCheck, "selectCheck");
        q.z(selectCheck, this.f94017e);
        a13.f55507g.setForbidSwipe(this.f94017e);
        a13.f55506f.setSelected(c1Var.z());
        ImageView selectCheck2 = a13.f55506f;
        g0.o(selectCheck2, "selectCheck");
        q.t(selectCheck2, 0, new x00.l() { // from class: vj.i
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 r11;
                r11 = p.r(c1.this, a13, this, (View) obj2);
                return r11;
            }
        }, 1, null);
        TextView tvWord = a13.f55511k;
        g0.o(tvWord, "tvWord");
        q.t(tvWord, 0, new x00.l() { // from class: vj.j
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 s11;
                s11 = p.s(p.this, c1Var, a13, (View) obj2);
                return s11;
            }
        }, 1, null);
        ImageView ivMore = a13.f55504d;
        g0.o(ivMore, "ivMore");
        KotlinExtKt.expandTouchArea(ivMore, 5);
        ImageView ivMore2 = a13.f55504d;
        g0.o(ivMore2, "ivMore");
        q.t(ivMore2, 0, new x00.l() { // from class: vj.k
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 v11;
                v11 = p.v(RecyclerView.ViewHolder.this, c1Var, this, (View) obj2);
                return v11;
            }
        }, 1, null);
        WordListType wordListType = this.f94013a;
        WordListType wordListType2 = WordListType.TODAY;
        final EditAction editAction = wordListType == wordListType2 ? c1Var.q() >= 100 ? EditAction.RELEARN : c1Var.y() ? EditAction.UNKILL : EditAction.KILL : wordListType.getEditAction();
        TextView textView2 = a13.f55509i;
        int i12 = d.f94022a[editAction.ordinal()];
        if (i12 == 1) {
            str = "重学";
        } else if (i12 == 2) {
            str = "撤斩";
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "斩";
        }
        textView2.setText(str);
        TextView tvOperate = a13.f55509i;
        g0.o(tvOperate, "tvOperate");
        q.t(tvOperate, 0, new x00.l() { // from class: vj.l
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 w11;
                w11 = p.w(p.this, editAction, c1Var, (View) obj2);
                return w11;
            }
        }, 1, null);
        a13.f55503c.setSelected(c1Var.x());
        ImageView ivCollect = a13.f55503c;
        g0.o(ivCollect, "ivCollect");
        q.t(ivCollect, 0, new x00.l() { // from class: vj.m
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 x11;
                x11 = p.x(p.this, c1Var, a13, (View) obj2);
                return x11;
            }
        }, 1, null);
        TextView tvReviewInfo = a13.f55510j;
        g0.o(tvReviewInfo, "tvReviewInfo");
        WordListType wordListType3 = this.f94013a;
        WordListType wordListType4 = WordListType.LEARNING;
        q.z(tvReviewInfo, wordListType3 == wordListType4 || wordListType3 == wordListType2);
        int t11 = c1Var.t();
        TextView textView3 = a13.f55510j;
        if (this.f94013a == wordListType4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("下次复习：");
            if (t11 <= 0) {
                sb3.append("已逾期");
            }
            sb3.append(Math.abs(t11));
            sb3.append("天");
            if (t11 >= 0) {
                sb3.append("后");
            }
            sb2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            if (c1Var.y()) {
                sb4.append("已斩");
            } else if (c1Var.q() >= 100) {
                sb4.append("已熟识");
            } else if (c1Var.t() >= 1) {
                sb4.append("下次复习：" + c1Var.t() + "天");
            }
            sb2 = sb4.toString();
        }
        textView3.setText(sb2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    public RecyclerView.ViewHolder onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        if (i11 == 1) {
            jh e11 = jh.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new e(this, e11);
        }
        if (i11 != 2) {
            lh e12 = lh.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e12, "inflate(...)");
            return new c(this, e12);
        }
        hh e13 = hh.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e13, "inflate(...)");
        return new a(this, e13);
    }

    public final boolean p(int i11) {
        if (i11 < 0 || i11 >= this.f94016d.size()) {
            return false;
        }
        Object obj = this.f94016d.get(i11);
        return (obj instanceof WordTodayCategory) || (obj instanceof String);
    }

    public final void z(@m80.k List<? extends Object> newList) {
        g0.p(newList, "newList");
        this.f94016d.clear();
        this.f94016d.addAll(newList);
        this.f94014b.o().setValue(Boolean.FALSE);
        notifyDataSetChanged();
    }
}
