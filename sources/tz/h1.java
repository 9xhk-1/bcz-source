package tz;

/* loaded from: classes8.dex */
public class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f91289a;

    public h1(g1 g1Var) {
        this.f91289a = g1Var;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0006 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
        L0:
            tz.g1 r0 = r4.f91289a
            boolean r0 = tz.g1.d(r0)
            if (r0 == 0) goto L1f
            tz.g1 r0 = r4.f91289a     // Catch: java.lang.InterruptedException -> L15
            java.util.concurrent.LinkedBlockingQueue r0 = tz.g1.e(r0)     // Catch: java.lang.InterruptedException -> L15
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L15
            r2 = 10
            r0.poll(r2, r1)     // Catch: java.lang.InterruptedException -> L15
        L15:
            tz.g1 r0 = r4.f91289a
            io.openinstall.sdk.o r0 = tz.g1.g(r0)
            r0.a()
            goto L0
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.h1.run():void");
    }
}
