package com.baicizhan.main.wikiv2.lookup.wikiv2;

import a00.d1;
import a00.v1;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.C;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.app.api.service.model.BookLanguageType;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.helper.SentenceTagHelper;
import com.baicizhan.main.wikiv2.lookup.wikiv2.tab.OtherFragment;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;
import gs.j9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.jvm.internal.u0;
import l3.i0;
import l3.y2;
import si.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiSceneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiSceneFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/WikiSceneFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,687:1\n106#2,15:688\n1#3:703\n1878#4,3:704\n1869#4,2:707\n1869#4,2:709\n1491#4:711\n1516#4,3:712\n1519#4,3:722\n1761#4,3:729\n1869#4,2:732\n785#4:734\n796#4:735\n1878#4,2:736\n797#4,2:738\n1880#4:740\n799#4:741\n382#5,7:715\n216#6,2:725\n183#7,2:727\n*S KotlinDebug\n*F\n+ 1 WikiSceneFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/WikiSceneFragment\n*L\n49#1:688,15\n170#1:704,3\n253#1:707,2\n326#1:709,2\n482#1:711\n482#1:712,3\n482#1:722,3\n604#1:729,3\n656#1:732,2\n74#1:734\n74#1:735\n74#1:736,2\n74#1:738,2\n74#1:740\n74#1:741\n482#1:715,7\n484#1:725,2\n593#1:727,2\n*E\n"})
@qu.b
/* loaded from: classes3.dex */
public final class WikiSceneFragment extends com.baicizhan.main.wikiv2.lookup.wikiv2.a {

    @m80.k
    public static final String A = "wiki_channel";

    @m80.k
    public static final String B = "wiki_background";

    @m80.k
    public static final String C = "need_report";

    @m80.k
    public static final String D = "wiki_scene_type";

    @m80.k
    public static final String E = "lookup";

    @m80.k
    public static final String F = "wordlist";

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final a f25600o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f25601p = 8;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f25602q = "WikiSceneFragment";

    /* renamed from: r, reason: collision with root package name */
    public static final int f25603r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final long f25604s = 300;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final List<String> f25605t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final Set<Integer> f25606u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final List<String> f25607v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final String f25608w = "wiki.tab_position.lookup";

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final String f25609x = "wiki.tab_position.wordlist";

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final String f25610y = "wiki_topic_id";

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final String f25611z = "wiki_book_id";

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public j9 f25612f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25613g;

