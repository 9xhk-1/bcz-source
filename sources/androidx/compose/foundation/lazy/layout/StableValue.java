package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@h
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m918boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m920equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && g0.g(obj, ((StableValue) obj2).m924unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m921equalsimpl0(Object obj, Object obj2) {
        return g0.g(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m922hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m923toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m920equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m922hashCodeimpl(this.value);
    }

    public String toString() {
        return m923toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m924unboximpl() {
        return this.value;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m919constructorimpl(T t11) {
        return t11;
    }
}
