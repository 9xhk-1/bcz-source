package wi;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMediaControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaControl.kt\ncom/baicizhan/main/wikiv2/study/MediaControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1869#2,2:110\n*S KotlinDebug\n*F\n+ 1 MediaControl.kt\ncom/baicizhan/main/wikiv2/study/MediaControl\n*L\n63#1:110,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final int f96363f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f96364a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q9.l f96365b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public com.baicizhan.main.wikiv2.study.model.h f96366c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public aj.a f96367d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public aj.a f96368e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96370a;

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
            f96370a = iArr;
        }
    }

    public c(@m80.k Application application) {
        g0.p(application, "application");
        this.f96364a = "StudyWiki.Media";
        q9.l lVar = new q9.l(application);
        this.f96365b = lVar;
        lVar.j(new IAudioPlayer.a() { // from class: wi.a
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
            public final void onPlayError(int i11, int i12) {
                c.c(c.this, i11, i12);
            }
        });
        lVar.f(new IAudioPlayer.b() { // from class: wi.b
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                c.d(c.this, state);
            }
        });
        lVar.h(new a());
    }

    public static final void c(c cVar, int i11, int i12) {
        va.g.g(R.string.audio_play_error, 0);
        qb.c.d(cVar.f96364a, "what = " + i11 + "  extra = " + i12, new Object[0]);
    }

    public static final void d(c cVar, IAudioPlayer.State state) {
        qb.c.i(cVar.f96364a, String.valueOf(state), new Object[0]);
        int i11 = state == null ? -1 : b.f96370a[state.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            aj.a aVar = cVar.f96367d;
            if (aVar != null) {
                aVar.h().setValue(Boolean.FALSE);
                cVar.f96367d = null;
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        aj.a aVar2 = cVar.f96368e;
        if (aVar2 != null) {
            cVar.f96367d = aVar2;
            aVar2.h().setValue(Boolean.TRUE);
        }
        cVar.f96368e = null;
    }

    public final void e(@m80.k List<?> list) {
        g0.p(list, "list");
        for (Object obj : list) {
            if (obj instanceof com.baicizhan.main.wikiv2.study.model.h) {
                this.f96366c = (com.baicizhan.main.wikiv2.study.model.h) obj;
            }
        }
    }

    public final boolean f() {
        MutableLiveData<Boolean> b11;
        Boolean value;
        com.baicizhan.main.wikiv2.study.model.h hVar = this.f96366c;
        if (hVar == null || (b11 = hVar.b()) == null || (value = b11.getValue()) == null || !value.booleanValue()) {
            return false;
        }
        b11.setValue(Boolean.FALSE);
        return true;
    }

    @m80.l
    public final aj.a g() {
        return this.f96367d;
    }

    @m80.l
    public final aj.a h() {
        return this.f96368e;
    }

    @m80.k
    public final q9.l i() {
        return this.f96365b;
    }

    @m80.k
    public final String j() {
        return this.f96364a;
    }

    @m80.l
    public final com.baicizhan.main.wikiv2.study.model.h k() {
        return this.f96366c;
    }

    public final void l(@m80.k aj.a audioPlay) {
        g0.p(audioPlay, "audioPlay");
        if (audioPlay.g() == null) {
            return;
        }
        this.f96368e = audioPlay;
        this.f96365b.stop();
        com.baicizhan.main.wikiv2.study.model.h hVar = this.f96366c;
        if (hVar != null && hVar.c()) {
            com.baicizhan.main.wikiv2.study.model.h hVar2 = this.f96366c;
            g0.m(hVar2);
            hVar2.h().setValue(Boolean.FALSE);
        }
        ZPackUtils.loadAudioCompat(this.f96365b, audioPlay.i(), audioPlay.g());
    }

    public final void m() {
        this.f96365b.stop();
    }

    public final void n() {
        this.f96365b.destroy();
    }

    public final void o(@m80.l aj.a aVar) {
        this.f96367d = aVar;
    }

    public final void p(@m80.l aj.a aVar) {
        this.f96368e = aVar;
    }

    public final void q(@m80.l com.baicizhan.main.wikiv2.study.model.h hVar) {
        this.f96366c = hVar;
    }

    public final void r() {
        MutableLiveData<Boolean> h11;
        com.baicizhan.main.wikiv2.study.model.h hVar = this.f96366c;
        if (hVar == null || (h11 = hVar.h()) == null) {
            return;
        }
        h11.setValue(Boolean.FALSE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements kb.f {
        public a() {
        }

        @Override // kb.f
        public void p0(boolean z11) {
            c.this.i().stop();
        }

        @Override // kb.f
        public void t() {
        }
    }
}
