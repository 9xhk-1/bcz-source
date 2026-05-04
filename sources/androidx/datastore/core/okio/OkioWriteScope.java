package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import okio.b;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:232\n66#2:237\n52#2,21:238\n60#2,10:259\n57#2,2:269\n71#2,2:271\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioWriteScope\n*L\n214#1:231\n214#1:232,5\n215#1:237\n215#1:238,21\n214#1:259,10\n214#1:269,2\n214#1:271,2\n*E\n"})
/* loaded from: classes2.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(@k b fileSystem, @k f path, @k OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        g0.p(fileSystem, "fileSystem");
        g0.p(path, "path");
        g0.p(serializer, "serializer");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:42|43))(6:44|45|46|47|48|(1:50)(1:51))|13|(2:29|30)|15|(3:17|(2:24|25)|(2:20|21)(1:23))(1:28)))|66|6|7|(0)(0)|13|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:17:0x0097, B:28:0x00a4, B:41:0x008c, B:38:0x0087), top: B:7:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioWriteScope$writeData$1, j00.c] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.datastore.core.okio.OkioSerializer] */
    @Override // androidx.datastore.core.WriteScope
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioWriteScope$writeData$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = (androidx.datastore.core.okio.OkioWriteScope$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = new androidx.datastore.core.okio.OkioWriteScope$writeData$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.L$2
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.L$1
            l60.r r1 = (l60.r) r1
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L36
            goto L72
        L36:
            r10 = move-exception
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            kotlin.e.n(r10)
            r8.checkClose()
            okio.b r10 = r8.getFileSystem()
            okio.f r2 = r8.getPath()
            l60.r r10 = r10.y0(r2)
            r5 = 0
            l60.e1 r2 = l60.r.h0(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La5
            l60.l r2 = l60.r0.d(r2)     // Catch: java.lang.Throwable -> La5
            androidx.datastore.core.okio.OkioSerializer r5 = r8.getSerializer()     // Catch: java.lang.Throwable -> L81
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L81
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L81
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L81
            r0.label = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r5.writeTo(r9, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r10
            r1 = r0
            r9 = r2
        L72:
            r1.flush()     // Catch: java.lang.Throwable -> L36
            yz.g2 r10 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7f
            r9.close()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r9 = r4
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L85:
            if (r9 == 0) goto L93
            r9.close()     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r9 = move-exception
            yz.r.a(r10, r9)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r9 = move-exception
            r10 = r0
            goto La6
        L93:
            r9 = r10
            r10 = r4
        L95:
            if (r9 != 0) goto La4
            kotlin.jvm.internal.g0.m(r10)     // Catch: java.lang.Throwable -> L90
            yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lb3
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb3
        La2:
            r4 = move-exception
            goto Lb3
        La4:
            throw r9     // Catch: java.lang.Throwable -> L90
        La5:
            r9 = move-exception
        La6:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            yz.r.a(r9, r10)
        Lb0:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb3:
            if (r4 != 0) goto Lbb
            kotlin.jvm.internal.g0.m(r9)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        Lbb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, j00.c):java.lang.Object");
    }
}
