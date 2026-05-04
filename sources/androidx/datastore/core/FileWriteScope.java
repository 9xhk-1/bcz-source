package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(@k File file, @k Serializer<T> serializer) {
        super(file, serializer);
        g0.p(file, "file");
        g0.p(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.datastore.core.WriteScope
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.FileWriteScope$writeData$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L72
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e.n(r7)
            r5.checkNotClosed()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            androidx.datastore.core.Serializer r2 = r5.getSerializer()     // Catch: java.lang.Throwable -> L70
            androidx.datastore.core.UncloseableOutputStream r4 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L70
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L70
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L70
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L70
            r0.label = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L70
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L31
            r7 = 0
            r00.b.a(r0, r7)
            return r6
        L70:
            r6 = move-exception
            r0 = r7
        L72:
            throw r6     // Catch: java.lang.Throwable -> L73
        L73:
            r7 = move-exception
            r00.b.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.writeData(java.lang.Object, j00.c):java.lang.Object");
    }
}
