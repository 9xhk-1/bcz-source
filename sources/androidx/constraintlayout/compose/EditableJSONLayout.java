package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import kotlin.jvm.internal.g0;
import l80.d;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@v0
/* loaded from: classes2.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    public static final int $stable = 8;

    @k
    private String currentContent;

    @l
    private String debugName;

    @l
    private MutableState<Long> updateFlag;
    private int forcedWidth = Integer.MIN_VALUE;
    private int forcedHeight = Integer.MIN_VALUE;

    @k
    private MotionLayoutDebugFlags forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;

    @k
    private LayoutInfoFlags layoutInformationMode = LayoutInfoFlags.NONE;

    @k
    private String layoutInformation = "";
    private long last = System.nanoTime();

    public EditableJSONLayout(@d("json5") @k String str) {
        this.currentContent = str;
    }

    @k
    public final String getCurrentContent() {
        return this.currentContent;
    }

    @l
    public final String getDebugName() {
        return this.debugName;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    @k
    public MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @k
    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    @k
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentLayoutInformation() {
                        String str;
                        str = EditableJSONLayout.this.layoutInformation;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentMotionScene() {
                        String str;
                        str = EditableJSONLayout.this.currentContent;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        long j11;
                        j11 = EditableJSONLayout.this.last;
                        return j11;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int i11, int i12) {
                        EditableJSONLayout.this.onNewDimensions(i11, i12);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(String str) {
                        if (str == null) {
                            return;
                        }
                        EditableJSONLayout.this.onNewContent(str);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float f11) {
                        EditableJSONLayout.this.onNewProgress(f11);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int i11) {
                        EditableJSONLayout.this.onDrawDebug(i11);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int i11) {
                        EditableJSONLayout.this.onLayoutInformation(i11);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r4 == r1.ordinal()) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawDebug(int r4) {
        /*
            r3 = this;
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r0 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.UNKNOWN
            int r1 = r0.ordinal()
            if (r4 != r1) goto L9
            goto L1c
        L9:
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r1 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.NONE
            int r2 = r1.ordinal()
            if (r4 != r2) goto L13
        L11:
            r0 = r1
            goto L1c
        L13:
            androidx.constraintlayout.compose.MotionLayoutDebugFlags r1 = androidx.constraintlayout.compose.MotionLayoutDebugFlags.SHOW_ALL
            int r2 = r1.ordinal()
            if (r4 != r2) goto L1c
            goto L11
        L1c:
            r3.forcedDrawDebug = r0
            r3.signalUpdate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.EditableJSONLayout.onDrawDebug(int):void");
    }

    public final void onLayoutInformation(int i11) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (i11 == layoutInfoFlags.ordinal()) {
            this.layoutInformationMode = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (i11 == layoutInfoFlags2.ordinal()) {
                this.layoutInformationMode = layoutInfoFlags2;
            }
        }
        signalUpdate();
    }

    public void onNewContent(@k String str) {
        CLObject objectOrNull;
        this.currentContent = str;
        try {
            CLObject parse = CLParser.parse(str);
            if (parse != null) {
                boolean z11 = this.debugName == null;
                if (z11 && (objectOrNull = parse.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                    this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
                }
                if (z11) {
                    return;
                }
                signalUpdate();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int i11, int i12) {
        this.forcedWidth = i11;
        this.forcedHeight = i12;
        signalUpdate();
    }

    public final void setCurrentContent(@k String str) {
        onNewContent(str);
    }

    public final void setDebugName(@l String str) {
        this.debugName = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(@k String str) {
        this.last = System.nanoTime();
        this.layoutInformation = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setUpdateFlag(@k MutableState<Long> mutableState) {
        this.updateFlag = mutableState;
    }

    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            g0.m(mutableState);
            MutableState<Long> mutableState2 = this.updateFlag;
            g0.m(mutableState2);
            mutableState.setValue(Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }
}
