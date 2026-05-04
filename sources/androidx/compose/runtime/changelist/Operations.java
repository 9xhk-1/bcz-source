package androidx.compose.runtime.changelist;

import a00.a0;
import a00.q;
import a00.r0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import pn.j;
import w00.g;
import w00.h;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n145#1,5:643\n158#1,5:648\n255#1:657\n255#1:658\n334#1,7:666\n325#1,16:673\n356#1:689\n356#1:690\n334#1,7:691\n27#2,2:653\n27#2,2:655\n27#2,2:664\n4658#3,4:659\n1#4:663\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:643,5\n124#1:648,5\n212#1:657\n213#1:658\n325#1:666,7\n347#1:673,16\n359#1:689\n362#1:690\n576#1:691,7\n141#1:653,2\n166#1:655,2\n295#1:664,2\n211#1:659,4\n*E\n"})
/* loaded from: classes.dex */
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    @g
    public int intArgsSize;

    @g
    public int objectArgsSize;

    @g
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;

    @g
    @k
    public Operation[] opCodes = new Operation[16];

    @g
    @k
    public int[] intArgs = new int[16];

    @g
    @k
    public Object[] objectArgs = new Object[16];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        @k
        public final String currentOperationDebugString() {
            String str = "operation[" + this.opIdx + "] = " + Operations.this.currentOpToDebugString(this, "");
            g0.o(str, "toString(...)");
            return str;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int i11) {
            return Operations.this.intArgs[this.intIdx + i11];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo2009getObject31yXWZQ(int i11) {
            return (T) Operations.this.objectArgs[this.objIdx + i11];
        }

        @k
        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i11 = this.opIdx + 1;
            this.opIdx = i11;
            return i11 < Operations.this.opCodesSize;
        }
    }

    private final int createExpectedArgMask(int i11) {
        return (i11 == 0 ? 0 : -1) >>> (32 - i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(operation.getName());
        sb2.append('(');
        String indent = indent(str);
        int ints = operation.getInts();
        boolean z11 = true;
        for (int i11 = 0; i11 < ints; i11++) {
            String intParamName = operation.intParamName(i11);
            if (z11) {
                z11 = false;
            } else {
                sb2.append(j2.O);
            }
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            sb2.append(indent);
            sb2.append(intParamName);
            sb2.append(" = ");
            sb2.append(opIterator.getInt(i11));
        }
        int objects = operation.getObjects();
        for (int i12 = 0; i12 < objects; i12++) {
            int m1989constructorimpl = Operation.ObjectParameter.m1989constructorimpl(i12);
            String mo1963objectParamName31yXWZQ = operation.mo1963objectParamName31yXWZQ(m1989constructorimpl);
            if (z11) {
                z11 = false;
            } else {
                sb2.append(j2.O);
            }
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            sb2.append(indent);
            sb2.append(mo1963objectParamName31yXWZQ);
            sb2.append(" = ");
            sb2.append(formatOpArgumentToString(opIterator.mo2009getObject31yXWZQ(m1989constructorimpl), indent));
        }
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        sb2.append(str);
        sb2.append(j.f81007d);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    private final int determineNewSize(int i11, int i12) {
        return u.u(i11 + u.B(i11, 1024), i12);
    }

    private final void ensureIntArgsSizeAtLeast(int i11) {
        int length = this.intArgs.length;
        if (i11 > length) {
            resizeIntArgs(length, i11);
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i11) {
        int length = this.objectArgs.length;
        if (i11 > length) {
            resizeObjectArgs(length, i11);
        }
    }

    private final String exceptionMessageForOperationPushNoScope(Operation operation) {
        return "Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.";
    }

    private final String exceptionMessageForOperationPushWithScope(Operation operation) {
        StringBuilder sb2 = new StringBuilder();
        int ints = operation.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < ints; i12++) {
            if (((1 << i12) & this.pushedIntMask) == 0) {
                if (i11 > 0) {
                    sb2.append(j2.O);
                }
                sb2.append(operation.intParamName(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        StringBuilder sb4 = new StringBuilder();
        int objects = operation.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < objects; i14++) {
            if (((1 << i14) & this.pushedObjectMask) == 0) {
                if (i11 > 0) {
                    sb4.append(j2.O);
                }
                sb4.append(operation.mo1963objectParamName31yXWZQ(Operation.ObjectParameter.m1989constructorimpl(i14)));
                i13++;
            }
        }
        String sb5 = sb4.toString();
        g0.o(sb5, "toString(...)");
        return "Error while pushing " + operation + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(a0.K5((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(a0.I5((int[]) obj), str) : obj instanceof long[] ? toCollectionString(a0.J5((long[]) obj), str) : obj instanceof float[] ? toCollectionString(a0.H5((float[]) obj), str) : obj instanceof double[] ? toCollectionString(a0.G5((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    private final String indent(String str) {
        return str + "    ";
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final void resizeIntArgs(int i11, int i12) {
        int[] iArr = new int[determineNewSize(i11, i12)];
        q.z0(this.intArgs, iArr, 0, 0, i11);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int i11, int i12) {
        Object[] objArr = new Object[determineNewSize(i11, i12)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, i11);
        this.objectArgs = objArr;
    }

    private final void resizeOpCodes() {
        int B = u.B(this.opCodesSize, 1024);
        int i11 = this.opCodesSize;
        Operation[] operationArr = new Operation[B + i11];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i11);
        this.opCodes = operationArr;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return r0.r3(iterable, j2.O, "[", "]", 0, null, new l<T, CharSequence>() { // from class: androidx.compose.runtime.changelist.Operations$toCollectionString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((Operations$toCollectionString$1<T>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final CharSequence invoke(T t11) {
                String formatOpArgumentToString;
                formatOpArgumentToString = Operations.this.formatOpArgumentToString(t11, str);
                return formatOpArgumentToString;
            }
        }, 24, null);
    }

    private final int topIntIndexOf(int i11) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + i11;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m2010topObjectIndexOf31yXWZQ(int i11) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + i11;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        q.M1(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(@k l<? super OpIterator, g2> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void ensureAllArgumentsPushedFor(@k Operation operation) {
        int i11 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i11 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void executeAndFlushAllPendingOperations(@k Applier<?> applier, @k SlotWriter slotWriter, @k RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(@k l<? super OpIterator, g2> lVar) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                lVar.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        Operation[] operationArr = this.opCodes;
        int i11 = this.opCodesSize - 1;
        this.opCodesSize = i11;
        Operation operation = operationArr[i11];
        operationArr[i11] = null;
        int objects = operation.getObjects();
        for (int i12 = 0; i12 < objects; i12++) {
            Object[] objArr = this.objectArgs;
            int i13 = this.objectArgsSize - 1;
            this.objectArgsSize = i13;
            objArr[i13] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(@k Operations operations) {
        Operation[] operationArr = this.opCodes;
        int i11 = this.opCodesSize - 1;
        this.opCodesSize = i11;
        Operation operation = operationArr[i11];
        operationArr[i11] = null;
        operations.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = operations.objectArgs;
        int objects = operations.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        q.M1(this.objectArgs, null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        q.z0(this.intArgs, operations.intArgs, operations.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void push(@k Operation operation) {
        pushOp(operation);
    }

    @InternalComposeApi
    public final void pushOp(@k Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i11 = this.opCodesSize;
        this.opCodesSize = i11 + 1;
        operationArr[i11] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @k
    public String toDebugString(@k String str) {
        StringBuilder sb2 = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i11 = 0;
            while (true) {
                sb2.append(str);
                int i12 = i11 + 1;
                sb2.append(i11);
                sb2.append(". ");
                sb2.append(currentOpToDebugString(opIterator, str));
                g0.o(sb2, "append(...)");
                sb2.append('\n');
                g0.o(sb2, "append(...)");
                if (!opIterator.next()) {
                    break;
                }
                i11 = i12;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @n(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @w0(expression = "toDebugString()", imports = {}))
    @k
    public String toString() {
        return super.toString();
    }

    public final void push(@k Operation operation, @k l<? super WriteScope, g2> lVar) {
        pushOp(operation);
        lVar.invoke(WriteScope.m2011boximpl(WriteScope.m2012constructorimpl(this)));
        ensureAllArgumentsPushedFor(operation);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    @u0({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,642:1\n356#2:643\n359#2:644\n356#2:645\n356#2:646\n356#2:647\n362#2:648\n356#2:649\n356#2:650\n356#2:651\n356#2:652\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n367#1:643\n378#1:644\n378#1:645\n396#1:646\n420#1:647\n436#1:648\n436#1:649\n454#1:650\n481#1:651\n513#1:652\n*E\n"})
    public static final class WriteScope {

        @k
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m2011boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2013equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && g0.g(operations, ((WriteScope) obj).m2025unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2014equalsimpl0(Operations operations, Operations operations2) {
            return g0.g(operations, operations2);
        }

        @k
        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m2015getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2016hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-impl, reason: not valid java name */
        public static final void m2017setIntimpl(Operations operations, int i11, int i12) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i11] = i12;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m2018setIntsimpl(Operations operations, int i11, int i12, int i13, int i14) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i11 + ints] = i12;
            iArr[ints + i13] = i14;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m2020setObjectDKhxnng(Operations operations, int i11, T t11) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i11] = t11;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m2021setObjects4uCC6AY(Operations operations, int i11, T t11, int i12, U u11) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i11 + objects] = t11;
            objArr[objects + i12] = u11;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m2022setObjectsOGa0p1M(Operations operations, int i11, T t11, int i12, U u11, int i13, V v11, int i14, W w11) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i11 + objects] = t11;
            objArr[i12 + objects] = u11;
            objArr[i13 + objects] = v11;
            objArr[objects + i14] = w11;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m2023setObjectst7hvbck(Operations operations, int i11, T t11, int i12, U u11, int i13, V v11) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i11 + objects] = t11;
            objArr[i12 + objects] = u11;
            objArr[objects + i13] = v11;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2024toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m2013equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m2016hashCodeimpl(this.stack);
        }

        public String toString() {
            return m2024toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m2025unboximpl() {
            return this.stack;
        }

        /* renamed from: setInts-impl, reason: not valid java name */
        public static final void m2019setIntsimpl(Operations operations, int i11, int i12, int i13, int i14, int i15, int i16) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i11 + ints] = i12;
            iArr[i13 + ints] = i14;
            iArr[ints + i15] = i16;
        }

        @k
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m2012constructorimpl(@k Operations operations) {
            return operations;
        }
    }

    public static /* synthetic */ void getOpCodes$runtime_release$annotations() {
    }
}
