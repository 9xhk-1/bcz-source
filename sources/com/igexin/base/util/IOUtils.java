package com.igexin.base.util;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public class IOUtils {
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }
}
