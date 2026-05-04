package fr;

import java.util.Iterator;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public gr.c f52291a = new gr.c();

    public void a() {
        gr.c cVar = this.f52291a;
        if (cVar.f54034c) {
            return;
        }
        synchronized (cVar.f54033b) {
            try {
                cVar.f54034c = true;
                Iterator<Runnable> it = cVar.f54032a.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b b() {
        return this.f52291a;
    }
}
