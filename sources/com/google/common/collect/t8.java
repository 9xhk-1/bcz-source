package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface t8<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
