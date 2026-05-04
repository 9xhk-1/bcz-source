package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import c40.n;
import j00.c;
import kotlin.Result;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import n40.a;
import n40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,362:1\n85#2:363\n113#2,2:364\n120#3,8:366\n129#3:385\n314#4,11:374\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n73#1:363\n73#1:364,2\n103#1:366,8\n103#1:385\n105#1:374,11\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    @k
    private final a mutex = g.b(false, 1, null);

    @k
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Stable
    public static final class SnackbarDataImpl implements SnackbarData {

        @l
        private final String actionLabel;

        @k
        private final n<SnackbarResult> continuation;

        @k
        private final SnackbarDuration duration;

        @k
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(@k String str, @l String str2, @k SnackbarDuration snackbarDuration, @k n<? super SnackbarResult> nVar) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = nVar;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                n<SnackbarResult> nVar = this.continuation;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        @l
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        @k
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        @k
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                n<SnackbarResult> nVar = this.continuation;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, cVar);
    }

    @l
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #1 {all -> 0x00ba, blocks: (B:26:0x008a, B:28:0x00b6), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(@m80.k java.lang.String r9, @m80.l java.lang.String r10, @m80.k androidx.compose.material.SnackbarDuration r11, @m80.k j00.c<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, j00.c):java.lang.Object");
    }
}
