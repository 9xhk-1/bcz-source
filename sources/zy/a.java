package zy;

import a00.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @n(level = DeprecationLevel.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @w0(expression = "mutableListOf<V>()", imports = {}))
    @k
    public static final <V> List<V> a() {
        return new ArrayList();
    }

    @n(level = DeprecationLevel.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @w0(expression = "mutableListOf(values)", imports = {}))
    @k
    public static final <T> List<T> b(@k T... values) {
        g0.p(values, "values");
        return h0.U(Arrays.copyOf(values, values.length));
    }

    @n(level = DeprecationLevel.ERROR, message = "Will be dropped with new memory model enabled by default", replaceWith = @w0(expression = "mutableMapOf()", imports = {}))
    @k
    public static final <K, V> Map<K, V> c(int i11) {
        return new LinkedHashMap(i11);
    }

    public static /* synthetic */ Map d(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c(i11);
    }
}
