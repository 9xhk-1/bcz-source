package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public abstract class n<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable<?> f34418a;

    public n() {
        Type capture = capture();
        Preconditions.checkArgument(capture instanceof TypeVariable, "%s should be a type variable.", capture);
        this.f34418a = (TypeVariable) capture;
    }

    public final boolean equals(@CheckForNull Object o11) {
        if (o11 instanceof n) {
            return this.f34418a.equals(((n) o11).f34418a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34418a.hashCode();
    }

    public String toString() {
        return this.f34418a.toString();
    }
}
