package androidx.room.util;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.f0;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "KClassUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class KClassUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <T, C> T findAndInstantiateDatabaseImpl(@k Class<C> klass, @k String suffix) {
        String str;
        String str2;
        g0.p(klass, "klass");
        g0.p(suffix, "suffix");
        Package r02 = klass.getPackage();
        if (r02 == null || (str = r02.getName()) == null) {
            str = "";
        }
        String canonicalName = klass.getCanonicalName();
        g0.m(canonicalName);
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
            g0.o(canonicalName, "substring(...)");
        }
        String str3 = f0.y2(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (str.length() == 0) {
                str2 = str3;
            } else {
                str2 = str + '.' + str3;
            }
            Class<?> cls = Class.forName(str2, true, klass.getClassLoader());
            g0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str3 + " does not exist. Is Room annotation processor correctly configured?", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e13);
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
