package tb0;

import android.os.Handler;
import ec0.f;
import java.util.concurrent.TimeUnit;
import qb0.h;
import rx.d;
import rx.internal.schedulers.ScheduledAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f90426a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f90427a;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f90428b = new ec0.b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: tb0.b$a$a, reason: collision with other inner class name */
        public class C1197a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ScheduledAction f90429a;

            public C1197a(ScheduledAction scheduledAction) {
                this.f90429a = scheduledAction;
            }

            @Override // wb0.a
            public void call() {
                a.this.f90427a.removeCallbacks(this.f90429a);
            }
        }

        public a(Handler handler) {
            this.f90427a = handler;
        }

        @Override // rx.d.a
        public h h(wb0.a aVar) {
            return j(aVar, 0L, TimeUnit.MILLISECONDS);
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f90428b.isUnsubscribed();
        }

        @Override // rx.d.a
        public h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            if (this.f90428b.isUnsubscribed()) {
                return f.e();
            }
            ScheduledAction scheduledAction = new ScheduledAction(sb0.a.a().b().c(aVar));
            scheduledAction.addParent(this.f90428b);
            this.f90428b.a(scheduledAction);
            this.f90427a.postDelayed(scheduledAction, timeUnit.toMillis(j11));
            scheduledAction.add(f.a(new C1197a(scheduledAction)));
            return scheduledAction;
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f90428b.unsubscribe();
        }
    }

    public b(Handler handler) {
        this.f90426a = handler;
    }

    public static b d(Handler handler) {
        if (handler != null) {
            return new b(handler);
        }
        throw new NullPointerException("handler == null");
    }

    @Override // rx.d
    public d.a a() {
        return new a(this.f90426a);
    }
}
