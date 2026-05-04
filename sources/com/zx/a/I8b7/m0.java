package com.zx.a.I8b7;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m0 {
    public static void a(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                a(new File(file2.getPath()));
            } else {
                file2.delete();
            }
        }
        if (file.listFiles().length <= 0) {
            file.delete();
        }
    }
}
