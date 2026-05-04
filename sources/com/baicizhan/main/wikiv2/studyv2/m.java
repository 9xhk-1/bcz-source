package com.baicizhan.main.wikiv2.studyv2;

import android.app.Application;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.wikiv2.studyv2.data.k0;
import com.baicizhan.main.wikiv2.studyv2.data.o0;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class m implements DefaultLifecycleObserver {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f26153e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f26154f = 8;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f26155g = "WikiMediaController";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q9.l f26156a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public o0 f26157b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public o0 f26158c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public k0 f26159d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26161a;

        static {
            int[] iArr = new int[IAudioPlayer.State.values().length];
            try {
                iArr[IAudioPlayer.State.Stopped.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAudioPlayer.State.Paused.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAudioPlayer.State.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAudioPlayer.State.Playing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26161a = iArr;
        }
    }

    public m(@m80.k Application application) {
        g0.p(application, "application");
        q9.l lVar = new q9.l(application);
        this.f26156a = lVar;
        lVar.j(new IAudioPlayer.a() { // from class: com.baicizhan.main.wikiv2.studyv2.k
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
            public final void onPlayError(int i11, int i12) {
                m.c(i11, i12);
            }
        });
        lVar.f(new IAudioPlayer.b() { // from class: com.baicizhan.main.wikiv2.studyv2.l
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                m.d(m.this, state);
            }
        });
        lVar.h(new a());
    }

    public static final void c(int i11, int i12) {
        va.g.g(R.string.audio_play_error, 0);
        qb.c.d(f26155g, "what = " + i11 + "  extra = " + i12, new Object[0]);
    }

    public static final void d(m mVar, IAudioPlayer.State state) {
        qb.c.i(f26155g, String.valueOf(state), new Object[0]);
        int i11 = state == null ? -1 : c.f26161a[state.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            o0 o0Var = mVar.f26157b;
            if (o0Var != null) {
                o0Var.a().setValue(Boolean.FALSE);
                mVar.f26157b = null;
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        o0 o0Var2 = mVar.f26158c;
        if (o0Var2 != null) {
            mVar.f26157b = o0Var2;
            o0Var2.a().setValue(Boolean.TRUE);
        }
        mVar.f26158c = null;
    }

    public final boolean f() {
        MutableLiveData<Boolean> c11;
        Boolean value;
        k0 k0Var = this.f26159d;
        if (k0Var == null || (c11 = k0Var.c()) == null || (value = c11.getValue()) == null || !value.booleanValue()) {
            return false;
        }
        c11.setValue(Boolean.FALSE);
        return true;
    }

    @m80.l
    public final o0 g() {
        return this.f26157b;
    }

    @m80.l
    public final o0 h() {
        return this.f26158c;
    }

    @m80.k
    public final q9.l i() {
        return this.f26156a;
    }

    @m80.l
    public final k0 j() {
        return this.f26159d;
    }

    public final void k(@m80.k o0 model, @m80.k Uri uri) {
        k0 k0Var;
        MutableLiveData<Boolean> a11;
        g0.p(model, "model");
        g0.p(uri, "uri");
        this.f26158c = model;
        k0 k0Var2 = this.f26159d;
        if (k0Var2 != null) {
            if (!k0Var2.isPlaying()) {
                k0Var2 = null;
            }
            if (k0Var2 != null && (k0Var = this.f26159d) != null && (a11 = k0Var.a()) != null) {
                a11.setValue(Boolean.FALSE);
            }
        }
        this.f26156a.stop();
        q9.g.a(this.f26156a, uri);
    }

    public final void l(@m80.l o0 o0Var) {
        this.f26157b = o0Var;
    }

    public final void m(@m80.l o0 o0Var) {
        this.f26158c = o0Var;
    }

    public final void n(@m80.l k0 k0Var) {
        this.f26159d = k0Var;
    }

    public final void o() {
        MutableLiveData<Boolean> a11;
        k0 k0Var = this.f26159d;
        if (k0Var == null || (a11 = k0Var.a()) == null) {
            return;
        }
        a11.setValue(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner owner) {
        g0.p(owner, "owner");
        super.onDestroy(owner);
        this.f26156a.destroy();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@m80.k LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
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
        this.f26156a.stop();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements kb.f {
        public a() {
        }

        @Override // kb.f
        public void p0(boolean z11) {
            m.this.i().stop();
        }

        @Override // kb.f
        public void t() {
        }
    }
}
