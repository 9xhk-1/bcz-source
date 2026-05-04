package mj;

import a00.k1;
import a00.l1;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.view.AspectRoundImageView;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.user_activity_api.ExportBanner;
import com.jiongji.andriod.card.R;
import gs.ah;
import gs.ch;
import gs.eh;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordDetailRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordDetailRecyclerAdapter.kt\ncom/baicizhan/main/word_book/detail/WordDetailRecyclerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,315:1\n808#2,11:316\n1563#2:327\n1634#2,3:328\n35#3:331\n*S KotlinDebug\n*F\n+ 1 WordDetailRecyclerAdapter.kt\ncom/baicizhan/main/word_book/detail/WordDetailRecyclerAdapter\n*L\n133#1:316,11\n133#1:327\n133#1:328,3\n256#1:331\n*E\n"})
/* loaded from: classes5.dex */
public final class w0 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements DefaultLifecycleObserver {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f73399i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f73400j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f73401k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f73402l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f73403m = 3;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f73404n = "WordDetailRecyclerAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i0 f73405a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f73406b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Object> f73407c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Set<Long> f73408d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f73409e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f73410f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73411g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public AnimationDrawable f73412h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f73413b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ah f73414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k ah bannerBinding) {
            super(bannerBinding.getRoot());
            kotlin.jvm.internal.g0.p(bannerBinding, "bannerBinding");
            this.f73414a = bannerBinding;
        }

        @m80.k
        public final ah a() {
            return this.f73414a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f73415b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final eh f73416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k eh sectionBinding) {
            super(sectionBinding.getRoot());
            kotlin.jvm.internal.g0.p(sectionBinding, "sectionBinding");
            this.f73416a = sectionBinding;
        }

        @m80.k
        public final eh a() {
            return this.f73416a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f73417b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ch f73418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k ch infoBinding) {
            super(infoBinding.getRoot());
            kotlin.jvm.internal.g0.p(infoBinding, "infoBinding");
            this.f73418a = infoBinding;
        }

        @m80.k
        public final ch a() {
            return this.f73418a;
        }
    }

    public w0(@m80.k i0 vm2) {
        kotlin.jvm.internal.g0.p(vm2, "vm");
        this.f73405a = vm2;
        this.f73407c = new ArrayList();
        this.f73408d = new LinkedHashSet();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.f73409e = mutableLiveData;
        this.f73410f = mutableLiveData;
        this.f73411g = yz.e0.c(new x00.a() { // from class: mj.k0
            @Override // x00.a
            public final Object invoke() {
                q9.l u11;
                u11 = w0.u();
                return u11;
            }
        });
    }

    public static final g2 A(w0 w0Var, ij.z zVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        w0Var.f73405a.m(a00.g0.l(Long.valueOf(zVar.y())));
        return g2.f100423a;
    }

    public static final g2 B(AspectRoundImageView aspectRoundImageView, ExportBanner exportBanner, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        BczWebExecutorKt.startNormalWeb$default(aspectRoundImageView.getContext(), exportBanner.jump_url, null, false, 0, null, 60, null);
        ma.l.a(ma.t.f73012k, ma.a.R4);
        return g2.f100423a;
    }

    public static final void D(AnimationDrawable animationDrawable, w0 w0Var, IAudioPlayer.State state) {
        if (IAudioPlayer.State.Playing == state) {
            animationDrawable.start();
        }
        if (IAudioPlayer.State.Stopped == state || IAudioPlayer.State.Completed == state) {
            w0Var.I(animationDrawable);
        }
    }

    public static final g2 E(w0 w0Var, File file) {
        w0Var.r().e(file);
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Throwable th2) {
        qb.c.d("WordDetailRecyclerAdapter", "play audio error:" + th2.getMessage(), new Object[0]);
        va.g.i(KotlinExtKt.getString(R.string.word_book_voice_no_file), 0);
    }

    public static /* synthetic */ void L(w0 w0Var, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        w0Var.K(list, z11);
    }

    private final q9.l r() {
        return (q9.l) this.f73411g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q9.l u() {
        return new q9.l(KotlinExtKt.getGlobalApplicationContext());
    }

    public static final void v(w0 w0Var, ij.z zVar, View view) {
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            w0Var.f73408d.add(Long.valueOf(zVar.y()));
        } else {
            w0Var.f73408d.remove(Long.valueOf(zVar.y()));
        }
        w0Var.f73409e.postValue(Integer.valueOf(w0Var.f73408d.size()));
    }

    public static final void w(w0 w0Var, ch chVar, ij.z zVar, View view) {
        if (w0Var.f73406b) {
            return;
        }
        View hideEnView = chVar.f54461c;
        kotlin.jvm.internal.g0.o(hideEnView, "hideEnView");
        View hideEnView2 = chVar.f54461c;
        kotlin.jvm.internal.g0.o(hideEnView2, "hideEnView");
        sa.q.z(hideEnView, !sa.q.m(hideEnView2));
        zVar.B(!zVar.w());
        Pair a11 = h1.a("topic_id", Integer.valueOf(zVar.x()));
        Pair a12 = h1.a("word_type", ma.b.F0);
        View hideEnView3 = chVar.f54461c;
        kotlin.jvm.internal.g0.o(hideEnView3, "hideEnView");
        ma.l.e(ma.t.f73012k, ma.a.Y3, l1.W(a11, a12, h1.a(ma.b.G0, sa.q.m(hideEnView3) ? ma.b.H0 : ma.b.I0)));
    }

    public static final void x(w0 w0Var, ch chVar, ij.z zVar, View view) {
        if (w0Var.f73406b) {
            return;
        }
        View hideChView = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView, "hideChView");
        View hideChView2 = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView2, "hideChView");
        sa.q.z(hideChView, !sa.q.m(hideChView2));
        zVar.A(!zVar.v());
        Pair a11 = h1.a("topic_id", Integer.valueOf(zVar.x()));
        Pair a12 = h1.a("word_type", ma.b.E0);
        View hideChView3 = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView3, "hideChView");
        ma.l.e(ma.t.f73012k, ma.a.Y3, l1.W(a11, a12, h1.a(ma.b.G0, sa.q.m(hideChView3) ? ma.b.H0 : ma.b.I0)));
    }

    public static final g2 y(w0 w0Var, RecyclerView.ViewHolder viewHolder, ij.z zVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (w0Var.f73406b) {
            return g2.f100423a;
        }
        WordWikiActivity.a aVar = WordWikiActivity.f25556b;
        Context context = viewHolder.itemView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        aVar.c(context, zVar.x(), zVar.r(), GetTopicResourceChannel.WORD_LIST_COLLECTED);
        ma.l.e(ma.t.f73012k, ma.a.f72710a4, k1.k(h1.a("topic_id", Integer.valueOf(zVar.x()))));
        return g2.f100423a;
    }

    public static final g2 z(w0 w0Var, ij.z zVar, AnimationDrawable animationDrawable, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (w0Var.f73406b) {
            return g2.f100423a;
        }
        ma.l.e(ma.t.f73012k, ma.a.Z3, k1.k(h1.a("topic_id", Integer.valueOf(zVar.x()))));
        w0Var.C(w0Var.f73405a.u() ? zVar.q() : zVar.p(), animationDrawable);
        return g2.f100423a;
    }

    public final void C(@m80.k String url, @m80.k final AnimationDrawable anim) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(anim, "anim");
        AnimationDrawable animationDrawable = this.f73412h;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            I(animationDrawable);
        }
        this.f73412h = anim;
        r().f(new IAudioPlayer.b() { // from class: mj.n0
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                w0.D(anim, this, state);
            }
        });
        rx.c<File> I3 = m9.d.d().e(url).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: mj.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = w0.E(w0.this, (File) obj);
                return E;
            }
        };
        I3.u5(new wb0.b() { // from class: mj.p0
            @Override // wb0.b
            public final void call(Object obj) {
                w0.F(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: mj.q0
            @Override // wb0.b
            public final void call(Object obj) {
                w0.G((Throwable) obj);
            }
        });
    }

    public final void H(boolean z11) {
        p();
        this.f73406b = z11;
        notifyDataSetChanged();
    }

    public final void I(@m80.k AnimationDrawable animationDrawable) {
        kotlin.jvm.internal.g0.p(animationDrawable, "<this>");
        animationDrawable.stop();
        animationDrawable.selectDrawable(0);
    }

    public final void J() {
        this.f73405a.m(a00.r0.a6(this.f73408d));
        p();
    }

    public final void K(@m80.k List<? extends Object> data, boolean z11) {
        kotlin.jvm.internal.g0.p(data, "data");
        if (z11) {
            DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new mj.a(this.f73407c, data), false);
            kotlin.jvm.internal.g0.o(calculateDiff, "calculateDiff(...)");
            calculateDiff.dispatchUpdatesTo(this);
        }
        this.f73407c.clear();
        this.f73407c.addAll(data);
        if (z11) {
            return;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f73407c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        Object obj = this.f73407c.get(i11);
        if (obj instanceof ij.z) {
            return 2;
        }
        return obj instanceof ExportBanner ? 3 : 1;
    }

    public final void o(boolean z11) {
        if (!z11) {
            p();
        }
        if (z11) {
            List<Object> list = this.f73407c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ij.z) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((ij.z) it.next()).y()));
            }
            this.f73408d.addAll(arrayList2);
            this.f73409e.postValue(Integer.valueOf(this.f73408d.size()));
        } else {
            this.f73408d.clear();
            this.f73409e.postValue(Integer.valueOf(this.f73408d.size()));
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@m80.k final RecyclerView.ViewHolder holder, int i11) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        if (!(holder instanceof d)) {
            if (!(holder instanceof a)) {
                TextView textView = ((c) holder).a().f54790a;
                Object obj = this.f73407c.get(i11);
                kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlin.String");
                textView.setText((String) obj);
                return;
            }
            Object obj2 = this.f73407c.get(i11);
            kotlin.jvm.internal.g0.n(obj2, "null cannot be cast to non-null type com.baicizhan.online.user_activity_api.ExportBanner");
            final ExportBanner exportBanner = (ExportBanner) obj2;
            final AspectRoundImageView aspectRoundImageView = ((a) holder).a().f54182a;
            String img_url = exportBanner.img_url;
            kotlin.jvm.internal.g0.o(img_url, "img_url");
            ic.c j11 = hc.c.l(img_url).j(R.drawable.ic_banner_default);
            kotlin.jvm.internal.g0.m(aspectRoundImageView);
            j11.o(aspectRoundImageView);
            sa.q.t(aspectRoundImageView, 0, new x00.l() { // from class: mj.m0
                @Override // x00.l
                public final Object invoke(Object obj3) {
                    g2 B;
                    B = w0.B(AspectRoundImageView.this, exportBanner, (View) obj3);
                    return B;
                }
            }, 1, null);
            return;
        }
        final ch a11 = ((d) holder).a();
        Object obj3 = this.f73407c.get(i11);
        kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type com.baicizhan.main.word_book.data.WordFavorite");
        final ij.z zVar = (ij.z) obj3;
        a11.f54465g.setForbidSwipe(this.f73406b);
        TextView textView2 = a11.f54469k;
        Drawable drawable = KotlinExtKt.getDrawable(R.drawable.ic_arrow_a7e_more);
        if (drawable != null) {
            drawable.setBounds(0, 0, KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(16));
        }
        textView2.setCompoundDrawables(null, null, drawable, null);
        a11.f54470l.setBackgroundResource(R.drawable.animation_word_book_sound);
        ImageView wordVoice = a11.f54470l;
        kotlin.jvm.internal.g0.o(wordVoice, "wordVoice");
        KotlinExtKt.expandTouchArea(wordVoice, 8);
        Drawable background = a11.f54470l.getBackground();
        kotlin.jvm.internal.g0.n(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        final AnimationDrawable animationDrawable = (AnimationDrawable) background;
        animationDrawable.selectDrawable(0);
        ImageView selectCheck = a11.f54464f;
        kotlin.jvm.internal.g0.o(selectCheck, "selectCheck");
        sa.q.z(selectCheck, this.f73406b);
        a11.f54464f.setSelected(this.f73408d.contains(Long.valueOf(zVar.y())));
        a11.f54468j.setText(zVar.z());
        a11.f54467i.setText(zVar.t());
        View hideEnView = a11.f54461c;
        kotlin.jvm.internal.g0.o(hideEnView, "hideEnView");
        sa.q.z(hideEnView, (zVar.w() || this.f73406b) ? false : true);
        View hideChView = a11.f54460b;
        kotlin.jvm.internal.g0.o(hideChView, "hideChView");
        sa.q.z(hideChView, (zVar.v() || this.f73406b) ? false : true);
        a11.f54464f.setOnClickListener(new View.OnClickListener() { // from class: mj.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.v(w0.this, zVar, view);
            }
        });
        if (this.f73406b) {
            return;
        }
        a11.f54468j.setOnClickListener(new View.OnClickListener() { // from class: mj.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.w(w0.this, a11, zVar, view);
            }
        });
        a11.f54467i.setOnClickListener(new View.OnClickListener() { // from class: mj.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.x(w0.this, a11, zVar, view);
            }
        });
        TextView wordMoreInfo = a11.f54469k;
        kotlin.jvm.internal.g0.o(wordMoreInfo, "wordMoreInfo");
        sa.q.t(wordMoreInfo, 0, new x00.l() { // from class: mj.u0
            @Override // x00.l
            public final Object invoke(Object obj4) {
                g2 y11;
                y11 = w0.y(w0.this, holder, zVar, (View) obj4);
                return y11;
            }
        }, 1, null);
        ImageView wordVoice2 = a11.f54470l;
        kotlin.jvm.internal.g0.o(wordVoice2, "wordVoice");
        sa.q.t(wordVoice2, 0, new x00.l() { // from class: mj.v0
            @Override // x00.l
            public final Object invoke(Object obj4) {
                g2 z11;
                z11 = w0.z(w0.this, zVar, animationDrawable, (View) obj4);
                return z11;
            }
        }, 1, null);
        TextView tvDelete = a11.f54466h;
        kotlin.jvm.internal.g0.o(tvDelete, "tvDelete");
        sa.q.t(tvDelete, 0, new x00.l() { // from class: mj.l0
            @Override // x00.l
            public final Object invoke(Object obj4) {
                g2 A;
                A = w0.A(w0.this, zVar, (View) obj4);
                return A;
            }
        }, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    public RecyclerView.ViewHolder onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        kotlin.jvm.internal.g0.p(parent, "parent");
        if (i11 == 2) {
            ch e11 = ch.e(LayoutInflater.from(parent.getContext()), parent, false);
            kotlin.jvm.internal.g0.o(e11, "inflate(...)");
            return new d(e11);
        }
        if (i11 != 3) {
            eh e12 = eh.e(LayoutInflater.from(parent.getContext()), parent, false);
            kotlin.jvm.internal.g0.o(e12, "inflate(...)");
            return new c(e12);
        }
        ah e13 = ah.e(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.g0.o(e13, "inflate(...)");
        return new a(e13);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        r().stop();
        r().destroy();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        AnimationDrawable animationDrawable = this.f73412h;
        if (animationDrawable != null) {
            I(animationDrawable);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(@m80.k LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    public final void p() {
        this.f73408d.clear();
        this.f73409e.postValue(0);
    }

    @m80.k
    public final LiveData<Integer> q() {
        return this.f73410f;
    }

    @m80.k
    public final List<Object> s() {
        return this.f73407c;
    }

    @m80.k
    public final Set<Long> t() {
        return this.f73408d;
    }
}
