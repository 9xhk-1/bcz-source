package za0;

import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {
    @k
    public static final c a(@k String name) {
        g0.p(name, "name");
        return new c(name);
    }

    public static final /* synthetic */ <T> d b() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new d(o0.d(Object.class));
    }

    @k
    public static final <E extends Enum<E>> a c(@k Enum<E> r22) {
        g0.p(r22, "<this>");
        String lowerCase = r22.toString().toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        return new c(lowerCase);
    }

    @k
    public static final <E extends Enum<E>> a d(@k Enum<E> r12) {
        g0.p(r12, "enum");
        return c(r12);
    }

    @k
    public static final c e(@k String name) {
        g0.p(name, "name");
        return new c(name);
    }

    public static final /* synthetic */ <T> d f() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new d(o0.d(Object.class));
    }

    @k
    public static final <E extends Enum<E>> a g(@k Enum<E> r12) {
        g0.p(r12, "enum");
        return c(r12);
    }

    @k
    public static final c h(@k String name) {
        g0.p(name, "name");
        return new c(name);
    }

    public static final /* synthetic */ <T> d i() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new d(o0.d(Object.class));
    }
}
