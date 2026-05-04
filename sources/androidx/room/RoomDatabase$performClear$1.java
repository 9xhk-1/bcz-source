package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RoomDatabase$performClear$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ boolean $hasForeignKeys;
    final /* synthetic */ String[] $tableNames;
    int label;
    final /* synthetic */ RoomDatabase this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {TypedValues.PositionType.TYPE_CURVE_FIT, 509, 511, com.badlogic.gdx.graphics.f.f11608j2, com.badlogic.gdx.graphics.f.f11614k2, com.badlogic.gdx.graphics.f.f11620l2}, m = "invokeSuspend", n = {c60.c.f8163j, c60.c.f8163j, c60.c.f8163j, c60.c.f8163j, c60.c.f8163j}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<Transactor, j00.c<? super g2>, Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomDatabase this$0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {513, com.badlogic.gdx.graphics.f.f11596h2}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
        @u0({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2151:1\n13402#2,2:2152\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n*L\n515#1:2152,2\n*E\n"})
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00941 extends SuspendLambda implements x00.p<TransactionScope<g2>, j00.c<? super g2>, Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            int I$0;
            int I$1;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00941(boolean z11, String[] strArr, j00.c<? super C00941> cVar) {
                super(2, cVar);
                this.$hasForeignKeys = z11;
                this.$tableNames = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C00941 c00941 = new C00941(this.$hasForeignKeys, this.$tableNames, cVar);
                c00941.L$0 = obj;
                return c00941;
            }

            @Override // x00.p
            public final Object invoke(TransactionScope<g2> transactionScope, j00.c<? super g2> cVar) {
                return ((C00941) create(transactionScope, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r6, r10, r9) == r0) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0077 -> B:6:0x007a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2e
                    if (r1 == r3) goto L26
                    if (r1 != r2) goto L1e
                    int r1 = r9.I$1
                    int r4 = r9.I$0
                    java.lang.Object r5 = r9.L$1
                    java.lang.String[] r5 = (java.lang.String[]) r5
                    java.lang.Object r6 = r9.L$0
                    androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                    kotlin.e.n(r10)
                    goto L7a
                L1e:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L26:
                    java.lang.Object r1 = r9.L$0
                    androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                    kotlin.e.n(r10)
                    goto L47
                L2e:
                    kotlin.e.n(r10)
                    java.lang.Object r10 = r9.L$0
                    r1 = r10
                    androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                    boolean r10 = r9.$hasForeignKeys
                    if (r10 == 0) goto L47
                    r9.L$0 = r1
                    r9.label = r3
                    java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                    java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r1, r10, r9)
                    if (r10 != r0) goto L47
                    goto L79
                L47:
                    java.lang.String[] r10 = r9.$tableNames
                    int r4 = r10.length
                    r5 = 0
                    r6 = r1
                    r1 = r4
                    r4 = r5
                    r5 = r10
                L4f:
                    if (r4 >= r1) goto L7c
                    r10 = r5[r4]
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "DELETE FROM `"
                    r7.append(r8)
                    r7.append(r10)
                    r10 = 96
                    r7.append(r10)
                    java.lang.String r10 = r7.toString()
                    r9.L$0 = r6
                    r9.L$1 = r5
                    r9.I$0 = r4
                    r9.I$1 = r1
                    r9.label = r2
                    java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r6, r10, r9)
                    if (r10 != r0) goto L7a
                L79:
                    return r0
                L7a:
                    int r4 = r4 + r3
                    goto L4f
                L7c:
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00941.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoomDatabase roomDatabase, boolean z11, String[] strArr, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = roomDatabase;
            this.$hasForeignKeys = z11;
            this.$tableNames = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$hasForeignKeys, this.$tableNames, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(Transactor transactor, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(transactor, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA wal_checkpoint(FULL)", r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        
            if (r8 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        
            if (r1.withTransaction(r8, r3, r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        
            if (r8.sync$room_runtime_release(r7) == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 0
                switch(r1) {
                    case 0: goto L41;
                    case 1: goto L39;
                    case 2: goto L31;
                    case 3: goto L29;
                    case 4: goto L20;
                    case 5: goto L17;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L12:
                kotlin.e.n(r8)
                goto Lb8
            L17:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.e.n(r8)
                goto Laa
            L20:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.e.n(r8)
                goto L94
            L29:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.e.n(r8)
                goto L88
            L31:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.e.n(r8)
                goto L71
            L39:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.e.n(r8)
                goto L57
            L41:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.L$0
                androidx.room.Transactor r8 = (androidx.room.Transactor) r8
                r7.L$0 = r8
                r1 = 1
                r7.label = r1
                java.lang.Object r1 = r8.inTransaction(r7)
                if (r1 != r0) goto L54
                goto Lb7
            L54:
                r6 = r1
                r1 = r8
                r8 = r6
            L57:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L71
                androidx.room.RoomDatabase r8 = r7.this$0
                androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                r7.L$0 = r1
                r3 = 2
                r7.label = r3
                java.lang.Object r8 = r8.sync$room_runtime_release(r7)
                if (r8 != r0) goto L71
                goto Lb7
            L71:
                androidx.room.Transactor$SQLiteTransactionType r8 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
                androidx.room.RoomDatabase$performClear$1$1$1 r3 = new androidx.room.RoomDatabase$performClear$1$1$1
                boolean r4 = r7.$hasForeignKeys
                java.lang.String[] r5 = r7.$tableNames
                r3.<init>(r4, r5, r2)
                r7.L$0 = r1
                r4 = 3
                r7.label = r4
                java.lang.Object r8 = r1.withTransaction(r8, r3, r7)
                if (r8 != r0) goto L88
                goto Lb7
            L88:
                r7.L$0 = r1
                r8 = 4
                r7.label = r8
                java.lang.Object r8 = r1.inTransaction(r7)
                if (r8 != r0) goto L94
                goto Lb7
            L94:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto Lc1
                r7.L$0 = r1
                r8 = 5
                r7.label = r8
                java.lang.String r8 = "PRAGMA wal_checkpoint(FULL)"
                java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                if (r8 != r0) goto Laa
                goto Lb7
            Laa:
                r7.L$0 = r2
                r8 = 6
                r7.label = r8
                java.lang.String r8 = "VACUUM"
                java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                if (r8 != r0) goto Lb8
            Lb7:
                return r0
            Lb8:
                androidx.room.RoomDatabase r8 = r7.this$0
                androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                r8.refreshAsync()
            Lc1:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase$performClear$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$performClear$1(RoomDatabase roomDatabase, boolean z11, String[] strArr, j00.c<? super RoomDatabase$performClear$1> cVar) {
        super(2, cVar);
        this.this$0 = roomDatabase;
        this.$hasForeignKeys = z11;
        this.$tableNames = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new RoomDatabase$performClear$1(this.this$0, this.$hasForeignKeys, this.$tableNames, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((RoomDatabase$performClear$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoomConnectionManager roomConnectionManager;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            roomConnectionManager = this.this$0.connectionManager;
            if (roomConnectionManager == null) {
                g0.S("connectionManager");
                roomConnectionManager = null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$hasForeignKeys, this.$tableNames, null);
            this.label = 1;
            if (roomConnectionManager.useConnection(false, anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
