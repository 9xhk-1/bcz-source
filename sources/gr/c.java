package gr;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class c extends fr.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<Runnable> f54032a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f54033b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f54034c = false;

    @Override // fr.b
    public final boolean a() {
        return this.f54034c;
    }

    @Override // fr.b
    public final fr.b b(Runnable runnable) {
        synchronized (this.f54033b) {
            try {
                if (this.f54034c) {
                    runnable.run();
                } else {
                    this.f54032a.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }
}
