package rx.internal.operators;

import rx.Notification;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z1<T> implements c.b<T, Notification<T>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Notification<T>> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86472a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f86473b = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86472a) {
                return;
            }
            this.f86472a = true;
            this.f86473b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86472a) {
                return;
            }
            this.f86472a = true;
            this.f86473b.onError(th2);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<T> notification) {
            int i11 = b.f86475a[notification.f().ordinal()];
            if (i11 == 1) {
                if (this.f86472a) {
                    return;
                }
                this.f86473b.onNext(notification.h());
            } else {
                if (i11 == 2) {
                    onError(notification.g());
                    return;
                }
                if (i11 == 3) {
                    onCompleted();
                    return;
                }
                onError(new IllegalArgumentException("Unsupported notification type: " + notification));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86475a;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            f86475a = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86475a[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86475a[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final z1<Object> f86476a = new z1<>();
    }

    public static z1 b() {
        return c.f86476a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super Notification<T>> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
