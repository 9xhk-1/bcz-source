package com.baicizhan.main.examassistant;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.jiongji.andriod.card.R;
import gs.ch;
import gs.eh;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nMarkedWordRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkedWordRecyclerAdapter.kt\ncom/baicizhan/main/examassistant/MarkedWordRecyclerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,237:1\n808#2,11:238\n1563#2:249\n1634#2,3:250\n35#3:253\n*S KotlinDebug\n*F\n+ 1 MarkedWordRecyclerAdapter.kt\ncom/baicizhan/main/examassistant/MarkedWordRecyclerAdapter\n*L\n100#1:238,11\n100#1:249\n100#1:250,3\n183#1:253\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements DefaultLifecycleObserver {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f20545i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f20546j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20547k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f20548l = 2;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f20549m = "WordDetailRecyclerAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t1 f20550a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20551b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Object> f20552c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f20553d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f20554e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20555f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public AnimationDrawable f20556g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20557h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f20558b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final eh f20559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k eh sectionBinding) {
            super(sectionBinding.getRoot());
            kotlin.jvm.internal.g0.p(sectionBinding, "sectionBinding");
            this.f20559a = sectionBinding;
        }

        @m80.k
        public final eh a() {
            return this.f20559a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f20560b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ch f20561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k ch infoBinding) {
            super(infoBinding.getRoot());
            kotlin.jvm.internal.g0.p(infoBinding, "infoBinding");
            this.f20561a = infoBinding;
        }

        @m80.k
        public final ch a() {
            return this.f20561a;
        }
    }

    public k0(@m80.k t1 vm2) {
        kotlin.jvm.internal.g0.p(vm2, "vm");
        this.f20550a = vm2;
        this.f20552c = new ArrayList();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.f20553d = mutableLiveData;
        this.f20554e = mutableLiveData;
        this.f20555f = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.a0
            @Override // x00.a
            public final Object invoke() {
                q9.l t11;
                t11 = k0.t();
                return t11;
            }
        });
    }

    public static final void A(AnimationDrawable animationDrawable, k0 k0Var, IAudioPlayer.State state) {
        if (IAudioPlayer.State.Playing == state) {
            animationDrawable.start();
        }
        if (IAudioPlayer.State.Stopped == state || IAudioPlayer.State.Completed == state) {
            k0Var.G(animationDrawable);
        }
    }

    public static final yz.g2 B(k0 k0Var, File file) {
        k0Var.p().e(file);
        return yz.g2.f100423a;
    }

    public static final void C(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void D(Throwable th2) {
        qb.c.d("WordDetailRecyclerAdapter", "play audio error:" + th2.getMessage(), new Object[0]);
        va.g.i(KotlinExtKt.getString(R.string.word_book_voice_no_file), 0);
    }

    private final q9.l p() {
        return (q9.l) this.f20555f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q9.l t() {
        return new q9.l(KotlinExtKt.getGlobalApplicationContext());
    }

    public static final void u(k0 k0Var, ch chVar, MarkedWord markedWord, View view) {
        if (k0Var.f20551b || kotlin.jvm.internal.g0.g(k0Var.f20550a.m().getValue(), Boolean.FALSE)) {
            return;
        }
        View hideChView = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView, "hideChView");
        View hideChView2 = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView2, "hideChView");
        sa.q.z(hideChView, !sa.q.m(hideChView2));
        Map<Integer, Boolean> o11 = k0Var.f20550a.o();
        Integer valueOf = Integer.valueOf(markedWord.n());
        View hideChView3 = chVar.f54460b;
        kotlin.jvm.internal.g0.o(hideChView3, "hideChView");
        o11.put(valueOf, Boolean.valueOf(sa.q.m(hideChView3)));
    }

    public static final yz.g2 v(k0 k0Var, RecyclerView.ViewHolder viewHolder, MarkedWord markedWord, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (k0Var.f20551b) {
            return yz.g2.f100423a;
        }
        WordWikiActivity.a aVar = WordWikiActivity.f25556b;
        Context context = viewHolder.itemView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        WordWikiActivity.a.d(aVar, context, markedWord.n(), 0, null, 12, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(k0 k0Var, MarkedWord markedWord, AnimationDrawable animationDrawable, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (k0Var.f20551b) {
            return yz.g2.f100423a;
        }
        k0Var.z(markedWord.j(), animationDrawable);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(k0 k0Var, MarkedWord markedWord, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        k0Var.f20557h = true;
        k0Var.f20550a.j(markedWord.n());
        return yz.g2.f100423a;
    }

    public static final void y(ch chVar, k0 k0Var, MarkedWord markedWord, View view) {
        chVar.f54464f.setSelected(!r4.isSelected());
        if (chVar.f54464f.isSelected()) {
            k0Var.f20550a.s().add(Integer.valueOf(markedWord.n()));
        } else {
            k0Var.f20550a.s().remove(Integer.valueOf(markedWord.n()));
        }
        k0Var.f20553d.postValue(Integer.valueOf(k0Var.f20550a.s().size()));
    }

    public final void E(boolean z11) {
        this.f20551b = z11;
    }

    public final void F(boolean z11) {
        n();
        this.f20551b = z11;
        notifyDataSetChanged();
    }

    public final void G(@m80.k AnimationDrawable animationDrawable) {
        kotlin.jvm.internal.g0.p(animationDrawable, "<this>");
        animationDrawable.stop();
        animationDrawable.selectDrawable(0);
    }

    public final void H(@m80.k List<? extends Object> data) {
        kotlin.jvm.internal.g0.p(data, "data");
        if (this.f20557h) {
            DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new y(this.f20552c, data), false);
            kotlin.jvm.internal.g0.o(calculateDiff, "calculateDiff(...)");
            calculateDiff.dispatchUpdatesTo(this);
        }
        this.f20552c.clear();
        this.f20552c.addAll(data);
        if (!this.f20557h) {
            notifyDataSetChanged();
        }
        this.f20557h = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20552c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return this.f20552c.get(i11) instanceof MarkedWord ? 2 : 1;
    }

    public final void m(boolean z11) {
        if (!z11) {
            n();
        }
        if (z11) {
            List<Object> list = this.f20552c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MarkedWord) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((MarkedWord) it.next()).n()));
            }
            this.f20550a.s().addAll(arrayList2);
            this.f20553d.postValue(Integer.valueOf(this.f20550a.s().size()));
        } else {
            this.f20550a.s().clear();
            this.f20553d.postValue(Integer.valueOf(this.f20550a.s().size()));
        }
        notifyDataSetChanged();
    }

    public final void n() {
        this.f20550a.s().clear();
        this.f20553d.postValue(0);
    }

    @m80.k
    public final LiveData<Integer> o() {
        return this.f20554e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0125  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(@m80.k final androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.examassistant.k0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
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
            return new c(e11);
        }
        eh e12 = eh.e(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.g0.o(e12, "inflate(...)");
        return new b(e12);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        p().stop();
        p().destroy();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        AnimationDrawable animationDrawable = this.f20556g;
        if (animationDrawable != null) {
            G(animationDrawable);
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

    @m80.k
    public final List<Object> q() {
        return this.f20552c;
    }

    public final boolean r() {
        return this.f20551b;
    }

    @m80.k
    public final t1 s() {
        return this.f20550a;
    }

    public final void z(@m80.k String url, @m80.k final AnimationDrawable anim) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(anim, "anim");
        AnimationDrawable animationDrawable = this.f20556g;
        if (animationDrawable != null && animationDrawable.isRunning()) {
            G(animationDrawable);
        }
        this.f20556g = anim;
        p().f(new IAudioPlayer.b() { // from class: com.baicizhan.main.examassistant.b0
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                k0.A(anim, this, state);
            }
        });
        rx.c<File> I3 = m9.d.d().e(url).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.examassistant.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 B;
                B = k0.B(k0.this, (File) obj);
                return B;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.examassistant.d0
            @Override // wb0.b
            public final void call(Object obj) {
                k0.C(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.examassistant.e0
            @Override // wb0.b
            public final void call(Object obj) {
                k0.D((Throwable) obj);
            }
        });
    }
}