    /* renamed from: h, reason: collision with root package name */
    public int f25614h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public Fragment f25615i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public List<Integer> f25616j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25617k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25618l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25619m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25620n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ WikiSceneFragment f(a aVar, int i11, int i12, GetTopicResourceChannel getTopicResourceChannel, int i13, boolean z11, String str, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            }
            GetTopicResourceChannel getTopicResourceChannel2 = getTopicResourceChannel;
            if ((i14 & 8) != 0) {
                i13 = 0;
            }
            int i15 = i13;
            if ((i14 & 16) != 0) {
                z11 = true;
            }
            boolean z12 = z11;
            if ((i14 & 32) != 0) {
                str = "lookup";
            }
            return aVar.e(i11, i12, getTopicResourceChannel2, i15, z12, str);
        }

        @w00.k
        @w00.o
        @m80.k
        public final WikiSceneFragment a(int i11, int i12) {
            return f(this, i11, i12, null, 0, false, null, 60, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final WikiSceneFragment b(int i11, int i12, @m80.k GetTopicResourceChannel channel) {
            kotlin.jvm.internal.g0.p(channel, "channel");
            return f(this, i11, i12, channel, 0, false, null, 56, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final WikiSceneFragment c(int i11, int i12, @m80.k GetTopicResourceChannel channel, @ColorInt int i13) {
            kotlin.jvm.internal.g0.p(channel, "channel");
            return f(this, i11, i12, channel, i13, false, null, 48, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final WikiSceneFragment d(int i11, int i12, @m80.k GetTopicResourceChannel channel, @ColorInt int i13, boolean z11) {
            kotlin.jvm.internal.g0.p(channel, "channel");
            return f(this, i11, i12, channel, i13, z11, null, 32, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final WikiSceneFragment e(int i11, int i12, @m80.k GetTopicResourceChannel channel, @ColorInt int i13, boolean z11, @m80.k String sceneType) {
            kotlin.jvm.internal.g0.p(channel, "channel");
            kotlin.jvm.internal.g0.p(sceneType, "sceneType");
            WikiSceneFragment wikiSceneFragment = new WikiSceneFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("wiki_topic_id", i11);
            bundle.putInt("wiki_book_id", i12);
            bundle.putSerializable("wiki_channel", channel);
            bundle.putInt("wiki_background", i13);
            bundle.putBoolean("need_report", z11);
            bundle.putString(WikiSceneFragment.D, sceneType);
            wikiSceneFragment.setArguments(bundle);
            return wikiSceneFragment;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25622a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f25622a = function;
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
            return this.f25622a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25622a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f25623a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TabLayout f25624b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f25625c;

        public d(TextView textView, TabLayout tabLayout, x00.a<g2> aVar) {
            this.f25623a = textView;
            this.f25624b = tabLayout;
            this.f25625c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f25623a.getWidth() > 0) {
                this.f25624b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f25625c.invoke();
            }
        }
    }

    static {
        List<String> Q = a00.h0.Q("例句", "真题例句", "词组", "助记", "派生", "其他");
        f25605t = Q;
        f25606u = v1.f(1);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : Q) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (!f25606u.contains(Integer.valueOf(i11))) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        f25607v = arrayList;
    }

    public WikiSceneFragment() {
        final x00.a<Fragment> aVar = new x00.a<Fragment>() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment$special$$inlined$viewModels$default$1
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
        final yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a<ViewModelStoreOwner>() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment$special$$inlined$viewModels$default$2
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
        this.f25613g = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(o0.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment$special$$inlined$viewModels$default$3
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
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment$special$$inlined$viewModels$default$4
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
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment$special$$inlined$viewModels$default$5
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
        this.f25616j = new ArrayList();
        this.f25617k = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.f
            @Override // x00.a
            public final Object invoke() {
                Bundle X;
                X = WikiSceneFragment.X(WikiSceneFragment.this);
                return X;
            }
        });
        this.f25618l = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.g
            @Override // x00.a
            public final Object invoke() {
                String H0;
                H0 = WikiSceneFragment.H0(WikiSceneFragment.this);
                return H0;
            }
        });
        this.f25619m = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.h
            @Override // x00.a
            public final Object invoke() {
                int M0;
                M0 = WikiSceneFragment.M0(WikiSceneFragment.this);
                return Integer.valueOf(M0);
            }
        });
        this.f25620n = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.i
            @Override // x00.a
            public final Object invoke() {
                int Y;
                Y = WikiSceneFragment.Y(WikiSceneFragment.this);
                return Integer.valueOf(Y);
            }
        });
    }

    public static final g2 A0(o0 o0Var, WikiSceneFragment wikiSceneFragment, y2 y2Var) {
        if (kotlin.jvm.internal.g0.g(o0Var.F(), "wordlist") && y2Var != null) {
            wikiSceneFragment.W0(y2Var);
        }
        return g2.f100423a;
    }

    public static final g2 B0(WikiSceneFragment wikiSceneFragment, Boolean bool) {
        j9 j9Var = wikiSceneFragment.f25612f;
        if (j9Var != null && bool.booleanValue()) {
            j9Var.f55457l.setVisibility(8);
            j9Var.f55453h.setVisibility(8);
        }
        return g2.f100423a;
    }

    public static final g2 C0(WikiSceneFragment wikiSceneFragment, Throwable th2) {
        j9 j9Var = wikiSceneFragment.f25612f;
        if (j9Var != null) {
            if (th2 != null) {
                qb.c.c(f25602q, "加载Wiki数据出错: ", th2);
                j9Var.f55453h.setVisibility(0);
                j9Var.f55457l.setVisibility(8);
            } else {
                j9Var.f55453h.setVisibility(8);
            }
        }
        return g2.f100423a;
    }

    public static final void E0(WikiSceneFragment wikiSceneFragment, ij.e it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wikiSceneFragment.o0().E(new hj.m(wikiSceneFragment, it));
        si.c value = wikiSceneFragment.o0().I().getValue();
        if (value != null) {
            wikiSceneFragment.T0(value.s());
        }
    }

    public static final String H0(WikiSceneFragment wikiSceneFragment) {
        String string = wikiSceneFragment.e0().getString(D, "lookup");
        return string == null ? "lookup" : string;
    }

    public static final int M0(WikiSceneFragment wikiSceneFragment) {
        return wikiSceneFragment.e0().getInt("wiki_topic_id", 0);
    }

    public static /* synthetic */ void Q0(WikiSceneFragment wikiSceneFragment, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        wikiSceneFragment.P0(i11, z11);
    }

    public static final g2 R0(TabLayout.TabView tabView, TabLayout tabLayout, TextView textView, final j9 j9Var, int i11, boolean z11) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        tabView.getLocationInWindow(iArr);
        tabLayout.getLocationInWindow(iArr2);
        int i12 = iArr[0] - iArr2[0];
        float left = ((textView.getLeft() + i12) + (textView.getWidth() / 2)) - (j9Var.f55452g.getWidth() / 2);
        qb.c.b(f25602q, "指示器位置: position=" + i11 + ", tabRelativeLeft=" + i12 + ", textViewLeft=" + textView.getLeft() + ", textViewWidth=" + textView.getWidth() + ", targetX=" + left + ", animate=" + z11, new Object[0]);
        if (left >= 0.0f) {
            if (!z11 || j9Var.f55452g.getTranslationX() <= 0.0f) {
                j9Var.f55452g.setTranslationX(left);
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(j9Var.f55452g.getTranslationX(), left);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.a0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        WikiSceneFragment.S0(j9.this, valueAnimator);
                    }
                });
                ofFloat.start();
            }
        }
        return g2.f100423a;
    }

    public static final void S0(j9 j9Var, ValueAnimator animator) {
        kotlin.jvm.internal.g0.p(animator, "animator");
        View view = j9Var.f55452g;
        Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationX(((Float) animatedValue).floatValue());
    }

    public static final void U0(ImageView imageView, int i11, List favorites) {
        kotlin.jvm.internal.g0.p(favorites, "favorites");
        imageView.setSelected(favorites.contains(Integer.valueOf(i11)));
    }

    public static final Bundle X(WikiSceneFragment wikiSceneFragment) {
        return wikiSceneFragment.requireArguments();
    }

    public static final int Y(WikiSceneFragment wikiSceneFragment) {
        return wikiSceneFragment.e0().getInt("wiki_book_id", 0);
    }

    public static final void Y0(WikiSceneFragment wikiSceneFragment, si.c cVar, View view) {
        wikiSceneFragment.o0().Q(cVar.n(), true);
        o0.z(wikiSceneFragment.o0(), "wiki_word_play_us", null, 2, null);
    }

    public static final void Z0(WikiSceneFragment wikiSceneFragment, si.c cVar, View view) {
        wikiSceneFragment.o0().Q(cVar.m(), false);
        o0.z(wikiSceneFragment.o0(), "wiki_word_play_uk", null, 2, null);
    }

    public static final g2 a1(WikiSceneFragment wikiSceneFragment, j9 j9Var, Boolean bool) {
        LottieAnimationView voiceUs = j9Var.f55465t;
        kotlin.jvm.internal.g0.o(voiceUs, "voiceUs");
        kotlin.jvm.internal.g0.m(bool);
        wikiSceneFragment.O0(voiceUs, bool.booleanValue());
        return g2.f100423a;
    }

    public static final g2 b1(WikiSceneFragment wikiSceneFragment, j9 j9Var, Boolean bool) {
        LottieAnimationView voiceUk = j9Var.f55464s;
        kotlin.jvm.internal.g0.o(voiceUk, "voiceUk");
        kotlin.jvm.internal.g0.m(bool);
        wikiSceneFragment.O0(voiceUk, bool.booleanValue());
        return g2.f100423a;
    }

    public static final View c0(ViewGroup viewGroup, int i11) {
        return viewGroup.getChildAt(i11);
    }

    public static final void c1(j9 j9Var, si.c cVar, List favorites) {
        kotlin.jvm.internal.g0.p(favorites, "favorites");
        j9Var.f55450e.setSelected(favorites.contains(Integer.valueOf(cVar.s())));
    }

    public static final FrameLayout d0(ViewGroup viewGroup, WikiSceneFragment wikiSceneFragment, int i11) {
        View childAt = viewGroup.getChildAt(i11);
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 != null) {
            return wikiSceneFragment.b0(viewGroup2);
        }
        return null;
    }

    public static final void d1(WikiSceneFragment wikiSceneFragment, si.c cVar, final View view) {
        wikiSceneFragment.o0().e0(cVar, new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e12;
                e12 = WikiSceneFragment.e1(view, ((Boolean) obj).booleanValue());
                return e12;
            }
        });
        o0.z(wikiSceneFragment.o0(), ma.a.B4, null, 2, null);
    }

    public static final g2 e1(View view, boolean z11) {
        view.setSelected(z11);
        return g2.f100423a;
    }

    private final int f0() {
        return ((Number) this.f25620n.getValue()).intValue();
    }

    public static final CharSequence f1(c.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.e();
    }

    @w00.k
    @w00.o
    @m80.k
    public static final WikiSceneFragment g0(int i11, int i12) {
        return f25600o.a(i11, i12);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final WikiSceneFragment h0(int i11, int i12, @m80.k GetTopicResourceChannel getTopicResourceChannel) {
        return f25600o.b(i11, i12, getTopicResourceChannel);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final WikiSceneFragment i0(int i11, int i12, @m80.k GetTopicResourceChannel getTopicResourceChannel, @ColorInt int i13) {
        return f25600o.c(i11, i12, getTopicResourceChannel, i13);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final WikiSceneFragment j0(int i11, int i12, @m80.k GetTopicResourceChannel getTopicResourceChannel, @ColorInt int i13, boolean z11) {
        return f25600o.d(i11, i12, getTopicResourceChannel, i13, z11);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final WikiSceneFragment k0(int i11, int i12, @m80.k GetTopicResourceChannel getTopicResourceChannel, @ColorInt int i13, boolean z11, @m80.k String str) {
        return f25600o.e(i11, i12, getTopicResourceChannel, i13, z11, str);
    }

    private final String m0() {
        return (String) this.f25618l.getValue();
    }

    private final int n0() {
        return ((Number) this.f25619m.getValue()).intValue();
    }

    private final o0 o0() {
        return (o0) this.f25613g.getValue();
    }

    public static final void r0(WikiSceneFragment wikiSceneFragment, View view) {
        qb.c.b(f25602q, "点击单词报错", new Object[0]);
        wikiSceneFragment.o0().a0();
        o0.z(wikiSceneFragment.o0(), "wiki_report_word", null, 2, null);
    }

    public static final void s0(WikiSceneFragment wikiSceneFragment, View view) {
        qb.c.b(f25602q, "点击举报", new Object[0]);
        o0.z(wikiSceneFragment.o0(), "wiki_report", null, 2, null);
    }

    public static final void u0(WikiSceneFragment wikiSceneFragment, View view) {
        if (wikiSceneFragment.n0() > 0) {
            qb.c.b(f25602q, "点击重试按钮", new Object[0]);
            wikiSceneFragment.o0().b0(wikiSceneFragment.n0(), wikiSceneFragment.f0());
        }
    }

    private final void x0() {
        final o0 o02 = o0();
        o02.I().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y02;
                y02 = WikiSceneFragment.y0(WikiSceneFragment.this, (si.c) obj);
                return y02;
            }
        }));
        o02.J().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A0;
                A0 = WikiSceneFragment.A0(o0.this, this, (y2) obj);
                return A0;
            }
        }));
        o02.L().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B0;
                B0 = WikiSceneFragment.B0(WikiSceneFragment.this, (Boolean) obj);
                return B0;
            }
        }));
        o02.C().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 C0;
                C0 = WikiSceneFragment.C0(WikiSceneFragment.this, (Throwable) obj);
                return C0;
            }
        }));
    }

    public static final g2 y0(final WikiSceneFragment wikiSceneFragment, si.c cVar) {
        j9 j9Var = wikiSceneFragment.f25612f;
        if (j9Var != null && cVar != null) {
            qb.c.b(f25602q, "收到单词信息: " + cVar.t(), new Object[0]);
            j9Var.f55457l.setVisibility(0);
            j9Var.f55453h.setVisibility(8);
            wikiSceneFragment.X0(cVar);
            j9Var.getRoot().postDelayed(new Runnable() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.j
                @Override // java.lang.Runnable
                public final void run() {
                    WikiSceneFragment.z0(WikiSceneFragment.this);
                }
            }, 300L);
        }
        return g2.f100423a;
    }

    public static final void z0(WikiSceneFragment wikiSceneFragment) {
        wikiSceneFragment.Z();
    }

    public final boolean D0(BookLanguageType bookLanguageType) {
        return bookLanguageType == null || bookLanguageType == BookLanguageType.English;
    }

    public final void F0() {
        TabLayout tabLayout;
        TabLayout.i D2;
        int d11 = i9.f.d(requireContext(), kotlin.jvm.internal.g0.g(m0(), "lookup") ? f25608w : f25609x);
        if (d11 < 0 || d11 >= f25607v.size()) {
            d11 = 0;
        }
        j9 j9Var = this.f25612f;
        if (j9Var != null && (tabLayout = j9Var.f55463r) != null && (D2 = tabLayout.D(d11)) != null) {
            D2.r();
        }
        K0(d11);
        V0(d11);
        P0(d11, false);
    }

    public final void G0(int i11) {
        i9.f.k(requireContext(), kotlin.jvm.internal.g0.g(m0(), "lookup") ? f25608w : f25609x, i11);
        qb.c.b(f25602q, "保存tab位置: " + i11 + " (sceneType: " + m0() + pn.j.f81007d, new Object[0]);
    }

    public final void I0(TextView textView, String str) {
        textView.setText(str);
        textView.setVisibility(L0(!(str == null || str.length() == 0)));
    }

    public final Object J0() {
        Object m6308constructorimpl;
        TabLayout.TabView tabView;
        TabLayout tabLayout = l0().f55463r;
        try {
            Result.a aVar = Result.Companion;
            int dpPixels = KotlinExtKt.getDpPixels(16);
            int i11 = dpPixels / 2;
            Iterator<Integer> it = g10.u.W1(0, tabLayout.getTabCount()).iterator();
            while (it.hasNext()) {
                int nextInt = ((d1) it).nextInt();
                TabLayout.i D2 = tabLayout.D(nextInt);
                if (D2 != null && (tabView = D2.f32310i) != null) {
                    tabView.setPadding(0, 0, 0, 0);
                    tabView.setBackground(null);
                    tabView.setClickable(true);
                    ViewGroup.LayoutParams layoutParams = tabView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(nextInt == 0 ? 0 : i11);
                        marginLayoutParams.setMarginEnd(nextInt == tabLayout.getTabCount() - 1 ? 0 : i11);
                        tabView.setLayoutParams(marginLayoutParams);
                    }
                }
            }
            V0(0);
            qb.c.b(f25602q, "设置 Tab 间距: " + dpPixels + "px", new Object[0]);
            m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
        if (m6311exceptionOrNullimpl != null) {
            qb.c.c(f25602q, "设置 Tab 间距失败", m6311exceptionOrNullimpl);
        }
        return m6308constructorimpl;
    }

    public final void K0(int i11) {
        FrameLayout frameLayout;
        if (i11 != this.f25614h || this.f25615i == null) {
            this.f25614h = i11;
            Fragment a02 = a0(i11);
            this.f25615i = a02;
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            j9 j9Var = this.f25612f;
            if (j9Var == null || (frameLayout = j9Var.f55462q) == null) {
                return;
            }
            beginTransaction.replace(frameLayout.getId(), a02).commitAllowingStateLoss();
            qb.c.b(f25602q, "切换到tab: " + i11 + ", fragment: " + a02.getClass().getSimpleName(), new Object[0]);
        }
    }

    public final int L0(boolean z11) {
        return z11 ? 0 : 8;
    }

    public final boolean N0() {
        Window window;
        View decorView;
        View view;
        FrameLayout b02;
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof WikiVideoView) {
                    WikiVideoView wikiVideoView = (WikiVideoView) childAt;
                    if (wikiVideoView.n()) {
                        wikiVideoView.setFullscreen(false);
                        viewGroup.removeView(childAt);
                        Fragment fragment = this.f25615i;
                        if (fragment != null && (view = fragment.getView()) != null && (view instanceof FrameLayout) && (b02 = b0((ViewGroup) view)) != null) {
                            b02.removeAllViews();
                            b02.addView(childAt);
                        }
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            activity2.setRequestedOrientation(1);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void O0(LottieAnimationView lottieAnimationView, boolean z11) {
        if (z11) {
            lottieAnimationView.A();
        } else {
            lottieAnimationView.m();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    public final void P0(final int i11, final boolean z11) {
        final j9 j9Var = this.f25612f;
        if (j9Var != null && i11 >= 0 && i11 < j9Var.f55463r.getTabCount()) {
            final TabLayout tabLayout = j9Var.f55463r;
            kotlin.jvm.internal.g0.o(tabLayout, "tabLayout");
            TabLayout.i D2 = tabLayout.D(i11);
            if (D2 == null) {
                return;
            }
            View g11 = D2.g();
            final TextView textView = g11 instanceof TextView ? (TextView) g11 : null;
            if (textView == null) {
                return;
            }
            final TabLayout.TabView view = D2.f32310i;
            kotlin.jvm.internal.g0.o(view, "view");
            tabLayout.getViewTreeObserver().addOnGlobalLayoutListener(new d(textView, tabLayout, new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.e
                @Override // x00.a
                public final Object invoke() {
                    g2 R0;
                    R0 = WikiSceneFragment.R0(TabLayout.TabView.this, tabLayout, textView, j9Var, i11, z11);
                    return R0;
                }
            }));
        }
    }

    public final void T0(final int i11) {
        final ImageView imageView;
        hj.m l02;
        j9 j9Var = this.f25612f;
        if (j9Var == null || (imageView = j9Var.f55450e) == null || (l02 = o0().l0()) == null) {
            return;
        }
        l02.D(new hj.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.c0
            @Override // hj.a
            public final void onResult(Object obj) {
                WikiSceneFragment.U0(imageView, i11, (List) obj);
            }
        });
    }

    public final void V0(int i11) {
        TabLayout tabLayout = l0().f55463r;
        Iterator<Integer> it = g10.u.W1(0, tabLayout.getTabCount()).iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            TabLayout.i D2 = tabLayout.D(nextInt);
            View g11 = D2 != null ? D2.g() : null;
            TextView textView = g11 instanceof TextView ? (TextView) g11 : null;
            if (textView != null) {
                if (nextInt == i11) {
                    textView.setTypeface(Typeface.create("sans-serif-medium", 1));
                    textView.setTextColor(-14143420);
                } else {
                    textView.setTypeface(Typeface.create(C.SANS_SERIF_NAME, 0));
                    textView.setTextColor(-6510920);
                }
            }
        }
    }

    public final void W0(y2 y2Var) {
        TabLayout.TabView tabView;
        BookLanguageType value = o0().B().getValue();
        if (D0(value)) {
            qb.c.b(f25602q, "英语场景，不隐藏空tab", new Object[0]);
            return;
        }
        qb.c.b(f25602q, "小语种场景，检查并隐藏空tab: language=" + value, new Object[0]);
        j9 j9Var = this.f25612f;
        if (j9Var == null) {
            return;
        }
        TabLayout tabLayout = j9Var.f55463r;
        kotlin.jvm.internal.g0.o(tabLayout, "tabLayout");
        this.f25616j.clear();
        Iterator<Integer> it = g10.u.W1(0, f25607v.size()).iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            boolean p02 = p0(nextInt, y2Var);
            if (p02) {
                this.f25616j.add(Integer.valueOf(nextInt));
            }
            TabLayout.i D2 = tabLayout.D(nextInt);
            if (D2 != null && (tabView = D2.f32310i) != null) {
                tabView.setVisibility(p02 ? 0 : 8);
            }
            qb.c.b(f25602q, "Tab " + nextInt + " (" + ((Object) f25607v.get(nextInt)) + "): hasData=" + p02, new Object[0]);
        }
        if (this.f25616j.contains(Integer.valueOf(this.f25614h)) || this.f25616j.isEmpty()) {
            return;
        }
        int intValue = ((Number) a00.r0.G2(this.f25616j)).intValue();
        TabLayout.i D3 = tabLayout.D(intValue);
        if (D3 != null) {
            D3.r();
        }
        qb.c.b(f25602q, "当前tab被隐藏，切换到第一个可用tab: " + intValue, new Object[0]);
    }

    public final void X0(final si.c cVar) {
        qb.c.b(f25602q, "updateWordInfo: word=" + cVar.t() + ", meanings=" + cVar.p().size() + ", sceneType=" + o0().F(), new Object[0]);
        final j9 j9Var = this.f25612f;
        if (j9Var != null) {
            j9Var.f55466u.setText(cVar.t());
            Boolean value = o0().O().getValue();
            if (value != null ? value.booleanValue() : true) {
                TextView phoneticUs = j9Var.f55460o;
                kotlin.jvm.internal.g0.o(phoneticUs, "phoneticUs");
                I0(phoneticUs, cVar.r());
                j9Var.f55459n.setVisibility(8);
                LottieAnimationView lottieAnimationView = j9Var.f55465t;
                String n11 = cVar.n();
                lottieAnimationView.setVisibility(L0(!(n11 == null || n11.length() == 0)));
                j9Var.f55464s.setVisibility(8);
            } else {
                j9Var.f55460o.setVisibility(8);
                TextView phoneticUk = j9Var.f55459n;
                kotlin.jvm.internal.g0.o(phoneticUk, "phoneticUk");
                I0(phoneticUk, cVar.q());
                j9Var.f55465t.setVisibility(8);
                LottieAnimationView lottieAnimationView2 = j9Var.f55464s;
                String m11 = cVar.m();
                lottieAnimationView2.setVisibility(L0(!(m11 == null || m11.length() == 0)));
            }
            j9Var.f55465t.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WikiSceneFragment.Y0(WikiSceneFragment.this, cVar, view);
                }
            });
            j9Var.f55464s.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WikiSceneFragment.Z0(WikiSceneFragment.this, cVar, view);
                }
            });
            o0().N().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 a12;
                    a12 = WikiSceneFragment.a1(WikiSceneFragment.this, j9Var, (Boolean) obj);
                    return a12;
                }
            }));
            o0().M().observe(getViewLifecycleOwner(), new c(new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.w
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b12;
                    b12 = WikiSceneFragment.b1(WikiSceneFragment.this, j9Var, (Boolean) obj);
                    return b12;
                }
            }));
            boolean D0 = kotlin.jvm.internal.g0.g(m0(), "wordlist") ? D0(o0().B().getValue()) : true;
            j9Var.f55450e.setVisibility(D0 ? 0 : 8);
            if (D0) {
                hj.m l02 = o0().l0();
                if (l02 != null) {
                    l02.D(new hj.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.x
                        @Override // hj.a
                        public final void onResult(Object obj) {
                            WikiSceneFragment.c1(j9.this, cVar, (List) obj);
                        }
                    });
                } else {
                    j9Var.f55450e.setSelected(false);
                }
                j9Var.f55450e.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WikiSceneFragment.d1(WikiSceneFragment.this, cVar, view);
                    }
                });
            }
            j9Var.f55456k.removeAllViews();
            if (!cVar.p().isEmpty()) {
                List<c.b> p11 = cVar.p();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : p11) {
                    String f11 = ((c.b) obj).f();
                    Object obj2 = linkedHashMap.get(f11);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(f11, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    LinearLayout linearLayout = new LinearLayout(requireContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, KotlinExtKt.getDpPixels(4), 0, KotlinExtKt.getDpPixels(4));
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(48);
                    if (str.length() > 0) {
                        TextView textView = new TextView(requireContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.setMargins(0, 0, KotlinExtKt.getDpPixels(8), 0);
                        textView.setLayoutParams(layoutParams2);
                        textView.setText(str);
                        textView.setTextSize(14.0f);
                        textView.setTextColor(KotlinExtKt.getColorInt(R.color.main_color_word_b8));
                        textView.setPadding(0, KotlinExtKt.getDpPixels(2), 0, KotlinExtKt.getDpPixels(2));
                        textView.setMaxLines(1);
                        textView.setSingleLine(true);
                        linearLayout.addView(textView);
                    }
                    String r32 = a00.r0.r3(list, "; ", null, null, 0, null, new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.z
                        @Override // x00.l
                        public final Object invoke(Object obj3) {
                            CharSequence f12;
                            f12 = WikiSceneFragment.f1((c.b) obj3);
                            return f12;
                        }
                    }, 30, null);
                    TextView textView2 = new TextView(requireContext());
                    textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    textView2.setText(r32);
                    textView2.setTextSize(14.0f);
                    textView2.setTextColor(KotlinExtKt.getColorInt(R.color.main_color_word_822));
                    textView2.setPadding(0, KotlinExtKt.getDpPixels(2), 0, KotlinExtKt.getDpPixels(2));
                    textView2.setMaxLines(Integer.MAX_VALUE);
                    textView2.setGravity(8388659);
                    linearLayout.addView(textView2);
                    j9Var.f55456k.addView(linearLayout);
                }
            }
            TextView applicableScopes = j9Var.f55446a;
            kotlin.jvm.internal.g0.o(applicableScopes, "applicableScopes");
            sa.q.z(applicableScopes, false);
            TextView examInfo = j9Var.f55454i;
            kotlin.jvm.internal.g0.o(examInfo, "examInfo");
            sa.q.z(examInfo, false);
        }
    }

    public final Fragment a0(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? com.baicizhan.main.wikiv2.lookup.wikiv2.tab.c.f25758h.a() : OtherFragment.f25728q.a() : com.baicizhan.main.wikiv2.lookup.wikiv2.tab.b.f25754g.a() : com.baicizhan.main.wikiv2.lookup.wikiv2.tab.d.f25763g.a() : com.baicizhan.main.wikiv2.lookup.wikiv2.tab.e.f25767h.a() : com.baicizhan.main.wikiv2.lookup.wikiv2.tab.c.f25758h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final FrameLayout b0(final ViewGroup viewGroup) {
        FrameLayout frameLayout;
        Iterator it = q30.k0.N1(a00.r0.E1(g10.u.W1(0, viewGroup.getChildCount())), new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                View c02;
                c02 = WikiSceneFragment.c0(viewGroup, ((Integer) obj).intValue());
                return c02;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                frameLayout = 0;
                break;
            }
            frameLayout = it.next();
            if (((View) frameLayout).getId() == R.id.video_container) {
                break;
            }
        }
        FrameLayout frameLayout2 = frameLayout instanceof FrameLayout ? frameLayout : null;
        return frameLayout2 == null ? (FrameLayout) q30.k0.i1(q30.k0.S1(a00.r0.E1(g10.u.W1(0, viewGroup.getChildCount())), new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                FrameLayout d02;
                d02 = WikiSceneFragment.d0(viewGroup, this, ((Integer) obj).intValue());
                return d02;
            }
        })) : frameLayout2;
    }

    public final Bundle e0() {
        return (Bundle) this.f25617k.getValue();
    }

    public final j9 l0() {
        j9 j9Var = this.f25612f;
        kotlin.jvm.internal.g0.m(j9Var);
        return j9Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        o0().c0(m0());
        hj.p.e(this, new rj.e() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.l
            @Override // rj.e
            public final void a(ij.e eVar) {
                WikiSceneFragment.E0(WikiSceneFragment.this, eVar);
            }
        });
        if (n0() > 0) {
            o0().b0(n0(), f0());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @m80.k
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        j9 g11 = j9.g(inflater, viewGroup, false);
        this.f25612f = g11;
        g11.j(o0());
        g11.setLifecycleOwner(getViewLifecycleOwner());
        Integer valueOf = Integer.valueOf(e0().getInt("wiki_background"));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            View root = g11.getRoot();
            kotlin.jvm.internal.g0.o(root, "getRoot(...)");
            root.setBackgroundColor(valueOf.intValue());
        }
        w0();
        x0();
        View root2 = g11.getRoot();
        kotlin.jvm.internal.g0.o(root2, "getRoot(...)");
        return root2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25615i = null;
        this.f25612f = null;
    }

    public final boolean p0(int i11, y2 y2Var) {
        if (i11 != 0) {
            if (i11 == 1) {
                return !y2Var.a0().isEmpty();
            }
            if (i11 == 2) {
                return !y2Var.k0().isEmpty();
            }
            if (i11 == 3) {
                return !y2Var.S().isEmpty();
            }
            if (i11 != 4) {
                return false;
            }
            return (y2Var.e0().isEmpty() && y2Var.i0().isEmpty() && y2Var.Q().isEmpty() && y2Var.o0().isEmpty() && y2Var.U().isEmpty() && y2Var.m0() == null) ? false : true;
        }
        List<i0.w> c02 = y2Var.c0();
        if ((c02 instanceof Collection) && c02.isEmpty()) {
            return false;
        }
        Iterator<T> it = c02.iterator();
        while (it.hasNext()) {
            if (!SentenceTagHelper.f25653a.d(((i0.w) it.next()).j0())) {
                return true;
            }
        }
        return false;
    }

    public final void q0() {
        j9 l02 = l0();
        l02.f55449d.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WikiSceneFragment.r0(WikiSceneFragment.this, view);
            }
        });
        l02.f55448c.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WikiSceneFragment.s0(WikiSceneFragment.this, view);
            }
        });
    }

    public final g2 t0() {
        View findViewById = l0().f55453h.findViewById(R.id.error_retry_button);
        if (findViewById == null) {
            return null;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WikiSceneFragment.u0(WikiSceneFragment.this, view);
            }
        });
        return g2.f100423a;
    }

    public final void v0() {
        j9 l02 = l0();
        int i11 = 0;
        for (Object obj : f25607v) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            TabLayout.i I = l02.f55463r.I();
            kotlin.jvm.internal.g0.o(I, "newTab(...)");
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.item_wiki_custom_tab, (ViewGroup) null);
            kotlin.jvm.internal.g0.n(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setText((String) obj);
            I.v(textView);
            l02.f55463r.i(I);
            i11 = i12;
        }
        l02.f55463r.h(new b());
        J0();
        F0();
    }

    public final g2 w0() {
        l0();
        v0();
        q0();
        return t0();
    }

    public final void Z() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements TabLayout.f {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.i iVar) {
            if (iVar != null) {
                int k11 = iVar.k();
                WikiSceneFragment wikiSceneFragment = WikiSceneFragment.this;
                wikiSceneFragment.K0(k11);
                wikiSceneFragment.V0(k11);
                WikiSceneFragment.Q0(wikiSceneFragment, k11, false, 2, null);
                wikiSceneFragment.G0(k11);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.i iVar) {
        }
    }
}
