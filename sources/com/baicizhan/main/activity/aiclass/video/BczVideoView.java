package com.baicizhan.main.activity.aiclass.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.aiclass.video.BczVideoView;
import com.baicizhan.main.activity.aiclass.video.PlayOperate;
import com.jiongji.andriod.card.R;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.io.File;
import jd.e0;
import jd.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BczVideoView extends FrameLayout implements ITXVodPlayListener {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f18250e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f18251f = 8;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f18252g = "VideoView";

    /* renamed from: a, reason: collision with root package name */
    @l
    public TXCloudVideoView f18253a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public TXVodPlayer f18254b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public View f18255c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public e0 f18256d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18257a;

        static {
            int[] iArr = new int[PlayOperate.values().length];
            try {
                iArr[PlayOperate.RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayOperate.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayOperate.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18257a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f18258a;

        public c(x00.l function) {
            g0.p(function, "function");
            this.f18258a = function;
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
            return this.f18258a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18258a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BczVideoView(@k Context context) {
        super(context);
        g0.p(context, "context");
        g(context, null);
    }

    public static final g2 k(BczVideoView bczVideoView, String str) {
        TXVodPlayer tXVodPlayer = bczVideoView.f18254b;
        if (tXVodPlayer != null) {
            tXVodPlayer.startPlay(str);
        }
        return g2.f100423a;
    }

    public static final g2 l(BczVideoView bczVideoView, Long l11) {
        TXVodPlayer tXVodPlayer = bczVideoView.f18254b;
        if (tXVodPlayer != null) {
            tXVodPlayer.seek((int) (l11.longValue() / 1000));
        }
        return g2.f100423a;
    }

    public static final g2 m(BczVideoView bczVideoView, Float f11) {
        TXVodPlayer tXVodPlayer = bczVideoView.f18254b;
        if (tXVodPlayer != null) {
            g0.m(f11);
            tXVodPlayer.setRate(f11.floatValue());
        }
        return g2.f100423a;
    }

    public static final g2 n(BczVideoView bczVideoView, PlayOperate playOperate) {
        MutableLiveData<PlayerState> o11;
        if (playOperate == null) {
            return g2.f100423a;
        }
        qb.c.i(f18252g, "operate %s", playOperate.toString());
        int i11 = b.f18257a[playOperate.ordinal()];
        if (i11 == 1) {
            TXVodPlayer tXVodPlayer = bczVideoView.f18254b;
            if (tXVodPlayer != null) {
                tXVodPlayer.resume();
            }
        } else if (i11 == 2) {
            TXVodPlayer tXVodPlayer2 = bczVideoView.f18254b;
            if (tXVodPlayer2 != null) {
                tXVodPlayer2.pause();
                e0 e0Var = bczVideoView.f18256d;
                if (e0Var != null && (o11 = e0Var.o()) != null) {
                    o11.setValue(PlayerState.PAUSE);
                }
            }
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TXVodPlayer tXVodPlayer3 = bczVideoView.f18254b;
            if (tXVodPlayer3 != null) {
                tXVodPlayer3.stopPlay(true);
            }
        }
        return g2.f100423a;
    }

    public static final g2 o(final BczVideoView bczVideoView, Boolean bool) {
        TXVodPlayer tXVodPlayer = bczVideoView.f18254b;
        if (tXVodPlayer != null) {
            tXVodPlayer.snapshot(new TXLivePlayer.ITXSnapshotListener() { // from class: jd.a
                @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
                public final void onSnapshot(Bitmap bitmap) {
                    BczVideoView.p(BczVideoView.this, bitmap);
                }
            });
        }
        return g2.f100423a;
    }

    public static final void p(BczVideoView bczVideoView, Bitmap bitmap) {
        MutableLiveData<Bitmap> l11;
        qb.c.i(f18252g, "snap shot w " + bitmap.getWidth() + " h " + bitmap.getHeight(), new Object[0]);
        e0 e0Var = bczVideoView.f18256d;
        if (e0Var == null || (l11 = e0Var.l()) == null) {
            return;
        }
        l11.postValue(bitmap);
    }

    public final void g(Context context, AttributeSet attributeSet) {
        i(context, attributeSet);
        h(context);
    }

    public final void h(Context context) {
        String path;
        this.f18254b = new g(context);
        TXVodPlayConfig tXVodPlayConfig = new TXVodPlayConfig();
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null && (path = externalCacheDir.getPath()) != null) {
            tXVodPlayConfig.setCacheFolderPath(path + "/aiclass");
            tXVodPlayConfig.setMaxCacheItems(5);
            tXVodPlayConfig.setCacheMp4ExtName("class");
        }
        tXVodPlayConfig.setProgressInterval(100);
        TXVodPlayer tXVodPlayer = this.f18254b;
        if (tXVodPlayer != null) {
            tXVodPlayer.setAutoPlay(false);
        }
        TXVodPlayer tXVodPlayer2 = this.f18254b;
        if (tXVodPlayer2 != null) {
            tXVodPlayer2.setConfig(tXVodPlayConfig);
        }
        TXVodPlayer tXVodPlayer3 = this.f18254b;
        if (tXVodPlayer3 != null) {
            tXVodPlayer3.setRenderMode(1);
        }
        TXVodPlayer tXVodPlayer4 = this.f18254b;
        if (tXVodPlayer4 != null) {
            tXVodPlayer4.setVodListener(this);
        }
        TXVodPlayer tXVodPlayer5 = this.f18254b;
        if (tXVodPlayer5 != null) {
            tXVodPlayer5.enableHardwareDecode(false);
        }
        TXVodPlayer tXVodPlayer6 = this.f18254b;
        if (tXVodPlayer6 != null) {
            tXVodPlayer6.setPlayerView(this.f18253a);
        }
    }

    public final void i(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.view_video_player, (ViewGroup) this, true);
        this.f18253a = (TXCloudVideoView) findViewById(R.id.txVideoView);
        this.f18255c = findViewById(R.id.loading);
    }

    public final void j(@k e0 videoVm, @k LifecycleOwner lifecycleOwner) {
        SingleLiveEvent<Boolean> k11;
        SingleLiveEvent<PlayOperate> g11;
        MutableLiveData<Float> h11;
        MutableLiveData<Long> j11;
        MutableLiveData<String> p11;
        g0.p(videoVm, "videoVm");
        g0.p(lifecycleOwner, "lifecycleOwner");
        this.f18256d = videoVm;
        if (videoVm != null && (p11 = videoVm.p()) != null) {
            p11.observe(lifecycleOwner, new c(new x00.l() { // from class: jd.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 k12;
                    k12 = BczVideoView.k(BczVideoView.this, (String) obj);
                    return k12;
                }
            }));
        }
        e0 e0Var = this.f18256d;
        if (e0Var != null && (j11 = e0Var.j()) != null) {
            j11.observe(lifecycleOwner, new c(new x00.l() { // from class: jd.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 l11;
                    l11 = BczVideoView.l(BczVideoView.this, (Long) obj);
                    return l11;
                }
            }));
        }
        e0 e0Var2 = this.f18256d;
        if (e0Var2 != null && (h11 = e0Var2.h()) != null) {
            h11.observe(lifecycleOwner, new c(new x00.l() { // from class: jd.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = BczVideoView.m(BczVideoView.this, (Float) obj);
                    return m11;
                }
            }));
        }
        e0 e0Var3 = this.f18256d;
        if (e0Var3 != null && (g11 = e0Var3.g()) != null) {
            g11.observe(lifecycleOwner, new c(new x00.l() { // from class: jd.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 n11;
                    n11 = BczVideoView.n(BczVideoView.this, (PlayOperate) obj);
                    return n11;
                }
            }));
        }
        e0 e0Var4 = this.f18256d;
        if (e0Var4 == null || (k11 = e0Var4.k()) == null) {
            return;
        }
        k11.observe(lifecycleOwner, new c(new x00.l() { // from class: jd.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = BczVideoView.o(BczVideoView.this, (Boolean) obj);
                return o11;
            }
        }));
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onNetStatus(@l TXVodPlayer tXVodPlayer, @l Bundle bundle) {
        qb.c.i(f18252g, "net info %s", bundle != null ? bundle.toString() : null);
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onPlayEvent(@l TXVodPlayer tXVodPlayer, int i11, @l Bundle bundle) {
        MutableLiveData<PlayerState> o11;
        MutableLiveData<PlayerState> o12;
        dc0.c<Long> i12;
        MutableLiveData<PlayerState> o13;
        MutableLiveData<PlayerState> o14;
        if (i11 != 2005) {
            qb.c.i(f18252g, "code %d , info %s", Integer.valueOf(i11), bundle != null ? bundle.toString() : null);
        }
        if (i11 == 2013) {
            e0 e0Var = this.f18256d;
            if (e0Var == null || !e0Var.f()) {
                qb.c.i(f18252g, "video prepared but not active", new Object[0]);
            } else {
                TXVodPlayer tXVodPlayer2 = this.f18254b;
                if (tXVodPlayer2 != null) {
                    tXVodPlayer2.resume();
                }
                qb.c.i(f18252g, "videoStart", new Object[0]);
            }
        } else if (i11 != 2014) {
            switch (i11) {
                case 2004:
                    e0 e0Var2 = this.f18256d;
                    if (e0Var2 != null && (o12 = e0Var2.o()) != null) {
                        o12.postValue(PlayerState.PLAYING);
                    }
                    View view = this.f18255c;
                    if (view != null) {
                        view.setVisibility(8);
                        break;
                    }
                    break;
                case 2005:
                    if (bundle != null) {
                        int intValue = Integer.valueOf(bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS)).intValue();
                        e0 e0Var3 = this.f18256d;
                        if (e0Var3 != null && (i12 = e0Var3.i()) != null) {
                            i12.onNext(Long.valueOf(intValue));
                            break;
                        }
                    }
                    break;
                case 2006:
                    e0 e0Var4 = this.f18256d;
                    if (e0Var4 != null && (o13 = e0Var4.o()) != null) {
                        o13.postValue(PlayerState.END);
                        break;
                    }
                    break;
                case 2007:
                    e0 e0Var5 = this.f18256d;
                    if (e0Var5 != null && (o14 = e0Var5.o()) != null) {
                        o14.postValue(PlayerState.LOADING);
                    }
                    View view2 = this.f18255c;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        break;
                    }
                    break;
            }
        } else {
            View view3 = this.f18255c;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        if (i11 < 0) {
            TXVodPlayer tXVodPlayer3 = this.f18254b;
            if (tXVodPlayer3 != null) {
                tXVodPlayer3.stopPlay(true);
            }
            e0 e0Var6 = this.f18256d;
            if (e0Var6 != null && (o11 = e0Var6.o()) != null) {
                o11.postValue(PlayerState.ERROR);
            }
            qb.c.d(f18252g, "%s", bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION) : null);
        }
    }

    public final void q() {
        TXVodPlayer tXVodPlayer = this.f18254b;
        if (tXVodPlayer != null) {
            tXVodPlayer.stopPlay(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BczVideoView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        g0.p(context, "context");
        g(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BczVideoView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        g(context, attributeSet);
    }
}
