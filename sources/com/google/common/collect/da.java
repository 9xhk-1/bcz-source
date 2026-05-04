package com.google.common.collect;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class da extends s7<Object> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final da f33364c = new da();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f33364c;
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(Object left, Object right) {
        return left.toString().compareTo(right.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
