package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    @k
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final Class<E> f66935c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public EnumEntriesSerializationProxy(@k E[] entries) {
        g0.p(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        g0.m(cls);
        this.f66935c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f66935c.getEnumConstants();
        g0.o(enumConstants, "getEnumConstants(...)");
        return c.c(enumConstants);
    }
}
