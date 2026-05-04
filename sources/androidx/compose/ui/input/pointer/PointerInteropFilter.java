package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public l<? super MotionEvent, Boolean> onTouchEvent;

    @k
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);

    @m80.l
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DispatchToViewState {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ DispatchToViewState[] $VALUES;
        public static final DispatchToViewState Unknown = new DispatchToViewState(PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN, 0);
        public static final DispatchToViewState Dispatching = new DispatchToViewState("Dispatching", 1);
        public static final DispatchToViewState NotDispatching = new DispatchToViewState("NotDispatching", 2);

        private static final /* synthetic */ DispatchToViewState[] $values() {
            return new DispatchToViewState[]{Unknown, Dispatching, NotDispatching};
        }

        static {
            DispatchToViewState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private DispatchToViewState(String str, int i11) {
        }

        @k
        public static m00.a<DispatchToViewState> getEntries() {
            return $ENTRIES;
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) $VALUES.clone();
        }
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    @k
    public final l<MotionEvent, Boolean> getOnTouchEvent() {
        l lVar = this.onTouchEvent;
        if (lVar != null) {
            return lVar;
        }
        g0.S("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    @k
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @m80.l
    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z11) {
        this.disallowIntercept = z11;
    }

    public final void setOnTouchEvent(@k l<? super MotionEvent, Boolean> lVar) {
        this.onTouchEvent = lVar;
    }

    public final void setRequestDisallowInterceptTouchEvent(@m80.l RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent == null) {
            return;
        }
        requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
    }
}
