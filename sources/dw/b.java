package dw;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public dw.a f48182a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static b f48183a = new b();
    }

    public b() {
        this.f48182a = null;
        this.f48182a = new dw.a();
    }

    public final void a(c cVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f48182a.f48181a;
        if (cVar.f48184a != 1) {
            int a11 = d.a(cVar.f48184a);
            if (a11 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (a11 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        cVar.f48184a = 2;
        cVar.f48185b.getClass();
        cVar.f48185b.getClass();
        threadPoolExecutor.execute(cVar.f48186c);
    }
}
