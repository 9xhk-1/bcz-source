package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CanvasHolder {

    @m80.k
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(@m80.k android.graphics.Canvas canvas, @m80.k x00.l<? super Canvas, yz.g2> lVar) {
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        lVar.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @m80.k
    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    @yz.v0
    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
