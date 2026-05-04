package w00;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import yz.w0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "JvmClassMappingKt")
/* loaded from: classes8.dex */
public final class b {
    @m80.k
    public static final <T extends Annotation> h10.d<? extends T> a(@m80.k T t11) {
        g0.p(t11, "<this>");
        Class<? extends Annotation> annotationType = t11.annotationType();
        g0.o(annotationType, "annotationType(...)");
        h10.d<? extends T> i11 = i(annotationType);
        g0.n(i11, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i11;
    }

    public static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        g0.p(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        g0.o(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @j(name = "getJavaClass")
    @m80.k
    public static final <T> Class<T> d(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.s) dVar).g();
        g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @m80.k
    public static final <T> Class<T> e(@m80.k T t11) {
        g0.p(t11, "<this>");
        Class<T> cls = (Class<T>) t11.getClass();
        g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @m80.k
    public static final <T> Class<T> g(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.s) dVar).g();
        if (!cls.isPrimitive()) {
            g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    @m80.l
    public static final <T> Class<T> h(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.s) dVar).g();
        if (cls.isPrimitive()) {
            g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @j(name = "getKotlinClass")
    @m80.k
    public static final <T> h10.d<T> i(@m80.k Class<T> cls) {
        g0.p(cls, "<this>");
        return o0.d(cls);
    }

    @j(name = "getRuntimeClassOfKClassInstance")
    @m80.k
    public static final <T> Class<h10.d<T>> j(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Class<h10.d<T>> cls = (Class<h10.d<T>>) dVar.getClass();
        g0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        g0.p(objArr, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @y0(version = "1.7")
    @o00.f
    public static /* synthetic */ void c(Enum r02) {
    }

    public static /* synthetic */ void f(h10.d dVar) {
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @w0(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(h10.d dVar) {
    }
}
