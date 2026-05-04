package j50;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @w00.j(name = "throwSubtypeNotRegistered")
    @m80.k
    public static final Void a(@m80.k h10.d<?> subClass, @m80.k h10.d<?> baseClass) {
        kotlin.jvm.internal.g0.p(subClass, "subClass");
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        String C = subClass.C();
        if (C == null) {
            C = String.valueOf(subClass);
        }
        b(C, baseClass);
        throw new KotlinNothingValueException();
    }

    @w00.j(name = "throwSubtypeNotRegistered")
    @m80.k
    public static final Void b(@m80.l String str, @m80.k h10.d<?> baseClass) {
        String str2;
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.C() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.C() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
