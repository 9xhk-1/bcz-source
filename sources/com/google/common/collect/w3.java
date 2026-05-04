package com.google.common.collect;

import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public class w3 extends ImmutableListMultimap<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final w3 f34076a = new w3();
    private static final long serialVersionUID = 0;

    public w3() {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve() {
        return f34076a;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }
}
