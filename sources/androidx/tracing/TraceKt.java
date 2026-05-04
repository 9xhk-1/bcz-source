package androidx.tracing;

import j00.c;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class TraceKt {
    public static final <T> T trace(@k String label, @k a<? extends T> block) {
        g0.p(label, "label");
        g0.p(block, "block");
        Trace.beginSection(label);
        try {
            return block.invoke();
        } finally {
            d0.d(1);
            Trace.endSection();
            d0.c(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(@m80.k java.lang.String r4, int r5, @m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r6, @m80.k j00.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt$traceAsync$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt$traceAsync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.TraceKt$traceAsync$1 r0 = new androidx.tracing.TraceKt$traceAsync$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2f
            goto L4c
        L2f:
            r6 = move-exception
            goto L56
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.e.n(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2f
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L4c
            return r1
        L4c:
            kotlin.jvm.internal.d0.d(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.d0.c(r3)
            return r7
        L56:
            kotlin.jvm.internal.d0.d(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.d0.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, x00.l, j00.c):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i11, l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        Trace.beginAsyncSection(str, i11);
        try {
            return lVar.invoke(cVar);
        } finally {
            d0.d(1);
            Trace.endAsyncSection(str, i11);
            d0.c(1);
        }
    }

    public static final <T> T trace(@k a<String> lazyLabel, @k a<? extends T> block) {
        g0.p(lazyLabel, "lazyLabel");
        g0.p(block, "block");
        boolean isEnabled = Trace.isEnabled();
        if (isEnabled) {
            Trace.beginSection(lazyLabel.invoke());
        }
        try {
            return block.invoke();
        } finally {
            d0.d(1);
            if (isEnabled) {
                Trace.endSection();
            }
            d0.c(1);
        }
    }

    public static final <T> T traceAsync(@k a<String> lazyMethodName, @k a<Integer> lazyCookie, @k a<? extends T> block) {
        String str;
        int i11;
        g0.p(lazyMethodName, "lazyMethodName");
        g0.p(lazyCookie, "lazyCookie");
        g0.p(block, "block");
        if (Trace.isEnabled()) {
            str = lazyMethodName.invoke();
            i11 = lazyCookie.invoke().intValue();
            Trace.beginAsyncSection(str, i11);
        } else {
            str = null;
            i11 = 0;
        }
        try {
            return block.invoke();
        } finally {
            d0.d(1);
            if (str != null) {
                Trace.endAsyncSection(str, i11);
            }
            d0.c(1);
        }
    }
}
