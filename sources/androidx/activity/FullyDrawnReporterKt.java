package androidx.activity;

import kotlin.jvm.internal.d0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yz.g2] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(@m80.k androidx.activity.FullyDrawnReporter r4, @m80.k x00.l<? super j00.c<? super yz.g2>, ? extends java.lang.Object> r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L46
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L46:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.jvm.internal.d0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.d0.c(r3)
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L5d:
            kotlin.jvm.internal.d0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.d0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, x00.l, j00.c):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super g2> cVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return g2.f100423a;
        }
        try {
            lVar.invoke(cVar);
            d0.d(1);
            fullyDrawnReporter.removeReporter();
            d0.c(1);
            return g2.f100423a;
        } catch (Throwable th2) {
            d0.d(1);
            fullyDrawnReporter.removeReporter();
            d0.c(1);
            throw th2;
        }
    }
}
