package c40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7953c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(@m80.k j00.c<?> r3, @m80.l java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.s.<init>(j00.c, java.lang.Throwable, boolean):void");
    }

    public final /* synthetic */ int f() {
        return this._resumed$volatile;
    }

    public final boolean h() {
        return f7953c.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void i(int i11) {
        this._resumed$volatile = i11;
    }
}
