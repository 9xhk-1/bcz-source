package p50;

import androidx.annotation.CheckResult;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements p50.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f79144a;

        public a(f fVar) {
            this.f79144a = fVar;
        }

        @Override // p50.b
        @m80.k
        public final Class<? extends e<T, ?>> a(int i11, T t11) {
            return w00.b.d(this.f79144a.a(i11, t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements p50.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p f79145a;

        public b(x00.p pVar) {
            this.f79145a = pVar;
        }

        @Override // p50.b
        @m80.k
        public final Class<? extends e<T, ?>> a(int i11, T t11) {
            return w00.b.d((h10.d) this.f79145a.invoke(Integer.valueOf(i11), t11));
        }
    }

    public static final <T> int a(@m80.k p receiver, @m80.k h10.d<? extends T> clazz) {
        g0.q(receiver, "$receiver");
        g0.q(clazz, "clazz");
        return receiver.d(w00.b.d(clazz));
    }

    @CheckResult
    @m80.k
    public static final <T> n<T> b(@m80.k h receiver, @m80.k h10.d<? extends T> clazz) {
        g0.q(receiver, "$receiver");
        g0.q(clazz, "clazz");
        n<T> h11 = receiver.h(w00.b.d(clazz));
        g0.h(h11, "register(clazz.java)");
        return h11;
    }

    public static final <T> void c(@m80.k h receiver, @m80.k h10.d<? extends T> clazz, @m80.k e<T, ?> binder) {
        g0.q(receiver, "$receiver");
        g0.q(clazz, "clazz");
        g0.q(binder, "binder");
        receiver.i(w00.b.d(clazz), binder);
    }

    public static final <T> void d(@m80.k h hVar, e<T, ?> eVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        hVar.i(Object.class, eVar);
    }

    public static final <T> void e(@m80.k p receiver, @m80.k h10.d<? extends T> clazz, @m80.k e<T, ?> binder, @m80.k g<T> linker) {
        g0.q(receiver, "$receiver");
        g0.q(clazz, "clazz");
        g0.q(binder, "binder");
        g0.q(linker, "linker");
        receiver.f(w00.b.d(clazz), binder, linker);
    }

    public static final <T> boolean f(@m80.k p receiver, @m80.k h10.d<? extends T> clazz) {
        g0.q(receiver, "$receiver");
        g0.q(clazz, "clazz");
        return receiver.b(w00.b.d(clazz));
    }

    public static final <T> void g(@m80.k m<T> receiver, @m80.k f<T> classLinker) {
        g0.q(receiver, "$receiver");
        g0.q(classLinker, "classLinker");
        receiver.a(new a(classLinker));
    }

    public static final <T> void h(@m80.k m<T> receiver, @m80.k x00.p<? super Integer, ? super T, ? extends h10.d<? extends e<T, ?>>> classLinker) {
        g0.q(receiver, "$receiver");
        g0.q(classLinker, "classLinker");
        receiver.a(new b(classLinker));
    }
}
