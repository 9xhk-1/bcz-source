package wg;

import a00.l1;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.home.player.model.AudioEffect;
import com.jiongji.andriod.card.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f96262f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f96263g = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f96264h = "EffectPlayer";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f96265a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f96266b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f96267c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f96268d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Pair<IAudioPlayer, Boolean>> f96269e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96270a;

        static {
            int[] iArr = new int[AudioEffect.values().length];
            try {
                iArr[AudioEffect.TREASURE_CHEST_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioEffect.TREASURE_CHEST_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioEffect.ISLAND_UNLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioEffect.ISLAND_GROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioEffect.ISLAND_GROW2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioEffect.ISLAND_INTERACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AudioEffect.TRY_UNLOCKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AudioEffect.STATUS_AWARD_COINS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AudioEffect.STATUS_AWARD_FORWARDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AudioEffect.COMMON_HOME_CLICK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AudioEffect.HOME_LE_START.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f96270a = iArr;
        }
    }

    public i(@m80.k Context context) {
        g0.p(context, "context");
        this.f96265a = context;
        this.f96266b = e0.c(new x00.a() { // from class: wg.c
            @Override // x00.a
            public final Object invoke() {
                q9.l q11;
                q11 = i.q(i.this);
                return q11;
            }
        });
        this.f96267c = e0.c(new x00.a() { // from class: wg.d
            @Override // x00.a
            public final Object invoke() {
                q9.l r11;
                r11 = i.r(i.this);
                return r11;
            }
        });
        this.f96268d = e0.c(new x00.a() { // from class: wg.e
            @Override // x00.a
            public final Object invoke() {
                q9.l s11;
                s11 = i.s(i.this);
                return s11;
            }
        });
        q9.l n11 = n();
        Boolean bool = Boolean.FALSE;
        this.f96269e = l1.j0(h1.a(0, new Pair(n11, bool)), h1.a(1, new Pair(o(), bool)), h1.a(2, new Pair(p(), bool)));
        n().f(new IAudioPlayer.b() { // from class: wg.f
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                i.g(i.this, state);
            }
        });
        o().f(new IAudioPlayer.b() { // from class: wg.g
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                i.h(i.this, state);
            }
        });
        p().f(new IAudioPlayer.b() { // from class: wg.h
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                i.i(i.this, state);
            }
        });
    }

    public static final void g(i iVar, IAudioPlayer.State state) {
        Map<Integer, Pair<IAudioPlayer, Boolean>> map = iVar.f96269e;
        Pair<IAudioPlayer, Boolean> pair = iVar.f96269e.get(0);
        if (pair != null) {
            Pair<IAudioPlayer, Boolean> copy$default = Pair.copy$default(pair, null, Boolean.valueOf(state == IAudioPlayer.State.Preparing || state == IAudioPlayer.State.Playing), 1, null);
            if (copy$default == null) {
                return;
            }
            map.put(0, copy$default);
        }
    }

    public static final void h(i iVar, IAudioPlayer.State state) {
        Map<Integer, Pair<IAudioPlayer, Boolean>> map = iVar.f96269e;
        Pair<IAudioPlayer, Boolean> pair = iVar.f96269e.get(1);
        if (pair != null) {
            Pair<IAudioPlayer, Boolean> copy$default = Pair.copy$default(pair, null, Boolean.valueOf(state == IAudioPlayer.State.Preparing || state == IAudioPlayer.State.Playing), 1, null);
            if (copy$default == null) {
                return;
            }
            map.put(1, copy$default);
        }
    }

    public static final void i(i iVar, IAudioPlayer.State state) {
        Map<Integer, Pair<IAudioPlayer, Boolean>> map = iVar.f96269e;
        Pair<IAudioPlayer, Boolean> pair = iVar.f96269e.get(2);
        if (pair != null) {
            Pair<IAudioPlayer, Boolean> copy$default = Pair.copy$default(pair, null, Boolean.valueOf(state == IAudioPlayer.State.Preparing || state == IAudioPlayer.State.Playing), 1, null);
            if (copy$default == null) {
                return;
            }
            map.put(2, copy$default);
        }
    }

    public static /* synthetic */ void k(i iVar, AudioEffect audioEffect, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        iVar.j(audioEffect, obj);
    }

    public static final q9.l q(i iVar) {
        return new q9.l(iVar.f96265a);
    }

    public static final q9.l r(i iVar) {
        return new q9.l(iVar.f96265a);
    }

    public static final q9.l s(i iVar) {
        return new q9.l(iVar.f96265a);
    }

    public final void j(@m80.k AudioEffect effect, @m80.l Object obj) {
        g0.p(effect, "effect");
        qb.c.b(f96264h, "audio effect " + effect + " by " + obj, new Object[0]);
        switch (b.f96270a[effect.ordinal()]) {
            case 1:
                m().a(R.raw.treasure_chest_display);
                return;
            case 2:
                m().a(R.raw.treasure_chest_open);
                return;
            case 3:
                m().i("audio/island_unlock.mp3", false);
                return;
            case 4:
                IAudioPlayer m11 = m();
                g0.m(obj);
                m11.i("audio/ui_w_story_" + obj + "_ani_grow1.mp3", false);
                return;
            case 5:
                IAudioPlayer m12 = m();
                g0.m(obj);
                m12.i("audio/ui_w_story_" + obj + "_ani_grow2.mp3", false);
                return;
            case 6:
                IAudioPlayer m13 = m();
                g0.m(obj);
                m13.i("audio/ui_w_story_" + obj + "_ani_interact.mp3", false);
                return;
            case 7:
                m().a(R.raw.try_to_unlock);
                return;
            case 8:
                m().a(R.raw.status_award_coins);
                return;
            case 9:
                m().a(R.raw.status_award_forwarding);
                return;
            case 10:
                m().a(R.raw.home_btn_clicked);
                return;
            case 11:
                m().a(R.raw.home_le_button_clicked);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @m80.k
    public final Context l() {
        return this.f96265a;
    }

    public final IAudioPlayer m() {
        for (int i11 = 0; i11 < 3; i11++) {
            Pair<IAudioPlayer, Boolean> pair = this.f96269e.get(Integer.valueOf(i11));
            g0.m(pair);
            if (!pair.getSecond().booleanValue()) {
                qb.c.b(f96264h, "use " + i11, new Object[0]);
                Pair<IAudioPlayer, Boolean> pair2 = this.f96269e.get(Integer.valueOf(i11));
                g0.m(pair2);
                return pair2.getFirst();
            }
        }
        qb.c.b(f96264h, "use 0", new Object[0]);
        Pair<IAudioPlayer, Boolean> pair3 = this.f96269e.get(0);
        g0.m(pair3);
        return pair3.getFirst();
    }

    public final q9.l n() {
        return (q9.l) this.f96266b.getValue();
    }

    public final q9.l o() {
        return (q9.l) this.f96267c.getValue();
    }

    public final q9.l p() {
        return (q9.l) this.f96268d.getValue();
    }
}
