package androidx.datastore.core;

import j00.c;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DataMigrationInitializer<T> {

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1855#2,2:73\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n*L\n55#1:73,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r7, androidx.datastore.core.InitializerApi<T> r8, j00.c<? super yz.g2> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r6, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.L$1
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.L$0
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.L$0
                java.util.List r7 = (java.util.List) r7
                kotlin.e.n(r9)
                goto L60
            L46:
                kotlin.e.n(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.L$0 = r9
                r0.label = r4
                java.lang.Object r7 = r8.updateData(r2, r0)
                if (r7 != r1) goto L5f
                goto L83
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                x00.l r9 = (x00.l) r9
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L34
                r0.L$1 = r7     // Catch: java.lang.Throwable -> L34
                r0.label = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
            L83:
                return r1
            L84:
                T r2 = r8.element
                if (r2 != 0) goto L8b
                r8.element = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.g0.m(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                yz.r.a(r2, r9)
                goto L6b
            L94:
                T r7 = r8.element
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, androidx.datastore.core.InitializerApi, j00.c):java.lang.Object");
        }

        @k
        public final <T> p<InitializerApi<T>, c<? super g2>, Object> getInitializer(@k List<? extends DataMigration<T>> migrations) {
            g0.p(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        private Companion() {
        }
    }
}
