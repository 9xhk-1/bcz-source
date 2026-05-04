package io.ktor.client.engine.apache;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInterestControllerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterestControllerHolder.kt\nio/ktor/client/engine/apache/InterestControllerHolder\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n163#2,3:79\n166#2:83\n163#2,4:84\n1#3:82\n*S KotlinDebug\n*F\n+ 1 InterestControllerHolder.kt\nio/ktor/client/engine/apache/InterestControllerHolder\n*L\n41#1:79,3\n41#1:83\n63#1:84,4\n*E\n"})
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f60794a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "interestController");

    @m80.k
    private volatile /* synthetic */ Object interestController = null;

    @m80.k
    private volatile /* synthetic */ int waitingInput = 0;

    @m80.k
    private volatile /* synthetic */ int waitingOutput = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this.waitingInput;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean b() {
        return this.waitingOutput;
    }

    public final void c() {
        m70.g gVar = (m70.g) f60794a.getAndSet(this, null);
        if (gVar != null) {
            gVar.j();
        }
        this.waitingInput = 0;
    }

    public final void d() {
        m70.g gVar = (m70.g) f60794a.getAndSet(this, null);
        if (gVar != null) {
            gVar.f();
        }
        this.waitingOutput = 0;
    }

    public final void e(@m80.k m70.g ioControl) {
        Object obj;
        g0.p(ioControl, "ioControl");
        this.waitingInput = 1;
        ioControl.e();
        do {
            obj = this.interestController;
            m70.g gVar = (m70.g) obj;
            if (gVar != null && gVar != ioControl) {
                throw new IllegalStateException("IOControl is already published");
            }
        } while (!androidx.concurrent.futures.a.a(f60794a, this, obj, ioControl));
    }

    public final void f(@m80.k m70.g ioControl) {
        Object obj;
        g0.p(ioControl, "ioControl");
        this.waitingOutput = 1;
        ioControl.q();
        do {
            obj = this.interestController;
            m70.g gVar = (m70.g) obj;
            if (gVar != null && gVar != ioControl) {
                throw new IllegalStateException("IOControl is already published");
            }
        } while (!androidx.concurrent.futures.a.a(f60794a, this, obj, ioControl));
    }
}
