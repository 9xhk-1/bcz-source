package com.baicizhan.main.home.plan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.client.business.util.navigate.Navigator;
import com.baicizhan.client.business.util.report.RecyclerViewExposureHelper;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.baicizhan.client.wordtesting.activity.VocabularyTestGuideActivity;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.EverydayNoticeSettingActivity;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.PrepareLearningActivity;
import com.baicizhan.main.activity.ShowOffActivity;
import com.baicizhan.main.activity.TrainingActivity;
import com.baicizhan.main.activity.cake.CakeWebActivity;
import com.baicizhan.main.activity.daka.dakapage.DakaActivity;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.lookup.Candidate;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.lookup.SearchInfo;
import com.baicizhan.main.activity.lookup.SearchType;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.customview.MainPopdownMessageView;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.home.plan.PrioritizedTask;
import com.baicizhan.main.home.plan.WordPlanFragment;
import com.baicizhan.main.home.plan.data.WordBanner;
import com.baicizhan.main.home.plan.winningStreak.WinningStreakBarView;
import com.baicizhan.main.home.plan.winningStreak.b;
import com.baicizhan.main.model.data.GoldenNavigation;
import com.baicizhan.main.operate.share_code.ButtonInfo;
import com.baicizhan.main.operate.share_code.FriendTeamData;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.ad_property.AdLunchWechatProgram;
import com.baicizhan.online.user_assistant_api.ClipboardResp;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import gs.yb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Inject;
import jg.g;
import kc.d;
import kc.u;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lg.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,1412:1\n246#1:1429\n106#2,15:1413\n1#3:1428\n1#3:1430\n1869#4,2:1431\n360#4,7:1433\n388#4,7:1440\n360#4,7:1447\n388#4,7:1454\n1869#4,2:1462\n1869#4,2:1464\n35#5:1461\n*S KotlinDebug\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment\n*L\n309#1:1429\n180#1:1413,15\n309#1:1430\n413#1:1431,2\n418#1:1433,7\n419#1:1440,7\n433#1:1447,7\n434#1:1454,7\n699#1:1462,2\n1049#1:1464,2\n685#1:1461\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class WordPlanFragment extends com.baicizhan.main.home.plan.e implements be.i, q.c {

    @m80.k
    public static final a O = new a(null);
    public static final int P = 8;

    @m80.k
    public static final String Q = "WordPlanFragment";
    public static final float R = 0.5f;

    @m80.k
    public TreeSet<PrioritizedTask> A;

    @m80.l
    public c40.l2 B;

    @m80.k
    public final Observer<Boolean> C;
    public ActivityResultLauncher<yz.g2> D;
    public ActivityResultLauncher<b> E;
    public yb F;

    @m80.k
    public final Object G;

    @m80.l
    public Boolean H;

    @m80.k
    public final List<RecyclerViewExposureHelper> I;
    public boolean J;
    public kc.h K;
    public be.d L;
    public boolean M;

    @m80.l
    public va.b N;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public f f21826f;

    /* renamed from: g, reason: collision with root package name */
    public p50.h f21827g;

    /* renamed from: h, reason: collision with root package name */
    public e f21828h;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public List<? extends Object> f21831k;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public fe.k f21833m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public d f21834n;

    /* renamed from: o, reason: collision with root package name */
    public int f21835o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21836p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public u9.f f21837q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public sa.h f21838r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final LifecycleRegistry f21839s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21840t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21841u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21842v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21843w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21844x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21845y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21846z;

    /* renamed from: i, reason: collision with root package name */
    public float f21829i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21830j = true;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final List<RecyclerView.ItemDecoration> f21832l = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Intent f21847a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final PrioritizedTask f21848b;

        public b(@m80.k Intent intent, @m80.k PrioritizedTask task) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(task, "task");
            this.f21847a = intent;
            this.f21848b = task;
        }

        public static /* synthetic */ b d(b bVar, Intent intent, PrioritizedTask prioritizedTask, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                intent = bVar.f21847a;
            }
            if ((i11 & 2) != 0) {
                prioritizedTask = bVar.f21848b;
            }
            return bVar.c(intent, prioritizedTask);
        }

        @m80.k
        public final Intent a() {
            return this.f21847a;
        }

        @m80.k
        public final PrioritizedTask b() {
            return this.f21848b;
        }

        @m80.k
        public final b c(@m80.k Intent intent, @m80.k PrioritizedTask task) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(task, "task");
            return new b(intent, task);
        }

        @m80.k
        public final Intent e() {
            return this.f21847a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f21847a, bVar.f21847a) && kotlin.jvm.internal.g0.g(this.f21848b, bVar.f21848b);
        }

        @m80.k
        public final PrioritizedTask f() {
            return this.f21848b;
        }

        public int hashCode() {
            return (this.f21847a.hashCode() * 31) + this.f21848b.hashCode();
        }

        @m80.k
        public String toString() {
            return "TaskLauncherInfo(intent=" + this.f21847a + ", task=" + this.f21848b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$TaskStarterContract\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1412:1\n1#2:1413\n*E\n"})
    public static final class c extends ActivityResultContract<b, PrioritizedTask> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ArrayDeque<PrioritizedTask> f21849a = new ArrayDeque<>();

        @Override // androidx.activity.result.contract.ActivityResultContract
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@m80.k Context context, @m80.k b input) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(input, "input");
            Intent e11 = input.e();
            this.f21849a.add(input.f());
            qb.c.i(WordPlanFragment.Q, input.f() + " launcher created", new Object[0]);
            return e11;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrioritizedTask parseResult(int i11, @m80.l Intent intent) {
            PrioritizedTask poll = this.f21849a.poll();
            if (poll == null) {
                PrioritizedTask.None none = PrioritizedTask.None.f21808j;
                qb.c.q(WordPlanFragment.Q, "empty and none to poll!", new Object[0]);
                return none;
            }
            qb.c.i(WordPlanFragment.Q, poll + " launcher result parsed", new Object[0]);
            return poll;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$Timer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1412:1\n1#2:1413\n*E\n"})
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f21850a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f21851b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public CountDownTimer f21852c;

        /* renamed from: d, reason: collision with root package name */
        public long f21853d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends CountDownTimer {
            public a(long j11) {
                super(j11, 500L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                d.this.f21853d = 0L;
                d.this.f21851b.invoke();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                d.this.f21853d = j11;
            }
        }

        public d(long j11, @m80.k x00.a<yz.g2> tick) {
            kotlin.jvm.internal.g0.p(tick, "tick");
            this.f21850a = j11;
            this.f21851b = tick;
        }

        public final void c() {
            if (this.f21852c == null || this.f21853d == 0) {
                Long valueOf = Long.valueOf(this.f21853d);
                if (valueOf.longValue() == 0) {
                    valueOf = null;
                }
                this.f21852c = new a(valueOf != null ? valueOf.longValue() : this.f21850a).start();
            }
        }

        public final void d() {
            qb.c.b(WordPlanFragment.Q, "stop", new Object[0]);
            CountDownTimer countDownTimer = this.f21852c;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f21852c = null;
        }

        public /* synthetic */ d(long j11, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? 5000L : j11, aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends CoordinatorLayout.Behavior<ConstraintLayout> {

        /* renamed from: a, reason: collision with root package name */
        public int f21855a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final yz.c0 f21856b;

        public e() {
            this.f21856b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.h1
                @Override // x00.a
                public final Object invoke() {
                    int m11;
                    m11 = WordPlanFragment.e.m(WordPlanFragment.this);
                    return Integer.valueOf(m11);
                }
            });
        }

        public static final int m(WordPlanFragment wordPlanFragment) {
            return wordPlanFragment.getResources().getDimensionPixelSize(R.dimen.word_plan_top_bar_transformation_distance);
        }

        public final int i() {
            return ((Number) this.f21856b.getValue()).intValue();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onNestedScroll(@m80.k CoordinatorLayout coordinatorLayout, @m80.k ConstraintLayout child, @m80.k View target, int i11, int i12, int i13, int i14, int i15) {
            kotlin.jvm.internal.g0.p(coordinatorLayout, "coordinatorLayout");
            kotlin.jvm.internal.g0.p(child, "child");
            kotlin.jvm.internal.g0.p(target, "target");
            super.onNestedScroll(coordinatorLayout, child, target, i11, i12, i13, i14, i15);
            if (i12 != 0) {
                int i16 = this.f21855a + i12;
                this.f21855a = i16;
                if (i16 > 0) {
                    WordPlanFragment.u2(WordPlanFragment.this, Math.min(i(), this.f21855a) / i(), false, null, 0.0f, 14, null);
                } else {
                    WordPlanFragment.u2(WordPlanFragment.this, 0.0f, false, null, 0.0f, 14, null);
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(@m80.k CoordinatorLayout coordinatorLayout, @m80.k ConstraintLayout child, @m80.k View directTargetChild, @m80.k View target, int i11, int i12) {
            kotlin.jvm.internal.g0.p(coordinatorLayout, "coordinatorLayout");
            kotlin.jvm.internal.g0.p(child, "child");
            kotlin.jvm.internal.g0.p(directTargetChild, "directTargetChild");
            kotlin.jvm.internal.g0.p(target, "target");
            return (i11 & 2) != 0;
        }

        public final void l() {
            this.f21855a = 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void y(@m80.k PrioritizedTask prioritizedTask);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements x00.l {
        public g() {
        }

        public final void a(Void r12) {
            WordPlanFragment.this.T1();
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Void) obj);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.l {
        public h() {
        }

        public final void a(Void r32) {
            TrainingActivity.a aVar = TrainingActivity.f18233c;
            FragmentActivity requireActivity = WordPlanFragment.this.requireActivity();
            kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
            aVar.a(requireActivity);
            ma.l.a(ma.t.f73011j, ma.a.f72805o1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Void) obj);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$onCreate$3", f = "WordPlanFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<sg.c, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21860a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21861b;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            i iVar = WordPlanFragment.this.new i(cVar);
            iVar.f21861b = obj;
            return iVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sg.c cVar, j00.c<? super yz.g2> cVar2) {
            return ((i) create(cVar, cVar2)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            sg.c cVar = (sg.c) this.f21861b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21860a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (!kotlin.jvm.internal.g0.g(cVar.h(), b.a.f22992b)) {
                a3 W0 = WordPlanFragment.this.W0();
                Context requireContext = WordPlanFragment.this.requireContext();
                kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
                yb ybVar = WordPlanFragment.this.F;
                if (ybVar == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar = null;
                }
                WinningStreakBarView winning = ybVar.f57584h;
                kotlin.jvm.internal.g0.o(winning, "winning");
                W0.i1(new ce.i(requireContext, winning, null, 0, null, null, 0, 124, null));
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$1$1\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,1412:1\n35#2:1413\n35#2:1414\n*S KotlinDebug\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$1$1\n*L\n800#1:1413\n807#1:1414\n*E\n"})
    public static final class k implements RecyclerViewExposureHelper.ExposureDataCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lg.b f21864a;

        public k(lg.b bVar) {
            this.f21864a = bVar;
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onExposure(Object data, int i11, Size size) {
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(size, "size");
            mg.b bVar = data instanceof mg.b ? (mg.b) data : null;
            lg.b bVar2 = this.f21864a;
            if (bVar != null) {
                bVar2.I(bVar);
            }
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onUnExposure(Object data, int i11) {
            kotlin.jvm.internal.g0.p(data, "data");
            mg.b bVar = data instanceof mg.b ? (mg.b) data : null;
            lg.b bVar2 = this.f21864a;
            if (bVar != null) {
                bVar2.J();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l implements RecyclerViewExposureHelper.ExposureDataCallback {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$onViewCreated$1$8$2$1$onExposure$1", f = "WordPlanFragment.kt", i = {0, 0, 0, 0, 0}, l = {831}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordPlanFragment$onViewCreated$1$8$2$1$onExposure$1$1"}, s = {"L$0", "L$4", "L$5", "I$0", "I$1"}, v = 1)
        @kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$2$1$onExposure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1412:1\n1869#2,2:1413\n*S KotlinDebug\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$2$1$onExposure$1\n*L\n830#1:1413,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21866a;

            /* renamed from: b, reason: collision with root package name */
            public Object f21867b;

            /* renamed from: c, reason: collision with root package name */
            public Object f21868c;

            /* renamed from: d, reason: collision with root package name */
            public Object f21869d;

            /* renamed from: e, reason: collision with root package name */
            public Object f21870e;

            /* renamed from: f, reason: collision with root package name */
            public Object f21871f;

            /* renamed from: g, reason: collision with root package name */
            public int f21872g;

            /* renamed from: h, reason: collision with root package name */
            public int f21873h;

            /* renamed from: i, reason: collision with root package name */
            public int f21874i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Object f21875j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Size f21876k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Size size, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f21875j = obj;
                this.f21876k = size;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f21875j, this.f21876k, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List<String> list;
                Object obj2;
                Size size;
                Iterator it;
                Iterable iterable;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f21874i;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    AdExtraResp h11 = ((mg.g) this.f21875j).h();
                    if (h11 != null && (list = h11.imp_trackers) != null) {
                        List<String> list2 = list;
                        Size size2 = this.f21876k;
                        obj2 = this.f21875j;
                        size = size2;
                        it = list2.iterator();
                        iterable = list2;
                        i11 = 0;
                    }
                    return yz.g2.f100423a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f21872g;
                it = (Iterator) this.f21869d;
                obj2 = this.f21868c;
                size = (Size) this.f21867b;
                iterable = (Iterable) this.f21866a;
                kotlin.e.n(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    int width = size.getWidth();
                    int height = size.getHeight();
                    String valueOf = String.valueOf(((mg.g) obj2).h().price);
                    if (valueOf == null) {
                        valueOf = "";
                    }
                    mg.a aVar = new mg.a(0L, 0L, width, height, 0.0f, 0.0f, 0.0f, 0.0f, null, valueOf, 499, null);
                    kotlin.jvm.internal.g0.m(str);
                    this.f21866a = l00.k.a(iterable);
                    this.f21867b = size;
                    this.f21868c = obj2;
                    this.f21869d = it;
                    this.f21870e = l00.k.a(next);
                    this.f21871f = l00.k.a(str);
                    this.f21872g = i11;
                    this.f21873h = 0;
                    this.f21874i = 1;
                    if (k3.r(aVar, str, this) == l11) {
                        return l11;
                    }
                }
                return yz.g2.f100423a;
            }
        }

        public l() {
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onExposure(Object data, int i11, Size size) {
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(size, "size");
            if (data instanceof mg.g) {
                mg.g gVar = (mg.g) data;
                ma.l.e(ma.t.f73010i, ma.a.f72842t3, a00.l1.W(yz.h1.a("adv_id", gVar.i()), yz.h1.a("id", gVar.i()), yz.h1.a("idx", Integer.valueOf(gVar.k()))));
                c40.k.f(LifecycleOwnerKt.getLifecycleScope(WordPlanFragment.this), null, null, new a(data, size, null), 3, null);
            }
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onUnExposure(Object data, int i11) {
            kotlin.jvm.internal.g0.p(data, "data");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1412:1\n1869#2,2:1413\n*S KotlinDebug\n*F\n+ 1 WordPlanFragment.kt\ncom/baicizhan/main/home/plan/WordPlanFragment$onViewCreated$1$8$3$1\n*L\n852#1:1413,2\n*E\n"})
    public static final class m implements RecyclerViewExposureHelper.ExposureDataCallback {
        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onExposure(Object data, int i11, Size size) {
            List<mg.g> d11;
            kotlin.jvm.internal.g0.p(data, "data");
            kotlin.jvm.internal.g0.p(size, "size");
            mg.c cVar = data instanceof mg.c ? (mg.c) data : null;
            if (cVar == null || (d11 = cVar.d()) == null) {
                return;
            }
            for (mg.g gVar : d11) {
                ma.l.e(ma.t.f73010i, ma.a.f72842t3, a00.l1.W(yz.h1.a("adv_id", gVar.i()), yz.h1.a("id", gVar.i()), yz.h1.a("idx", Integer.valueOf(gVar.k()))));
            }
        }

        @Override // com.baicizhan.client.business.util.report.RecyclerViewExposureHelper.ExposureDataCallback
        public void onUnExposure(Object data, int i11) {
            kotlin.jvm.internal.g0.p(data, "data");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment", f = "WordPlanFragment.kt", i = {0, 0, 0, 1, 1, 1}, l = {480, 592}, m = "parseTaskIfAny", n = {"task", TypedValues.AttributesType.S_TARGET, "$i$a$-let-WordPlanFragment$parseTaskIfAny$2", "task", "$this$parseTaskIfAny_u24lambda_u241", "$i$a$-run-WordPlanFragment$parseTaskIfAny$3"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21877a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21878b;

        /* renamed from: c, reason: collision with root package name */
        public int f21879c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21880d;

        /* renamed from: f, reason: collision with root package name */
        public int f21882f;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21880d = obj;
            this.f21882f |= Integer.MIN_VALUE;
            return WordPlanFragment.this.D1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$parseTaskIfAny$2$1", f = "WordPlanFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21883a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PrioritizedTask f21885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(PrioritizedTask prioritizedTask, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f21885c = prioritizedTask;
        }

        public static final yz.g2 q(WordPlanFragment wordPlanFragment) {
            ma.l.e(ma.t.f73017p, ma.a.M1, a00.k1.k(yz.h1.a(ma.b.T1, 10)));
            wordPlanFragment.Y0().o1();
            wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.NewUser.class));
            return yz.g2.f100423a;
        }

        public static final yz.g2 r(WordPlanFragment wordPlanFragment) {
            ma.l.a(ma.t.f73017p, ma.a.L1);
            wordPlanFragment.Y0().o1();
            wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.NewUser.class));
            return yz.g2.f100423a;
        }

        public static final void u(WordPlanFragment wordPlanFragment, DialogInterface dialogInterface) {
            wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.PromptEmergency.class));
        }

        public static final yz.g2 w() {
            ma.l.a(ma.t.A, ma.a.f72751g3);
            return yz.g2.f100423a;
        }

        public static final yz.g2 z() {
            ma.l.a(ma.t.A, ma.a.f72744f3);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordPlanFragment.this.new o(this.f21885c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((o) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [kc.d, kc.h] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b s12;
            FragmentManager supportFragmentManager;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Object obj2 = WordPlanFragment.this.G;
            final WordPlanFragment wordPlanFragment = WordPlanFragment.this;
            PrioritizedTask prioritizedTask = this.f21885c;
            synchronized (obj2) {
                qb.c.b(WordPlanFragment.Q, "current tasks: " + wordPlanFragment.A + ", target = " + prioritizedTask, new Object[0]);
                if (!wordPlanFragment.J0(wordPlanFragment.A, prioritizedTask)) {
                    qb.c.b(WordPlanFragment.Q, prioritizedTask + " not needed", new Object[0]);
                    return yz.g2.f100423a;
                }
                ActivityResultLauncher activityResultLauncher = null;
                yb ybVar = null;
                yb ybVar2 = null;
                activityResultLauncher = null;
                ActivityResultLauncher activityResultLauncher2 = null;
                if (prioritizedTask instanceof PrioritizedTask.Notify) {
                    if (((PrioritizedTask.Notify) prioritizedTask).b().notify != null) {
                        yb ybVar3 = wordPlanFragment.F;
                        if (ybVar3 == null) {
                            kotlin.jvm.internal.g0.S("binding");
                        } else {
                            ybVar = ybVar3;
                        }
                        ybVar.f57581e.getRoot().t(((PrioritizedTask.Notify) prioritizedTask).b());
                        yz.g2 g2Var = yz.g2.f100423a;
                    }
                } else if (prioritizedTask instanceof PrioritizedTask.Ad) {
                    if (((PrioritizedTask.Ad) prioritizedTask).b().d().advNotify != null) {
                        yb ybVar4 = wordPlanFragment.F;
                        if (ybVar4 == null) {
                            kotlin.jvm.internal.g0.S("binding");
                        } else {
                            ybVar2 = ybVar4;
                        }
                        ybVar2.f57581e.getRoot().s(((PrioritizedTask.Ad) prioritizedTask).b().d());
                    }
                    yz.g2 g2Var2 = yz.g2.f100423a;
                } else if (prioritizedTask instanceof PrioritizedTask.CodeShare) {
                    wordPlanFragment.m2(((PrioritizedTask.CodeShare) prioritizedTask).b(), ((PrioritizedTask.CodeShare) prioritizedTask).c());
                    yz.g2 g2Var3 = yz.g2.f100423a;
                } else if (kotlin.jvm.internal.g0.g(prioritizedTask, PrioritizedTask.NewUser.f21806j)) {
                    FragmentActivity activity = wordPlanFragment.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        if (supportFragmentManager.findFragmentByTag("freshman_guide") != null) {
                            qb.c.q(WordPlanFragment.Q, "Attempt to show learning guide when already displayed.", new Object[0]);
                        } else if (com.baicizhan.main.home.experiment.q0.f21394a.b()) {
                            new rg.e().z(new x00.a() { // from class: com.baicizhan.main.home.plan.i1
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 q11;
                                    q11 = WordPlanFragment.o.q(WordPlanFragment.this);
                                    return q11;
                                }
                            }).show(supportFragmentManager, "freshman_guide");
                        } else {
                            new com.baicizhan.main.home.plan.view.a().w(new x00.a() { // from class: com.baicizhan.main.home.plan.j1
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 r11;
                                    r11 = WordPlanFragment.o.r(WordPlanFragment.this);
                                    return r11;
                                }
                            }).show(supportFragmentManager, "freshman_guide");
                        }
                        yz.g2 g2Var4 = yz.g2.f100423a;
                    }
                } else if (prioritizedTask instanceof PrioritizedTask.PromptEmergency) {
                    Pair<String, String> b11 = ((PrioritizedTask.PromptEmergency) prioritizedTask).b();
                    String component1 = b11.component1();
                    kotlin.jvm.internal.g0.o(component1, "component1(...)");
                    String component2 = b11.component2();
                    kotlin.jvm.internal.g0.o(component2, "component2(...)");
                    ?? d11 = ((u.a) d.a.I(mc.a.e(wordPlanFragment).b0(ButtonType.SINGLE_POSITIVE).X(R.drawable.warning_img_normal_default).M(component1).V(component2), R.string.i_know, null, null, 6, null)).d();
                    ((kc.u) d11).B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.main.home.plan.k1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            WordPlanFragment.o.u(WordPlanFragment.this, dialogInterface);
                        }
                    });
                    Result.m6307boximpl(mc.a.l(wordPlanFragment, d11, "server_fatal_error"));
                } else if (kotlin.jvm.internal.g0.g(prioritizedTask, PrioritizedTask.PromptPraise.f21816j)) {
                    wordPlanFragment.W1();
                    yz.g2 g2Var5 = yz.g2.f100423a;
                } else if (kotlin.jvm.internal.g0.g(prioritizedTask, PrioritizedTask.PromptReminder.f21818j)) {
                    wordPlanFragment.f2(new x00.a() { // from class: com.baicizhan.main.home.plan.l1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 w11;
                            w11 = WordPlanFragment.o.w();
                            return w11;
                        }
                    }, new x00.a() { // from class: com.baicizhan.main.home.plan.m1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 z11;
                            z11 = WordPlanFragment.o.z();
                            return z11;
                        }
                    });
                    ma.l.a(ma.t.A, ma.a.f72737e3);
                    yz.g2 g2Var6 = yz.g2.f100423a;
                } else {
                    if (prioritizedTask instanceof PrioritizedTask.RoleFillIn) {
                        ActivityResultLauncher activityResultLauncher3 = wordPlanFragment.E;
                        if (activityResultLauncher3 == null) {
                            kotlin.jvm.internal.g0.S("taskLauncher");
                        } else {
                            activityResultLauncher = activityResultLauncher3;
                        }
                        UserGradleActivity.a aVar = UserGradleActivity.f18481f;
                        FragmentActivity activity2 = wordPlanFragment.getActivity();
                        if (activity2 == null) {
                            return yz.g2.f100423a;
                        }
                        s12 = wordPlanFragment.s1(prioritizedTask, aVar.a(activity2, 1));
                    } else if (prioritizedTask instanceof PrioritizedTask.ShowOff) {
                        Pair<BookRecord, Integer> b12 = ((PrioritizedTask.ShowOff) prioritizedTask).b();
                        BookRecord component12 = b12.component1();
                        int intValue = b12.component2().intValue();
                        FragmentActivity activity3 = wordPlanFragment.getActivity();
                        if (activity3 == null) {
                            return yz.g2.f100423a;
                        }
                        ActivityResultLauncher activityResultLauncher4 = wordPlanFragment.E;
                        if (activityResultLauncher4 == null) {
                            kotlin.jvm.internal.g0.S("taskLauncher");
                        } else {
                            activityResultLauncher2 = activityResultLauncher4;
                        }
                        Intent M0 = ShowOffActivity.M0(activity3, component12.bookName, component12.wordCount, intValue, component12.bookId);
                        kotlin.jvm.internal.g0.o(M0, "createIntent(...)");
                        activityResultLauncher2.launch(wordPlanFragment.s1(prioritizedTask, M0), ActivityOptionsCompat.makeCustomAnimation(activity3, R.anim.slide_in_from_bottom, R.anim.business_no_fade_long));
                        yz.g2 g2Var7 = yz.g2.f100423a;
                    } else if (prioritizedTask instanceof PrioritizedTask.VocabularyTest) {
                        ActivityResultLauncher activityResultLauncher5 = wordPlanFragment.E;
                        if (activityResultLauncher5 == null) {
                            kotlin.jvm.internal.g0.S("taskLauncher");
                        } else {
                            activityResultLauncher = activityResultLauncher5;
                        }
                        FragmentActivity activity4 = wordPlanFragment.getActivity();
                        if (activity4 == null) {
                            return yz.g2.f100423a;
                        }
                        s12 = wordPlanFragment.s1(prioritizedTask, new Intent(activity4, (Class<?>) VocabularyTestGuideActivity.class));
                    } else {
                        qb.c.q(WordPlanFragment.Q, prioritizedTask + " unhandled", new Object[0]);
                        yz.g2 g2Var8 = yz.g2.f100423a;
                    }
                    activityResultLauncher.launch(s12);
                    yz.g2 g2Var9 = yz.g2.f100423a;
                }
                return yz.g2.f100423a;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$parseTaskIfAny$3$3", f = "WordPlanFragment.kt", i = {0}, l = {TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class p extends SuspendLambda implements x00.p<PrioritizedTask, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21886a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21887b;

        public p(j00.c<? super p> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            p pVar = WordPlanFragment.this.new p(cVar);
            pVar.f21887b = obj;
            return pVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PrioritizedTask prioritizedTask, j00.c<? super yz.g2> cVar) {
            return ((p) create(prioritizedTask, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PrioritizedTask prioritizedTask = (PrioritizedTask) this.f21887b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21886a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.b(WordPlanFragment.Q, "to update to " + prioritizedTask, new Object[0]);
                WordPlanFragment wordPlanFragment = WordPlanFragment.this;
                this.f21887b = l00.k.a(prioritizedTask);
                this.f21886a = 1;
                if (wordPlanFragment.D1(prioritizedTask, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$parseTasks$1", f = "WordPlanFragment.kt", i = {}, l = {613}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21889a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PrioritizedTask f21891c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(PrioritizedTask prioritizedTask, j00.c<? super q> cVar) {
            super(2, cVar);
            this.f21891c = prioritizedTask;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return WordPlanFragment.this.new q(this.f21891c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((q) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21889a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                WordPlanFragment wordPlanFragment = WordPlanFragment.this;
                PrioritizedTask prioritizedTask = this.f21891c;
                this.f21889a = 1;
                if (wordPlanFragment.D1(prioritizedTask, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f21892a;

        public r(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f21892a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f21892a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21892a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$showShareCodeDialog$1", f = "WordPlanFragment.kt", i = {0}, l = {1082}, m = "invokeSuspend", n = {"$i$a$-runCatching-WordPlanFragment$showShareCodeDialog$1$1"}, s = {"I$0"}, v = 1)
    public static final class s extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21893a;

        /* renamed from: b, reason: collision with root package name */
        public int f21894b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f21895c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ WordPlanFragment f21896d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ClipboardResp f21897e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.WordPlanFragment$showShareCodeDialog$1$1$1", f = "WordPlanFragment.kt", i = {}, l = {1083}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super ij.i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21898a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f21899b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f21899b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f21899b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super ij.i> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21898a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                com.baicizhan.main.word_book.data.impl.o oVar = new com.baicizhan.main.word_book.data.impl.o();
                String str = this.f21899b;
                this.f21898a = 1;
                Object l12 = oVar.l(str, this);
                return l12 == l11 ? l11 : l12;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, WordPlanFragment wordPlanFragment, ClipboardResp clipboardResp, j00.c<? super s> cVar) {
            super(2, cVar);
            this.f21895c = str;
            this.f21896d = wordPlanFragment;
            this.f21897e = clipboardResp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new s(this.f21895c, this.f21896d, this.f21897e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((s) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21894b;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    String str = this.f21895c;
                    Result.a aVar = Result.Companion;
                    c40.m0 c11 = c40.h1.c();
                    a aVar2 = new a(str, null);
                    this.f21893a = 0;
                    this.f21894b = 1;
                    obj = c40.i.h(c11, aVar2, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl((ij.i) obj);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            WordPlanFragment wordPlanFragment = this.f21896d;
            String str2 = this.f21895c;
            ClipboardResp clipboardResp = this.f21897e;
            if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                ij.i iVar = (ij.i) m6308constructorimpl;
                if (iVar.f()) {
                    WordFavoriteBooksActivity.a aVar4 = WordFavoriteBooksActivity.f26767c;
                    FragmentActivity requireActivity = wordPlanFragment.requireActivity();
                    kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
                    Pair a11 = yz.h1.a(str2, l00.a.f(clipboardResp.businessId));
                    String e11 = iVar.e();
                    if (e11 == null) {
                        e11 = "";
                    }
                    aVar4.b(requireActivity, Standard_extKt.triplet(a11, e11));
                }
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl != null) {
                qb.c.c(WordPlanFragment.Q, "get_share_code_info failed", m6311exceptionOrNullimpl);
            }
            WordPlanFragment.n2(this.f21896d);
            return yz.g2.f100423a;
        }
    }

    public WordPlanFragment() {
        final x00.a<Fragment> aVar = new x00.a<Fragment>() { // from class: com.baicizhan.main.home.plan.WordPlanFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.home.plan.WordPlanFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) x00.a.this.invoke();
            }
        });
        final x00.a aVar2 = null;
        this.f21836p = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(com.baicizhan.main.home.plan.winningStreak.e.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.home.plan.WordPlanFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(yz.c0.this);
                return m5612viewModels$lambda1.getViewModelStore();
            }
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.home.plan.WordPlanFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final CreationExtras invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                CreationExtras creationExtras;
                x00.a aVar3 = x00.a.this;
                if (aVar3 != null && (creationExtras = (CreationExtras) aVar3.invoke()) != null) {
                    return creationExtras;
                }
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b11);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.home.plan.WordPlanFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m5612viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m5612viewModels$lambda1 = FragmentViewModelLazyKt.m5612viewModels$lambda1(b11);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5612viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5612viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? Fragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        Lifecycle lifecycle = getLifecycle();
        kotlin.jvm.internal.g0.n(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        this.f21839s = (LifecycleRegistry) lifecycle;
        this.f21840t = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.n0
            @Override // x00.a
            public final Object invoke() {
                va.f K1;
                K1 = WordPlanFragment.K1(WordPlanFragment.this);
                return K1;
            }
        });
        this.f21841u = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.p0
            @Override // x00.a
            public final Object invoke() {
                int b12;
                b12 = WordPlanFragment.b1(WordPlanFragment.this);
                return Integer.valueOf(b12);
            }
        });
        this.f21842v = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.q0
            @Override // x00.a
            public final Object invoke() {
                int a12;
                a12 = WordPlanFragment.a1(WordPlanFragment.this);
                return Integer.valueOf(a12);
            }
        });
        this.f21843w = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.r0
            @Override // x00.a
            public final Object invoke() {
                int r22;
                r22 = WordPlanFragment.r2(WordPlanFragment.this);
                return Integer.valueOf(r22);
            }
        });
        this.f21844x = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.s0
            @Override // x00.a
            public final Object invoke() {
                int I0;
                I0 = WordPlanFragment.I0(WordPlanFragment.this);
                return Integer.valueOf(I0);
            }
        });
        this.f21845y = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.t0
            @Override // x00.a
            public final Object invoke() {
                a3 y22;
                y22 = WordPlanFragment.y2(WordPlanFragment.this);
                return y22;
            }
        });
        this.f21846z = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.u0
            @Override // x00.a
            public final Object invoke() {
                yg.h1 Z0;
                Z0 = WordPlanFragment.Z0(WordPlanFragment.this);
                return Z0;
            }
        });
        this.A = a00.v1.g(new Comparator() { // from class: com.baicizhan.main.home.plan.v0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int K0;
                K0 = WordPlanFragment.K0((PrioritizedTask) obj, (PrioritizedTask) obj2);
                return K0;
            }
        }, new PrioritizedTask[0]);
        this.C = new Observer() { // from class: com.baicizhan.main.home.plan.w0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordPlanFragment.M1(WordPlanFragment.this, (Boolean) obj);
            }
        };
        this.G = new Object();
        this.I = new ArrayList();
    }

    public static final yz.g2 A1(WordPlanFragment wordPlanFragment, yb ybVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (wordPlanFragment.W0().A0().length() > 0) {
            BczWebExecutorKt.startNormalWeb$default(wordPlanFragment.getContext(), wordPlanFragment.W0().A0(), null, false, 0, null, 60, null);
        } else {
            BczWebExecutorKt.startNormalWeb$default(wordPlanFragment.getContext(), "", null, false, 2, null, 44, null);
        }
        ma.l.e("notify-popup", ma.a.f72734e0, a00.k1.k(yz.h1.a(ma.b.V1, Integer.valueOf(ybVar.f57579c.b() ? 1 : 0))));
        return yz.g2.f100423a;
    }

    public static final yz.g2 B1(WordPlanFragment wordPlanFragment, boolean z11, yb ybVar, View view) {
        Pair pair;
        SearchInfo searchInfo;
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        FragmentActivity activity = wordPlanFragment.getActivity();
        if (activity == null) {
            return yz.g2.f100423a;
        }
        SearchType searchType = z11 ? SearchType.OCR : SearchType.NORMAL;
        fe.k kVar = wordPlanFragment.f21833m;
        if (kVar != null) {
            Candidate candidate = (Candidate) a00.r0.b3(kVar.f(), wordPlanFragment.f21835o);
            if (candidate != null) {
                pair = new Pair(Integer.valueOf(wordPlanFragment.f21835o), candidate.getKey());
            } else {
                candidate = null;
                pair = null;
            }
            searchInfo = new SearchInfo(candidate, wordPlanFragment.f21835o, kVar.e());
        } else {
            pair = null;
            searchInfo = null;
        }
        LookupWordActivity.n1(activity, searchType, searchInfo);
        if (pair != null) {
            ma.l.b(ma.t.f73003b, ma.a.N3, ma.u.d(new String[]{"index", "title"}, new Object[]{pair.getFirst(), pair.getSecond()}, false, 4, null));
        } else {
            ma.l.a(ma.t.f73003b, ma.a.I);
        }
        return yz.g2.f100423a;
    }

    public static final View C1(FragmentActivity fragmentActivity) {
        View findViewById = fragmentActivity.findViewById(R.id.bottom_navigation);
        if (findViewById != null) {
            AHBottomNavigation aHBottomNavigation = findViewById instanceof AHBottomNavigation ? (AHBottomNavigation) findViewById : null;
            if (aHBottomNavigation != null) {
                return aHBottomNavigation.p(4);
            }
        }
        return null;
    }

    public static /* synthetic */ Object E1(WordPlanFragment wordPlanFragment, PrioritizedTask prioritizedTask, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            prioritizedTask = null;
        }
        return wordPlanFragment.D1(prioritizedTask, cVar);
    }

    public static final PrioritizedTask F1(WordPlanFragment wordPlanFragment) {
        return (PrioritizedTask) a00.r0.y3(wordPlanFragment.A);
    }

    public static final yz.g2 G1(WordPlanFragment wordPlanFragment, PrioritizedTask it) {
        yz.g2 g2Var;
        kotlin.jvm.internal.g0.p(it, "it");
        synchronized (wordPlanFragment.G) {
            try {
                qb.c.b(Q, it + " done", new Object[0]);
                wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(it.getClass()));
                if (kotlin.jvm.internal.g0.g(it, PrioritizedTask.MainGuider.f21804j) && wordPlanFragment.M) {
                    wordPlanFragment.M = false;
                    wordPlanFragment.L1();
                }
                g2Var = yz.g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g2Var;
    }

    public static final int I0(WordPlanFragment wordPlanFragment) {
        return xb.f.a(wordPlanFragment.getContext(), 16.0f);
    }

    public static /* synthetic */ void I1(WordPlanFragment wordPlanFragment, PrioritizedTask prioritizedTask, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            prioritizedTask = null;
        }
        wordPlanFragment.H1(prioritizedTask);
    }

    public static final yz.g2 J1(Throwable th2) {
        String message;
        if (th2 == null || (message = th2.getMessage()) == null) {
            return yz.g2.f100423a;
        }
        qb.c.q(Q, "completed: " + message, new Object[0]);
        return yz.g2.f100423a;
    }

    public static final int K0(PrioritizedTask prioritizedTask, PrioritizedTask prioritizedTask2) {
        return prioritizedTask.a() - prioritizedTask2.a();
    }

    public static final va.f K1(WordPlanFragment wordPlanFragment) {
        va.f fVar = new va.f(wordPlanFragment.getActivity());
        fVar.setCancelable(false);
        return fVar;
    }

    private final void L1() {
        int i11;
        int i12;
        int i13;
        p50.h hVar;
        int i14;
        yb ybVar;
        List<?> U0 = U0();
        if (U0 != null) {
            for (RecyclerView.ItemDecoration itemDecoration : this.f21832l) {
                yb ybVar2 = this.F;
                if (ybVar2 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar = null;
                } else {
                    ybVar = ybVar2;
                }
                ybVar.f57580d.removeItemDecoration(itemDecoration);
            }
            this.f21832l.clear();
            int i15 = 0;
            for (Object obj : U0) {
                if ((obj instanceof mg.g) || (obj instanceof mg.b)) {
                    i11 = i15;
                    break;
                }
                i15++;
            }
            i11 = -1;
            ListIterator<?> listIterator = U0.listIterator(U0.size());
            while (listIterator.hasPrevious()) {
                Object previous = listIterator.previous();
                if ((previous instanceof mg.g) || (previous instanceof mg.b)) {
                    i12 = listIterator.nextIndex();
                    break;
                }
            }
            i12 = -1;
            if (i11 > -1 && i12 >= i11) {
                yb ybVar3 = this.F;
                if (ybVar3 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar3 = null;
                }
                RecyclerView recyclerView = ybVar3.f57580d;
                Context requireContext = requireContext();
                kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
                xl.c cVar = new xl.c(requireContext, 1, i11, i12, false, 16, null);
                Drawable drawable = getResources().getDrawable(R.drawable.divider_transparent_16dp);
                kotlin.jvm.internal.g0.o(drawable, "getDrawable(...)");
                cVar.setDrawable(drawable);
                this.f21832l.add(cVar);
                recyclerView.addItemDecoration(cVar);
            }
            Object A3 = a00.r0.A3(U0);
            if (A3 != null && (A3 instanceof mg.e)) {
                yb ybVar4 = this.F;
                if (ybVar4 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar4 = null;
                }
                RecyclerView recyclerView2 = ybVar4.f57580d;
                Context requireContext2 = requireContext();
                kotlin.jvm.internal.g0.o(requireContext2, "requireContext(...)");
                xl.c cVar2 = new xl.c(requireContext2, 1, U0.size() - 1, 0, false, 24, null);
                Drawable drawable2 = getResources().getDrawable(R.drawable.divider_transparent_36dp);
                kotlin.jvm.internal.g0.o(drawable2, "getDrawable(...)");
                cVar2.setDrawable(drawable2);
                this.f21832l.add(cVar2);
                recyclerView2.addItemDecoration(cVar2);
            }
            Iterator<?> it = U0.iterator();
            int i16 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i16 = -1;
                    break;
                } else if (it.next() instanceof mg.c) {
                    break;
                } else {
                    i16++;
                }
            }
            ListIterator<?> listIterator2 = U0.listIterator(U0.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    if (listIterator2.previous() instanceof mg.c) {
                        i13 = listIterator2.nextIndex();
                        break;
                    }
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (i16 > -1 && i13 >= i16) {
                if (i11 <= -1 || i12 < i11) {
                    i14 = i16;
                } else {
                    yb ybVar5 = this.F;
                    if (ybVar5 == null) {
                        kotlin.jvm.internal.g0.S("binding");
                        ybVar5 = null;
                    }
                    RecyclerView recyclerView3 = ybVar5.f57580d;
                    Context requireContext3 = requireContext();
                    kotlin.jvm.internal.g0.o(requireContext3, "requireContext(...)");
                    int i17 = i16;
                    xl.c cVar3 = new xl.c(requireContext3, 1, i16 - 1, i17, false, 16, null);
                    i14 = i17;
                    Drawable drawable3 = getResources().getDrawable(R.drawable.divider_transparent_16dp);
                    kotlin.jvm.internal.g0.o(drawable3, "getDrawable(...)");
                    cVar3.setDrawable(drawable3);
                    this.f21832l.add(cVar3);
                    recyclerView3.addItemDecoration(cVar3);
                }
                yb ybVar6 = this.F;
                if (ybVar6 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar6 = null;
                }
                RecyclerView recyclerView4 = ybVar6.f57580d;
                Context requireContext4 = requireContext();
                kotlin.jvm.internal.g0.o(requireContext4, "requireContext(...)");
                xl.c cVar4 = new xl.c(requireContext4, 1, i14, i13, false, 16, null);
                Drawable drawable4 = getResources().getDrawable(R.drawable.divider_transparent_12dp);
                kotlin.jvm.internal.g0.o(drawable4, "getDrawable(...)");
                cVar4.setDrawable(drawable4);
                this.f21832l.add(cVar4);
                recyclerView4.addItemDecoration(cVar4);
            }
            N1(U0);
            if (!t1(U0)) {
                yb ybVar7 = this.F;
                if (ybVar7 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar7 = null;
                }
                RecyclerView recyclerView5 = ybVar7.f57580d;
                Context requireContext5 = requireContext();
                kotlin.jvm.internal.g0.o(requireContext5, "requireContext(...)");
                xl.c cVar5 = new xl.c(requireContext5, 1, 0, 1, false, 16, null);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(0);
                yb ybVar8 = this.F;
                if (ybVar8 == null) {
                    kotlin.jvm.internal.g0.S("binding");
                    ybVar8 = null;
                }
                gradientDrawable.setSize(1, ybVar8.f57583g.getLayoutParams().height + N0());
                cVar5.setDrawable(gradientDrawable);
                cVar5.i(true);
                this.f21832l.add(cVar5);
                recyclerView5.addItemDecoration(cVar5);
            }
            p50.h hVar2 = this.f21827g;
            if (hVar2 == null) {
                kotlin.jvm.internal.g0.S("adapter");
                hVar2 = null;
            }
            hVar2.m(U0);
            p50.h hVar3 = this.f21827g;
            if (hVar3 == null) {
                kotlin.jvm.internal.g0.S("adapter");
                hVar = null;
            } else {
                hVar = hVar3;
            }
            hVar.notifyDataSetChanged();
        }
    }

    public static final boolean M0(h10.d dVar, PrioritizedTask it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return kotlin.jvm.internal.g0.g(kotlin.jvm.internal.o0.d(it.getClass()), dVar);
    }

    public static final void M1(WordPlanFragment wordPlanFragment, Boolean bool) {
        if (kotlin.jvm.internal.g0.g(bool, Boolean.TRUE)) {
            I1(wordPlanFragment, null, 1, null);
        }
    }

    public static final yz.g2 Q1(WordPlanFragment wordPlanFragment, FriendTeamData friendTeamData, ClipboardResp clipboardResp, String str, View it) {
        String action;
        kotlin.jvm.internal.g0.p(it, "it");
        Context requireContext = wordPlanFragment.requireContext();
        kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
        ButtonInfo confirm = friendTeamData.getConfirm();
        Navigator.navigate$default(requireContext, (confirm == null || (action = confirm.getAction()) == null) ? null : u30.k0.b6(action).toString(), null, 0, 12, null);
        ma.l.e("activity-common", ma.a.f72822q4, a00.l1.W(yz.h1.a(ma.b.f72889a1, String.valueOf(clipboardResp.businessId)), yz.h1.a(ma.b.f72893b1, "join"), yz.h1.a(ma.b.f72896c1, str)));
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.CodeShare.class));
        return yz.g2.f100423a;
    }

    public static final yz.g2 R1(ClipboardResp clipboardResp, String str, WordPlanFragment wordPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        ma.l.e("activity-common", ma.a.f72822q4, a00.l1.W(yz.h1.a(ma.b.f72889a1, String.valueOf(clipboardResp.businessId)), yz.h1.a(ma.b.f72893b1, "reject"), yz.h1.a(ma.b.f72896c1, str)));
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.CodeShare.class));
        return yz.g2.f100423a;
    }

    public static final void S1(WordPlanFragment wordPlanFragment) {
        kc.h hVar = wordPlanFragment.K;
        if (hVar == null) {
            kotlin.jvm.internal.g0.S("mShareDialog");
            hVar = null;
        }
        mc.a.l(wordPlanFragment, hVar, "share_dialog");
    }

    public static final void U1(RadioGroup radioGroup, WordPlanFragment wordPlanFragment, RadioGroup radioGroup2, int i11) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        String str = (String) text;
        va.b bVar = wordPlanFragment.N;
        if (bVar != null) {
            bVar.k(wordPlanFragment.getString(R.string.dialog_plan_more_title, Integer.valueOf(Integer.parseInt(str))));
            bVar.m(true);
        }
    }

    public static final void V1(RadioGroup radioGroup, WordPlanFragment wordPlanFragment, int i11, DialogInterface dialogInterface, int i12) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        int parseInt = Integer.parseInt((String) text);
        ma.l.b(ma.t.f73009h, ma.a.f72790m0, ma.u.d(new String[]{"count", "plan_type"}, new Object[]{Integer.valueOf(parseInt), ma.v.f73035f}, false, 4, null));
        wordPlanFragment.W0().r1(parseInt);
        if (i11 != parseInt) {
            i9.f.k(wordPlanFragment.getActivity(), i9.f.f60390p, parseInt);
        }
        u9.f.d(wordPlanFragment.V0(), TaskAction.WantMoreClick, false, parseInt, 2, null);
    }

    public static final yz.g2 X1(final WordPlanFragment wordPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        c2(wordPlanFragment, new x00.a() { // from class: com.baicizhan.main.home.plan.f1
            @Override // x00.a
            public final Object invoke() {
                yz.g2 Y1;
                Y1 = WordPlanFragment.Y1(WordPlanFragment.this);
                return Y1;
            }
        });
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y1(WordPlanFragment wordPlanFragment) {
        if (wordPlanFragment.getActivity() instanceof MainTabActivity) {
            FragmentActivity activity = wordPlanFragment.getActivity();
            kotlin.jvm.internal.g0.n(activity, "null cannot be cast to non-null type com.baicizhan.main.activity.MainTabActivity");
            ((MainTabActivity) activity).O1();
        }
        return yz.g2.f100423a;
    }

    public static final yg.h1 Z0(WordPlanFragment wordPlanFragment) {
        FragmentActivity requireActivity = wordPlanFragment.requireActivity();
        kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
        return (yg.h1) new ViewModelProvider(requireActivity).get(yg.h1.class);
    }

    public static final yz.g2 Z1(final WordPlanFragment wordPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        c2(wordPlanFragment, new x00.a() { // from class: com.baicizhan.main.home.plan.z0
            @Override // x00.a
            public final Object invoke() {
                yz.g2 a22;
                a22 = WordPlanFragment.a2(WordPlanFragment.this);
                return a22;
            }
        });
        return yz.g2.f100423a;
    }

    public static final int a1(WordPlanFragment wordPlanFragment) {
        return wordPlanFragment.getResources().getColor(R.color.top_bar_icon_and_text_color_light);
    }

    public static final yz.g2 a2(WordPlanFragment wordPlanFragment) {
        BczWebHelperKt.startFeedBack(wordPlanFragment.getActivity());
        return yz.g2.f100423a;
    }

    public static final int b1(WordPlanFragment wordPlanFragment) {
        return wordPlanFragment.getResources().getColor(R.color.top_bar_icon_and_text_color);
    }

    public static final yz.g2 b2(WordPlanFragment wordPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        d2(wordPlanFragment, null, 2, null);
        return yz.g2.f100423a;
    }

    private final void c1() {
        a3 W0 = W0();
        W0.C0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d12;
                d12 = WordPlanFragment.d1(WordPlanFragment.this, (Boolean) obj);
                return d12;
            }
        }));
        W0.y0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 e12;
                e12 = WordPlanFragment.e1(WordPlanFragment.this, (List) obj);
                return e12;
            }
        }));
        W0.w0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j12;
                j12 = WordPlanFragment.j1(WordPlanFragment.this, (String) obj);
                return j12;
            }
        }));
        W0.q0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 k12;
                k12 = WordPlanFragment.k1(WordPlanFragment.this, (String) obj);
                return k12;
            }
        }));
        W0.t0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 l12;
                l12 = WordPlanFragment.l1(WordPlanFragment.this, (AdLunchWechatProgram) obj);
                return l12;
            }
        }));
        W0.r0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m12;
                m12 = WordPlanFragment.m1(WordPlanFragment.this, (Pair) obj);
                return m12;
            }
        }));
        W0.s0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 n12;
                n12 = WordPlanFragment.n1(WordPlanFragment.this, (Boolean) obj);
                return n12;
            }
        }));
        W0.H0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o12;
                o12 = WordPlanFragment.o1(WordPlanFragment.this, (Integer) obj);
                return o12;
            }
        }));
        W0.u0().observe(getViewLifecycleOwner(), new Observer() { // from class: com.baicizhan.main.home.plan.g0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordPlanFragment.p1(WordPlanFragment.this, obj);
            }
        });
        W0.F0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q12;
                q12 = WordPlanFragment.q1(WordPlanFragment.this, (Pair) obj);
                return q12;
            }
        }));
        W0.G0().observe(getViewLifecycleOwner(), new r(new g()));
        W0.E0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 f12;
                f12 = WordPlanFragment.f1(WordPlanFragment.this, (Boolean) obj);
                return f12;
            }
        }));
        W0.B0().observe(getViewLifecycleOwner(), new Observer() { // from class: com.baicizhan.main.home.plan.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WordPlanFragment.g1(WordPlanFragment.this, obj);
            }
        });
        W0.v0().observe(getViewLifecycleOwner(), new r(new h()));
        W0.o0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h12;
                h12 = WordPlanFragment.h1(WordPlanFragment.this, (Boolean) obj);
                return h12;
            }
        }));
        W0.p0().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i12;
                i12 = WordPlanFragment.i1(WordPlanFragment.this, (String) obj);
                return i12;
            }
        }));
        O0().G().observe(getViewLifecycleOwner(), new r(new x00.l() { // from class: com.baicizhan.main.home.plan.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 r12;
                r12 = WordPlanFragment.r1(WordPlanFragment.this, (Boolean) obj);
                return r12;
            }
        }));
    }

    public static final void c2(WordPlanFragment wordPlanFragment, x00.a<yz.g2> aVar) {
        aVar.invoke();
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.PromptPraise.class));
        gi.v.a(8192);
    }

    public static final yz.g2 d1(WordPlanFragment wordPlanFragment, Boolean bool) {
        List<Object> U0;
        qb.c.b(Q, "reviewing: from " + wordPlanFragment.H + " to " + bool, new Object[0]);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = wordPlanFragment.H;
            if (bool2 != null && booleanValue != bool2.booleanValue() && (U0 = wordPlanFragment.U0()) != null) {
                wordPlanFragment.N1(U0);
            }
        }
        wordPlanFragment.H = bool;
        return yz.g2.f100423a;
    }

    public static /* synthetic */ void d2(WordPlanFragment wordPlanFragment, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: com.baicizhan.main.home.plan.m0
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 e22;
                    e22 = WordPlanFragment.e2();
                    return e22;
                }
            };
        }
        c2(wordPlanFragment, aVar);
    }

    public static final yz.g2 e1(WordPlanFragment wordPlanFragment, List list) {
        yz.g2 g2Var;
        qb.c.i(Q, "new items coming", new Object[0]);
        synchronized (wordPlanFragment.G) {
            wordPlanFragment.f21831k = list;
            g2Var = yz.g2.f100423a;
        }
        if (wordPlanFragment.v1()) {
            wordPlanFragment.M = true;
            return g2Var;
        }
        wordPlanFragment.L1();
        return g2Var;
    }

    public static final yz.g2 e2() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 f1(WordPlanFragment wordPlanFragment, Boolean bool) {
        yb ybVar = wordPlanFragment.F;
        if (ybVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar = null;
        }
        ybVar.f57579c.setShowRedDot(kotlin.jvm.internal.g0.g(bool, Boolean.TRUE));
        return yz.g2.f100423a;
    }

    public static final void g1(WordPlanFragment wordPlanFragment, Object obj) {
        if (wordPlanFragment.getActivity() != null) {
            ma.l.a(ma.t.f73009h, ma.a.f72769j0);
            ActivityResultLauncher<yz.g2> activityResultLauncher = wordPlanFragment.D;
            if (activityResultLauncher == null) {
                kotlin.jvm.internal.g0.S("planAdjustLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(yz.g2.f100423a);
        }
    }

    public static final yz.g2 g2(final WordPlanFragment wordPlanFragment, final x00.a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        j2(wordPlanFragment, new x00.a() { // from class: com.baicizhan.main.home.plan.c1
            @Override // x00.a
            public final Object invoke() {
                yz.g2 h22;
                h22 = WordPlanFragment.h2(WordPlanFragment.this, aVar);
                return h22;
            }
        });
        return yz.g2.f100423a;
    }

    public static final yz.g2 h1(WordPlanFragment wordPlanFragment, Boolean bool) {
        List<RecyclerViewExposureHelper> list = wordPlanFragment.I;
        kotlin.jvm.internal.g0.m(bool);
        if (!bool.booleanValue()) {
            list = null;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RecyclerViewExposureHelper) it.next()).onVisible();
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 h2(WordPlanFragment wordPlanFragment, x00.a aVar) {
        EverydayNoticeSettingActivity.U0(wordPlanFragment.getActivity());
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 i1(WordPlanFragment wordPlanFragment, String str) {
        sa.h hVar;
        kotlin.jvm.internal.g0.m(str);
        if (str.length() > 0 && (hVar = wordPlanFragment.f21838r) != null) {
            sa.h.l(hVar, null, str, 1, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 i2(x00.a aVar, WordPlanFragment wordPlanFragment, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        j2(wordPlanFragment, aVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 j1(WordPlanFragment wordPlanFragment, String str) {
        if (str != null) {
            BczWebExecutorKt.startNormalWeb$default(wordPlanFragment.getActivity(), str, null, false, 0, null, 60, null);
        }
        return yz.g2.f100423a;
    }

    public static final void j2(WordPlanFragment wordPlanFragment, x00.a<yz.g2> aVar) {
        aVar.invoke();
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.PromptReminder.class));
        ia.a.i(ia.a.f60471v, false);
    }

    public static final yz.g2 k1(WordPlanFragment wordPlanFragment, String str) {
        try {
            Result.a aVar = Result.Companion;
            Context requireContext = wordPlanFragment.requireContext();
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.addFlags(268435456);
            requireContext.startActivity(intent);
            Result.m6308constructorimpl(yz.g2.f100423a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        return yz.g2.f100423a;
    }

    public static /* synthetic */ void k2(WordPlanFragment wordPlanFragment, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: com.baicizhan.main.home.plan.d1
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 l22;
                    l22 = WordPlanFragment.l2();
                    return l22;
                }
            };
        }
        j2(wordPlanFragment, aVar);
    }

    public static final yz.g2 l1(WordPlanFragment wordPlanFragment, AdLunchWechatProgram adLunchWechatProgram) {
        WeixinAuthHelper.A().D(wordPlanFragment.requireContext(), adLunchWechatProgram.program_id, adLunchWechatProgram.program_path, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 l2() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 m1(WordPlanFragment wordPlanFragment, Pair pair) {
        String str;
        FragmentActivity activity = wordPlanFragment.getActivity();
        if (pair == null || (str = (String) pair.getFirst()) == null) {
            return yz.g2.f100423a;
        }
        CakeWebActivity.N0(activity, str, ((Boolean) pair.getSecond()).booleanValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 n1(WordPlanFragment wordPlanFragment, Boolean bool) {
        if (bool == null) {
            return yz.g2.f100423a;
        }
        if (bool.booleanValue()) {
            DakaActivity.h1(wordPlanFragment.getActivity(), true);
            return yz.g2.f100423a;
        }
        ImageDakaV2Activity.a aVar = ImageDakaV2Activity.f18406d;
        FragmentActivity requireActivity = wordPlanFragment.requireActivity();
        kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
        aVar.a(requireActivity);
        return yz.g2.f100423a;
    }

    public static final void n2(WordPlanFragment wordPlanFragment) {
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.CodeShare.class));
        gi.d.a();
    }

    public static final yz.g2 o1(WordPlanFragment wordPlanFragment, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            wordPlanFragment.S0().f(wordPlanFragment.getString(R.string.learn_tab_merge_learning_record_tips, Integer.valueOf(intValue)));
            if (intValue == 100 && wordPlanFragment.S0().isShowing()) {
                wordPlanFragment.S0().dismiss();
            } else if (intValue != 100 && !wordPlanFragment.S0().isShowing()) {
                wordPlanFragment.S0().show();
            }
        }
        return yz.g2.f100423a;
    }

    public static final void p1(WordPlanFragment wordPlanFragment, Object obj) {
        wordPlanFragment.startActivity(new Intent(wordPlanFragment.getActivity(), (Class<?>) PrepareLearningActivity.class));
        ig.b.f60539a.c(new pg.l0().d().getStatus().isNormalLearning() ? AppPageStatus.STUDY_NORMAL : AppPageStatus.STUDY_FINAL_REVIEW);
    }

    public static final yz.g2 p2(WordPlanFragment wordPlanFragment, Map map, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordPlanFragment.W0().p1();
        ma.l.e(ma.t.f73014m, ma.a.f72826r1, map);
        qb.c.i(Q, "user confirm update", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 q1(WordPlanFragment wordPlanFragment, Pair pair) {
        if (pair == null) {
            return yz.g2.f100423a;
        }
        wordPlanFragment.o2(pair);
        return yz.g2.f100423a;
    }

    public static final yz.g2 q2(WordPlanFragment wordPlanFragment, Map map, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordPlanFragment.W0().q1();
        ma.l.e(ma.t.f73014m, ma.a.f72833s1, map);
        qb.c.i(Q, "user reject update", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r1(WordPlanFragment wordPlanFragment, Boolean bool) {
        if (!bool.booleanValue() || wordPlanFragment.isHidden()) {
            d dVar = wordPlanFragment.f21834n;
            if (dVar != null) {
                dVar.d();
            }
        } else {
            d dVar2 = wordPlanFragment.f21834n;
            if (dVar2 != null) {
                dVar2.c();
            }
        }
        return yz.g2.f100423a;
    }

    public static final int r2(WordPlanFragment wordPlanFragment) {
        return zb.a.k(wordPlanFragment.getActivity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean u1(WordPlanFragment wordPlanFragment, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wordPlanFragment.f21831k;
        }
        return wordPlanFragment.t1(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u2(WordPlanFragment wordPlanFragment, float f11, boolean z11, List list, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            list = wordPlanFragment.f21831k;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.5f;
        }
        wordPlanFragment.t2(f11, z11, list, f12);
    }

    public static final void v2(WordPlanFragment wordPlanFragment, boolean z11) {
        wordPlanFragment.X0().k(!z11);
        zb.a.f(wordPlanFragment.getActivity(), z11);
        w2(wordPlanFragment, z11);
        wordPlanFragment.f21830j = z11;
    }

    public static final void w2(final WordPlanFragment wordPlanFragment, final boolean z11) {
        final int P0 = z11 ? wordPlanFragment.P0() : wordPlanFragment.Q0();
        final ColorStateList valueOf = ColorStateList.valueOf(P0);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        yb ybVar = wordPlanFragment.F;
        if (ybVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar = null;
        }
        ConstraintLayout topBar = ybVar.f57583g;
        kotlin.jvm.internal.g0.o(topBar, "topBar");
        sa.q.i(topBar, true, new x00.l() { // from class: com.baicizhan.main.home.plan.b1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 x22;
                x22 = WordPlanFragment.x2(valueOf, P0, wordPlanFragment, z11, (View) obj);
                return x22;
            }
        });
    }

    public static final void x1(Boolean it) {
        kotlin.jvm.internal.g0.p(it, "it");
        it.getClass();
    }

    public static final yz.g2 x2(ColorStateList colorStateList, int i11, WordPlanFragment wordPlanFragment, boolean z11, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it instanceof ImageView) {
            ((ImageView) it).setImageTintList(colorStateList);
        } else if (it instanceof TextView) {
            ((TextView) it).setTextColor(i11);
        } else if (it instanceof ViewAnimator) {
            ((ViewAnimator) it).setBackground(wordPlanFragment.getResources().getDrawable(z11 ? R.drawable.bg_button_word_search : R.drawable.bg_button_word_search_light));
        }
        return yz.g2.f100423a;
    }

    public static final void y1(WordPlanFragment wordPlanFragment, PrioritizedTask it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(it.getClass()));
    }

    public static final a3 y2(WordPlanFragment wordPlanFragment) {
        FragmentActivity requireActivity = wordPlanFragment.requireActivity();
        kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
        return (a3) new ViewModelProvider(requireActivity, new p1(wordPlanFragment, wordPlanFragment)).get(a3.class);
    }

    public static final boolean z1(WordPlanFragment wordPlanFragment, View view, MotionEvent motionEvent) {
        return wordPlanFragment.f21829i > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r10 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r10.W0(r2, r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.baicizhan.main.home.plan.PrioritizedTask r9, j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.home.plan.WordPlanFragment.n
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.main.home.plan.WordPlanFragment$n r0 = (com.baicizhan.main.home.plan.WordPlanFragment.n) r0
            int r1 = r0.f21882f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21882f = r1
            goto L18
        L13:
            com.baicizhan.main.home.plan.WordPlanFragment$n r0 = new com.baicizhan.main.home.plan.WordPlanFragment$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f21880d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21882f
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f21878b
            com.baicizhan.main.home.plan.WordPlanFragment r9 = (com.baicizhan.main.home.plan.WordPlanFragment) r9
            java.lang.Object r9 = r0.f21877a
            com.baicizhan.main.home.plan.PrioritizedTask r9 = (com.baicizhan.main.home.plan.PrioritizedTask) r9
            kotlin.e.n(r10)
            goto L99
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f21878b
            com.baicizhan.main.home.plan.PrioritizedTask r9 = (com.baicizhan.main.home.plan.PrioritizedTask) r9
            java.lang.Object r9 = r0.f21877a
            com.baicizhan.main.home.plan.PrioritizedTask r9 = (com.baicizhan.main.home.plan.PrioritizedTask) r9
            kotlin.e.n(r10)
            goto L6d
        L4a:
            kotlin.e.n(r10)
            if (r9 == 0) goto L6f
            androidx.lifecycle.LifecycleRegistry r10 = r8.f21839s
            com.baicizhan.main.home.plan.WordPlanFragment$o r2 = new com.baicizhan.main.home.plan.WordPlanFragment$o
            r2.<init>(r9, r3)
            java.lang.Object r7 = l00.k.a(r9)
            r0.f21877a = r7
            java.lang.Object r7 = l00.k.a(r9)
            r0.f21878b = r7
            r0.f21879c = r4
            r0.f21882f = r6
            java.lang.Object r10 = androidx.lifecycle.PausingDispatcherKt.whenResumed(r10, r2, r0)
            if (r10 != r1) goto L6d
            goto L98
        L6d:
            if (r10 != 0) goto L9b
        L6f:
            com.baicizhan.main.home.plan.a3 r10 = r8.W0()
            com.baicizhan.main.home.plan.h r2 = new com.baicizhan.main.home.plan.h
            r2.<init>()
            com.baicizhan.main.home.plan.s r6 = new com.baicizhan.main.home.plan.s
            r6.<init>()
            com.baicizhan.main.home.plan.WordPlanFragment$p r7 = new com.baicizhan.main.home.plan.WordPlanFragment$p
            r7.<init>(r3)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f21877a = r9
            java.lang.Object r9 = l00.k.a(r8)
            r0.f21878b = r9
            r0.f21879c = r4
            r0.f21882f = r5
            java.lang.Object r9 = r10.W0(r2, r6, r7, r0)
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            yz.g2 r9 = yz.g2.f100423a
        L9b:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.WordPlanFragment.D1(com.baicizhan.main.home.plan.PrioritizedTask, j00.c):java.lang.Object");
    }

    public final void H1(PrioritizedTask prioritizedTask) {
        c40.l2 f11;
        c40.l2 l2Var = this.B;
        if (l2Var != null) {
            c40.p2.i(l2Var, "cancel previous when new parsing comes", null, 2, null);
        }
        f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new q(prioritizedTask, null), 3, null);
        this.B = f11;
        if (f11 != null) {
            f11.z0(new x00.l() { // from class: com.baicizhan.main.home.plan.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 J1;
                    J1 = WordPlanFragment.J1((Throwable) obj);
                    return J1;
                }
            });
        }
    }

    public final boolean J0(Set<PrioritizedTask> set, PrioritizedTask prioritizedTask) {
        f fVar;
        if (prioritizedTask.a() == 0) {
            f fVar2 = this.f21826f;
            if (fVar2 != null) {
                fVar2.y(prioritizedTask);
            }
            return false;
        }
        if (!set.isEmpty() && prioritizedTask.a() <= ((PrioritizedTask) a00.r0.s3(set)).a()) {
            return false;
        }
        boolean add = set.add(prioritizedTask);
        if (add && (fVar = this.f21826f) != null) {
            fVar.y(prioritizedTask);
        }
        return add;
    }

    public final <T extends PrioritizedTask> void L0(Set<PrioritizedTask> set, final h10.d<T> dVar) {
        Set<PrioritizedTask> set2 = set;
        a00.m0.I0(set2, new x00.l() { // from class: com.baicizhan.main.home.plan.e1
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean M0;
                M0 = WordPlanFragment.M0(h10.d.this, (PrioritizedTask) obj);
                return Boolean.valueOf(M0);
            }
        });
        qb.c.b(Q, "after done " + dVar.C() + ": " + set, new Object[0]);
        if (set.isEmpty()) {
            f fVar = this.f21826f;
            if (fVar != null) {
                fVar.y(PrioritizedTask.None.f21808j);
                return;
            }
            return;
        }
        f fVar2 = this.f21826f;
        if (fVar2 != null) {
            fVar2.y((PrioritizedTask) a00.r0.s3(set2));
        }
    }

    public final int N0() {
        return ((Number) this.f21844x.getValue()).intValue();
    }

    public final void N1(List<? extends Object> list) {
        e eVar = this.f21828h;
        yb ybVar = null;
        if (eVar == null) {
            kotlin.jvm.internal.g0.S("topBarBehavior");
            eVar = null;
        }
        eVar.l();
        u2(this, 0.0f, true, list, 0.0f, 8, null);
        yb ybVar2 = this.F;
        if (ybVar2 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            ybVar = ybVar2;
        }
        ybVar.f57580d.scrollToPosition(0);
    }

    public final yg.h1 O0() {
        return (yg.h1) this.f21846z.getValue();
    }

    public final void O1(@m80.k u9.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<set-?>");
        this.f21837q = fVar;
    }

    public final int P0() {
        return ((Number) this.f21841u.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [kc.d, kc.h] */
    public final boolean P1(final ClipboardResp clipboardResp, final String str) {
        String content;
        final FriendTeamData friendTeamData = (FriendTeamData) new com.google.gson.d().n(clipboardResp.json, FriendTeamData.class);
        kc.h hVar = this.K;
        yb ybVar = null;
        if (hVar != null) {
            if (hVar == null) {
                kotlin.jvm.internal.g0.S("mShareDialog");
                hVar = null;
            }
            if (hVar.isVisible()) {
                kc.h hVar2 = this.K;
                if (hVar2 == null) {
                    kotlin.jvm.internal.g0.S("mShareDialog");
                    hVar2 = null;
                }
                hVar2.dismiss();
            }
        }
        if (!eh.a.b(friendTeamData.getConfirm()) && !eh.a.a(friendTeamData.getCancel())) {
            return false;
        }
        String title = friendTeamData.getTitle();
        if ((title == null || u30.k0.O3(title)) && ((content = friendTeamData.getContent()) == null || u30.k0.O3(content))) {
            return false;
        }
        u.a V = mc.a.e(this).M(friendTeamData.getTitle()).V(friendTeamData.getContent());
        String img = friendTeamData.getImg();
        if (img != null && img.length() != 0) {
            Uri parse = Uri.parse(friendTeamData.getImg());
            kotlin.jvm.internal.g0.o(parse, "parse(...)");
            V.Z(parse);
        }
        if (eh.a.b(friendTeamData.getConfirm()) && eh.a.a(friendTeamData.getCancel())) {
            V.b0(ButtonType.DOUBLE);
        } else if (eh.a.b(friendTeamData.getConfirm())) {
            V.b0(ButtonType.SINGLE_POSITIVE);
        } else if (eh.a.a(friendTeamData.getCancel())) {
            V.b0(ButtonType.SINGLE_NEGATIVE);
        }
        if (eh.a.b(friendTeamData.getConfirm())) {
            ButtonInfo confirm = friendTeamData.getConfirm();
            d.a.J(V, confirm != null ? confirm.getText() : null, null, new x00.l() { // from class: com.baicizhan.main.home.plan.o
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 Q1;
                    Q1 = WordPlanFragment.Q1(WordPlanFragment.this, friendTeamData, clipboardResp, str, (View) obj);
                    return Q1;
                }
            }, 2, null);
        }
        if (eh.a.a(friendTeamData.getCancel())) {
            ButtonInfo cancel = friendTeamData.getCancel();
            V.q(cancel != null ? cancel.getText() : null, new x00.l() { // from class: com.baicizhan.main.home.plan.p
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 R1;
                    R1 = WordPlanFragment.R1(ClipboardResp.this, str, this, (View) obj);
                    return R1;
                }
            });
        }
        this.K = V.d();
        yb ybVar2 = this.F;
        if (ybVar2 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            ybVar = ybVar2;
        }
        ybVar.f57580d.post(new Runnable() { // from class: com.baicizhan.main.home.plan.q
            @Override // java.lang.Runnable
            public final void run() {
                WordPlanFragment.S1(WordPlanFragment.this);
            }
        });
        return true;
    }

    public final int Q0() {
        return ((Number) this.f21842v.getValue()).intValue();
    }

    @m80.k
    public final LifecycleRegistry R0() {
        return this.f21839s;
    }

    public final va.f S0() {
        return (va.f) this.f21840t.getValue();
    }

    public final int T0() {
        return ((Number) this.f21843w.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.WordPlanFragment.T1():void");
    }

    public final List<Object> U0() {
        ArrayList arrayList;
        synchronized (this.G) {
            List<? extends Object> list = this.f21831k;
            arrayList = null;
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(list.get(i11));
                }
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    @m80.k
    public final u9.f V0() {
        u9.f fVar = this.f21837q;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.g0.S("taskRepo");
        return null;
    }

    public final a3 W0() {
        return (a3) this.f21845y.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kc.d, kc.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kc.d$a] */
    public final void W1() {
        mc.a.o(this, ((u.a) ((u.a) ((u.a) d.a.I(mc.a.e(this).X(R.drawable.score_img_normal_default).L(R.string.raise_select_dialog_title).U(R.string.raise_select_dialog_content).b0(ButtonType.TRIPLE).e(R.layout.layout_dialog_prompt_buttons_triple), R.string.raise_select_dialog_give_praise, null, new x00.l() { // from class: com.baicizhan.main.home.plan.x0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 X1;
                X1 = WordPlanFragment.X1(WordPlanFragment.this, (View) obj);
                return X1;
            }
        }, 2, null)).u(R.string.raise_select_dialog_give_criticism, new x00.l() { // from class: com.baicizhan.main.home.plan.y0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 Z1;
                Z1 = WordPlanFragment.Z1(WordPlanFragment.this, (View) obj);
                return Z1;
            }
        })).o(R.string.raise_select_dialog_give_refuse, new x00.l() { // from class: com.baicizhan.main.home.plan.a1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 b22;
                b22 = WordPlanFragment.b2(WordPlanFragment.this, (View) obj);
                return b22;
            }
        })).d(), null, 2, null);
    }

    public final com.baicizhan.main.home.plan.winningStreak.e X0() {
        return (com.baicizhan.main.home.plan.winningStreak.e) this.f21836p.getValue();
    }

    @m80.k
    public final a3 Y0() {
        return W0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [kc.d, kc.h] */
    public final void f2(final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2) {
        mc.a.o(this, ((u.a) ((u.a) d.a.I(mc.a.e(this).X(R.drawable.remind_img_normal_default).L(R.string.remind_study_dialog_title).U(R.string.remind_study_dialog_content), R.string.remind_study_dialog_ok, null, new x00.l() { // from class: com.baicizhan.main.home.plan.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 g22;
                g22 = WordPlanFragment.g2(WordPlanFragment.this, aVar2, (View) obj);
                return g22;
            }
        }, 2, null)).o(R.string.remind_study_dialog_give_refuse, new x00.l() { // from class: com.baicizhan.main.home.plan.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i22;
                i22 = WordPlanFragment.i2(x00.a.this, this, (View) obj);
                return i22;
            }
        })).d(), null, 2, null);
    }

    public final void m2(ClipboardResp clipboardResp, String str) {
        if (clipboardResp.businessId == 7) {
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new s(str, this, clipboardResp, null), 3, null);
            ma.l.e("activity-common", ma.a.f72829r4, a00.l1.W(yz.h1.a(ma.b.f72889a1, Integer.valueOf(clipboardResp.businessId)), yz.h1.a(ma.b.f72896c1, str)));
            gi.d.a();
            return;
        }
        int i11 = clipboardResp.style;
        if (i11 == 0) {
            n2(this);
            return;
        }
        if (i11 == 1) {
            if (!P1(clipboardResp, str)) {
                n2(this);
                return;
            } else {
                ma.l.e("activity-common", ma.a.f72829r4, a00.l1.W(yz.h1.a(ma.b.f72889a1, Integer.valueOf(clipboardResp.businessId)), yz.h1.a(ma.b.f72896c1, str)));
                gi.d.a();
                return;
            }
        }
        qb.c.q(Q, "unknown style: " + i11, new Object[0]);
        n2(this);
    }

    @Override // be.i
    @m80.l
    public be.h o() {
        be.d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.g0.S("_guider");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [kc.d, kc.h] */
    public final void o2(Pair<? extends BookUpdateInfos.BookUpdateInfo, String> pair) {
        final HashMap hashMap = new HashMap();
        hashMap.put(ma.b.f72921l, Integer.valueOf(q9.x.r().s().u().k() != 0 ? 1 : 0));
        hashMap.put("channel", kotlin.jvm.internal.g0.g(ma.a.f72812p1, pair.getSecond()) ? ma.b.f72927n : ma.b.f72930o);
        mc.a.l(this, ((u.a) ((u.a) d.a.J(mc.a.e(this).M(pair.getFirst().mainPageDialogTitle).V(pair.getFirst().mainPageDialogContent), pair.getFirst().mainPageDialogOk, null, new x00.l() { // from class: com.baicizhan.main.home.plan.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 p22;
                p22 = WordPlanFragment.p2(WordPlanFragment.this, hashMap, (View) obj);
                return p22;
            }
        }, 2, null)).q(pair.getFirst().mainPageDialogCancel, new x00.l() { // from class: com.baicizhan.main.home.plan.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q22;
                q22 = WordPlanFragment.q2(WordPlanFragment.this, hashMap, (View) obj);
                return q22;
            }
        })).d(), "book-upgrade");
        ma.l.e(ma.t.f73014m, pair.getSecond(), hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baicizhan.main.home.plan.e, androidx.fragment.app.Fragment
    public void onAttach(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        super.onAttach(context);
        if (context instanceof f) {
            this.f21826f = (f) context;
        }
        if (this.L == null) {
            View decorView = requireActivity().getWindow().getDecorView();
            kotlin.jvm.internal.g0.n(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.L = new be.d((ViewGroup) decorView, this.f21839s);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        this.f21839s.markState(Lifecycle.State.CREATED);
        W0().start();
        ActivityResultLauncher<yz.g2> registerForActivityResult = registerForActivityResult(new EditScheduleActivity.a(), new ActivityResultCallback() { // from class: com.baicizhan.main.home.plan.k0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                WordPlanFragment.x1((Boolean) obj);
            }
        });
        kotlin.jvm.internal.g0.o(registerForActivityResult, "registerForActivityResult(...)");
        this.D = registerForActivityResult;
        ActivityResultLauncher<b> registerForActivityResult2 = registerForActivityResult(new c(), new ActivityResultCallback() { // from class: com.baicizhan.main.home.plan.l0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                WordPlanFragment.y1(WordPlanFragment.this, (PrioritizedTask) obj);
            }
        });
        kotlin.jvm.internal.g0.o(registerForActivityResult2, "registerForActivityResult(...)");
        this.E = registerForActivityResult2;
        pg.u0.f80487a.q().observe(this, this.C);
        kotlinx.coroutines.flow.m0<sg.c> i11 = X0().i();
        Lifecycle lifecycle = getLifecycle();
        kotlin.jvm.internal.g0.o(lifecycle, "<get-lifecycle>(...)");
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(FlowExtKt.flowWithLifecycle$default(i11, lifecycle, null, 2, null), new i(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
        this.f21838r = new sa.h(requireActivity, true);
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        yb c11 = yb.c(inflater);
        kotlin.jvm.internal.g0.o(c11, "inflate(...)");
        this.F = c11;
        if (c11 == null) {
            kotlin.jvm.internal.g0.S("binding");
            c11 = null;
        }
        return c11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f21839s.markState(Lifecycle.State.DESTROYED);
        d dVar = this.f21834n;
        if (dVar != null) {
            dVar.d();
        }
        pg.u0.f80487a.q().removeObserver(this.C);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        d dVar = this.f21834n;
        if (dVar != null) {
            dVar.d();
        }
        Iterator<T> it = this.I.iterator();
        while (it.hasNext()) {
            ((RecyclerViewExposureHelper) it.next()).onInvisible();
        }
        this.f21839s.markState(Lifecycle.State.CREATED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        d dVar = this.f21834n;
        if (dVar != null) {
            dVar.c();
        }
        zb.a.f(getActivity(), this.f21830j);
        this.f21839s.markState(Lifecycle.State.RESUMED);
        W0().V0();
        X0().j();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@m80.k View view, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(view, "view");
        super.onViewCreated(view, bundle);
        final yb ybVar = this.F;
        yb ybVar2 = null;
        if (ybVar == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar = null;
        }
        ybVar.f57583g.setPadding(0, T0(), 0, 0);
        ybVar.f57583g.getLayoutParams().height += T0();
        ViewGroup.LayoutParams layoutParams = ybVar.f57583g.getLayoutParams();
        kotlin.jvm.internal.g0.n(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        e eVar = new e();
        this.f21828h = eVar;
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(eVar);
        ybVar.f57583g.setOnTouchListener(new View.OnTouchListener() { // from class: com.baicizhan.main.home.plan.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean z12;
                z12 = WordPlanFragment.z1(WordPlanFragment.this, view2, motionEvent);
                return z12;
            }
        });
        ViewGroup.LayoutParams layoutParams2 = ybVar.f57581e.getRoot().getLayoutParams();
        kotlin.jvm.internal.g0.n(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((CoordinatorLayout.LayoutParams) layoutParams2).setMargins(0, T0(), 0, 0);
        ybVar.f57581e.getRoot().setOnNotificationListener(new j());
        Context requireContext = requireContext();
        kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
        if (com.baicizhan.base.a.a(requireContext)) {
            ybVar.f57584h.setVisibility(8);
            ybVar.f57582f.setVisibility(8);
        }
        RedDotImageView messages = ybVar.f57579c;
        kotlin.jvm.internal.g0.o(messages, "messages");
        sa.q.t(messages, 0, new x00.l() { // from class: com.baicizhan.main.home.plan.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 A1;
                A1 = WordPlanFragment.A1(WordPlanFragment.this, ybVar, (View) obj);
                return A1;
            }
        }, 1, null);
        final boolean a11 = ij.p.a().a();
        yb ybVar3 = this.F;
        if (ybVar3 == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar3 = null;
        }
        ImageView wordsSearch = ybVar3.f57586j;
        kotlin.jvm.internal.g0.o(wordsSearch, "wordsSearch");
        sa.q.t(wordsSearch, 0, new x00.l() { // from class: com.baicizhan.main.home.plan.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 B1;
                B1 = WordPlanFragment.B1(WordPlanFragment.this, a11, ybVar, (View) obj);
                return B1;
            }
        }, 1, null);
        lg.b bVar = new lg.b(this);
        bVar.H(this.f21839s);
        yb ybVar4 = this.F;
        if (ybVar4 == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar4 = null;
        }
        RecyclerView recyclerView = ybVar4.f57580d;
        p50.h hVar = new p50.h();
        hVar.i(WordBanner.class, new lg.j(this));
        hVar.i(og.t.class, new lg.q(this, this));
        hVar.i(mg.h.class, new lg.o(this));
        hVar.i(GoldenNavigation.class, new lg.k(this));
        hVar.i(mg.b.class, bVar);
        hVar.i(mg.g.class, new lg.f(this));
        hVar.i(mg.c.class, new lg.d(this));
        this.f21827g = hVar;
        recyclerView.setAdapter(hVar);
        List<RecyclerViewExposureHelper> list = this.I;
        yb ybVar5 = this.F;
        if (ybVar5 == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar5 = null;
        }
        RecyclerView planCards = ybVar5.f57580d;
        kotlin.jvm.internal.g0.o(planCards, "planCards");
        RecyclerViewExposureHelper recyclerViewExposureHelper = new RecyclerViewExposureHelper(planCards, this.f21839s, 99);
        recyclerViewExposureHelper.setExposureCallback(new k(bVar));
        list.add(recyclerViewExposureHelper);
        yb ybVar6 = this.F;
        if (ybVar6 == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar6 = null;
        }
        RecyclerView planCards2 = ybVar6.f57580d;
        kotlin.jvm.internal.g0.o(planCards2, "planCards");
        RecyclerViewExposureHelper recyclerViewExposureHelper2 = new RecyclerViewExposureHelper(planCards2, this.f21839s, 66);
        recyclerViewExposureHelper2.setExposureCallback(new l());
        list.add(recyclerViewExposureHelper2);
        yb ybVar7 = this.F;
        if (ybVar7 == null) {
            kotlin.jvm.internal.g0.S("binding");
        } else {
            ybVar2 = ybVar7;
        }
        RecyclerView planCards3 = ybVar2.f57580d;
        kotlin.jvm.internal.g0.o(planCards3, "planCards");
        RecyclerViewExposureHelper recyclerViewExposureHelper3 = new RecyclerViewExposureHelper(planCards3, this.f21839s, 50);
        recyclerViewExposureHelper3.setExposureCallback(new m());
        list.add(recyclerViewExposureHelper3);
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            a3 W0 = W0();
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.g0.o(requireContext2, "requireContext(...)");
            W0.i1(new ce.b(requireContext2, null, 0, null, null, 0, new x00.a() { // from class: com.baicizhan.main.home.plan.n
                @Override // x00.a
                public final Object invoke() {
                    View C1;
                    C1 = WordPlanFragment.C1(FragmentActivity.this);
                    return C1;
                }
            }, 62, null));
        }
        c1();
    }

    @Override // lg.q.c
    public void r(@m80.k PrioritizedTask task) {
        kotlin.jvm.internal.g0.p(task, "task");
        H1(task);
    }

    public final b s1(PrioritizedTask prioritizedTask, Intent intent) {
        return new b(intent, prioritizedTask);
    }

    public final void s2() {
        if (this.J) {
            return;
        }
        this.J = true;
        int dimenPx = KotlinExtKt.getDimenPx(R.dimen.word_book_guide_top_margin);
        if (t1(this.f21831k)) {
            int i11 = (int) (xb.f.i(getContext()) * 0.46f);
            yb ybVar = this.F;
            if (ybVar == null) {
                kotlin.jvm.internal.g0.S("binding");
                ybVar = null;
            }
            dimenPx = (dimenPx - (ybVar.f57583g.getLayoutParams().height + N0())) + i11;
        }
        Boolean value = W0().K0().getValue();
        if (value != null && !value.booleanValue()) {
            dimenPx += KotlinExtKt.getDimenPx(R.dimen.word_plan_learning_card_height_done) - KotlinExtKt.getDimenPx(R.dimen.word_plan_learning_card_height);
        }
        g.a aVar = new g.a();
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.g0.o(requireActivity, "requireActivity(...)");
        g.a a11 = aVar.a(jg.d.c(requireActivity, R.layout.guide_home_word_book, R.id.next, dimenPx, R.id.guide_content));
        View decorView = requireActivity().getWindow().getDecorView();
        kotlin.jvm.internal.g0.n(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        a11.b((ViewGroup) decorView).j();
    }

    public final boolean t1(List<? extends Object> list) {
        Object b32 = list != null ? a00.r0.b3(list, 0) : null;
        WordBanner wordBanner = b32 instanceof WordBanner ? (WordBanner) b32 : null;
        String imagePath = wordBanner != null ? wordBanner.getImagePath() : null;
        return true ^ (imagePath == null || imagePath.length() == 0);
    }

    public final void t2(float f11, boolean z11, List<? extends Object> list, float f12) {
        yb ybVar = null;
        Object b32 = list != null ? a00.r0.b3(list, 0) : null;
        WordBanner wordBanner = b32 instanceof WordBanner ? (WordBanner) b32 : null;
        if (wordBanner == null) {
            v2(this, true);
        } else if (wordBanner.isDark()) {
            float f13 = this.f21829i;
            boolean z12 = (f13 < f12 || z11) && f11 >= f12;
            boolean z13 = (f13 > f12 || z11) && f11 <= f12;
            if (z12) {
                v2(this, true);
            } else if (z13) {
                v2(this, false);
            }
        } else {
            v2(this, true);
        }
        this.f21829i = f11;
        yb ybVar2 = this.F;
        if (ybVar2 == null) {
            kotlin.jvm.internal.g0.S("binding");
            ybVar2 = null;
        }
        Drawable background = ybVar2.f57583g.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            int color = (((int) (255 * f11)) << 24) | (colorDrawable.getColor() & 16777215);
            yb ybVar3 = this.F;
            if (ybVar3 == null) {
                kotlin.jvm.internal.g0.S("binding");
            } else {
                ybVar = ybVar3;
            }
            ybVar.f57583g.setBackgroundColor(color);
        }
    }

    public final boolean v1() {
        Object obj;
        TreeSet<PrioritizedTask> treeSet = this.A;
        h10.d d11 = kotlin.jvm.internal.o0.d(PrioritizedTask.MainGuider.class);
        Iterator<T> it = treeSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(kotlin.jvm.internal.o0.d(((PrioritizedTask) obj).getClass()), d11)) {
                break;
            }
        }
        return obj != null;
    }

    public final /* synthetic */ <T extends PrioritizedTask> boolean w1(Set<PrioritizedTask> set, h10.d<T> dVar) {
        Object obj;
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(kotlin.jvm.internal.o0.d(((PrioritizedTask) obj).getClass()), dVar)) {
                break;
            }
        }
        return obj != null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j implements MainPopdownMessageView.i {
        public j() {
        }

        @Override // com.baicizhan.main.customview.MainPopdownMessageView.i
        public void a(int i11) {
            if (i11 == 1) {
                Object obj = WordPlanFragment.this.G;
                WordPlanFragment wordPlanFragment = WordPlanFragment.this;
                synchronized (obj) {
                    wordPlanFragment.L0(wordPlanFragment.A, kotlin.jvm.internal.o0.d(PrioritizedTask.Notify.class));
                    yz.g2 g2Var = yz.g2.f100423a;
                }
                return;
            }
            if (i11 != 2) {
                return;
            }
            Object obj2 = WordPlanFragment.this.G;
            WordPlanFragment wordPlanFragment2 = WordPlanFragment.this;
            synchronized (obj2) {
                wordPlanFragment2.L0(wordPlanFragment2.A, kotlin.jvm.internal.o0.d(PrioritizedTask.Ad.class));
                yz.g2 g2Var2 = yz.g2.f100423a;
            }
        }

        @Override // com.baicizhan.main.customview.MainPopdownMessageView.i
        public void b(int i11) {
        }

        @Override // com.baicizhan.main.customview.MainPopdownMessageView.i
        public void c(int i11) {
        }
    }
}
