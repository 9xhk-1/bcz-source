package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavArgument {

    @l
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;

    @k
    private final NavType<Object> type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {

        @l
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;

        @l
        private NavType<Object> type;
        private boolean unknownDefaultValuePresent;

        @k
        public final NavArgument build() {
            NavType<Object> navType = this.type;
            if (navType == null) {
                navType = NavType.Companion.inferFromValueType(this.defaultValue);
                g0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        @k
        public final Builder setDefaultValue(@l Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        @k
        public final Builder setIsNullable(boolean z11) {
            this.isNullable = z11;
            return this;
        }

        @k
        public final <T> Builder setType(@k NavType<T> type) {
            g0.p(type, "type");
            this.type = type;
            return this;
        }

        @k
        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean z11) {
            this.unknownDefaultValuePresent = z11;
            return this;
        }
    }

    public NavArgument(@k NavType<Object> type, boolean z11, @l Object obj, boolean z12, boolean z13) {
        g0.p(type, "type");
        if (!type.isNullableAllowed() && z11) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z11 && z12 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z11;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z12 || z13;
        this.isDefaultValueUnknown = z13;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.g(NavArgument.class, obj.getClass())) {
            NavArgument navArgument = (NavArgument) obj;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !g0.g(this.type, navArgument.type)) {
                return false;
            }
            Object obj2 = this.defaultValue;
            if (obj2 != null) {
                return g0.g(obj2, navArgument.defaultValue);
            }
            if (navArgument.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    @l
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @k
    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isDefaultValueUnknown$navigation_common_release() {
        return this.isDefaultValueUnknown;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(@k String name, @k Bundle bundle) {
        Object obj;
        g0.p(name, "name");
        g0.p(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, name, obj);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavArgument.class.getSimpleName());
        sb2.append(" Type: " + this.type);
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(@k String name, @k Bundle bundle) {
        g0.p(name, "name");
        g0.p(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
