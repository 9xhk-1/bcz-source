package androidx.lifecycle.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "LocalLifecycleOwnerKt")
@u0({"SMAP\nLocalLifecycleOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n18987#2,2:67\n*S KotlinDebug\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n*L\n49#1:67,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LocalLifecycleOwnerKt {

    @k
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        /*
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<androidx.lifecycle.LifecycleOwner> r1 = androidx.lifecycle.LifecycleOwner.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2b
            r4 = 0
        L1e:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5 instanceof yz.n     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L28
        L26:
            r1 = r0
            goto L37
        L28:
            int r4 = r4 + 1
            goto L1e
        L2b:
            r1 = move-exception
            goto L3c
        L2d:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L26
            androidx.compose.runtime.ProvidableCompositionLocal r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1     // Catch: java.lang.Throwable -> L2b
        L37:
            java.lang.Object r1 = kotlin.Result.m6308constructorimpl(r1)     // Catch: java.lang.Throwable -> L2b
            goto L46
        L3c:
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.e.a(r1)
            java.lang.Object r1 = kotlin.Result.m6308constructorimpl(r1)
        L46:
            boolean r2 = kotlin.Result.m6314isFailureimpl(r1)
            if (r2 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r1
        L4e:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = (androidx.compose.runtime.ProvidableCompositionLocal) r0
            if (r0 != 0) goto L58
            androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1 r0 = new x00.a<androidx.lifecycle.LifecycleOwner>() { // from class: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1
                static {
                    /*
                        androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1 r0 = new androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1) androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.INSTANCE androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.<init>():void");
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner invoke() {
                    /*
                        r1 = this;
                        androidx.lifecycle.LifecycleOwner r0 = r1.invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.invoke():java.lang.Object");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final androidx.lifecycle.LifecycleOwner invoke() {
                    /*
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "CompositionLocal LocalLifecycleOwner not present"
                        r0.<init>(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.invoke():androidx.lifecycle.LifecycleOwner");
                }
            }
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(r0)
        L58:
            androidx.lifecycle.compose.LocalLifecycleOwnerKt.LocalLifecycleOwner = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt.<clinit>():void");
    }

    @k
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
