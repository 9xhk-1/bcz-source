package kz;

import androidx.collection.SieveCacheKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @v0
    @k
    public static final Void a(long j11, @k String name) {
        g0.p(name, "name");
        throw new IllegalArgumentException("Long value " + j11 + " of " + name + " doesn't fit into 32-bit integer");
    }

    @v0
    public static final int b(long j11, @k String name) {
        g0.p(name, "name");
        if (j11 < SieveCacheKt.NodeLinkMask) {
            return (int) j11;
        }
        a(j11, name);
        throw new KotlinNothingValueException();
    }
}
