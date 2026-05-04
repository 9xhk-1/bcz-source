package i80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public i f60317a;

    /* renamed from: b, reason: collision with root package name */
    public i f60318b;

    public synchronized void a(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            i iVar2 = this.f60318b;
            if (iVar2 != null) {
                iVar2.f60316c = iVar;
                this.f60318b = iVar;
            } else {
                if (this.f60317a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f60318b = iVar;
                this.f60317a = iVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized i b() {
        i iVar;
        iVar = this.f60317a;
        if (iVar != null) {
            i iVar2 = iVar.f60316c;
            this.f60317a = iVar2;
            if (iVar2 == null) {
                this.f60318b = null;
            }
        }
        return iVar;
    }

    public synchronized i c(int i11) throws InterruptedException {
        try {
            if (this.f60317a == null) {
                wait(i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }
}
