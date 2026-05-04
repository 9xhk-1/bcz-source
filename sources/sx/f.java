package sx;

import c40.n;
import io.ktor.network.selector.ClosedChannelCancellationException;
import io.ktor.network.selector.SelectInterest;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectableJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableJvm.kt\nio/ktor/network/selector/SelectableBase\n+ 2 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n42#2,2:45\n45#2:48\n1#3:47\n*S KotlinDebug\n*F\n+ 1 SelectableJvm.kt\nio/ktor/network/selector/SelectableBase\n*L\n35#1:45,2\n35#1:48\n35#1:47\n*E\n"})
/* loaded from: classes8.dex */
public class f implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f89047d = AtomicIntegerFieldUpdater.newUpdater(f.class, "_interestedOps");

    @k
    private volatile /* synthetic */ int _interestedOps;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SelectableChannel f89048a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AtomicBoolean f89049b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.ktor.network.selector.a f89050c;

    public f(@k SelectableChannel channel) {
        g0.p(channel, "channel");
        this.f89048a = channel;
        this.f89049b = new AtomicBoolean(false);
        this.f89050c = new io.ktor.network.selector.a();
        this._interestedOps = 0;
    }

    @Override // sx.e
    @k
    public io.ktor.network.selector.a C4() {
        return this.f89050c;
    }

    @Override // sx.e
    public void T0(@k SelectInterest interest, boolean z11) {
        int i11;
        g0.p(interest, "interest");
        int flag = interest.getFlag();
        do {
            i11 = this._interestedOps;
        } while (!f89047d.compareAndSet(this, i11, z11 ? i11 | flag : (~flag) & i11));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f89049b.compareAndSet(false, true)) {
            this._interestedOps = 0;
            io.ktor.network.selector.a C4 = C4();
            for (SelectInterest selectInterest : SelectInterest.Companion.a()) {
                n<g2> n11 = C4.n(selectInterest);
                if (n11 != null) {
                    Result.a aVar = Result.Companion;
                    n11.resumeWith(Result.m6308constructorimpl(kotlin.e.a(new ClosedChannelCancellationException())));
                }
            }
        }
    }

    @Override // c40.k1
    public void dispose() {
        close();
    }

    @Override // sx.e
    @k
    public SelectableChannel getChannel() {
        return this.f89048a;
    }

    @Override // sx.e
    public boolean isClosed() {
        return this.f89049b.get();
    }

    @Override // sx.e
    public int x5() {
        return this._interestedOps;
    }
}
