package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public abstract class m<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Preconditions.checkArgument(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
