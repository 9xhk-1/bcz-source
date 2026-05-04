package androidx.datastore.core;

import a00.h0;
import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import c40.l2;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x;
import j00.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import n40.g;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
/* loaded from: classes2.dex */
public final class DataStoreImpl<T> implements DataStore<T> {

    @k
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";

    @k
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;

    @l
    private l2 collectorJob;

    @k
    private final n40.a collectorMutex;

    @k
    private final c0 coordinator$delegate;

    @k
    private final CorruptionHandler<T> corruptionHandler;

    @k
    private final i<T> data;

    @k
    private final DataStoreInMemoryCache<T> inMemoryCache;

    @k
    private final DataStoreImpl<T>.InitDataStore readAndInit;

    @k
    private final r0 scope;

    @k
    private final Storage<T> storage;

    @k
    private final c0<StorageConnection<T>> storageConnectionDelegate;

    @k
    private final SimpleActor<Message.Update<T>> writeActor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class InitDataStore extends RunOnce {

        @l
        private List<? extends p<? super InitializerApi<T>, ? super c<? super g2>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(@k DataStoreImpl dataStoreImpl, List<? extends p<? super InitializerApi<T>, ? super c<? super g2>, ? extends Object>> initTasksList) {
            g0.p(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = a00.r0.a6(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // androidx.datastore.core.RunOnce
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doRun(@m80.k j00.c<? super yz.g2> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.e.n(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.e.n(r7)
                goto L7d
            L40:
                kotlin.e.n(r7)
                java.util.List<? extends x00.p<? super androidx.datastore.core.InitializerApi<T>, ? super j00.c<? super yz.g2>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.g0.m(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7f
            L6e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7f:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(j00.c):java.lang.Object");
        }
    }

    public DataStoreImpl(@k Storage<T> storage, @k List<? extends p<? super InitializerApi<T>, ? super c<? super g2>, ? extends Object>> initTasksList, @k CorruptionHandler<T> corruptionHandler, @k r0 scope) {
        g0.p(storage, "storage");
        g0.p(initTasksList, "initTasksList");
        g0.p(corruptionHandler, "corruptionHandler");
        g0.p(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = kotlinx.coroutines.flow.k.K0(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = g.b(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = e0.c(new x00.a<StorageConnection<T>>(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            @k
            public final StorageConnection<T> invoke() {
                Storage storage2;
                storage2 = ((DataStoreImpl) this.this$0).storage;
                return storage2.createConnection();
            }
        });
        this.coordinator$delegate = e0.c(new x00.a<InterProcessCoordinator>(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @k
            public final InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }
        });
        this.writeActor = new SimpleActor<>(scope, new x00.l<Throwable, g2>(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th2) {
                c0 c0Var;
                if (th2 != null) {
                    ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th2));
                }
                c0Var = ((DataStoreImpl) this.this$0).storageConnectionDelegate;
                if (c0Var.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new p<Message.Update<T>, Throwable, g2>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, Throwable th2) {
                invoke((Message.Update) obj, th2);
                return g2.f100423a;
            }

            public final void invoke(@k Message.Update<T> msg, @l Throwable th2) {
                g0.p(msg, "msg");
                x<T> ack = msg.getAck();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.r(th2);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x004e, B:13:0x0056, B:15:0x005a, B:16:0x0060, B:17:0x0062), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decrementCollector(j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$decrementCollector$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$decrementCollector$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            n40.a r1 = (n40.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.e.n(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.e.n(r6)
            n40.a r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            c40.l2 r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            c40.l2.a.b(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L68
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L5e
            r1.unlock(r4)
            return r6
        L68:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z11, x00.l<? super c<? super R>, ? extends Object> lVar, c<? super R> cVar) {
        return z11 ? lVar.invoke(cVar) : getCoordinator().lock(new DataStoreImpl$doWithWriteFileLock$3(lVar, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(6:(1:(1:(2:12|13))(3:15|16|17))|26|27|21|22|23)(5:28|29|30|(6:32|(1:34)|20|21|22|23)(3:35|(1:37)(1:53)|(2:39|(2:41|(1:43)(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52)))|25)|18))|58|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [c40.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, j00.c<? super yz.g2> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004e, B:13:0x0055, B:14:0x006a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementCollector(j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$incrementCollector$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$incrementCollector$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            n40.a r1 = (n40.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.e.n(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.e.n(r12)
            n40.a r12 = r11.collectorMutex
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            c40.r0 r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r8 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            c40.l2 r12 = c40.i.e(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L70
        L6a:
            yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L67
            r1.unlock(r4)
            return r12
        L70:
            r1.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.runIfNeeded(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.e.n(r6)
            goto L57
        L44:
            kotlin.e.n(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, j00.c<? super androidx.datastore.core.State<T>> r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(c<? super T> cVar) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0066, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0067, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, j00.c<? super androidx.datastore.core.Data<T>> r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z11, c<? super State<T>> cVar) {
        return c40.i.h(this.scope.getCoroutineContext(), new DataStoreImpl$readState$2(this, z11, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(p<? super T, ? super c<? super T>, ? extends Object> pVar, d dVar, c<? super T> cVar) {
        return getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(this, dVar, pVar, null), cVar);
    }

    @Override // androidx.datastore.core.DataStore
    @k
    public i<T> getData() {
        return this.data;
    }

    @k
    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    @l
    public Object updateData(@k p<? super T, ? super c<? super T>, ? extends Object> pVar, @k c<? super T> cVar) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) cVar.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return c40.i.h(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, pVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, @m80.k j00.c<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            kotlin.e.n(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.e.n(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.element
            java.lang.Integer r11 = l00.a.f(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, j00.c):java.lang.Object");
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, r0 r0Var, int i11, v vVar) {
        this(storage, (i11 & 2) != 0 ? h0.J() : list, (i11 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i11 & 8) != 0 ? s0.a(Actual_jvmKt.ioDispatcher().plus(l3.c(null, 1, null))) : r0Var);
    }
}
