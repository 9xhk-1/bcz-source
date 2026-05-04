package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface Marker extends Serializable {
    public static final String ANY_MARKER = "*";
    public static final String ANY_NON_NULL_MARKER = "+";

    void add(Marker marker);

    boolean contains(String str);

    boolean contains(Marker marker);

    boolean equals(Object obj);

    String getName();

    @Deprecated
    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    Iterator<Marker> iterator();

    boolean remove(Marker marker);
}
