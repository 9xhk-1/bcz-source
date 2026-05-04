package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnComposition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* loaded from: classes.dex */
final class ReportDrawnComposition implements x00.a<g2> {

    @k
    private final l<x00.a<Boolean>, g2> checkReporter;

    @k
    private final FullyDrawnReporter fullyDrawnReporter;

    @k
    private final x00.a<Boolean> predicate;

    @k
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(@k FullyDrawnReporter fullyDrawnReporter, @k x00.a<Boolean> aVar) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<x00.a<? extends g2>, g2>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar2) {
                invoke2((x00.a<g2>) aVar2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(x00.a<g2> aVar2) {
                aVar2.invoke();
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final x00.a<Boolean> aVar) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.snapshotStateObserver.observeReads(aVar, this.checkReporter, new x00.a<g2>() { // from class: androidx.activity.compose.ReportDrawnComposition$observeReporter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Ref.BooleanRef.this.element = aVar.invoke().booleanValue();
            }
        });
        if (booleanRef.element) {
            removeReporter();
        }
    }

    @Override // x00.a
    public /* bridge */ /* synthetic */ g2 invoke() {
        invoke2();
        return g2.f100423a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
