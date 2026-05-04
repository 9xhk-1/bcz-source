package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,392:1\n905#2:393\n1516#3:394\n65#4:395\n4643#5,5:396\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n262#1:393\n263#1:394\n319#1:395\n370#1:396,5\n*E\n"})
/* loaded from: classes.dex */
public final class RecordingApplier<N> implements Applier<N> {
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;
    public static final int UP = 0;
    private N current;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private final MutableIntList operations = new MutableIntList(0, 1, null);

    @k
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public RecordingApplier(N n11) {
        this.current = n11;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(@k p<? super N, Object, g2> pVar, @l Object obj) {
        this.operations.add(7);
        this.instances.add(pVar);
        this.instances.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n11) {
        this.operations.add(1);
        this.instances.add(n11);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i11, N n11) {
        this.operations.add(5);
        this.operations.add(i11);
        this.instances.add(n11);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i11, N n11) {
        this.operations.add(6);
        this.operations.add(i11);
        this.instances.add(n11);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i11, int i12, int i13) {
        this.operations.add(3);
        this.operations.add(i11);
        this.operations.add(i12);
        this.operations.add(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(@k Applier<N> applier) {
        int i11;
        MutableIntList mutableIntList = this.operations;
        int i12 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        applier.onBeginChanges();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i13 + 1;
            try {
                switch (mutableIntList.get(i13)) {
                    case 0:
                        applier.up();
                        i13 = i15;
                        break;
                    case 1:
                        applier.down(mutableObjectList.get(i14));
                        i14++;
                        i13 = i15;
                        break;
                    case 2:
                        int i16 = i13 + 2;
                        i13 += 3;
                        applier.remove(mutableIntList.get(i15), mutableIntList.get(i16));
                        break;
                    case 3:
                        int i17 = mutableIntList.get(i15);
                        int i18 = i13 + 3;
                        int i19 = mutableIntList.get(i13 + 2);
                        i13 += 4;
                        applier.move(i17, i19, mutableIntList.get(i18));
                        break;
                    case 4:
                        applier.clear();
                        i13 = i15;
                        break;
                    case 5:
                        i13 += 2;
                        i11 = i14 + 1;
                        applier.insertBottomUp(mutableIntList.get(i15), mutableObjectList.get(i14));
                        i14 = i11;
                        break;
                    case 6:
                        i13 += 2;
                        i11 = i14 + 1;
                        applier.insertTopDown(mutableIntList.get(i15), mutableObjectList.get(i14));
                        i14 = i11;
                        break;
                    case 7:
                        int i21 = i14 + 1;
                        Object obj = mutableObjectList.get(i14);
                        g0.n(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i14 += 2;
                        applier.apply((p) x0.q(obj, 2), mutableObjectList.get(i21));
                        i13 = i15;
                        break;
                    case 8:
                        applier.reuse();
                        i13 = i15;
                        break;
                    default:
                        i13 = i15;
                        break;
                }
            } catch (Throwable th2) {
                applier.onEndChanges();
                throw th2;
            }
        }
        if (!(i14 == mutableObjectList.getSize())) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        mutableObjectList.clear();
        mutableIntList.clear();
        applier.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i11, int i12) {
        this.operations.add(2);
        this.operations.add(i11);
        this.operations.add(i12);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    public void setCurrent(N n11) {
        this.current = n11;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.add(0);
    }
}
