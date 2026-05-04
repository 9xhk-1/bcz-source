package i10;

import a00.h0;
import a00.q;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KAnnotatedElements")
@u0({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n295#2,2:103\n295#2,2:106\n295#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @y0(version = "1.1")
    public static final /* synthetic */ <T extends Annotation> T a(h10.b bVar) {
        Object obj;
        g0.p(bVar, "<this>");
        Iterator<T> it = bVar.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Annotation annotation = (Annotation) obj;
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (annotation != null) {
                break;
            }
        }
        g0.y(1, "T?");
        return (T) obj;
    }

    @y0(version = "1.7")
    @j2(markerClass = {kotlin.c.class})
    public static final /* synthetic */ <T extends Annotation> List<T> b(h10.b bVar) {
        g0.p(bVar, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c(bVar, o0.d(Annotation.class));
    }

    @y0(version = "1.7")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final <T extends Annotation> List<T> c(@m80.k h10.b bVar, @m80.k h10.d<T> klass) {
        Object obj;
        g0.p(bVar, "<this>");
        g0.p(klass, "klass");
        List<T> h12 = a00.o0.h1(bVar.getAnnotations(), w00.b.d(klass));
        if (!h12.isEmpty()) {
            return h12;
        }
        Class<? extends Annotation> b11 = a.f60095a.b(w00.b.d(klass));
        if (b11 != null) {
            Iterator<T> it = bVar.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(w00.b.d(w00.b.a((Annotation) obj)), b11)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod("value", null).invoke(annotation, null);
                g0.n(invoke, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                return q.t((Annotation[]) invoke);
            }
        }
        return h0.J();
    }

    @y0(version = "1.4")
    @j2(markerClass = {kotlin.c.class})
    public static final /* synthetic */ <T extends Annotation> boolean d(h10.b bVar) {
        Object obj;
        g0.p(bVar, "<this>");
        Iterator<T> it = bVar.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Annotation annotation = (Annotation) obj;
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (annotation != null) {
                break;
            }
        }
        g0.y(1, "T?");
        return ((Annotation) obj) != null;
    }
}
