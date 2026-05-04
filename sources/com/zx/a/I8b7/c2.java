package com.zx.a.I8b7;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c2 {
    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Throwable unused) {
            }
        }
    }
}
