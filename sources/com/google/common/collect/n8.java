package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface n8<R, C, V> extends f9<R, C, V> {
    @Override // com.google.common.collect.f9
    SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.f9
    SortedMap<R, Map<C, V>> rowMap();
}
