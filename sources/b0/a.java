package b0;

import android.content.Context;
import coil.request.ImageRequest;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.o;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f5574a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static f f5575b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static g f5576c;

    @o
    @n(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.enqueue(request)'.", replaceWith = @w0(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @k
    public static final o0.d a(@k ImageRequest imageRequest) {
        throw new IllegalStateException("Unsupported");
    }

    @l
    @o
    @n(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.execute(request)'.", replaceWith = @w0(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    public static final Object b(@k ImageRequest imageRequest, @k j00.c<? super o0.g> cVar) {
        throw new IllegalStateException("Unsupported");
    }

    @o
    @k
    public static final f c(@k Context context) {
        f fVar = f5575b;
        return fVar == null ? f5574a.d(context) : fVar;
    }

    @o
    public static final synchronized void e() {
        synchronized (a.class) {
            f5575b = null;
            f5576c = null;
        }
    }

    @o
    public static final synchronized void f(@k f fVar) {
        synchronized (a.class) {
            f5576c = null;
            f5575b = fVar;
        }
    }

    @o
    public static final synchronized void g(@k g gVar) {
        synchronized (a.class) {
            f5576c = gVar;
            f5575b = null;
        }
    }

    public final synchronized f d(Context context) {
        f a11;
        try {
            f fVar = f5575b;
            if (fVar != null) {
                return fVar;
            }
            g gVar = f5576c;
            if (gVar != null) {
                a11 = gVar.a();
                if (a11 == null) {
                }
                f5576c = null;
                f5575b = a11;
                return a11;
            }
            Object applicationContext = context.getApplicationContext();
            g gVar2 = applicationContext instanceof g ? (g) applicationContext : null;
            a11 = gVar2 != null ? gVar2.a() : h.a(context);
            f5576c = null;
            f5575b = a11;
            return a11;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
