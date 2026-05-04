package rx.internal.operators;

import rx.c;
import rx.exceptions.AssemblyStackTraceException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class s0<T> implements c.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f86031c;

    /* renamed from: a, reason: collision with root package name */
    public final c.a<T> f86032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86033b = b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86034a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86035b;

        public a(qb0.g<? super T> gVar, String str) {
            super(gVar);
            this.f86034a = gVar;
            this.f86035b = str;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86034a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f86035b).attachTo(th2);
            this.f86034a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86034a.onNext(t11);
        }
    }

    public s0(c.a<T> aVar) {
        this.f86032a = aVar;
    }

    public static String b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb2 = new StringBuilder("Assembly trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (f86031c || (stackTraceElement.getLineNumber() > 1 && !stackTraceElement2.contains("RxJavaHooks.") && !stackTraceElement2.contains("OnSubscribeOnAssembly") && !stackTraceElement2.contains(".junit.runner") && !stackTraceElement2.contains(".junit4.runner") && !stackTraceElement2.contains(".junit.internal") && !stackTraceElement2.contains("sun.reflect") && !stackTraceElement2.contains("java.lang.Thread.") && !stackTraceElement2.contains("ThreadPoolExecutor") && !stackTraceElement2.contains("org.apache.catalina.") && !stackTraceElement2.contains("org.apache.tomcat."))) {
                sb2.append("\n at ");
                sb2.append(stackTraceElement2);
            }
        }
        sb2.append("\nOriginal exception:");
        return sb2.toString();
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        this.f86032a.call(new a(gVar, this.f86033b));
    }
}
