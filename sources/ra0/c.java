package ra0;

import a00.h0;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import org.koin.core.definition.Kind;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements p<cb0.b, ya0.a, T> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f83892a;

        static {
            g0.w();
            f83892a = new a();
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(cb0.b BeanDefinition, ya0.a it) {
            g0.p(BeanDefinition, "$this$BeanDefinition");
            g0.p(it, "it");
            throw new IllegalStateException("declared instance error ");
        }
    }

    public static final /* synthetic */ <T> b<T> a(Kind kind, za0.a aVar, List<? extends h10.d<?>> secondaryTypes, za0.a scopeQualifier) {
        g0.p(kind, "kind");
        g0.p(secondaryTypes, "secondaryTypes");
        g0.p(scopeQualifier, "scopeQualifier");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        g0.w();
        return new b<>(scopeQualifier, d11, aVar, a.f83892a, kind, secondaryTypes);
    }

    public static /* synthetic */ b b(Kind kind, za0.a aVar, List list, za0.a scopeQualifier, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kind = Kind.Singleton;
        }
        Kind kind2 = kind;
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        za0.a aVar2 = aVar;
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List secondaryTypes = list;
        g0.p(kind2, "kind");
        g0.p(secondaryTypes, "secondaryTypes");
        g0.p(scopeQualifier, "scopeQualifier");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        g0.w();
        return new b(scopeQualifier, d11, aVar2, a.f83892a, kind2, secondaryTypes);
    }

    public static final /* synthetic */ <T> b<T> c(Kind kind, za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition, List<? extends h10.d<?>> secondaryTypes, za0.a scopeQualifier) {
        g0.p(kind, "kind");
        g0.p(definition, "definition");
        g0.p(secondaryTypes, "secondaryTypes");
        g0.p(scopeQualifier, "scopeQualifier");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new b<>(scopeQualifier, o0.d(Object.class), aVar, definition, kind, secondaryTypes);
    }

    public static /* synthetic */ b d(Kind kind, za0.a aVar, p definition, List list, za0.a scopeQualifier, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kind = Kind.Singleton;
        }
        Kind kind2 = kind;
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        za0.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            list = h0.J();
        }
        List secondaryTypes = list;
        g0.p(kind2, "kind");
        g0.p(definition, "definition");
        g0.p(secondaryTypes, "secondaryTypes");
        g0.p(scopeQualifier, "scopeQualifier");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new b(scopeQualifier, o0.d(Object.class), aVar2, definition, kind2, secondaryTypes);
    }

    @k
    public static final String e(@k h10.d<?> clazz, @l za0.a aVar, @k za0.a scopeQualifier) {
        String str;
        g0.p(clazz, "clazz");
        g0.p(scopeQualifier, "scopeQualifier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fb0.b.a(clazz));
        sb2.append(':');
        if (aVar == null || (str = aVar.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(scopeQualifier);
        return sb2.toString();
    }
}
