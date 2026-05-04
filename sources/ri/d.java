package ri;

import a00.h0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.tab.OtherFragment;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.jiongji.andriod.card.R;
import gi.m0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import ri.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f84086e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f84087f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f84088g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f84089h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f84090i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f84091j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f84092k = 5;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final LifecycleOwner f84093a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final o0 f84094b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public OtherFragment.OtherType f84095c = OtherFragment.OtherType.SIMILAR;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public List<? extends Object> f84096d = h0.J();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f84097b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f84098a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.en_mean_text);
            g0.o(findViewById, "findViewById(...)");
            this.f84098a = (TextView) findViewById;
        }

        public final void a(@m80.k String mean, @m80.l o0 o0Var) {
            g0.p(mean, "mean");
            m0.u(this.f84098a, mean, o0Var != null ? o0Var.K() : true, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: c, reason: collision with root package name */
        public static final int f84099c = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f84100a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f84101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.similar_word_left);
            g0.o(findViewById, "findViewById(...)");
            this.f84100a = (TextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.similar_word_right);
            g0.o(findViewById2, "findViewById(...)");
            this.f84101b = (TextView) findViewById2;
        }

        public final void a(@m80.k i0.y item, @m80.l o0 o0Var) {
            g0.p(item, "item");
            boolean K = o0Var != null ? o0Var.K() : true;
            m0.u(this.f84100a, item.y(), K, true);
            StringBuilder sb2 = new StringBuilder();
            String u11 = item.u();
            if (u11 != null && u11.length() != 0) {
                sb2.append(item.u());
                sb2.append(" ");
            }
            sb2.append(item.s());
            m0.u(this.f84101b, sb2.toString(), K, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    /* renamed from: ri.d$d, reason: collision with other inner class name */
    public static final class C1050d extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f84102b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f84103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1050d(@m80.k View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.synonym_word);
            g0.o(findViewById, "findViewById(...)");
            this.f84103a = (TextView) findViewById;
        }

        public final void a(@m80.k String word, @m80.l o0 o0Var) {
            g0.p(word, "word");
            m0.u(this.f84103a, word, o0Var != null ? o0Var.K() : true, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class f extends RecyclerView.ViewHolder {

        /* renamed from: c, reason: collision with root package name */
        public static final int f84109c = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f84110a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f84111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.variant_type);
            g0.o(findViewById, "findViewById(...)");
            this.f84110a = (TextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.variant_word);
            g0.o(findViewById2, "findViewById(...)");
            this.f84111b = (TextView) findViewById2;
        }

        public final void a(@m80.k i0.b0 item, @m80.l o0 o0Var) {
            String str;
            g0.p(item, "item");
            if (o0Var != null) {
                o0Var.K();
            }
            switch (item.e()) {
                case 1:
                    str = ExtendedWordInfo.WordDeform.f25863e;
                    break;
                case 2:
                    str = ExtendedWordInfo.WordDeform.f25865g;
                    break;
                case 3:
                    str = ExtendedWordInfo.WordDeform.f25864f;
                    break;
                case 4:
                    str = ExtendedWordInfo.WordDeform.f25862d;
                    break;
                case 5:
                    str = "单数";
                    break;
                case 6:
                    str = ExtendedWordInfo.WordDeform.f25861c;
                    break;
                case 7:
                    str = ExtendedWordInfo.WordDeform.f25866h;
                    break;
                case 8:
                    str = ExtendedWordInfo.WordDeform.f25867i;
                    break;
                default:
                    str = "";
                    break;
            }
            this.f84110a.setText(str);
            m0.u(this.f84111b, item.g(), false, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84112a;

        static {
            int[] iArr = new int[OtherFragment.OtherType.values().length];
            try {
                iArr[OtherFragment.OtherType.SIMILAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtherFragment.OtherType.SYNONYM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtherFragment.OtherType.ANTONYM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtherFragment.OtherType.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OtherFragment.OtherType.EN_MEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OtherFragment.OtherType.TV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f84112a = iArr;
        }
    }

    public d(@m80.l LifecycleOwner lifecycleOwner, @m80.l o0 o0Var) {
        this.f84093a = lifecycleOwner;
        this.f84094b = o0Var;
    }

    public final void b(@m80.k OtherFragment.OtherType type, @m80.k List<? extends Object> data) {
        g0.p(type, "type");
        g0.p(data, "data");
        this.f84095c = type;
        this.f84096d = data;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84096d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        switch (g.f84112a[this.f84095c.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@m80.k RecyclerView.ViewHolder holder, int i11) {
        g0.p(holder, "holder");
        if (holder instanceof c) {
            Object obj = this.f84096d.get(i11);
            g0.n(obj, "null cannot be cast to non-null type com.baicizhan.app.api.service.model.TopicResourceModel.Similar");
            ((c) holder).a((i0.y) obj, this.f84094b);
            return;
        }
        if (holder instanceof C1050d) {
            Object obj2 = this.f84096d.get(i11);
            g0.n(obj2, "null cannot be cast to non-null type kotlin.String");
            ((C1050d) holder).a((String) obj2, this.f84094b);
            return;
        }
        if (holder instanceof f) {
            Object obj3 = this.f84096d.get(i11);
            g0.n(obj3, "null cannot be cast to non-null type com.baicizhan.app.api.service.model.TopicResourceModel.Variant");
            ((f) holder).a((i0.b0) obj3, this.f84094b);
            return;
        }
        if (holder instanceof b) {
            Object obj4 = this.f84096d.get(i11);
            g0.n(obj4, "null cannot be cast to non-null type kotlin.String");
            ((b) holder).a((String) obj4, this.f84094b);
            return;
        }
        if (holder instanceof e) {
            Object obj5 = this.f84096d.get(i11);
            g0.n(obj5, "null cannot be cast to non-null type com.baicizhan.app.api.service.model.TopicResourceModel.TvInfo");
            ((e) holder).d((i0.a0) obj5, this.f84093a, this.f84094b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    public RecyclerView.ViewHolder onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i11 == 1) {
            View inflate = from.inflate(R.layout.item_lookup_other_similar, parent, false);
            g0.m(inflate);
            return new c(inflate);
        }
        if (i11 == 2) {
            View inflate2 = from.inflate(R.layout.item_lookup_other_synonym, parent, false);
            g0.m(inflate2);
            return new C1050d(inflate2);
        }
        if (i11 == 3) {
            View inflate3 = from.inflate(R.layout.item_lookup_other_variant, parent, false);
            g0.m(inflate3);
            return new f(inflate3);
        }
        if (i11 == 4) {
            View inflate4 = from.inflate(R.layout.item_lookup_other_en_mean, parent, false);
            g0.m(inflate4);
            return new b(inflate4);
        }
        if (i11 == 5) {
            View inflate5 = from.inflate(R.layout.item_lookup_other_tv, parent, false);
            g0.m(inflate5);
            return new e(inflate5);
        }
        throw new IllegalArgumentException("Unknown view type: " + i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nOtherContentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherContentAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/adapter/OtherContentAdapter$TvViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
    public static final class e extends RecyclerView.ViewHolder {

        /* renamed from: d, reason: collision with root package name */
        public static final int f84104d = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final FrameLayout f84105a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final WikiVideoView f84106b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public LifecycleEventObserver f84107c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84108a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f84108a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.video_container);
            g0.o(findViewById, "findViewById(...)");
            this.f84105a = (FrameLayout) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tv_video_view);
            g0.o(findViewById2, "findViewById(...)");
            this.f84106b = (WikiVideoView) findViewById2;
        }

        public static final void h(e eVar, Lifecycle lifecycle, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            g0.p(lifecycleOwner, "<unused var>");
            g0.p(event, "event");
            int i11 = a.f84108a[event.ordinal()];
            if (i11 == 1) {
                eVar.f84106b.r();
            } else {
                if (i11 != 2) {
                    return;
                }
                LifecycleEventObserver lifecycleEventObserver = eVar.f84107c;
                g0.m(lifecycleEventObserver);
                lifecycle.removeObserver(lifecycleEventObserver);
                eVar.f84107c = null;
            }
        }

        public static final void j(WikiVideoView wikiVideoView, e eVar) {
            if (wikiVideoView.n()) {
                eVar.e();
            } else {
                eVar.f();
            }
        }

        public final void d(@m80.k i0.a0 tvInfo, @m80.l LifecycleOwner lifecycleOwner, @m80.l o0 o0Var) {
            g0.p(tvInfo, "tvInfo");
            i(tvInfo, lifecycleOwner);
            g(lifecycleOwner);
        }

        @SuppressLint({"SourceLockedOrientationActivity"})
        public final void e() {
            FragmentActivity fragmentActivity;
            Window window;
            View decorView;
            Context context = this.itemView.getContext();
            if (!(context instanceof FragmentActivity) || (window = (fragmentActivity = (FragmentActivity) context).getWindow()) == null || (decorView = window.getDecorView()) == null) {
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
                    this.f84105a.removeAllViews();
                    this.f84105a.addView(childAt);
                    break;
                }
                i11++;
            }
            this.f84106b.setFullscreen(false);
            fragmentActivity.setRequestedOrientation(1);
        }

        public final void f() {
            FragmentActivity fragmentActivity;
            Window window;
            View decorView;
            Context context = this.itemView.getContext();
            if (!(context instanceof FragmentActivity) || (window = (fragmentActivity = (FragmentActivity) context).getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            this.f84105a.removeView(this.f84106b);
            ((ViewGroup) decorView).addView(this.f84106b);
            this.f84106b.setFullscreen(true);
            fragmentActivity.setRequestedOrientation(0);
        }

        public final void g(LifecycleOwner lifecycleOwner) {
            final Lifecycle lifecycle;
            if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                return;
            }
            LifecycleEventObserver lifecycleEventObserver = this.f84107c;
            if (lifecycleEventObserver != null) {
                lifecycle.removeObserver(lifecycleEventObserver);
            }
            LifecycleEventObserver lifecycleEventObserver2 = new LifecycleEventObserver() { // from class: ri.g
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    d.e.h(d.e.this, lifecycle, lifecycleOwner2, event);
                }
            };
            this.f84107c = lifecycleEventObserver2;
            g0.m(lifecycleEventObserver2);
            lifecycle.addObserver(lifecycleEventObserver2);
        }

        public final void i(i0.a0 a0Var, LifecycleOwner lifecycleOwner) {
            final WikiVideoView wikiVideoView = this.f84106b;
            wikiVideoView.setFullscreenEnabled(true);
            String e11 = a0Var.e();
            if (e11 != null) {
                wikiVideoView.setVideoURI(m9.c.d(e11));
            }
            String g11 = a0Var.g();
            if (g11 != null) {
                wikiVideoView.setSnapshot(m9.c.d(g11));
            }
            wikiVideoView.setOnFullscreenListener(new WikiVideoView.e() { // from class: ri.e
                @Override // com.baicizhan.client.business.widget.WikiVideoView.e
                public final void a() {
                    d.e.j(WikiVideoView.this, this);
                }
            });
            wikiVideoView.setOnToggleListener(new WikiVideoView.f() { // from class: ri.f
                @Override // com.baicizhan.client.business.widget.WikiVideoView.f
                public final void a(boolean z11) {
                    d.e.k(z11);
                }
            });
        }

        public static final void k(boolean z11) {
        }
    }
}
