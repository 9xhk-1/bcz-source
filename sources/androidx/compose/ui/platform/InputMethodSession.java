package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,183:1\n1101#2:184\n1083#2,2:185\n32#3,2:187\n32#3,2:190\n1#4:189\n423#5,9:192\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n122#1:184\n122#1:185,2\n136#1:187,2\n175#1:190,2\n178#1:192,9\n*E\n"})
/* loaded from: classes2.dex */
final class InputMethodSession {
    private boolean disposed;

    @m80.k
    private final x00.a<g2> onAllConnectionsClosed;

    @m80.k
    private final PlatformTextInputMethodRequest request;

    @m80.k
    private final Object lock = new Object();

    @m80.k
    private MutableVector<WeakReference<NullableInputConnectionWrapper>> connections = new MutableVector<>(new WeakReference[16], 0);

    public InputMethodSession(@m80.k PlatformTextInputMethodRequest platformTextInputMethodRequest, @m80.k x00.a<g2> aVar) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = aVar;
    }

    @m80.l
    public final InputConnection createInputConnection(@m80.k EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), new x00.l<NullableInputConnectionWrapper, g2>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    invoke2(nullableInputConnectionWrapper);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    MutableVector mutableVector;
                    MutableVector mutableVector2;
                    x00.a aVar;
                    MutableVector mutableVector3;
                    nullableInputConnectionWrapper.disposeDelegate();
                    mutableVector = InputMethodSession.this.connections;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i11 = -1;
                            break;
                        } else if (kotlin.jvm.internal.g0.g((WeakReference) objArr[i11], nullableInputConnectionWrapper)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 >= 0) {
                        mutableVector3 = InputMethodSession.this.connections;
                        mutableVector3.removeAt(i11);
                    }
                    mutableVector2 = InputMethodSession.this.connections;
                    if (mutableVector2.getSize() == 0) {
                        aVar = InputMethodSession.this.onAllConnectionsClosed;
                        aVar.invoke();
                    }
                }
            });
            this.connections.add(new WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                MutableVector<WeakReference<NullableInputConnectionWrapper>> mutableVector = this.connections;
                WeakReference<NullableInputConnectionWrapper>[] weakReferenceArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i11].get();
                    if (nullableInputConnectionWrapper != null) {
                        nullableInputConnectionWrapper.disposeDelegate();
                    }
                }
                this.connections.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
