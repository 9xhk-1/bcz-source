package q9;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nGAudioPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GAudioPlayer.kt\ncom/baicizhan/client/business/managers/AudioPlayerIml\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1869#2,2:170\n1869#2,2:172\n*S KotlinDebug\n*F\n+ 1 GAudioPlayer.kt\ncom/baicizhan/client/business/managers/AudioPlayerIml\n*L\n25#1:170,2\n37#1:172,2\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f81930a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f81931b = "GAudioPlayer";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c0 f81932c = e0.c(new x00.a() { // from class: q9.e
        @Override // x00.a
        public final Object invoke() {
            com.baicizhan.client.framework.audio.a f11;
            f11 = f.f();
            return f11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final List<IAudioPlayer.a> f81933d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final List<IAudioPlayer.b> f81934e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final List<kb.f> f81935f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final int f81936g = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGAudioPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GAudioPlayer.kt\ncom/baicizhan/client/business/managers/AudioPlayerIml$audioPlayer$2$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1869#2,2:170\n1869#2,2:172\n*S KotlinDebug\n*F\n+ 1 GAudioPlayer.kt\ncom/baicizhan/client/business/managers/AudioPlayerIml$audioPlayer$2$1$3\n*L\n51#1:170,2\n64#1:172,2\n*E\n"})
    public static final class a implements kb.f {
        @Override // kb.f
        public void p0(boolean z11) {
            qb.c.i(f.f81931b, "", new Object[0]);
            synchronized (f.f81935f) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(f.f81935f);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((kb.f) it.next()).p0(z11);
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kb.f
        public void t() {
            qb.c.i(f.f81931b, "", new Object[0]);
            synchronized (f.f81935f) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(f.f81935f);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((kb.f) it.next()).t();
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final com.baicizhan.client.framework.audio.a f() {
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(pb.a.a());
        aVar.j(new IAudioPlayer.a() { // from class: q9.c
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
            public final void onPlayError(int i11, int i12) {
                f.g(i11, i12);
            }
        });
        aVar.f(new IAudioPlayer.b() { // from class: q9.d
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                f.h(state);
            }
        });
        aVar.h(new a());
        return aVar;
    }

    public static final void g(int i11, int i12) {
        qb.c.i(f81931b, "w = " + i11 + " e = " + i12, new Object[0]);
        List<IAudioPlayer.a> list = f81933d;
        synchronized (list) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((IAudioPlayer.a) it.next()).onPlayError(i11, i12);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void h(IAudioPlayer.State state) {
        List<IAudioPlayer.b> list = f81934e;
        synchronized (list) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((IAudioPlayer.b) it.next()).onPlayStateChanged(state);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m80.k
    public final com.baicizhan.client.framework.audio.a i() {
        return (com.baicizhan.client.framework.audio.a) f81932c.getValue();
    }

    public final void j() {
        i().pause();
    }

    public final boolean k(@m80.k IAudioPlayer.a l11) {
        boolean add;
        g0.p(l11, "l");
        List<IAudioPlayer.a> list = f81933d;
        synchronized (list) {
            add = list.add(l11);
        }
        return add;
    }

    public final boolean l(@m80.k kb.f l11) {
        boolean add;
        g0.p(l11, "l");
        List<kb.f> list = f81935f;
        synchronized (list) {
            add = list.add(l11);
        }
        return add;
    }

    public final boolean m(@m80.k IAudioPlayer.b l11) {
        boolean add;
        g0.p(l11, "l");
        List<IAudioPlayer.b> list = f81934e;
        synchronized (list) {
            add = list.add(l11);
        }
        return add;
    }

    public final boolean n(@m80.k IAudioPlayer.a l11) {
        boolean remove;
        g0.p(l11, "l");
        List<IAudioPlayer.a> list = f81933d;
        synchronized (list) {
            remove = list.remove(l11);
        }
        return remove;
    }

    public final boolean o(@m80.k kb.f l11) {
        boolean remove;
        g0.p(l11, "l");
        List<kb.f> list = f81935f;
        synchronized (list) {
            remove = list.remove(l11);
        }
        return remove;
    }

    public final boolean p(@m80.k IAudioPlayer.b l11) {
        boolean remove;
        g0.p(l11, "l");
        List<IAudioPlayer.b> list = f81934e;
        synchronized (list) {
            remove = list.remove(l11);
        }
        return remove;
    }
}
